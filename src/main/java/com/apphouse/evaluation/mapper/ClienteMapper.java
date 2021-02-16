package com.apphouse.evaluation.mapper;

import com.apphouse.evaluation.dto.ClienteDTO;
import com.apphouse.evaluation.domain.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClienteMapper extends BaseMapper<Cliente, ClienteDTO> {


}
