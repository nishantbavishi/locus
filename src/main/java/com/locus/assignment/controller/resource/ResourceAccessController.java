package com.locus.assignment.controller.resource;

import com.locus.assignment.service.resource.ResourceAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resourceaccess")
public class ResourceAccessController {

    @Autowired private ResourceAccessService resourceAccessService;

    @GetMapping("/isallowed")
    public String isAllowed(@RequestParam(value = "resourceId") Integer resourceId,
                           @RequestParam(value = "userId") Integer userId,
                           @RequestParam(value = "actionId") Integer actionId) {

        Boolean isallowed = resourceAccessService.isResourceAccessible(userId, resourceId, actionId);
        return new String(isallowed + "");
    }
}
