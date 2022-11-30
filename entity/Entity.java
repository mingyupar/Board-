package src.main.java.com.example.hanghae.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public @interface Entity {

        import com.example.hanghae.entity.Board;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<src.main.java.com.example.hanghae.entity.Board, Long> {
}
}