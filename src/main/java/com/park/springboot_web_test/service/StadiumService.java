package com.park.springboot_web_test.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.park.springboot_web_test.model.stadium.Stadium;
import com.park.springboot_web_test.model.stadium.StadiumRepo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StadiumService {

	private final StadiumRepo stadiumRepo;
	
	@Transactional
	public Stadium 구장등록(Stadium stadium) {
		Stadium stadiumEntity = stadiumRepo.save(stadium);
		return stadiumEntity;
	}
	
	@Transactional(readOnly = true)
	public List<Stadium> 전체찾기() {
		List<Stadium> stadiums = stadiumRepo.findAll();
		return stadiums;
	}
}
