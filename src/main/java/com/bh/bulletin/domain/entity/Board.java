package com.bh.bulletin.domain.entity;

import com.bh.bulletin.domain.repository.TimeEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board extends TimeEntity {

    @Id @GeneratedValue
    private Long id;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(length =100, nullable = false)
    private String title;

    @Column(columnDefinition = "text", nullable = false)
    private String content;

    @Builder
    public Board(Long id, String writer, String title, String content){
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.content = content;
    }
}
