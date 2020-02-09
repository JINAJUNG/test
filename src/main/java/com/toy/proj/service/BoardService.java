package com.toy.proj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.proj.controller.BoardForm;
import com.toy.proj.entity.Board;
import com.toy.proj.repo.BoardRepo;

@Service
public class BoardService {
	@Autowired
	private BoardRepo boardRepo;
	
	public void create(BoardForm form) {
		boardRepo.save(changeEntity(form));
	}
	
	public Board getOne(Integer seq) {
		return boardRepo.findById(seq).orElseThrow(()->new RuntimeException("없는 글"));
	}
	
	private Board changeEntity(BoardForm form) {
		Board entity = new Board();
		entity.setTitle(form.getTitle());
		entity.setContents(form.getContents());
		entity.setConnectBoard(form.getConnectBoard());
		return entity;
	}
}
