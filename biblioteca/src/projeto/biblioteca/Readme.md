# Projeto Biblioteca

Este projeto é uma aplicação Java para gerenciar uma biblioteca. Ele permite adicionar, remover e buscar livros, além de gerenciar usuários e empréstimos.

## Estrutura do Projeto

O projeto está organizado no seguinte pacote:

- `projeto.biblioteca`

## Funcionalidades

- **Gerenciamento de Livros**
    - Adicionar novos livros
    - Remover livros existentes
    - Buscar livros por título, autor ou ISBN

- **Gerenciamento de Usuários**
    - Adicionar novos usuários
    - Remover usuários existentes
    - Atualizar informações dos usuários

- **Empréstimos**
    - Registrar novos empréstimos
    - Devolver livros
    - Consultar histórico de empréstimos

## Como Executar

1. Clone o repositório:
        ```sh
        git clone <URL_DO_REPOSITORIO>
        ```

2. Navegue até o diretório do projeto:
        ```sh
        cd desenvolvimento-java/biblioteca
        ```

3. Compile o projeto:
        ```sh
        javac -d bin src/projeto/biblioteca/*.java
        ```

4. Execute a aplicação:
        ```sh
        java -cp bin projeto.biblioteca.Main
        ```

## Requisitos

- Java 8 ou superior
- Git

## Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Faça o push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request
