package com.can.springbootmssql.service;

import com.can.springbootmssql.model.Problem;
import com.can.springbootmssql.model.ProblemSolution;

import java.util.List;

public interface ProblemSolutionService {

    List<ProblemSolution> getAllProblemSolutions();

    ProblemSolution createProblemSolution(ProblemSolution problemSolution);
}
