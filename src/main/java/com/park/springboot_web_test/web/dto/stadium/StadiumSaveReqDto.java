package com.park.springboot_web_test.web.dto.stadium;

import com.park.springboot_web_test.model.stadium.Stadium;

import lombok.Data;

@Data
public class StadiumSaveReqDto {
	private String name;
	private String teamName;
	
	public Stadium toEntity() {
		Stadium stadium = new Stadium().builder()
				.name(name)
				.teamName(teamName)
				.build();
		return stadium;
	}
}
