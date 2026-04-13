package Etapa3;

public class PrincipalEtapa3 {

    public static void main(String[] args) {

        System.out.println("Teste 1:");

        StaticList<Integer> lista = new StaticList<>(10);
        lista.insert(1, 0);
        lista.insert(2, 1);
        lista.insert(1, 2);

        System.out.println("Quantidade de 1: " + lista.contaElementos(1));

        System.out.println("Teste 2:");

        StaticStack<Character> pilha = new StaticStack<>(5);
        pilha.push('(');
        pilha.push('A');
        pilha.push(')');

        Etapa3 etapa = new Etapa3();
        System.out.println(etapa.checkBrackets(pilha));
    }
}
