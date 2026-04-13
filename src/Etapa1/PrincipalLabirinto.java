package Etapa1;

public class PrincipalLabirinto {

    public static void main(String[] args) {

        Labirinto lab = new Labirinto();

        lab.criaLabirinto("src/Etapa1/labirinto.txt");

        if (lab.percorreLabirinto()) {
            System.out.println("Solução encontrada");
        } else {
            System.out.println("Sem solução");
        }

        lab.imprimeLabirinto();
    }
}