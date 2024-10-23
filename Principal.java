public class Principal {
    public static void main(String[] args) {
        // Instanciando clientes
        Cliente[] clientes = new Cliente[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nCadastro do cliente " + (i + 1));
            String name = Teclado.leString("Informe o nome do cliente: ");
            int age = Teclado.leInt("Informe a idade do cliente: ");
            char sex = Teclado.leChar("Informe o sexo do cliente (M/F): ");
            String email = Teclado.leString("Informe o email do cliente: ");

            // Instanciando o cliente
            Cliente cliente = new Cliente(name, age, sex, email);
            cliente.solicitarSenha(); // Solicita e armazena a senha

            // Armazena o cliente no array
            clientes[i] = cliente;
            System.out.println("\nCliente " + (i + 1) + " criado com sucesso!");
        }

        // Exibir informações dos clientes
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("\nInformações do cliente " + (i + 1) + ":");
            clientes[i].exibirInformacoes();
        }
    }
}
