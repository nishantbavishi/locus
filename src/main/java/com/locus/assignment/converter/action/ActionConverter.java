package com.locus.assignment.converter.action;

import com.locus.assignment.entity.action.Action;
import com.locus.assignment.model.action.ActionDto;

public class ActionConverter  {

    public static ActionDto convert(Action action) {

        return ActionDto.builder()
                .id(action.getId())
                .type(action.getType())
                .build();
    }

    public static Action convert(ActionDto actionDto) {

        Action action = Action.builder()
                .type(actionDto.getType())
                .build();

        action.setId(actionDto.getId());
        return action;
    }
}
