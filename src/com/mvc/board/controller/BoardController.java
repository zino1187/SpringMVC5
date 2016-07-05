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
	
	//�� �޼��尡 ���۵Ƿ���, Ŭ���̾�Ʈ�� get������� ��û�� �ؾ��Ѵ�.
	@RequestMapping(value="/board", method=RequestMethod.GET)
	public String selectAll(){
		System.out.println("selectAll �޼��� ȣ���߾�!!");
		return "board/list";
	}
	
	//��Ͽ�û ó�� 
	@RequestMapping(value="/board", method=RequestMethod.POST)
	public String insert(ReBoard board){
		boardService.insert(board);
		return null;
	}
	
	
}




