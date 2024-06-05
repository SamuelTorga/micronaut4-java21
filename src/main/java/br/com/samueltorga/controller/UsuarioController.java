package br.com.samueltorga.controller;

import br.com.samueltorga.repository.UsuarioRepository;
import br.com.samueltorga.repository.entity.Usuario;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Controller
@RequiredArgsConstructor(onConstructor_ = @__(@Inject))
@Slf4j
public class UsuarioController {

    private final UsuarioRepository repository;

    @Get
    public HttpResponse<Long> count() {
        return HttpResponse.ok(repository.count());
    }

    @Post(consumes = {MediaType.ALL}, produces = {MediaType.TEXT_PLAIN})
    public HttpResponse<String> create() {
        Usuario usuario = Usuario.builder()
                .nome("Nome do usuário")
                .email("teste")
                .uuid(UUID.randomUUID().toString())
                .emailVerificado(true)
                .primeiroNome("Nome")
                .sobrenome("Sobrenome")
                .build();
        repository.save(usuario);
        return HttpResponse.created("Usuário criado com sucesso");
    }

}
