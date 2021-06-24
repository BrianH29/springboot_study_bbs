package com.bh.bulletin.repository;

import com.bh.bulletin.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    //JpaRepository에서는 By 뒷 부분은 SQL의 where 조건 절에 해당된다. 따라서, Containing을 붙여주면 Like 검색이 된다.
    List<Board> findByTitleContaining(String keyword);
}
