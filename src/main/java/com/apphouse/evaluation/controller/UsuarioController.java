package com.apphouse.evaluation.controller;

import com.apphouse.evaluation.dto.UsuarioAuthDTO;
import com.apphouse.evaluation.dto.UsuarioDTO;
import com.apphouse.evaluation.mapper.UsuarioMapper;
import com.apphouse.evaluation.service.UsuarioService;
import com.apphouse.evaluation.domain.Usuario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.message.AuthException;
import java.util.List;


@RestController
@RequestMapping("/usuarios")
@Api(tags = "Usuários")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;
    private final UsuarioMapper mapper;

    @PostMapping
    @ApiOperation("Salvar uma usuarioss")
    public ResponseEntity<UsuarioDTO> salvar(@Validated @RequestBody UsuarioDTO dto) {
        return ResponseEntity.ok(mapper.toDto(service.salvar(dto)));
    }

    @GetMapping
    @ApiOperation("Lista todas os usuarios")
    public ResponseEntity<List<UsuarioDTO>> listar() {
        return ResponseEntity.ok(mapper.toDto(service.listarTudo()));
    }

    @GetMapping("/{id}")
    @ApiOperation("Busca um usuario pelo ID ")
    public ResponseEntity<UsuarioDTO> buscarPeloId(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(mapper.toDto(service.buscarPeloId(id)));
    }


    @DeleteMapping("/{id}")
    @ApiOperation("Deleta um usuario pelo ID")
    public ResponseEntity<Void> deletarPeloId(@PathVariable(value = "id") Long id) {
        service.deletarPeloId(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/autenticar")
    @ApiOperation("Autenticar o usuário.")
    public ResponseEntity autenticar(@RequestBody UsuarioAuthDTO dto) {
        try {
            Usuario usuarioAutenticado = service.autenticar(dto.getLogin(), dto.getSenha());
            return ResponseEntity.ok(mapper.toDto(usuarioAutenticado));
        } catch (AuthException e) {
            return ResponseEntity.badRequest().body(e.getMessage());

        }
    }
}
