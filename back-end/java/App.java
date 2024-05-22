public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Alessandro");
        System.out.println(pessoa1.getNome());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Alessandro");
        if (pessoa1 == pessoa2) {
            System.out.println("Referencias diferentes");
        }
        //criando um objeto
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Alessandro Silva da Costa");
    }
}