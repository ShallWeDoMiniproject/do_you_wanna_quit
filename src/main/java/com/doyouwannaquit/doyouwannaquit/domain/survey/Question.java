package com.doyouwannaquit.doyouwannaquit.domain.survey;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "QUESTION")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "q_id")
    private Long id;

    @NotNull
    @Column(name = "q_context")
    private String context;

    @NotNull
    @Column(name = "q_type")
    private String category;
}
