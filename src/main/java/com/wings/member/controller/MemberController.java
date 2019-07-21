package com.wings.member.controller;

import com.wings.member.data.Credentials;
import com.wings.member.model.CredentialsDO;
import com.wings.member.model.MemberDO;
import com.wings.member.model.RegistrationDO;
import com.wings.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    @Autowired
    private MemberService service;

    @PostMapping("/register")
    public MemberDO register(@RequestBody RegistrationDO registration) {
        return service.register(registration);
    }

    @PostMapping("/login")
    public MemberDO login(CredentialsDO credentialsDO) {
            return service.login(credentialsDO);
    }

    @PostMapping("emailId/check")
    public HttpStatus checkEmailId(@RequestBody CredentialsDO credentialsDO) {
        Credentials credentials = service.emailIdExist(credentialsDO.getEmail_id());
        if (credentials == null) {
            return HttpStatus.NOT_FOUND;
        }
        return HttpStatus.OK;
    }

    @GetMapping
    public List<MemberDO> retrieveAll(@RequestParam(required = false)
                                                Map<String,String> params) {
        return service.getAllMembers(params);
    }

    @PutMapping
    public MemberDO update(@RequestBody MemberDO memberDO) {
        return service.updateMember(memberDO);
    }

    @GetMapping("/{id}")
    public MemberDO retrieve(@PathVariable("id") String id) {
        return service.getMemberById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        service.deleteMember(id);
    }
}
