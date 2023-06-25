/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasks;

import java.io.File;

/**
 *
 * @author ana
 */
public class NovaTarefa extends TarefaEspecifica{
    private String nome;
    private String categoria;
    private String observacoes;
    private File arquivo;
    
     public NovaTarefa(String nome, String categoria, String observacoes, File arquivo) {
        super(nome, categoria, observacoes, arquivo);
        this.nome = nome;
        this.categoria = categoria;
        this.observacoes = observacoes;
        this.arquivo = arquivo;
    }
     
    @Override
     public String getNome(){
        return nome;
    }
    
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    
    @Override
    public String getCategoria(){
        return categoria;
    }
    
    @Override
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    @Override
    public String getObservacoes(){
        return observacoes;
    }
    
    @Override
    public void setObservacoes(String observacoes){
        this.observacoes = observacoes;
    }
    
    @Override
    public File getArquivo(){
        return arquivo;
    }
    
    @Override
    public void setArquivo(File arquivo){
        this.arquivo = arquivo;
    }
    
}
