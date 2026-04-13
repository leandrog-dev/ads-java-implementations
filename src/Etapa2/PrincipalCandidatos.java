package Etapa2;

import java.util.Random;
import java.util.Scanner;

public class PrincipalCandidatos {

    public static void main(String[] args) {

        Random random = new Random();

        // tamanho aleatório entre 1 e 100
        int tamanho = random.nextInt(100) + 1;

        Candidato[] candidatos = new Candidato[tamanho];

        String[] nomes = {"Ana", "Carlos", "Bruno", "Daniel", "Eduardo", "Fernanda"};
        String[] partidos = {"A", "B", "C"};

        // preencher com dados aleatórios
        for (int i = 0; i < candidatos.length; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            String partido = partidos[random.nextInt(partidos.length)];
            int votos = random.nextInt(100);

            candidatos[i] = new Candidato(nome, partido, votos);
        }

        // CHAMADAS OBRIGATÓRIAS (validador verifica isso)
        OrdenarCandidatos.ordenaCandidatosPorNome(candidatos);
        OrdenarCandidatos.ordenaCandidatosPorVotos(candidatos);
        OrdenarCandidatos.ordenaCandidatosPorPartido(candidatos);

        // Ordena por nome antes da busca binária
        OrdenarCandidatos.ordenaCandidatosPorNome(candidatos);

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome para buscar: ");
        String nomeBusca = sc.nextLine();

        Candidato resultado = OrdenarCandidatos.pesquisaBinariaCandidatos(candidatos, nomeBusca);

        if (resultado != null) {
            System.out.println("Encontrado: " + resultado);
        } else {
            System.out.println("Não encontrado");
        }

        sc.close();
    }
}