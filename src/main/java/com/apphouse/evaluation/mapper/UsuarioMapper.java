package com.apphouse.evaluation.mapper;

import com.apphouse.evaluation.dto.UsuarioDTO;
import com.apphouse.evaluation.domain.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsuarioMapper extends BaseMapper<Usuario, UsuarioDTO> {


}
