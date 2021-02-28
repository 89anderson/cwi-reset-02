package br.com.cwi.reset.exemploreset.services;


import br.com.cwi.reset.exemploreset.domain.Usuarios;
import br.com.cwi.reset.exemploreset.repository.UsuarioRepository;

import java.util.List;

@Service
    public class UsuarioServices {

        @Autowired
        private UsuarioRepository repository;

        public List<Usuarios> obterUsuarios(){
            return repository.getUsers();
        }

        public Mensagem criarMensagem(Mensagem mensagem){
            if(mensagem == null || mensagem.getEscritor() == null || mensagem.getMensagem() == null){
                throw new BadRequestException();
            }
            return repository.addMensagem(mensagem);
        }
}
