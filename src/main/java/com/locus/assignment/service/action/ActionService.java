package com.locus.assignment.service.action;

import com.locus.assignment.model.action.ActionDto;
import com.locus.assignment.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ActionService extends AbstractService<ActionDto> {


    @Override
    public ActionDto createOrUpdate(ActionDto actionDto) {
        return null;
    }

    @Override
    public ActionDto findById(Integer id) {
        return null;
    }
}
