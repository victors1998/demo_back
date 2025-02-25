package com.eusebio.service.impl;

import com.eusebio.exception.ModelNotFoundException;
import com.eusebio.repo.IGenericoRepo;
import com.eusebio.service.ICRUD;

import java.util.List;

public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID> {

    protected abstract IGenericoRepo<T, ID> getRepo();

    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public T update(ID id, T t) {
        getRepo().findById(id).orElseThrow( () -> new ModelNotFoundException("NO SE ENCONTRO LA ID: "+ id));
        return getRepo().save(t);
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElseThrow( () -> new ModelNotFoundException("NO SE ENCONTRO LA ID: "+ id));
    }

    @Override
    public void delete(ID id) {
        getRepo().findById(id).orElseThrow( () -> new ModelNotFoundException("NO SE ENCONTRO LA ID: "+ id));
        getRepo().deleteById(id);
    }
}
