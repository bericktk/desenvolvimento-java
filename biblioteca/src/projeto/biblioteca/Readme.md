# Projeto Biblioteca

Este projeto é uma aplicação Java para gerenciar uma biblioteca. Ele permite adicionar, remover e buscar livros, além de gerenciar usuários e empréstimos.

## Estrutura do Projeto

O projeto está organizado no pacote `projeto.biblioteca` e contém os seguintes arquivos:

### 1. `Livro.java`
Classe que representa um livro na biblioteca. Contém atributos como título, autor, ISBN e disponibilidade.

### 2. `Usuario.java`
Classe que representa um usuário da biblioteca. Contém atributos como nome, ID do usuário e lista de livros emprestados.

### 3. `Biblioteca.java`
Classe principal que gerencia a coleção de livros e usuários. Contém métodos para adicionar, remover e buscar livros, além de gerenciar os empréstimos.

### 4. `CadastroUsuario.java`
Classe para realizar cadastro de usuários e os livros emprestados e devolvidos.

### 5. `CadastroLivro.java`
Classe para cadastro dos livros.

### 6. `Main.java`
Classe principal onde os menus de cadastrados são chamados.

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

1. Clone o repositório para sua máquina local.
2. Navegue até o diretório do projeto.
3. Compile os arquivos Java usando o comando `javac`.
4. Execute a aplicação com o comando `java`.

## Funcionalidades

- **Adicionar Livro**: Permite adicionar novos livros à biblioteca.
- **Remover Livro**: Permite remover livros existentes da biblioteca.
- **Buscar Livro**: Permite buscar livros pelo título ou autor.
- **Adicionar Usuário**: Permite adicionar novos usuários à biblioteca.
- **Registrar Empréstimo**: Permite registrar o empréstimo de um livro para um usuário.
- **Registrar Devolução**: Permite registrar a devolução de um livro emprestado.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.