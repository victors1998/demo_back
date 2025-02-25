package com.eusebio.service.impl;

import com.eusebio.model.Accionista;
import com.eusebio.repo.IAccionistaRepo;
import com.eusebio.repo.IGenericoRepo;
import com.eusebio.service.IAccionistaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccionistaServiceImpl extends CRUDImpl<Accionista, Integer> implements IAccionistaService {

    private final IAccionistaRepo accionistaRepo;

    @Override
    protected IGenericoRepo<Accionista, Integer> getRepo() {
        return accionistaRepo;
    }
}
