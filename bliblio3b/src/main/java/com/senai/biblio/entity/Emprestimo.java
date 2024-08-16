
package com.senai.biblio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name="emprestimos")
public class Emprestimo {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long IdEmprestimo;
    
    @OneToOne
    @JoinColumn(nullable=false)
    private Livro livro;
    
    @Column(nullable=false)
    private Long matricula;
    
    @Column(nullable=false)
    private Date DataEmprestimo;
    
    @Column(nullable=false)
    private Date DataEntrega;
    
    @Column(nullable=true)
    private Boolean devolucao;
    
    
    

    public Long getIdEmprestimo() {
        return IdEmprestimo;
    }

    public void setIdEmprestimo(Long IdEmprestimo) {
        this.IdEmprestimo = IdEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Date getDataEmprestimo() {
        return DataEmprestimo;
    }

    public void setDataEmprestimo(Date DataEmprestimo) {
        this.DataEmprestimo = DataEmprestimo;
    }

    public Date getDataEntrega() {
        return DataEntrega;
    }

    public void setDataEntrega(Date DataEntrega) {
        this.DataEntrega = DataEntrega;
    }

    public Boolean getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Boolean devolucao) {
        this.devolucao = devolucao;
    }
    
    
    
    
    
    
    
}
