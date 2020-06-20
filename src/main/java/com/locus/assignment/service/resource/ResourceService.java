package com.locus.assignment.service.resource;

import com.locus.assignment.model.resource.ResourceDto;
import com.locus.assignment.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ResourceService extends AbstractService<ResourceDto> {


    @Override
    public ResourceDto createOrUpdate(ResourceDto resourceDto) {
        return null;
    }

    @Override
    public ResourceDto findById(Integer id) {
        return null;
    }
}
