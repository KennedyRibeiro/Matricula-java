public class Matricula {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("12345", "Kennedy", "3599846-6434");
        aluno1.realizarProva1(80);
        aluno1.realizarProva2(75);
        aluno1.apurarResultado();
        aluno1.estadoAtual();
    }
}
