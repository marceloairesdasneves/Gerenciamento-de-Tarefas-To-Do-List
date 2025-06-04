package poo;

public class SistemaDeEnumeracao {
    public static void main(String[] args) {
        //EstadoBrasileiro eb = EstadoBrasileiro.valueOf("RIO_JANEIRO");
        for (EstadoBrasileiro eb: EstadoBrasileiro.values()){
            System.out.println(eb.getNome());
            //System.out.println(eb.name());
            System.out.println(eb.getSigla());
        }
    }
}
