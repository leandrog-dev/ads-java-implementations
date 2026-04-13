package Etapa2;

public class OrdenarCandidatos {

    public static void ordenaCandidatosPorNome(Candidato[] candidatos) {
        for (int i = 0; i < candidatos.length - 1; i++) {
            for (int j = 0; j < candidatos.length - i - 1; j++) {
                if (candidatos[j].getNome().compareTo(candidatos[j + 1].getNome()) > 0) {
                    Candidato temp = candidatos[j];
                    candidatos[j] = candidatos[j + 1];
                    candidatos[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenaCandidatosPorVotos(Candidato[] candidatos) {
        for (int i = 0; i < candidatos.length - 1; i++) {
            for (int j = 0; j < candidatos.length - i - 1; j++) {
                if (candidatos[j].getIntencoesVotos() > candidatos[j + 1].getIntencoesVotos()) {
                    Candidato temp = candidatos[j];
                    candidatos[j] = candidatos[j + 1];
                    candidatos[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenaCandidatosPorPartido(Candidato[] candidatos) {
        for (int i = 0; i < candidatos.length - 1; i++) {
            for (int j = 0; j < candidatos.length - i - 1; j++) {
                if (candidatos[j].getPartido().compareTo(candidatos[j + 1].getPartido()) > 0) {
                    Candidato temp = candidatos[j];
                    candidatos[j] = candidatos[j + 1];
                    candidatos[j + 1] = temp;
                }
            }
        }
    }

    public static Candidato pesquisaBinariaCandidatos(Candidato[] candidatos, String nome) {
        int inicio = 0;
        int fim = candidatos.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            int comparacao = candidatos[meio].getNome().compareTo(nome);

            if (comparacao == 0) {
                return candidatos[meio];
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return null;
    }
}