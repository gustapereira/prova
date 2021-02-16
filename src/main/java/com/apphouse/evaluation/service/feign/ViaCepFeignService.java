package com.apphouse.evaluation.service.feign;

import com.apphouse.evaluation.dto.EnderecoViaCepDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "api.viacep", url = "${api.viacep.url}")
public interface ViaCepFeignService {

    @GetMapping("/{cep}/json")
    EnderecoViaCepDTO consultarEndereco(
            @PathVariable("cep") final String cep
    );
}
