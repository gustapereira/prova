package com.apphouse.evaluation.service;

import com.apphouse.evaluation.dto.EnderecoViaCepDTO;
import com.apphouse.evaluation.domain.Endereco;
import com.apphouse.evaluation.service.feign.ViaCepFeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EnderecoService {

    private final ViaCepFeignService viaCepFeignService;


    public Endereco buscarViaCep(String cep) {
        EnderecoViaCepDTO viaCep = viaCepFeignService.consultarEndereco(cep);
        return Endereco.builder()
                .bairro(viaCep.getBairro())
                .cep(viaCep.getCep())
                .cidade(viaCep.getLocalidade())
                .logradouro(viaCep.getLogradouro())
                .uf(viaCep.getUf())
                .complemento(viaCep.getComplemento())
                .build();
    }

}
