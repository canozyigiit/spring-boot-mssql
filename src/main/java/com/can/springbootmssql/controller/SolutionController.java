package com.can.springbootmssql.controller;


import com.can.springbootmssql.model.Solution;
import com.can.springbootmssql.service.SolutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/solutions")
public class SolutionController {
    
    private final SolutionService solutionService;

    @GetMapping("")
    public List<Solution> getAllSolutions(){
        return solutionService.getAllSolutions();
    }

    @PostMapping("")
    public Solution createSolution(@RequestBody Solution Solution){
        return solutionService.createSolution(Solution);
    }

    @GetMapping("{id}")
    public Solution getSolutionById(@PathVariable Integer id){
        return solutionService.getSolutionById(id);
    }

}
