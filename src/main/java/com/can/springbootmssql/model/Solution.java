package com.can.springbootmssql.model;


import com.can.springbootmssql.model.Audit.AuditModel;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "solutions")
public class Solution  extends AuditModel<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String description;

    @ManyToMany(mappedBy = "solutions", fetch = FetchType.LAZY)
    Set<Problem> problems = new HashSet<>();
}
