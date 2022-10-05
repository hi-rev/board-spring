package com.example.boardspring.repository;

import com.example.boardspring.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
