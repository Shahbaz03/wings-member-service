package com.wings.member.utils;

import com.wings.member.data.Member;
import com.wings.member.model.MemberDO;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static Member convertToMemberData(MemberDO memberDo) {
        Member member = new Member();
        member.set_id(memberDo.get_id());
        member.setPhoneNo(memberDo.getPhoneNo());
        member.setShortBio(memberDo.getShortBio());
        member.setFullBio(memberDo.getFullBio());
        member.setdOb(memberDo.getdOb());
        member.setYearOfPassing12(memberDo.getYearOfPassing12());
        member.setImage(memberDo.getImage());
        member.setAdmin(memberDo.isAdmin());
        member.setMemberSince(memberDo.getMemberSince());
        member.setSubscription(memberDo.getSubscription());
        member.setCommunities(memberDo.getCommunities());
        member.setInterests(memberDo.getInterests());
        member.setEducation(memberDo.getEducation());
        member.setSocialMedia(memberDo.getSocialMedia());
        if(memberDo.getEmailId() != null) {
            member.setEmailId(memberDo.getEmailId().toLowerCase());
        }
        if(memberDo.getFirstName() != null) {
            member.setFirstName(memberDo.getFirstName().toLowerCase());
        }
        if(memberDo.getLastName() != null) {
            member.setLastName(memberDo.getLastName().toLowerCase());
        }
        if (memberDo.getCity() != null) {
            member.setCity(memberDo.getCity().toLowerCase());
        }
        if (memberDo.getCountry() != null) {
            member.setCountry(memberDo.getCountry().toLowerCase());
        }
        if (memberDo.getOccupation() != null) {
            member.setOccupation(memberDo.getOccupation().toLowerCase());
        }
        return member;
    }

    public static MemberDO convertToMemberDO(Member member) {
        MemberDO memberDO = new MemberDO();
        memberDO.set_id(member.get_id());
        memberDO.setEmailId(member.getEmailId());
        memberDO.setFirstName(member.getFirstName());
        memberDO.setLastName(member.getLastName());
        memberDO.setPhoneNo(member.getPhoneNo());
        memberDO.setShortBio(member.getShortBio());
        memberDO.setFullBio(member.getFullBio());
        memberDO.setYearOfPassing12(member.getYearOfPassing12());
        memberDO.setdOb(member.getdOb());
        memberDO.setCity(member.getCity());
        memberDO.setCountry(member.getCountry());
        memberDO.setImage(member.getImage());
        memberDO.setOccupation(member.getOccupation());
        memberDO.setAdmin(member.isAdmin());
        memberDO.setMemberSince(member.getMemberSince());
        memberDO.setSubscription(member.getSubscription());
        memberDO.setCommunities(member.getCommunities());
        memberDO.setInterests(member.getInterests());
        memberDO.setEducation(member.getEducation());
        memberDO.setSocialMedia(member.getSocialMedia());
        return memberDO;
    }

    public static List<MemberDO> convertToMemberDOList(List<Member> members) {
        List<MemberDO> memberDOList = new ArrayList<>();
        for(Member member : members) {
            MemberDO memberDO = convertToMemberDO(member);
            memberDOList.add(memberDO);
        }
        return memberDOList;
    }
}
