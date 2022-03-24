package com.can.springbootmssql.model;


import com.can.springbootmssql.model.Audit.AuditModel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

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
@Table(name = "solutions")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","problems"})

public class Solution  extends AuditModel<String>  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String description;


    @ManyToMany(mappedBy = "solutions", fetch = FetchType.LAZY,cascade=CascadeType.ALL)
    List<Problem> problems;
}
