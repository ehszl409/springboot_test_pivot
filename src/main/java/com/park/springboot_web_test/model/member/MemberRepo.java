package com.park.springboot_web_test.model.member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member, Integer>{

}
