package src.main.java.com.example.hanghae.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<src.main.java.com.example.hanghae.controller.Board, Long> {
    List<src.main.java.com.example.hanghae.controller.Board> findAllByOrderByModifiedAtDesc();
}
