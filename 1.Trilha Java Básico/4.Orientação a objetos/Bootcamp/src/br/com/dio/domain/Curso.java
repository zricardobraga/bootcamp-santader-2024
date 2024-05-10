package br.com.dio.domain;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return super.getTitulo()
                + "\n" + super.getDescricao()
                + "\n" + cargaHoraria;
    }

}
