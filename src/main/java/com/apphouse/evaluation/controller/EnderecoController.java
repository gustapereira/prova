package com.apphouse.evaluation.controller;

import com.apphouse.evaluation.dto.EnderecoDTO;
import com.apphouse.evaluation.mapper.EnderecoMapper;
import com.apphouse.evaluation.service.EnderecoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enderecos")
@Api(tags = "Endereços")
@RequiredArgsConstructor
public class EnderecoController {

    private final EnderecoService enderecoService;
    private final EnderecoMapper mapper;

    @GetMapping("/{cep}")
    @ApiOperation("ViaCep servico publico de consulta a Cep`s.")
    public ResponseEntity<EnderecoDTO> buscarViaCep(@PathVariable("cep") String cep) {
        return ResponseEntity.ok(mapper.toDto(enderecoService.buscarViaCep(cep)));
    }

}
