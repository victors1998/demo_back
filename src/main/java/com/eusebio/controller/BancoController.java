package com.eusebio.controller;

import com.eusebio.dto.BancoDTO;
import com.eusebio.service.IBancoService;
import com.eusebio.util.MapperUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bancos")
@RequiredArgsConstructor
public class BancoController {

    private final IBancoService bancoService;
    private final MapperUtil mapperUtil;

    @GetMapping
    public ResponseEntity<List<BancoDTO>> findAll() {
        //List<BancoDto> list = bancoService.findAll().stream().map(this::convertToDto).toList();
        List<BancoDTO> list = mapperUtil.mapList(bancoService.findAll(), BancoDTO.class);
        return ResponseEntity.ok(list);
    }
}
