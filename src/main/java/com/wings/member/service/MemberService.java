package com.wings.member.service;

import com.wings.member.data.Credentials;
import com.wings.member.model.CredentialsDO;
import com.wings.member.model.MemberDO;
import com.wings.member.model.RegistrationDO;
import com.wings.member.model.UpdatePasswordDO;

import java.util.List;
import java.util.Map;

public interface MemberService {
    List<MemberDO> getAllMembers(Map<String, String> params);

    MemberDO getMemberById(String id);

    MemberDO updateMember(MemberDO memberDO);

    void deleteMember(String id);

    Credentials emailIdExist(String emailId);

    MemberDO register(RegistrationDO registration);

    MemberDO login(CredentialsDO credentialsDO);

    void initiateForgotPasswordFlow(String emailId);

    void verifyResetToken(String resetToken);

    void updatePassword(String resetToken, String password);

    void updatePassword(UpdatePasswordDO updatePasswordDO);
}
