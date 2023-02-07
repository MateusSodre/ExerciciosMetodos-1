import java.util.Scanner;
public class Main {

    public static void  main(String[] args){
        //Calculadora
        System.out.println("Exercicios Calculadora");
        Calculadora.soma(2,8);
        Calculadora.subtracao(9,4.5);
        Calculadora.multiplicacao(5, 10);
        Calculadora.divisao(30, 3);

        //Mensagem
        System.out.println("Exercicios Mensagem");
        Mensagem.obterMensagem(11);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(3);

        //Emprestimo
        System.out.println("Exercicios Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}