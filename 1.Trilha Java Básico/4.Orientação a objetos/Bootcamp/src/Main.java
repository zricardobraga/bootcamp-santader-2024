import br.com.dio.domain.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Curso java = new Curso();

        java.setTitulo("Java");
        java.setDescricao("Curso de Java");
        java.setCargaHoraria(10);

//        System.out.println(java.toString());

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Mentoria sobre Java");
        mentoriaJava.setDataMentoria(LocalDate.now());

//        System.out.println(mentoriaJava.toString());

        Bootcamp bootcamp = new Bootcamp("Bootcamp UM", "Um bootcamp");
        bootcamp.getConteudos().add(java);
        bootcamp.getConteudos().add(mentoriaJava);

//        System.out.println(bootcamp.getConteudos());

        Desenvolvedor dev = new Desenvolvedor("Barnabé");
        dev.inscreverNoBootcamp(bootcamp);

//        System.out.println("Cursos do " + dev.getNomeCompleto() + " " + dev.getConteudosInscritos());

        dev.progredir();

        System.out.println(dev.getConteudosConcluidos());

    }
}