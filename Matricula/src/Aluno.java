public class Aluno {
    public String matricula;
    protected String nome;
    protected String telefone;
    protected boolean status;
    private double nota1;
    private double nota2;
    private double media;
    private String situacao;

    public Aluno(String matricula, String nome, String telefone) {
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.status = true; // Aluno começa com status ativo por padrão
    }

    // Métodos de acesso (getters) e modificação (setters) para os atributos
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean getStatus() {
        return status;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Método para realizar a primeira prova
    public void realizarProva1(double nota1) {
        if (status) {
            this.nota1 = nota1;
            System.out.println("A primeira prova de " + nome + " foi realizada com nota " + nota1);
        } else {
            System.out.println(nome + " está inativo e não pode realizar a prova.");
        }
    }

    // Método para realizar a segunda prova
    public void realizarProva2(double nota2) {
        if (status) {
            this.nota2 = nota2;
            System.out.println("A segunda prova de " + nome + " foi realizada com nota " + nota2);
        } else {
            System.out.println(nome + " está inativo e não pode realizar a prova.");
        }
    }

    // Método para apurar o resultado (calcular a média e definir a situação)
    public void apurarResultado() {
        if (status) {
            media = (nota1 + nota2) / 2;
            if (media >= 70) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }
            System.out.println(nome + " obteve média " + media + " e está " + situacao);
        } else {
            System.out.println(nome + " está inativo e não pode ter seu resultado apurado.");
        }
    }

    // Método para inativar o aluno
    public void inativarAluno() {
        status = false;
        System.out.println(nome + " foi inativado.");
    }

    // Método para ativar o aluno
    public void ativarAluno() {
        status = true;
        System.out.println(nome + " foi ativado.");
    }

    // Método para mostrar o estado atual do aluno
    public void estadoAtual() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Status: " + (status ? "Ativo" : "Inativo"));
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
        
    }
}
