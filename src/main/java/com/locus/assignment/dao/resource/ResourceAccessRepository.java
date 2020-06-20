package com.locus.assignment.dao.resource;

import com.locus.assignment.entity.resource.ResourceAccess;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ResourceAccessRepository extends JpaRepository<ResourceAccess, Integer> {

    boolean existsByResourceIdAndActionIdAndRoleIdIn(Integer resourceId, Integer actionId, List<Integer> roleIds);
}
