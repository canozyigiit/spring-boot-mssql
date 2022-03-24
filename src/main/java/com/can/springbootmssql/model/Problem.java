package com.can.springbootmssql.model;


import com.can.springbootmssql.model.Audit.AuditModel;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "problems")
public class Problem extends AuditModel<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String description;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "problem_solutions",
            joinColumns = {
                    @JoinColumn(name = "problem_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "solution_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    Set<Solution> solutions = new HashSet<>();

}
