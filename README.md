# Sistema Básico de Lanchonete

Este projeto é um sistema simples de gerenciamento de pedidos para uma lanchonete, desenvolvido em Java. Além de praticar o uso de **listas** (`ArrayList`) e estruturas de repetição `for`, o projeto também explora conceitos básicos de **Programação Orientada a Objetos (POO)**, como criação de classes, encapsulamento, métodos e composição entre objetos.

O sistema simula a manipulação de um carrinho de compras, onde é possível adicionar e remover itens, além de calcular o valor total, utilizando boas práticas de organização do código por meio da POO.

---

## Funcionalidades

- Adicionar itens ao carrinho.
- Remover itens do carrinho pelo código do item.
- Calcular e exibir o valor total dos itens no carrinho.
- Apresentar informações detalhadas de cada item.

---

## Estrutura do Código

### Classes principais

- **Item**: Representa um produto do cardápio, com atributos `codigo`, `nome` e `preço`. Possui métodos para acessar e modificar esses dados, além de um método para apresentar o item.
  
- **Carrinho**: Gerencia uma lista de itens. Permite adicionar, remover e calcular o total dos itens no carrinho, utilizando estruturas de repetição para percorrer a lista.

---

## Tecnologias usadas

- Java (versão 8 ou superior)
- Coleções Java (`ArrayList`)
- Estruturas de repetição (`for`)

---

## Como usar

1. Instancie objetos `Item` com código, nome e preço.
2. Crie um objeto `Carrinho`.
3. Use `adicionarItem()` para adicionar itens ao carrinho.
4. Para remover, chame `removerItem(codigo)`.
5. Utilize `calcular()` para ver o total dos itens no carrinho.

---

## O que pratiquei

- [x]  Manipular listas dinâmicas com `ArrayList`.
- [x]  Percorrer coleções com laços `for`.
- [x]  Criar classes com encapsulamento usando getters e setters.
- [x]  Conceito básico de composição (um carrinho possui vários itens).


## Possível melhoria futura
- **Gerenciamento de estoque:** Controlar a quantidade disponível de cada item no estoque, para evitar que itens sejam adicionados ao carrinho quando estiverem esgotados.
---

_Projeto criado para fins de estudo e prática em Java._
