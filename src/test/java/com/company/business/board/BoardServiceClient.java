package com.company.business.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		// 1. 스프링 컨테이너 구동
		AbstractApplicationContext container 
			= new GenericXmlApplicationContext("applicationContext.xml");
		
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		// 2. 게시글 등록 기능 테스트
		BoardDO boardDO = new BoardDO();
		boardDO.setTitle("스프링 어노테이션 기반 개발");
		boardDO.setWriter("이두희");
		boardDO.setContent("어노테이션 개념 학습");
		boardService.insertBoard(boardDO);
		
		// 3. 게시글 전체 목록보기 기능 테스트
		List<BoardDO> boardList = boardService.getBoardList();

		for(BoardDO board : boardList) {  // 확장된 for문 => 주로 객체를 반복 처리할 때 사용
			System.out.println("---> " + board.toString());
		}
		// 4. 스프링 컨테이너 종료
		container.close();  // 자원해제
	}
}
