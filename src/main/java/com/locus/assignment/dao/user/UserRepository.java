
package com.locus.assignment.dao.user;

import com.locus.assignment.entity.user.User;
import com.locus.assignment.model.user.UserDto;
import com.locus.assignment.service.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface UserRepository extends JpaRepository<User, Integer> {

}