package org.example.boardservice.repository;

import org.example.boardservice.Entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ReplyRepository  extends JpaRepository<Reply, Long> {
    @Modifying
    @Query("delete from  Reply r where r.board.bno =:bno ")
    void  deleteByBno(Long bno);
}
