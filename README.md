# 📚 Projeto Biblioteca em Java

Um projeto em Java para gerenciar informações de clientes e livros, com foco em praticar conceitos de **Orientação a Objetos**, **Validação de Entrada** e **Encapsulamento**. Esse projeto utiliza uma classe de entrada personalizada para facilitar a captura de dados diretamente do teclado.

## 📑 Funcionalidades

- **Classe `Cliente`**:
  - Armazena e exibe informações dos clientes, como nome, idade, sexo, e-mail e senha.
  - Validação e dupla confirmação de e-mail e senha com critérios de segurança.
  - Exibição de e-mail parcialmente oculto para maior segurança.

- **Classe `Livro`**:
  - Armazena informações dos livros, incluindo título, autor, preço e número de páginas.
  - Cálculo do preço por página de cada livro para facilitar análise de custo-benefício.
  - Exibição organizada de informações dos livros cadastrados.

- **Classe `Teclado`**:
  - A classe `Teclado` é responsável por facilitar a entrada de dados do usuário no console, proporcionando métodos específicos para a leitura de diferentes tipos de informações.
  - O modelo da classe `Teclado` foi adaptado de um projeto utilizado na faculdade, com a assistência do ChatGPT para melhorias e ajustes.

- **Classe `Principal`**:
  - Utiliza a classe `Teclado` para captar as informações necessárias e criar instâncias de `Cliente` e `Livro`.
  - Exibe as informações detalhadas dos objetos criados.

## 🚀 Tecnologias Utilizadas

- **Java: Versão 23** (SE Runtime Environment e HotSpot VM)
- **Entrada de Dados** via `BufferedReader`
- **Manipulação de Strings** para validações de senha e e-mail
- **Sistema Operacional**: Ubuntu 24.04.1 LTS

## 📋 Pré-requisitos

- **Java JDK: Versão 23** ou superior instalada
- **Ambiente de Desenvolvimento:** BlueJ ou qualquer outro IDE de sua preferência
- **Git:** Para versionamento de código e gerenciamento do repositório


## 🛠️ Como executar o projeto

1. **Clone o repositório:**
```bash
git clone https://github.com/seu-usuario/projeto-biblioteca-java.git
```
2. **Compile as classes Java:**
```bash
javac src/*.java
```
3. **Execute o programa principal:**
```bash
java src/Principal
```

## 📌 Estrutura do Projeto

Principal.java - Contém o método main para inicializar e interagir com o programa.
Cliente.java - Define a classe Cliente, com métodos de validação e exibição de dados.
Livro.java - Define a classe Livro, com métodos para cálculo e exibição de informações.
Teclado.java - Classe auxiliar para captura de entradas do teclado com tratamento de erros.

## 📝 To-Do

- Implementar persistência de dados (opcional);
- Adicionar mais validações no cadastro de cliente (ex: validação de idade);
- Melhorar o tratamento de erros de entrada para outros tipos de dados;
- Desenvolver uma interface gráfica para o programa;
- Compilar o código para um arquivo executável.

## 📄 Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para usá-lo e modificá-lo!
