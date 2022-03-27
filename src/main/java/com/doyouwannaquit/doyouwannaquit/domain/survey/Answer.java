package com.doyouwannaquit.doyouwannaquit.domain.survey;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "ANSWER")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "q_id")
    private Question question;

    @NotNull
    @Column(name = "q_score")
    private Long score;

}
