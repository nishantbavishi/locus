package com.locus.assignment.service.user;

import com.locus.assignment.converter.user.UserRoleConverter;
import com.locus.assignment.dao.user.UserRoleRepository;
import com.locus.assignment.entity.user.UserRole;
import com.locus.assignment.model.user.UserRoleDto;
import com.locus.assignment.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserRoleService extends AbstractService<UserRoleDto> {

    @Autowired private UserRoleRepository userRoleRepository;

    @Override
    public UserRoleDto createOrUpdate(UserRoleDto userRoleDto) {
        return null;
    }

    @Override
    public UserRoleDto findById(Integer id) {
        return null;
    }

    public UserRoleDto assignRole(Integer userId, Integer roleId) {

        UserRoleDto userRoleDto = UserRoleDto.builder()
                .userId(userId)
                .roleId(roleId)
                .active(1)
                .build();

        UserRole userRole = userRoleRepository.save(UserRoleConverter.convert(userRoleDto));

        return UserRoleConverter.convert(userRole);
    }

    public void unAssignRole(Integer userId, Integer roleId) {

        UserRole userRole = userRoleRepository.findByUserIdAndRoleIdAndActive(userId, roleId, 1);
        if(userRole != null) {
            userRole.setActive(0);
            userRoleRepository.save(userRole);
        }
    }

    /**
     * Active = 0 (Means Inactive)
     * Active = 1 (Means Active)
     * @param userId
     * @param active
     * @return
     */
    public List<UserRoleDto> findbyUserIdAndActive(Integer userId, Integer active) {

        List<UserRole> userRoles = userRoleRepository.findByUserIdAndActive(userId, active);

        List<UserRoleDto> userRoleDtos = new ArrayList<>();
        for(UserRole userRole : userRoles) {
            userRoleDtos.add(UserRoleConverter.convert(userRole));
        }

        return userRoleDtos;
    }
}
