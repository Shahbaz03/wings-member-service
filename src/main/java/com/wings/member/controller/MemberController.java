package com.wings.member.controller;

import com.wings.member.model.Member;
import com.wings.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    @Autowired
    private MemberRepository repository;

    @GetMapping
    public List<Member> RetrieveAll() {
        return repository.findAll();
    }

    @PostMapping
    public Member Create(@RequestBody Member member) {
        return repository.save(member);
    }
}
