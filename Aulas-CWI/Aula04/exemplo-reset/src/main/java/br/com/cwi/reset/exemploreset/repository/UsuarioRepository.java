package br.com.cwi.reset.exemploreset.repository;


import br.com.cwi.reset.exemploreset.domain.Usuarios;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {


}
    static List<Usuarios> users = new ArrayList<>();

    public List<Usuarios> getUsers(){
        return users;
    }

    public Usuarios addUser(Usuarios users){
        users.add(user);
        return users;
    }