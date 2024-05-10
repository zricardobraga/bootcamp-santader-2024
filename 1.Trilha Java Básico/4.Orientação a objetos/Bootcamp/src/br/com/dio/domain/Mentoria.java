package br.com.dio.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate dataMentoria;

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    public Integer calcularXp(){
        return null;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return super.getTitulo()
                + "\n" + super.getDescricao()
                + "\n" + dataMentoria;
    }
}
