import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

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

        Dev devTamires = new Dev();
        devTamires.setNome("Tamires");
        devTamires.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tamires:" + devTamires.getConteudosInscritos());
        devTamires.progredir();
        devTamires.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Tamires:" + devTamires.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Tamires:" + devTamires.getConteudosConcluidos());
        System.out.println("XP:" + devTamires.calcularTotalXp());

        System.out.println("-------");

        Dev devOlivia = new Dev();
        devOlivia.setNome("Olívia");
        devOlivia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Olívia:" + devOlivia.getConteudosInscritos());
        devOlivia.progredir();
        devOlivia.progredir();
        devOlivia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Olívia:" + devOlivia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Olívia:" + devOlivia.getConteudosConcluidos());
        System.out.println("XP:" + devOlivia.calcularTotalXp());
    }
}
