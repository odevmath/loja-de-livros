public class Cliente {
    // Atributos:
    private String name;
    private int age;
    private char sex;
    private String email;
    private String password;

    // Método construtor:
    public Cliente(String name, int age, char sex, String email) {
        this.name = name;
        this.age = age;
        setSex(sex); // Usando o setter para verificar o sexo
        this.email = email;
    }
    
    // Método de definição de senha com verificação:
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Senha inválida. A senha deve ter pelo menos 8 caracteres.");
        }
    }

    // Método para validar a senha:
    private boolean isValidPassword(String password) {
        return password.length() >= 8; // Verificação simples de senha
    }
    
    // Método de solicitação + verificação de senha
    public void solicitarSenha() {
        String password;
        String confirmPassword;

        do {
            password = Teclado.leString("Crie uma senha: "); // Certifique-se que Teclado está inicializado
            confirmPassword = Teclado.leString("Informe sua senha novamente: ");

            if (!password.equals(confirmPassword)) {
                System.out.println("As senhas não correspondem. Tente novamente!");
            }
        } while (!password.equals(confirmPassword) || !isValidPassword(password));

        setPassword(password); // Armazena a senha após verificar.
    }
    
    // Getters e Setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
 
    // Método para exibir as informações do cliente:
    public void exibirInformacoes() {
        System.out.println("=== INFORMAÇÕES DO CLIENTE ===");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Sexo: " + (sex == 'M' ? "Masculino" : "Feminino"));
        System.out.println("E-mail: " + email);
        System.out.println("Senha: " + "*******"); // Exibir a senha como asteriscos
        System.out.println("==============================");
    }
    
    public void setSex(char sex) {
        // Verifica se o sexo é 'M' ou 'F'
        if (sex == 'M' || sex == 'F') {
            this.sex = sex;
        } else {
            throw new IllegalArgumentException("O sexo deve ser 'M' ou 'F'.");
        }
    }
}
