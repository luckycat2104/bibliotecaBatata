
package com.senai.biblio.repository;

import com.senai.biblio.entity.Estudante;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
    
    Estudante findByMatricula(Long matricula);
    List<Estudante> findByNome(String nome);
    
    void deleteBymatricula(Long matricula);
    
}
