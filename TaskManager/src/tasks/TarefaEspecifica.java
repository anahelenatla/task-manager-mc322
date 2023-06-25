package tasks;

import java.io.File;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ana
 */
public abstract class TarefaEspecifica {
    private String nome;
    private String categoria;
    private String observacoes;
    private File arquivo;
    
    public TarefaEspecifica(String nome, String categoria, String observacoes, File arquivo){
        this.nome = nome;
        this.categoria = categoria;
        this.observacoes = observacoes;
        this.arquivo = arquivo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getObservacoes(){
        return observacoes;
    }
    
    public void setObservacoes(String observacoes){
        this.observacoes = observacoes;
    }
    
    public File getArquivo(){
        return arquivo;
    }
    
    public void setArquivo(File arquivo){
        this.arquivo = arquivo;
    }
    
    
}
