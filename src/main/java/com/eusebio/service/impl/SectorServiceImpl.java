package com.eusebio.service.impl;

import com.eusebio.model.Banco;
import com.eusebio.model.Sector;
import com.eusebio.repo.IGenericoRepo;
import com.eusebio.repo.ISectorRepo;
import com.eusebio.service.IBancoService;
import com.eusebio.service.ISectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SectorServiceImpl extends CRUDImpl<Sector, Integer> implements ISectorService {

    private final ISectorRepo sectorRepo;

    @Override
    protected IGenericoRepo<Sector, Integer> getRepo() {
        return sectorRepo;
    }
}
