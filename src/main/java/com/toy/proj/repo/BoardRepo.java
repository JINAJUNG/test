package com.toy.proj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toy.proj.entity.Board;

public interface BoardRepo extends JpaRepository<Board, Integer>{

}
