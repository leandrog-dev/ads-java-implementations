# ads-java-implementations

Esse repositório é basicamente um compilado das coisas que fui fazendo durante o curso de ADS durante um projeto acadêmico. 
— desde resolver labirinto com recursão até implementar pilha e fila na mão, sem usar biblioteca pronta.

Serve tanto pra eu revisar depois quanto pra quem estiver estudando os mesmos assuntos.

---

## Como rodar

Você vai precisar ter o **Java JDK 11+** instalado.

```bash
git clone https://github.com/leandrog-dev/ads-java-implementations.git
```

Depois disso, abre o projeto na IDE que você usa e roda o `Principal.java` da etapa que quiser testar.

---

## Estrutura do projeto

```
src/
├── Etapa1/   → Labirinto (recursão + backtracking)
├── Etapa2/   → Ordenação e busca de candidatos
├── Etapa3/   → Lista e Pilha com array fixo
└── Etapa4/   → Pilha e Fila encadeadas
```

---

## Etapa 1 — Labirinto

Aqui eu fiz um programa que lê um labirinto de um `.txt` e tenta encontrar a saída usando recursão com backtracking.

Os símbolos são:

| Símbolo | Significado |
|--------|------------|
| `X` | parede |
| ` ` | caminho livre |
| `D` | saída |
| `#` | caminho encontrado |

Ele começa no `(0,0)` e vai tentando andar nas direções. Se bater em parede ou já tiver passado por ali, ele volta e tenta outro caminho.

No final, o caminho certo fica marcado com `#`.

---

## Etapa 2 — Candidatos

Aqui trabalhei com ordenação e busca em uma lista de candidatos.

Cada candidato tem:
- nome  
- partido  
- número de votos  

Implementei:
- Bubble Sort (pra ordenar por nome, votos e partido)
- Busca Binária (pra achar candidato pelo nome)

A busca binária é bem mais rápida que percorrer tudo, porque ela vai cortando a lista pela metade.

---

## Etapa 3 — Estruturas estáticas

Aqui eu implementei lista e pilha usando array de tamanho fixo.

Ou seja:
- é rápido  
- mas tem limite  

Se passar do limite → dá erro (overflow).

### Lista
Dá pra:
- inserir em qualquer posição  
- remover  
- buscar  
- pegar elemento  

### Pilha
Funciona no esquema LIFO (último entra, primeiro sai).

Tipo:
- `push` → adiciona  
- `pop` → remove  
- `top` → vê o topo  

---

## Etapa 4 — Estruturas encadeadas

Aqui muda tudo porque não tem mais array.

Cada elemento aponta pro próximo (tipo uma corrente). Isso faz a estrutura crescer conforme precisa.

### Pilha encadeada
Mesma ideia da pilha normal, mas sem limite fixo.

### Fila encadeada
Aqui é FIFO (primeiro entra, primeiro sai).

- `enqueue` → entra no final  
- `dequeue` → sai do início  

---

## O que eu pratiquei aqui

- Recursão e backtracking  
- Ordenação e busca  
- Estruturas de dados (lista, pilha, fila)  
- Diferença entre array e estrutura encadeada  
- Generics em Java  
- Interfaces  
- Exceções customizadas  

---



Feito por **Leandro G.**  
Projeto acadêmico
