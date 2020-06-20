package com.locus.assignment.converter.resource;

import com.locus.assignment.entity.resource.ResourceAccess;
import com.locus.assignment.model.resource.ResourceAccessDto;

public class ResourceAccessConverter {

    public static ResourceAccessDto convert(ResourceAccess resourceAccess) {

        return ResourceAccessDto.builder()
                .id(resourceAccess.getId())
                .actionId(resourceAccess.getActionId())
                .resourceId(resourceAccess.getResourceId())
                .roleId(resourceAccess.getRoleId())
                .build();
    }

    public static ResourceAccess convert(ResourceAccessDto resourceAccessDto) {

        ResourceAccess resourceAccess = ResourceAccess.builder()
                .actionId(resourceAccessDto.getActionId())
                .resourceId(resourceAccessDto.getResourceId())
                .roleId(resourceAccessDto.getRoleId())
                .build();

        resourceAccess.setId(resourceAccessDto.getId());
        return resourceAccess;
    }
}
