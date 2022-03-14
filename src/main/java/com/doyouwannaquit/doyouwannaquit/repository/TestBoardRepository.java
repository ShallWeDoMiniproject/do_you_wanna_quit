package com.doyouwannaquit.doyouwannaquit.repository;

import com.doyouwannaquit.doyouwannaquit.domain.TestBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestBoardRepository extends JpaRepository<TestBoard,Long> {
}
