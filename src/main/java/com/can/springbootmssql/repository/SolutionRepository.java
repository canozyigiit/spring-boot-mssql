package com.can.springbootmssql.repository;

import com.can.springbootmssql.model.Solution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SolutionRepository extends JpaRepository<Solution,Integer> {
}
