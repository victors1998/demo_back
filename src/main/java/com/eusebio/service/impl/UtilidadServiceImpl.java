package com.eusebio.service.impl;

import com.eusebio.model.Utilidad;
import com.eusebio.repo.IGenericoRepo;
import com.eusebio.repo.IUtilidadRepo;
import com.eusebio.service.IUtilidadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UtilidadServiceImpl extends CRUDImpl<Utilidad, Integer> implements IUtilidadService {

    private  IUtilidadRepo utilidadRepo;

    @Override
    protected IGenericoRepo<Utilidad, Integer> getRepo() {
        return utilidadRepo;
    }
}
