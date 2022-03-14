package com.doyouwannaquit.doyouwannaquit.controller;

import com.doyouwannaquit.doyouwannaquit.domain.TestBoard;
import com.doyouwannaquit.doyouwannaquit.repository.TestBoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TestBoardController {

    private final TestBoardRepository testBoardRepository;

    @PostMapping("/test/")
    public Long save(@RequestBody TestBoard testBoard){
        return testBoardRepository.save(testBoard).getId();
    }

    @GetMapping("/test/{id}")
    public Optional<TestBoard> findById(@PathVariable Long id){
        return  testBoardRepository.findById(id);
    }
}
