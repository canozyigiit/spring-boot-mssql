package com.can.springbootmssql.service;

import com.can.springbootmssql.model.Problem;

import java.util.List;

public interface ProblemService {

    List<Problem> getAllProblems();
    Problem createProblem(Problem problem);
    Problem getProblemById(Integer id);

}
