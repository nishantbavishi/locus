package com.locus.assignment.dao.action;

import com.locus.assignment.entity.action.Action;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ActionRepository  extends JpaRepository<Action, Integer> {


}
