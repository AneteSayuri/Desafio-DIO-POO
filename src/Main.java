import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPessoa1 = new Dev();
        devPessoa1.setNome("Pessoa1");
        devPessoa1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devPessoa1.getNome() + devPessoa1.getConteudosInscritos());
        devPessoa1.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: " + devPessoa1.getNome() + devPessoa1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devPessoa1.getNome() + devPessoa1.getConteudosConluidos());
        System.out.println("XP: " + devPessoa1.calcularTotalXP());
        System.out.println("-----");

        Dev devPessoa2 = new Dev();
        devPessoa2.setNome("Pessoa2");
        devPessoa2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devPessoa2.getNome() + devPessoa2.getConteudosInscritos());
        devPessoa2.progredir();
        devPessoa2.progredir();
        devPessoa2.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: " + devPessoa2.getNome() + devPessoa2.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devPessoa2.getNome() + devPessoa2.getConteudosConluidos());
        System.out.println("XP: " + devPessoa2.calcularTotalXP());

    }
}
