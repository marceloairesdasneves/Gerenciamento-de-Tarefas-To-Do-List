public class ChecaIdade {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setIdade(21);
        pessoa1.setNome("Marcelo");

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setIdade(15);
        pessoa2.setNome("Maria");


        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();

    }
}
