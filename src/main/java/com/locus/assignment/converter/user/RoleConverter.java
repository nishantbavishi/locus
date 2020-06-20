package com.locus.assignment.converter.user;

import com.locus.assignment.entity.user.Role;
import com.locus.assignment.model.user.RoleDto;

public class RoleConverter {

    public static RoleDto convert(Role role) {
        return RoleDto.builder()
                .id(role.getId())
                .name(role.getName())
                .build();
    }

    public static Role convert(RoleDto roleDto) {
        Role role = Role.builder()
                .name(roleDto.getName())
                .build();

        role.setId(roleDto.getId());
        return role;
    }

}
