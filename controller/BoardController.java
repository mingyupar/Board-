package com.example.hanghae.controller;

import com.example.hanghae.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;,RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @src.main.java.com.example.hanghae.controller.GetMapping("/")
    public src.main.java.com.example.hanghae.controller.ModelAndView home() {
        return new src.main.java.com.example.hanghae.controller.ModelAndView("index");
    }

    @src.main.java.com.example.hanghae.controller.PostMapping("/api/board")
    public src.main.java.com.example.hanghae.controller.Board creatBoard(@src.main.java.com.example.hanghae.controller.RequestBody src.main.java.com.example.hanghae.controller.BoardRequestDto requestDto) {

        return boardService.createwrite(requestDto);
    }

    @GetMapping("/api/board")
    public List<boards> getboard() {
        return boardService.getBoard()
    }


}
