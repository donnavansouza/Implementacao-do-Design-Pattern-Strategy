# Ordenação de Array com diferentes algoritmos de ordenação & Implementação do Design Pattern Strategy

## Overview
Esse projeto é uma prática da Implementação do Design Pattern Strategy, que ordena um array informado pelo usuário. Para isso, implementa 3 algoritmos de ordenação diferentes, BubbleSort, InsertionSort e SelectionSort, além da Interface Strategy e classe context, requiridas pela implementação do padrão de projetos Strategy.

--- 

A implementação do padrão de projeto Strategy foi baseada no artigo contido na descrição do trabalho prático, disponível em: https://refactoring.guru/pt-br/design-patterns/strategy.
Para isso foram implementadas:
-- **Interface Strategy**: contém o método SortArray, implementado nas classes dos algoritmos de ordenação.
-- **Classe Context**: que 'setta' e invoca o método SortArray. Também é utilizado na classe Main para invocar o método de uma 'strategy' a ser definida a depender do usuário.
-- **Algoritmos de Ordenação**: Responsáveis pela ordenação do array preenchido por valores inteiros informados pelo usuário.

## Features
- **Ordenação de array**: Ordena array com valores inteiros informados pelo usuário utilizando um dos três algoritmos a seguir, também escolhido pelo usuário:
  -- **BubbleSort**
  -- **Selection Sort**
  -- **SelectionSort**

## Usage
- **Basta rodar a classe Main**

