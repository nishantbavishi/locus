package com.locus.assignment.entity.action;

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
@Entity(name = "action")
@Where(clause = "deleted = 0")
public class Action extends BaseEntityIntID {

    @Column(name = "type")
    private String type;
}
