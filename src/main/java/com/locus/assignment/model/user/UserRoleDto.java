package com.locus.assignment.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleDto {

    private Integer id;
    private Integer userId;
    private Integer roleId;
    private Integer active;
}
