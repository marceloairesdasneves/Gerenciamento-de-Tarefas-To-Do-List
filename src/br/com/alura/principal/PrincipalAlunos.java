package br.com.alura.principal;
import br.com.alura.alunos.Aluno;
import br.com.alura.professores.Docente;

public class PrincipalAlunos {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Julia", 16, 8.5);
        Aluno aluno2 = new Aluno("Caio", 17, 7.2);

        Docente docente1 = new Docente("Marcelo", 40, "Matematica");
        Docente docente2 = new Docente("Roberto", 38, "Historia");

        aluno1.exibirInfo();
        aluno2.exibirInfo();
        docente1.exibirInfo();
        docente2.exibirInfo();
    }
}
