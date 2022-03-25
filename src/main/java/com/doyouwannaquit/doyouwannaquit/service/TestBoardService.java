package com.doyouwannaquit.doyouwannaquit.service;

import com.doyouwannaquit.doyouwannaquit.domain.TestBoard;
import com.doyouwannaquit.doyouwannaquit.dto.TestBoardResponseDto;
import com.doyouwannaquit.doyouwannaquit.repository.TestBoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestBoardService {

    private final TestBoardRepository testBoardRepository;

    public Long save(TestBoard testBoard){
        return testBoardRepository.save(testBoard).getId();
    }

    public TestBoardResponseDto findById(Long id){
        TestBoard testBoard = testBoardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 데이터가 없습니다. "));
        return new TestBoardResponseDto(testBoard);
    }

}
