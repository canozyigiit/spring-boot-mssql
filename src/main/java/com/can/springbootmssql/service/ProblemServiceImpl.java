package com.can.springbootmssql.service;

import com.can.springbootmssql.model.Problem;
import com.can.springbootmssql.repository.ProblemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProblemServiceImpl implements ProblemService{

    private final ProblemRepository problemRepository;
    @Override
    public List<Problem> getAllProblems() {
        return problemRepository.findAll();
    }

    @Override
    public Problem createProblem(Problem problem) {
        return problemRepository.save(problem);
    }

    @Override
    public Problem getProblemById(Integer id) {
        return problemRepository.findById(id).orElseThrow();
    }
}
