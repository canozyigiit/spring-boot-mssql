package com.can.springbootmssql.model;


import com.can.springbootmssql.model.Audit.AuditModel;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(ProblemSolution.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "problem_solutions")
public class ProblemSolution  implements Serializable {

    @Id
    Integer problem_id;
    @Id
    Integer solution_id;
}
