/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasks;

import java.util.ArrayList;

/**
 *
 * @author ana
 */
public class ListaFaculdade extends ListaDeTarefas {
    private ArrayList<TarefaEspecifica> tarefas;
    private int quantidade;
    
    public ListaFaculdade(){
        this.tarefas = new ArrayList<>();
        this.quantidade = quantidade;
    }
    
    @Override
    public void adicionarAtividade(NovaTarefa tarefa){
        tarefas.add(tarefa);
        quantidade++;
    }

    @Override
    public void removerAtividade(){
        quantidade--;
    }
    
    @Override
    public int getQuantidade(){
        return quantidade;
    }
    
    @Override
     public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
}
