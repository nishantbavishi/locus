package com.locus.assignment.entity.user;

import com.locus.assignment.entity.BaseEntityIntID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "role")
@Where(clause = "deleted = 0")
public class Role extends BaseEntityIntID {

    @Column(name = "name")
    private String name;


}
