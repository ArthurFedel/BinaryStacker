# Decimal to Binary Converter (Stack LIFO) 🔢

Este repositório contém uma implementação de um conversor de números decimais para binários, utilizando a estrutura de dados **Pilha Sequencial (Stack)** em Java.

O projeto foi desenvolvido seguindo os conceitos de **TAD (Tipo Abstrato de Dados)** e a lógica **LIFO (Last In, First Out)**, conforme as diretrizes da disciplina de Códigos de Alta Performance.

## 🚀 Como funciona a lógica?

Na conversão de decimal para binário por divisões sucessivas:
1. O número decimal é dividido por 2 repetidamente.
2. O resto de cada divisão (0 ou 1) é **empilhado** (`push`).
3. O primeiro resto encontrado é o dígito menos significativo, enquanto o último é o mais significativo.
4. Ao final, os elementos são **desempilhados** (`pop`), o que inverte naturalmente a ordem dos restos, resultando no número binário correto.

## 🛠️ Estrutura do Código

A implementação segue o padrão clássico de Pilha Sequencial apresentado em aula:

- `init()`: Inicializa o topo da pilha.
- `isEmpty()`: Verifica se a pilha está vazia.
- `isFull()`: Verifica se a pilha atingiu sua capacidade máxima (Stack Overflow).
- `push(elem)`: Insere um elemento no topo.
- `pop()`: Remove e retorna o elemento do topo.

## 💻 Exemplo de Uso

```java
// Exemplo: Converter o número 13
// 1. Divisões: 13/2 (R:1), 6/2 (R:0), 3/2 (R:1), 1/2 (R:1)
// 2. Pilha (Push): [1, 0, 1, 1] <- Topo
// 3. Saída (Pop): 1101
