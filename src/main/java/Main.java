import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Avaliacao avaliacaoCurso1 = new Avaliacao(7);
        Avaliacao avaliacaoCurso2 = new Avaliacao(7);

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        curso1.setAvaliacao(avaliacaoCurso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        curso2.setAvaliacao(avaliacaoCurso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Diego");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXp());




    }

}
