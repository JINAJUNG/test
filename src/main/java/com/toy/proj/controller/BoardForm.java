package com.toy.proj.controller;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class BoardForm {
	
	private Integer seq;
	@NotNull
	private String user;
	@NotNull
	private String title;
	@NotNull
	private String contents;
	private Integer connectBoard;
}
