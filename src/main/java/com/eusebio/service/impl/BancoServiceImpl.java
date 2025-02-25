package com.eusebio.service.impl;

import com.eusebio.model.Banco;
import com.eusebio.repo.IBancoRepo;
import com.eusebio.repo.IGenericoRepo;
import com.eusebio.service.IBancoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BancoServiceImpl extends CRUDImpl<Banco, Integer> implements IBancoService {

    private final IBancoRepo bancoRepo;

    @Override
    protected IGenericoRepo<Banco, Integer> getRepo() {
        return null;
    }
}
