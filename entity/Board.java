package src.main.java.com.example.hanghae;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@src.main.java.com.example.hanghae.entity.Entity
@NoArgsConstructor
public class Board extends src.main.java.com.example.hanghae.entity.Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String contents;

    public Board(src.main.java.com.example.hanghae.controller.BoardRequestDto requestDto) {

            src.main.java.com.example.hanghae.entity.Board board = new Board(requestDto);
            this.username = (String) requestDto.getUserName();
            this.contents = (String) requestDto.getUserContents();
        }
    }
    }
}