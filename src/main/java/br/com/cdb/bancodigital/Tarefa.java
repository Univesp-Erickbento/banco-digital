package br.com.cdb.bancodigital;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Tarefa implements Comparable<Tarefa> {

    public static int proximoId=0;
    private int id;

    private String nome;

    private LocalDateTime data;



    public Tarefa( String nome) {
       
        id = proximoId;
        proximoId ++;
        this.nome = nome;
        this.data = LocalDateTime.now();
    }

    public Tarefa() {

        this.data = LocalDateTime.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return getId() == tarefa.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "" + id + "-" + nome ;




//        return "Tarefa{" +
//                "nome='" + nome + '\'' +
//

    }

    @Override
    public int compareTo(Tarefa tarefa) {
        if(this.id<tarefa.id){
        return tarefa.id;
        }
        return this.id;
    }

    // @Override
//    public int compareTo(Tarefa tarefa) {
//        return this.data<tarefa.data;
//    }
}
