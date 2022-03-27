package com.doyouwannaquit.doyouwannaquit.domain.survey;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "SURVEY")
public class Survey {

    @Id
    @Column(name = "session_id")
    private Long id;

    @Column(name = "survey_date")
    private String date;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "sex")
    private String sex;

    @Column(name = "age")
    private String age;

    @OneToOne
    @JoinColumn(name = "session_id")
    private Result result;
}
