package com.wings.member.utils;

import com.wings.member.data.Member;
import com.wings.member.model.MemberDO;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static Member convertToMemberData(MemberDO memberDo) {
        Member member = new Member();
        member.set_id(memberDo.get_id());
        member.setPhoneNo(memberDo.getPhone_no());
        member.setShortBio(memberDo.getShort_bio());
        member.setFullBio(memberDo.getFull_bio());
        member.setdOb(memberDo.getdOb());
        member.setImage(memberDo.getImage());
        member.setAdmin(memberDo.isAdmin());
        member.setMemberSince(memberDo.getMember_since());
        member.setSubscription(memberDo.getSubscription());
        member.setCommunities(memberDo.getCommunities());
        member.setInterests(memberDo.getInterests());
        member.setEducation(memberDo.getEducation());
        member.setSocialMedia(memberDo.getSocial_media());
        if(memberDo.getEmail_id() != null) {
            member.setEmailId(memberDo.getEmail_id().toLowerCase());
        }
        if(memberDo.getFirst_name() != null) {
            member.setFirstName(memberDo.getFirst_name().toLowerCase());
        }
        if(memberDo.getLast_name() != null) {
            member.setLastName(memberDo.getLast_name().toLowerCase());
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
        memberDO.setEmail_id(member.getEmailId());
        memberDO.setFirst_name(member.getFirstName());
        memberDO.setLast_name(member.getLastName());
        memberDO.setPhone_no(member.getPhoneNo());
        memberDO.setShort_bio(member.getShortBio());
        memberDO.setFull_bio(member.getFullBio());
        memberDO.setdOb(member.getdOb());
        memberDO.setCity(member.getCity());
        memberDO.setCountry(member.getCountry());
        memberDO.setImage(member.getImage());
        memberDO.setOccupation(member.getOccupation());
        memberDO.setAdmin(member.isAdmin());
        memberDO.setMember_since(member.getMemberSince());
        memberDO.setSubscription(member.getSubscription());
        memberDO.setCommunities(member.getCommunities());
        memberDO.setInterests(member.getInterests());
        memberDO.setEducation(member.getEducation());
        memberDO.setSocial_media(member.getSocialMedia());
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
