package br.com.cdb.bancodigital;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CriarTarefas {

    List<Tarefa> listaDeTarefas = new ArrayList<>();


    public List<Tarefa> adicionarTarefa(Tarefa tarefa1) {
        if (!listaDeTarefas.contains(tarefa1)) {
            listaDeTarefas.add(tarefa1);
            System.out.println(listaDeTarefas.get(0));
            System.out.println("----------------------------------------------------------------------");
       System.out.println("Tarefa adicionada com Sucesso");
            System.out.println("----------------------------------------------------------------------");
        }

        return listaDeTarefas;
    }
    public void removerTarefas(Tarefa tarefa1){
          listaDeTarefas.remove(tarefa1);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Tarefa Removida com Sucesso");
        System.out.println("----------------------------------------------------------------------");

    }

    public List<Tarefa> listartarefas (){


            System.out.println(listaDeTarefas);
            System.out.println("Debag3");




        return listaDeTarefas;
    }
    public List<Tarefa> tarefasEmOrdemAlfabetica(List<Tarefa> lista) {

        lista.sort(new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa o1, Tarefa o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        return lista;
    }
    public List<Tarefa> tarefasCronologicas(List<Tarefa> lista){

        lista.sort(new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa o1, Tarefa o2) {
                return o1.getData().compareTo(o2.getData());
            }
        });
        return lista;
    }


    public List<Tarefa> getListaDeTarefas() {

        return listaDeTarefas;
    }
    }
