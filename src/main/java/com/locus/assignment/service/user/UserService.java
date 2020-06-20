
package com.locus.assignment.service.user;

import com.locus.assignment.model.user.UserDto;
import com.locus.assignment.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<UserDto> {

    @Override
    public UserDto createOrUpdate(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto findById(Integer id) {
        return null;
    }
}