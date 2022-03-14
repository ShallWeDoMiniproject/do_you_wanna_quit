package com.doyouwannaquit.doyouwannaquit.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class TestBoard {

    @Id @GeneratedValue
    @Column(name = "test_id")
    private Long id;

    private String title;
    private String content;


}
