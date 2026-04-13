package Etapa1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Labirinto {

    public final char PAREDE = 'X';
    public final char CAMINHO_ABERTO = ' ';
    public final char SAIDA = 'D';
    public final char CAMINHO_SOLUCAO = '#';

    private char[][] labirinto;

    public void criaLabirinto(String filename) {
        ArrayList<char[]> linhas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String linha;

            while ((linha = br.readLine()) != null) {
                linhas.add(linha.toCharArray());
            }

            br.close();

            
            if (linhas.size() == 0) {
                throw new IllegalArgumentException("Arquivo vazio");
            }

        } catch (Exception e) {
            
            throw new IllegalArgumentException("Erro ao ler arquivo");
        }

        labirinto = new char[linhas.size()][];

        for (int i = 0; i < linhas.size(); i++) {
            labirinto[i] = linhas.get(i);
        }
    }

    public boolean percorreLabirinto() {
        if (labirinto == null) {
            throw new IllegalStateException("Labirinto não carregado");
        }
        return resolverLabirinto(0, 0);
    }

    private boolean resolverLabirinto(int x, int y) {

        // Limite
        if (x < 0 || y < 0 || x >= labirinto.length || y >= labirinto[0].length) {
            return false;
        }

        // Parede ou já visitado
        if (labirinto[x][y] == PAREDE || labirinto[x][y] == CAMINHO_SOLUCAO) {
            return false;
        }

        // Saída encontrada
        if (labirinto[x][y] == SAIDA) {
            return true;
        }

        // Marca caminho
        labirinto[x][y] = CAMINHO_SOLUCAO;

        // Recursão (4 direções)
        if (resolverLabirinto(x + 1, y) ||
            resolverLabirinto(x - 1, y) ||
            resolverLabirinto(x, y + 1) ||
            resolverLabirinto(x, y - 1)) {
            return true;
        }

        // Backtracking
        labirinto[x][y] = CAMINHO_ABERTO;

        return false;
    }

    public void imprimeLabirinto() {
        for (int i = 0; i < labirinto.length; i++) {
            for (int j = 0; j < labirinto[i].length; j++) {
                System.out.print(labirinto[i][j]);
            }
            System.out.println();
        }
    }
}