package com.can.springbootmssql.controller;


import com.can.springbootmssql.model.Problem;
import com.can.springbootmssql.model.ProblemSolution;
import com.can.springbootmssql.service.ProblemSolutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/problemSolutions")
public class ProblemSolutionController {
    private final ProblemSolutionService problemSolutionService;

    @GetMapping("")
    public List<ProblemSolution> getAllProblems(){
        return problemSolutionService.getAllProblemSolutions();
    }

    @PostMapping("")
    public ProblemSolution createProblemSolution(@RequestBody ProblemSolution problemSolution){
        return problemSolutionService.createProblemSolution(problemSolution);
    }
}
