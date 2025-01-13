package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder // 생성자 대신 사용
@NoArgsConstructor // 파라미터가 없는 디폴트 생성자를 생성
@AllArgsConstructor	// 모든 필드 값을 파라미터로 받는 생성자를 생성
public class SampleDto {

	private String name;
	private int age;
	private String tel;
	
}
