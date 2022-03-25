package com.doyouwannaquit.doyouwannaquit.controller;

import com.doyouwannaquit.doyouwannaquit.domain.TestBoard;
import com.doyouwannaquit.doyouwannaquit.dto.TestBoardResponseDto;
import com.doyouwannaquit.doyouwannaquit.repository.TestBoardRepository;
import com.doyouwannaquit.doyouwannaquit.service.TestBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TestBoardApiController {

    private final TestBoardRepository testBoardRepository;
    private final TestBoardService testBoardService;

    @PostMapping("/test")
    public Long save(@RequestBody TestBoard testBoard){
        return testBoardService.save(testBoard);
    }

    @GetMapping("/test/{id}")
    public TestBoardResponseDto findById(@PathVariable Long id){
        return  testBoardService.findById(id);
    }
}
