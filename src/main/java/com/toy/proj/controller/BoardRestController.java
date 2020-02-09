package com.toy.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toy.proj.service.BoardService;

@RestController
@RequestMapping("/api/board")
public class BoardRestController {

	@Autowired
	private BoardService boardService;

	@PostMapping
	public ResponseEntity getCreate(@RequestBody BoardForm form) {
		boardService.create(form);
		return new ResponseEntity(HttpStatus.OK);
	}
}
