package com.locus.assignment.converter.resource;

import com.locus.assignment.entity.resource.Resource;
import com.locus.assignment.model.resource.ResourceDto;


public class ResourceConverter {

    public static ResourceDto convert(Resource resource) {
        return ResourceDto.builder()
                .id(resource.getId())
                .name(resource.getName())
                .build();
    }

    public static Resource convert(ResourceDto resourceDto) {
        Resource resource = Resource.builder()
                .name(resourceDto.getName())
                .build();

        resource.setId(resourceDto.getId());
        return resource;
    }
}
