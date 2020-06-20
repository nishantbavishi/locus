package com.locus.assignment.entity.resource;

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
@Entity(name = "resource")
@Where(clause = "deleted = 0")
public class Resource extends BaseEntityIntID {

    @Column(name = "name")
    private String name;
}
