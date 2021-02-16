package com.apphouse.evaluation.mapper;

import com.apphouse.evaluation.dto.EnderecoDTO;
import com.apphouse.evaluation.domain.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EnderecoMapper extends BaseMapper<Endereco, EnderecoDTO> {


}
