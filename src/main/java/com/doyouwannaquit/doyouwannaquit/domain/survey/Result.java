package com.doyouwannaquit.doyouwannaquit.domain.survey;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "RESULT")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private Long Id;

    @OneToOne(mappedBy = "result")
    private Survey survey;

    @NotNull
    @Column(name = "result_sum")
    private Long resultScore;
}
