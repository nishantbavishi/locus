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
@Entity(name = "resource_access")
@Where(clause = "deleted = 0")
public class ResourceAccess extends BaseEntityIntID {

    @Column(name = "resource_id")
    private Integer resourceId;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "action_id")
    private Integer actionId;
}
