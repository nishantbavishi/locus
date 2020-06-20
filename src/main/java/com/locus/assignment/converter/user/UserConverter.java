
package com.locus.assignment.converter.user;

import com.locus.assignment.entity.user.User;
import com.locus.assignment.model.user.UserDto;

public class UserConverter {

    public static UserDto convert(User user) {
        return UserDto.builder()
                .id(user.getId())
                .username(user.getUsername())
                .build();
    }

    public static User convert(UserDto userDto) {
        User user = User.builder()
                .username(userDto.getUsername())
                .build();

        user.setId(userDto.getId());
        return user;
    }

}