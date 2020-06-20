package com.locus.assignment.dao.resource;

import com.locus.assignment.entity.resource.Resource;
import com.locus.assignment.model.resource.ResourceDto;
import com.locus.assignment.service.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface ResourceRepository  extends JpaRepository<Resource, Integer> {


}
