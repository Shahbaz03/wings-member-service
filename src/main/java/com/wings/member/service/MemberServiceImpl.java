package com.wings.member.service;

import com.wings.member.data.Credentials;
import com.wings.member.data.Member;
import com.wings.member.exception.EmailIdNotFoundException;
import com.wings.member.exception.LoginFailedException;
import com.wings.member.exception.MemberNotFoundException;
import com.wings.member.model.CredentialsDO;
import com.wings.member.model.MemberDO;
import com.wings.member.model.RegistrationDO;
import com.wings.member.repository.CredentialsRepository;
import com.wings.member.repository.MemberRepository;
import com.wings.member.utils.Converter;
import org.apache.commons.collections.MapUtils;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private CredentialsRepository credentialsRepository;

    @Override
    public List<MemberDO> getAllMembers(Map<String, String> params) {
        List<Member> members = new ArrayList<>();
        if (MapUtils.isEmpty(params)) {
            members = memberRepository.findAll();
        }
        if (params.containsKey("firstName")) {
            members =  memberRepository.findByFirstName(params.get("firstName").toLowerCase());
        }
        if (params.containsKey("lastName")) {
            members = memberRepository.findByLastName(params.get("lastName").toLowerCase());
        }
        return Converter.convertToMemberDOList(members);
    }

    @Override
    public MemberDO getMemberById(String id) {
        Member member = memberRepository.findOne(id);
        if (member == null) {
            throw new MemberNotFoundException();
        }
        return Converter.convertToMemberDO(member);
    }

    @Override
    public MemberDO updateMember(MemberDO memberDO) {
        return Converter.convertToMemberDO(
                memberRepository.save(
                        Converter.convertToMemberData(memberDO)));
    }

    @Override
    public void deleteMember(String id) {
        memberRepository.delete(id);
    }

    @Override
    public Credentials emailIdExist(String emailId) {
       return credentialsRepository.findByEmailId(emailId);
    }

    @Override
    public MemberDO register(RegistrationDO registration) {
        registerCredentials(registration.getEmailId(), registration.getPassword());
        return registerMember(new Member(
                registration.getEmailId(), registration.getFirstName(), registration.getLastName()));
    }

    @Override
    public MemberDO login(CredentialsDO credentialsDO) {
        Credentials credentials = emailIdExist(credentialsDO.getEmail_id());
        if (credentials == null) {
            throw new EmailIdNotFoundException();
        }
        boolean loginSuccessful = BCrypt.checkpw(credentialsDO.getPassword(), credentials.getPasswordHashed());
        if (!loginSuccessful) {
            throw new LoginFailedException();
        }
        return Converter.convertToMemberDO(memberRepository.findByEmailId(credentialsDO.getEmail_id()));
    }


    private MemberDO registerMember(Member member) {
        return Converter.convertToMemberDO(
                memberRepository.save(member));
    }

    private void registerCredentials(String emailId, String password) {
        String salt = BCrypt.gensalt();
        String hashedPwd = BCrypt.hashpw(password, salt);
        credentialsRepository.save(new Credentials(emailId, hashedPwd, salt));
    }
}
