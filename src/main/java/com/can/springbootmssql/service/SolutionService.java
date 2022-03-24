package com.can.springbootmssql.service;

import com.can.springbootmssql.model.Problem;
import com.can.springbootmssql.model.Solution;

import java.util.List;

public interface SolutionService {

    List<Solution> getAllSolutions();
    Solution createSolution(Solution solution);
    Solution getSolutionById(Integer id);
}
