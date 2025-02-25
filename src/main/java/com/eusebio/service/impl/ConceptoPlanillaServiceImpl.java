package com.eusebio.service.impl;

import com.eusebio.model.ConceptoPlanilla;
import com.eusebio.repo.IConceptoPlanillaRepo;
import com.eusebio.repo.IGenericoRepo;
import com.eusebio.service.IConceptoPlanillaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConceptoPlanillaServiceImpl extends CRUDImpl<ConceptoPlanilla, Integer> implements IConceptoPlanillaService {

    private final IConceptoPlanillaRepo repo;

    @Override
    protected IGenericoRepo<ConceptoPlanilla, Integer> getRepo() {
        return repo;
    }
}
