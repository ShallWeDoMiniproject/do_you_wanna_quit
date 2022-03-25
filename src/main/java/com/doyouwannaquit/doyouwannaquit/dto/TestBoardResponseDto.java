package com.doyouwannaquit.doyouwannaquit.dto;

import com.doyouwannaquit.doyouwannaquit.domain.TestBoard;
import lombok.Getter;

@Getter
public class TestBoardResponseDto {
    private String title;
    private String content;

    public TestBoardResponseDto(TestBoard testBoard){
        this.title=testBoard.getTitle();
        this.content=testBoard.getContent();
    }
}
