package Etapa2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PrincipalCandidatos {

    public static void main(String[] args) {

        ArrayList<String> nomesLista = new ArrayList<>();
        ArrayList<String> partidosLista = new ArrayList<>();

        try {
            BufferedReader brNomes = new BufferedReader(new FileReader("src/Etapa2/nomes.txt"));
            String linha;
            while ((linha = brNomes.readLine()) != null) {
                nomesLista.add(linha);
            }
            brNomes.close();

            BufferedReader brPartidos = new BufferedReader(new FileReader("src/Etapa2/partidos.txt"));
            while ((linha = brPartidos.readLine()) != null) {
                partidosLista.add(linha);
            }
            brPartidos.close();

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivos.");
            return;
        }

        Random random = new Random();
        int tamanho = random.nextInt(100) + 1;

        Candidato[] candidatos = new Candidato[tamanho];

        for (int i = 0; i < candidatos.length; i++) {
            String nome = nomesLista.get(random.nextInt(nomesLista.size()));
            String partido = partidosLista.get(random.nextInt(partidosLista.size()));
            int votos = random.nextInt(100);

            candidatos[i] = new Candidato(nome, partido, votos);
        }

        OrdenarCandidatos.ordenaCandidatosPorNome(candidatos);
        OrdenarCandidatos.ordenaCandidatosPorVotos(candidatos);
        OrdenarCandidatos.ordenaCandidatosPorPartido(candidatos);

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
