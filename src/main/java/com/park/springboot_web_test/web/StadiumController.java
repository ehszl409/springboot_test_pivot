package com.park.springboot_web_test.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.park.springboot_web_test.model.stadium.Stadium;
import com.park.springboot_web_test.service.StadiumService;
import com.park.springboot_web_test.web.dto.CMRespDto;
import com.park.springboot_web_test.web.dto.stadium.StadiumSaveReqDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	private final StadiumService stadiumService;

	@GetMapping("/stadiumForm")
	public String saveForm() {
		return "stadium/saveForm";
	}
	
	@PostMapping("/stadium")
	public String save(StadiumSaveReqDto stadiumSaveReqDto){
		System.out.println("stadiumSaveReqDto : " + stadiumSaveReqDto);
		Stadium stadiumEntity =  stadiumService.구장등록(stadiumSaveReqDto.toEntity());
		return "redirect:/stadium";
	}
	
	@GetMapping("/stadium")
	public String findAll(Model model) {
		List<Stadium> stadiums = stadiumService.전체찾기();
		model.addAttribute("stadiums", stadiums);
		
		return "stadium/table";
	}
	
	
}

