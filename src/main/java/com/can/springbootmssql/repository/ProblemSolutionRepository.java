package com.can.springbootmssql.repository;

import com.can.springbootmssql.model.ProblemSolution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemSolutionRepository extends JpaRepository<ProblemSolution,Integer> {
}
