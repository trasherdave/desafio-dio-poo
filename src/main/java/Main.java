
import br.com.david.desafio.dio.dominio.Bootcamp;
import br.com.david.desafio.dio.dominio.Curso;
import br.com.david.desafio.dio.dominio.Dev;
import br.com.david.desafio.dio.dominio.Mentoria;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("JavaScript");
        curso1.setDescricao("Descrição curso JavaScript");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev david = new Dev();
        david.setNome("David");
        david.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + david.getConteudosInscritos());
        david.progredir();
        david.progredir();
        david.progredir();
        System.out.println("Conteudos inscritos " + david.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + david.getConteudosConcluidos());
        System.out.println("XP:" + david.calcularTotalXp());

        System.out.println("------");

        Dev arianne = new Dev();
        arianne.setNome("Arianne");
        arianne.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + arianne.getConteudosInscritos());
        arianne.progredir();
        arianne.progredir();
        System.out.println("Conteudos inscritos " + arianne.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + arianne.getConteudosConcluidos());
        System.out.println("XP:" + arianne.calcularTotalXp());

    }

}
