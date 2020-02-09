package com.toy.proj.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import lombok.Data;

@Entity
@Table
@Data
public class Reply {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer seq;
	@JoinColumn(name = "board_id",referencedColumnName = "seq")
	@OneToOne
	private Board board;
	private String user;
	private String contents;
	private Integer connectReply;
	@ColumnDefault(value = "0")
	private Integer depth;
}
