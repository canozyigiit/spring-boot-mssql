package com.can.springbootmssql.service;

import com.can.springbootmssql.model.Solution;
import com.can.springbootmssql.repository.SolutionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class SolutionServiceImpl implements SolutionService{

    private final SolutionRepository solutionRepository;
    @Override
    public List<Solution> getAllSolutions() {
        return solutionRepository.findAll();
    }

    @Override
    public Solution createSolution(Solution solution) {
        return solutionRepository.save(solution);
    }

    @Override
    public Solution getSolutionById(Integer id) {
        return solutionRepository.findById(id).orElseThrow();
    }
}
