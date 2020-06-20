package com.locus.assignment.dao.user;

import com.locus.assignment.entity.user.Role;
import com.locus.assignment.model.user.RoleDto;
import com.locus.assignment.service.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface RoleRepository extends JpaRepository<Role, Integer> {


}
