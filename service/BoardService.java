package com.example.hanghae.service;

import com.example.hanghae.controller.boards;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import src.main.java.com.example.hanghae.dto.BoarRequestDto;
import src.main.java.com.example.hanghae.entity.Board;

import java.util.List;

public class BoardService {
    private Object username;
    private Object contents;

    @PostMapping("/api/memos")
    public BoardService createwrite(@RequestBody BoarRequestDto requestDto, Object boardService) {
   
       private final src.main.java.com.example.hanghae.repository.BoardRepository;

       @Transactional
       public src.main.java.com.example.hanghae.entity.Board createBoard Object src = new src.main.java.com.example.hanghae.controller.Board(requestDto);
        src.main.java.com.example.hanghae.controller.Board board;
        src.main.java.com.example.hanghae.repository.BoardRepository.save(board);
        return board;
    }

    public List<boards> getBoard() {
        List<boards> boardRepository;
        return boardRepository.findAll();
        return boardRepository.findAll();
    }
}


