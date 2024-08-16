
package com.senai.biblio.service;

import com.senai.biblio.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.biblio.entity.Emprestimo;

@Service
public class EmprestimoService {
    
    @Autowired
    EmprestimoRepository emprestimoRepository;
    
    @Autowired
    EstudanteService estudanteService;
    
    @Autowired
    LivroService livroService;
    
    public Long incluirEmprestimo(Emprestimo emp, Long IdLivro){
        
        if( emp.getMatricula() == null || emp.getDataEmprestimo() == null ||
            emp.getDataEntrega() == null || IdLivro == null ){
            return null;
        }
        if( emp.getDevolucao() == false ||
            emp.getDevolucao() == null  ){
            return null;
        }
        return emprestimoRepository.save(emp).getIdEmprestimo();
            
    
    }
    
}
