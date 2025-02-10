package com.example.demo.View;
import com.example.demo.Model.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
public class EndPoint {

    private Usuario usuario = new Usuario(); // Inicializa um objeto vazio


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



