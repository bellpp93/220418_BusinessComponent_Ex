package com.company.business.board;

import java.sql.Date;

/*
 * 개발자가 클래스를 생성하면 기본적으로 Object 클래스로부터 상속을 받는다.
 */
// 멤버 필드 or 중간저장소
public class BoardDO {
	private int seq;		// 게시글 번호
	private String title;	// 제목
	private String writer;	// 작성자
	private String content;	// 내용
	private Date regdate;	// 작성일자
	private int cnt;		// 조회수
	
	// 멤버 필드 하나당 getter, setter 메소드
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	// 추가 => Object 최상위 클래스의 toString() 메소드를 오버라이드 시킨다.
	// 개발 시 소스가 잘 코딩되어 있는지 테스트하기 위해서 toString() 메소드를 오버라이드 시킨다.
	@Override  // 어노테이션
	public String toString() {
		return "BoardDO [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regdate="
				+ regdate + ", cnt=" + cnt + "]";
	}
}
