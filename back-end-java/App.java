import java.util.ArrayList;
import java.util.List;

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
        aluno1.setEmail("alessandropb.fj@gmail.com");
        aluno1.setMatricula(0000);
        System.out.println(aluno1.getNome());

        //Testando Quadriláteros
        Quadrado q1 = new Quadrado(5);
        System.out.println(q1.calcularArea());

        Retangulo r1 = new Retangulo(5, 10);
        System.out.println(r1.calcularArea());

        List<IQuadrilatero> lista = new ArrayList<>();
        lista.add(q1);
        lista.add(r1);
        double soma = 0;
        for (IQuadrilatero item : lista) {
            soma +=item.calcularArea();
        }
        System.out.println(soma);
    }

}