package com.wings.member.controller;

import com.wings.member.data.Credentials;
import com.wings.member.model.CredentialsDO;
import com.wings.member.model.MemberDO;
import com.wings.member.model.RegistrationDO;
import com.wings.member.model.UpdatePasswordDO;
import com.wings.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    @Autowired
    private MemberService service;

    @GetMapping
    public List<MemberDO> retrieveAll(@RequestParam(required = false)
                                              Map<String,String> params) {
        return service.getAllMembers(params);
    }

    @PutMapping
    public MemberDO update(@Valid @RequestBody MemberDO memberDO) {
        return service.updateMember(memberDO);
    }

    @PostMapping("/register")
    public MemberDO register(@Valid  @RequestBody RegistrationDO registration) {
        return service.register(registration);
    }

    @PostMapping("/login")
    public MemberDO login(@Valid @RequestBody CredentialsDO credentialsDO) {
            return service.login(credentialsDO);
    }

    @PostMapping("emailId/check")
    public HttpStatus checkEmailId(@RequestParam ("emailId") String emailId) {
        Credentials credentials = service.emailIdExist(emailId);
        if (credentials == null) {
            return HttpStatus.NOT_FOUND;
        }
        return HttpStatus.OK;
    }

    @PostMapping("/password/forgot")
    public void forgotPassword(@RequestParam (value = "emailId") String emailId) {
        service.initiateForgotPasswordFlow(emailId);
    }

    @GetMapping("/password/reset")
    public void verifyResetToken(@RequestParam (value = "resetToken") String resetToken) {
        service.verifyResetToken(resetToken);
    }

    @PutMapping("/password/reset")
    public void resetPassword(@RequestPart (value = "resetToken") String resetToken,
                              @RequestPart (value = "password") String password) {
        service.updatePassword(resetToken, password);
    }

    @PutMapping("/password/update")
    public void updatePassword(@Valid @RequestBody UpdatePasswordDO updatePasswordDO) {
        service.updatePassword(updatePasswordDO);
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
