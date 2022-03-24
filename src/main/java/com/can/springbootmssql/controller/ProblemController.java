package com.can.springbootmssql.controller;


import com.can.springbootmssql.model.Problem;
import com.can.springbootmssql.service.ProblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/problems")
@RequiredArgsConstructor
public class ProblemController {
    private final ProblemService problemService;


    @GetMapping("")
    public List<Problem> getAllProblems(){
        return problemService.getAllProblems();
    }

    @PostMapping("")
    public Problem createProblem(@RequestBody Problem problem){
        return problemService.createProblem(problem);
    }

    @GetMapping("{id}")
    public Problem getProblemById(@PathVariable Integer id){
        return problemService.getProblemById(id);
    }

}
