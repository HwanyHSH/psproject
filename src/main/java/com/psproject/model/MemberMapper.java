package com.psproject.model;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    int insertMember(MemberDTO memberDTO);

    MemberDTO findMemberName(String email);

}
