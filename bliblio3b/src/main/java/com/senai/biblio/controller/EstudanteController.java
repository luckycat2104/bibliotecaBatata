
package com.senai.biblio.controller;

import com.senai.biblio.entity.Estudante;
import com.senai.biblio.entity.Login;
import com.senai.biblio.service.EstudanteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudanteController {
    
    @Autowired
    private EstudanteService estudanteService;
    
    
    @PostMapping("/estudante")
    public ResponseEntity<Long> incluirEstudante(@RequestBody Estudante estudante){
        
        Long IdEstudante = estudanteService.incluirEstudante(estudante);
        if(IdEstudante != null){
            return new ResponseEntity<>(IdEstudante,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FOUND);        
    }
    
    @PostMapping("/estudante/login")
    public ResponseEntity<Estudante> loginEstudante(@RequestBody Login login){
        
        Estudante estudante = estudanteService.loginEstudante(login.getMatricula(),login.getSenha());
        if(estudante != null){
            return new ResponseEntity<>(estudante,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.FORBIDDEN);        
    }
    
    @PutMapping("/estudante")
    public ResponseEntity<Boolean> alterarEstudante(@RequestBody Estudante estudante){
        
        if(estudanteService.alterarEstudante(estudante)){
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);        
    }
    
    @DeleteMapping("/estudante/id/{IdEstudante}")
    public ResponseEntity<Boolean> excluirEstudantePorId(@PathVariable("IdEStudante") Long IdEstudante){
        if(estudanteService.excluirEstudantePorId(IdEstudante)){
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/estudante/matricula/{matricula}")
    public ResponseEntity<Boolean> excluirEstudantePorMatricula(@PathVariable("matricula") Long matricula){
        if(estudanteService.excluirEstudantePorMatricula(matricula)){
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("/estudante/id/{IdEstudante}")
    public ResponseEntity<Estudante> consultaEstudantePorId(@PathVariable("IdEstudante") Long IdEstudante){
        Estudante estude = estudanteService.consultaEstudantePorId(IdEstudante);
        if(estude != null){
            return new ResponseEntity<>(estude,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("/estudante/matricula/{matricula}")
    public ResponseEntity<Estudante> consultaEstudantePorMatricula(@PathVariable("matricula") Long matricula){
        Estudante estude = estudanteService.consultaEstudantePorMatricula(matricula);
        if(estude != null){
            return new ResponseEntity<>(estude,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("/estudante/email/{email}")
    public ResponseEntity<Estudante> consultaEstudantePorEmail(@PathVariable("email") String email){
        Estudante estude = estudanteService.consultaEstudantePorEmail(email);
        if(estude != null){
            return new ResponseEntity<>(estude,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("/estudante/nome/{nome}")
    public ResponseEntity<List<Estudante>> consultaEstudantePorNome(@PathVariable("nome") String nome){
        List<Estudante> estude = estudanteService.consultaEstudantePorNome(nome);
        if(estude != null){
            return new ResponseEntity<>(estude,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("/estudante/pag/{pagina}")
    public ResponseEntity<List<Estudante>> listarEstudantesPaginando(@PathVariable("pagina") Integer pagina){
        List<Estudante> estude = estudanteService.listarEstudante(pagina);
        if(estude != null){
            return new ResponseEntity<>(estude,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    
    
}
