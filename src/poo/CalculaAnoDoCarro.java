package poo;

public class CalculaAnoDoCarro {
    public static void main(String[] args) {
        Carro anoDoCarro = new Carro();

        anoDoCarro.modelo = "GOL VW";
        anoDoCarro.ano = 2020;
        anoDoCarro.cor = "Branco";
        anoDoCarro.idadeDoCarro(5);

        anoDoCarro.fichaTecnica();
        System.out.printf("O carro tem %d anos. \n", anoDoCarro.idadeDoCarro(2025));

    }
}
