public class Principal {
    public static void main(String[] args) {
        // Criando três instâncias de Livro
        Livro[] livros = new Livro[3];
        for (int i = 0; i < livros.length; i++) {
            System.out.println("Cadastro do Livro " + (i + 1));
            String titulo = Teclado.leString("Digite o título do livro:");
            String autor = Teclado.leString("Digite o autor do livro:");
            int ano = Teclado.leInt("Digite o ano de publicação:");
            double preco = Teclado.leDouble("Digite o preço do livro:");
            int numPaginas = Teclado.leInt("Digite o número de páginas do livro:");

            // Criando o objeto Livro com todas as informações coletadas
            livros[i] = new Livro(titulo, autor, ano, preco, numPaginas);
            System.out.println();
        }

        // Criando três instâncias de Cliente
        Cliente[] clientes = new Cliente[3];
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Cadastro do Cliente " + (i + 1));
            String nome = Teclado.leString("Digite o nome do cliente:");
            int idade = Teclado.leInt("Digite a idade do cliente:");
            char sexo = Teclado.leChar("Digite o sexo do cliente (M/F):");

            // Criando o objeto Cliente e cadastrando email e senha
            Cliente cliente = new Cliente(nome, idade, sexo);
            cliente.cadastrarEmail();
            cliente.cadastrarSenha();
            clientes[i] = cliente;
            System.out.println();
        }

        // Exibindo o preço por página de cada livro
        System.out.println("Preço por página dos livros:");
        for (int i = 0; i < livros.length; i++) {
            System.out.printf("Livro %d - %s: R$%.2f por página%n", i + 1, livros[i].getTitulo(), livros[i].calcularPrecoPorPagina());
        }

        // Exibindo informações de todos os livros
        System.out.println("\nInformações dos livros:");
        for (Livro livro : livros) {
            livro.imprimirInformacoes();
            System.out.println();
        }

        // Exibindo informações de todos os clientes
        System.out.println("Informações dos clientes:");
        for (Cliente cliente : clientes) {
            cliente.exibirInformacoes();
            System.out.println();
        }
    }
}
