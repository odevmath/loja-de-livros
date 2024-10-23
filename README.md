# Descrição do Projeto: Loja de Livros 📚

## Objetivo
Este projeto foi desenvolvido para aplicar conhecimentos de Java adquiridos durante o curso de Análise e Desenvolvimento de Sistemas da Unisinos. O sistema simula uma loja de livros, permitindo o cadastro e gerenciamento de clientes.

## Funcionalidades Implementadas ✅

- **Leitura de Dados**:
  - A classe `Teclado` foi criada para facilitar a entrada de dados, permitindo a leitura de inteiros, doubles, strings e caracteres de forma robusta e com tratamento de erros.

- **Cadastro de Clientes**:
  - A classe `Cliente` permite a criação de objetos com informações como nome, idade, sexo, e-mail e senha. A senha é validada para garantir que tenha pelo menos 8 caracteres.
  - O método `solicitarSenha` solicita ao usuário que crie e confirme a senha, armazenando-a se a confirmação for bem-sucedida.

- **Exibição de Informações do Cliente**:
  - Os dados dos clientes cadastrados são exibidos de forma organizada utilizando o método `exibirInformacoes`.

- **Gerenciamento de Clientes**:
  - O sistema permite o cadastro de múltiplos clientes e armazena suas informações em um array.

## Funcionalidades Pendentes ⏳

- **Integração com Livros**:
  - A classe `Livro` foi criada, mas sua integração no sistema ainda está pendente. A funcionalidade de cadastro e gerenciamento de livros deve ser implementada.

- **Sistema de Pesquisa e Filtros**:
  - A funcionalidade para pesquisar e filtrar livros com base em diferentes critérios (como título, autor e ano) ainda não foi implementada.

- **Interação com Clientes e Livros**:
  - É necessário desenvolver uma forma de associar clientes a livros, permitindo funcionalidades como a compra ou o empréstimo de livros.

## Considerações Finais
O projeto serve como uma base sólida para o desenvolvimento de um sistema de gerenciamento de uma loja de livros, incorporando boas práticas de programação orientada a objetos. Com as funcionalidades pendentes, o sistema poderá se tornar mais completo e funcional.
