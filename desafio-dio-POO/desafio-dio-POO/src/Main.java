import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main (String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devDanrlei = new Dev();
        devDanrlei.setNome("Danrlei");
        devDanrlei.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devDanrlei.getConteudosInscritos());
        devDanrlei.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos" + devDanrlei.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devDanrlei.getConteudosConcluidos());
        System.out.println("XP: " + devDanrlei.calcularTotalXp());

        System.out.println("||||<-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=->||||");

        Dev devAndressa = new Dev();
        devAndressa.setNome("Andressa");
        devAndressa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devAndressa.getConteudosInscritos());
        devAndressa.progredir();
        devAndressa.progredir();
        devAndressa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos" + devAndressa.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" + devAndressa.getConteudosConcluidos());
        System.out.println("XP: " + devAndressa.calcularTotalXp());


    }
}
