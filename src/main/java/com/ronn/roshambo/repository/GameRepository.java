package com.ronn.roshambo.repository;

import com.ronn.roshambo.dto.ResultDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<ResultDTO, Long> {
}
