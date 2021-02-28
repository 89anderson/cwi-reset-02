/*package br.com.cwi.reset.exemploreset;


import org.springframework.web.bind.annotation.*;

@RestController

public class NomeController {

    private static String nome = "Anderson Martins";
    @GetMapping("/nome")
    public String nome(){ return nome;}

    @PutMapping("/nome/{mudarNome}")
    public String mudarNome(@PathVariable String mudarNome){
        this.nome = mudarNome;
        return this.nome;
    }

    @DeleteMapping
    public void deletaNome(){
        this.nome = null;
    }

}
*/