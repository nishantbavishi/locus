package com.locus.assignment.service.resource;

import com.locus.assignment.dao.resource.ResourceAccessRepository;
import com.locus.assignment.model.resource.ResourceAccessDto;
import com.locus.assignment.model.user.UserRoleDto;
import com.locus.assignment.service.AbstractService;
import com.locus.assignment.service.user.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResourceAccessService extends AbstractService<ResourceAccessDto> {

    @Autowired private UserRoleService userRoleService;
    @Autowired private ResourceAccessRepository resourceAccessRepository;

    @Override
    public ResourceAccessDto createOrUpdate(ResourceAccessDto resourceAccessDto) {
        return null;
    }

    @Override
    public ResourceAccessDto findById(Integer id) {
        return null;
    }

    public boolean isResourceAccessible(Integer userId, Integer resourceId, Integer actionId) {

        List<UserRoleDto> userRoleDtos = userRoleService.findbyUserIdAndActive(userId, 1);
        List<Integer> roleIds = userRoleDtos.stream().map(k -> k.getRoleId()).collect(Collectors.toList());

        Boolean isallowed = resourceAccessRepository.existsByResourceIdAndActionIdAndRoleIdIn(resourceId, actionId, roleIds);
        return isallowed;
    }
}
