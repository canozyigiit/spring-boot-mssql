package com.can.springbootmssql.service;


import com.can.springbootmssql.model.Problem;
import com.can.springbootmssql.model.ProblemSolution;
import com.can.springbootmssql.model.Solution;
import com.can.springbootmssql.repository.ProblemSolutionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProblemSolutionServiceImpl implements ProblemSolutionService {
    private final ProblemSolutionRepository problemSolutionRepository;
    private final ProblemService problemService;
    private final SolutionService solutionService;

    @Override
    public List<ProblemSolution> getAllProblemSolutions() {
        return problemSolutionRepository.findAll();
    }

    @Override
    public ProblemSolution createProblemSolution(ProblemSolution problemSolution) {
      Problem problem =  problemService.getProblemById(problemSolution.getProblem_id());
      Solution solution = solutionService.getSolutionById(problemSolution.getSolution_id());

      problem.getSolutions();
        return problemSolutionRepository.save(problemSolution);
    }

}
