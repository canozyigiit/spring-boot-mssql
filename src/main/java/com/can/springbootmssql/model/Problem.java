package com.can.springbootmssql.model;


import com.can.springbootmssql.model.Audit.AuditModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "problems")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","solutions"})

public class Problem extends AuditModel<String> implements Serializable {

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
    @LazyCollection(LazyCollectionOption.FALSE)
    List<Solution> solutions ;

}
