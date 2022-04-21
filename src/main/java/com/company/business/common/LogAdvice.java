package com.company.business.common;

// 공통 로직(횡단 관심)을 따로 분리시킨 클래스

public class LogAdvice {
	public void printLog() {
		System.out.println("[공통 로그] 비즈니스 로직 수행 전에 동작");
	}
}
