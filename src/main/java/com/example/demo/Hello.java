package com.example.demo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;

@RestController
public class Hello {

    private Usuario usuario = new Usuario(); // Inicializa um objeto vazio

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    @PutMapping("/hello")
    public String putHello() {
        return "Substituir";
    }

    @PostMapping("/hello")
    public String postHello() {
        return "Criando algo novo";
    }

    @DeleteMapping("/hello")
    public String deleteHello() {
        return "Deletando";
    }

    @PostMapping("/usuario")
    public String criarUsuario(@RequestBody Usuario novoUsuario) {
        this.usuario = novoUsuario;
        return "Usuário criado: " + usuario.toString();
    }

 
    @GetMapping("/usuario")
    public Usuario getUsuario() {
        return usuario;
    }

    @PutMapping("/usuario")
    public String atualizarUsuario(@RequestBody Usuario usuarioAtualizado) {
        if (usuario == null) {
            return "Erro: Nenhum usuário encontrado para atualizar.";
        }
        this.usuario = usuarioAtualizado;
        return "Usuário atualizado: " + usuario.toString();
    }

    @DeleteMapping("/usuario")
    public String deletarUsuario() {
        if (usuario == null) {
            return "Erro: Nenhum usuário encontrado para deletar.";
        }
        usuario = null;
        return "Usuário removido com sucesso.";
    }
}



