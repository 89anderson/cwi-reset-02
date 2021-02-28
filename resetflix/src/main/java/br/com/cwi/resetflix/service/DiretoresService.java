package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.repository.DiretoresRepository;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.request.CriarDiretorRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretoresService {

    @Autowired
    private DiretoresRepository diretoresRepository;

    @Autowired
    private FilmeRepository filmeRepository;


    public List<DiretoresResponse> getDiretores;

    public ConsultarDetalhesDiretorResponse consultarDetalhesDiretor(Long id) {
    }

    public Long criarDiretor(CriarDiretorRequest request) {
    }
}
