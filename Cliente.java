public class Cliente {
    private String nome;
    private int idade;
    private char sexo;
    private String email;
    private String senha;

    // Construtor
    public Cliente(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Getters e Setters básicos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getSexoPorExtenso() {
        if (sexo == 'F' || sexo == 'f') {
            return "Feminino";
        } else if (sexo == 'M' || sexo == 'm') {
            return "Masculino";
        } else {
            return "Não especificado";
        }
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Método para cadastrar senha com confirmação e validação de requisitos
     */
    public void cadastrarSenha() {
        while (true) {
            String senha1 = Teclado.leString("Digite a senha:");
            if (!validaSenha(senha1)) {
                System.out.println("A senha deve ter no mínimo 8 caracteres, com ao menos uma letra maiúscula, um número e um caractere especial.");
                continue;
            }

            String senha2 = Teclado.leString("Confirme a senha:");
            if (senha1.equals(senha2)) {
                setSenha(senha1);
                System.out.println("Senha cadastrada com sucesso.");
                break;
            } else {
                System.out.println("As senhas não coincidem. Tente novamente.");
            }
        }
    }

    /**
     * Método para cadastrar email com confirmação
     */
    public void cadastrarEmail() {
        while (true) {
            String email1 = Teclado.leString("Digite o e-mail:");
            String email2 = Teclado.leString("Confirme o e-mail:");
            if (email1.equals(email2)) {
                setEmail(email1);
                System.out.println("E-mail cadastrado com sucesso.");
                break;
            } else {
                System.out.println("Os e-mails não coincidem. Tente novamente.");
            }
        }
    }

    /**
     * Método para exibir informações do usuário com e-mail mascarado
     */
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexoPorExtenso());
        System.out.println("E-mail: " + getEmailMascarado());
    }

    /**
     * Método para obter e-mail mascarado
     * @return String com o e-mail parcialmente oculto
     */
    private String getEmailMascarado() {
        if (email == null || email.isEmpty()) return "E-mail não cadastrado";

        int atIndex = email.indexOf('@');
        if (atIndex <= 1) return email; // Caso o e-mail seja muito curto

        String primeiroChar = email.substring(0, 1);
        String dominio = email.substring(atIndex); // Inclui @ e o domínio
        String mascarado = primeiroChar + "**********" + dominio;
        return mascarado;
    }

    /**
     * Método para validar os requisitos da senha
     * @param senha Senha a ser validada
     * @return boolean - true se a senha atende aos requisitos, false caso contrário
     */
    private boolean validaSenha(String senha) {
        if (senha.length() < 8) {
            return false;
        }
        boolean temMaiuscula = senha.matches(".*[A-Z].*");
        boolean temNumero = senha.matches(".*[0-9].*");
        boolean temEspecial = senha.matches(".*[!@#$%^&*()\\-+=].*");
        return temMaiuscula && temNumero && temEspecial;
    }
}
