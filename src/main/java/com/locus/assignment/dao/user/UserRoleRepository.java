package com.locus.assignment.dao.user;

import com.locus.assignment.entity.user.UserRole;
import com.locus.assignment.model.user.UserRoleDto;
import com.locus.assignment.service.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

    List<UserRole> findByUserIdAndActive(Integer userId, Integer active);

    UserRole findByUserIdAndRoleIdAndActive(Integer userId, Integer roleId, Integer active);
}
