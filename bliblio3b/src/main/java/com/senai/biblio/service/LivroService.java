
package com.senai.biblio.service;

import com.senai.biblio.entity.Livro;
import com.senai.biblio.repository.LivroRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    
    @Autowired
    private LivroRepository livroRepository;
    
    public Long incluirLivro(Livro livro){
        
        if(livro.getTitulo() == null  ||
           livro.getAutor() == null   ||
           livro.getEditora() == null ||
           livro.getAno()  == null){
           return null;
        }
        return livroRepository.save(livro).getIdLivro();
    }
    
    public Livro consultarLivroPorId(Long IdLivro){
        
        if(IdLivro == null){
            return null;
        }
        Optional<Livro> livro = livroRepository.findById(IdLivro);
            if(livro.isPresent()){
            return livro.get();
            }
            return null;
    }

    
    
}
