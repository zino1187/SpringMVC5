package com.mvc.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.board.domain.ReBoard;
import com.mvc.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	//이 메서드가 동작되려면, 클라이언트는 get방식으로 요청을 해야한다.
	@RequestMapping(value="/board", method=RequestMethod.GET)
	public String selectAll(){
		System.out.println("selectAll 메서드 호출했어!!");
		return "board/list";
	}
	
	//등록요청 처리 
	@RequestMapping(value="/board", method=RequestMethod.POST)
	public String insert(ReBoard board){
		boardService.insert(board);
		return null;
	}
	
	
}




