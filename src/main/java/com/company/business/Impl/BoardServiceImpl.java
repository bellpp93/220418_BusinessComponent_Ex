package com.company.business.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.business.board.BoardDO;
import com.company.business.board.BoardService;

/*
 * 다형성(polymorphism)이란 하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미합니다.
 * 자바에서는 이러한 다형성을 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있도록 하여 구현하고 있습니다.
 * 다형성은 상속, 추상화와 더불어 객체 지향 프로그래밍을 구성하는 중요한 특징 중 하나입니다.
 */
// 다형성 => 인터페이스를 적용하여 해결한다.

// 비즈니스 로직을 처리하는 클래스
@Service("boardService")
public class BoardServiceImpl implements BoardService {  // 구현 클래스
	// [중요]
	@Autowired
	private BoardDAO boardDAO;  // 스프링 컨테이너가 이미 만들어진 객체를 의존성 주입(DI)
	
	@Override
	public void insertBoard(BoardDO boardDO) {
		boardDAO.insertBoard(boardDO);
	}

	@Override
	public void updateBoard(BoardDO boardDO) {
		
	}

	@Override
	public void deleteBoard(BoardDO boardDO) {
		
	}

	@Override  // 재정의
	public List<BoardDO> getBoardList() {
		return boardDAO.getBoardList();
	}

	@Override
	public BoardDO getBoard(BoardDO boardDO) {

		return null;
	}
	
}
