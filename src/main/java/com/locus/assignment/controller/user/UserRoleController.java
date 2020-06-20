package com.locus.assignment.controller.user;

import com.locus.assignment.service.user.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userrole")
public class UserRoleController {

    @Autowired private UserRoleService userRoleService;

    @GetMapping("/assign")
    public String assign(@RequestParam(value = "userId") Integer userId, @RequestParam(value = "roleId") Integer roleId) {
        userRoleService.assignRole(userId,roleId);
        return new String("UserId : " + userId + " was assigned roleId : " + roleId);
    }

    @GetMapping("/unassign")
    public String unassign(@RequestParam(value = "userId") Integer userId, @RequestParam(value = "roleId") Integer roleId) {
        userRoleService.unAssignRole(userId,roleId);
        return new String("UserId : " + userId + " was unassigned roleId : " + roleId);
    }

}
