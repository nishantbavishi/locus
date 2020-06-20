package com.locus.assignment.service;

public abstract class AbstractService<M> {

    public abstract M createOrUpdate(M m);
    public abstract M findById(Integer id);

}
