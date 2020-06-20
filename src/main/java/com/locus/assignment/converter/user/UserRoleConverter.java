package com.locus.assignment.converter.user;

import com.locus.assignment.entity.user.UserRole;
import com.locus.assignment.model.user.UserRoleDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleConverter {

    private Integer id;
    private Integer userId;
    private Integer roleId;
    private Integer active;

    public static UserRoleDto convert(UserRole userRole) {

        return UserRoleDto.builder()
                .id(userRole.getId())
                .userId(userRole.getUserId())
                .roleId(userRole.getRoleId())
                .active(userRole.getActive())
                .build();
    }

    public static UserRole convert(UserRoleDto userRoleDto) {

        UserRole userRole =  UserRole.builder()
                .userId(userRoleDto.getUserId())
                .roleId(userRoleDto.getRoleId())
                .active(userRoleDto.getActive())
                .build();

        userRole.setId(userRoleDto.getId());
        return userRole;
    }
}
