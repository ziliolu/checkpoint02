package domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExceptions {
    static Scanner sc = new Scanner(System.in);

    public static int inputInteiro(){
        int opcao = 0;
        try{
            opcao = sc.nextInt();
            return opcao;
        } catch (InputMismatchException e){
            System.out.println("Ops! Era esperado um número (1 ou 2) mas algo diferente foi digitado.");
            sc.next();
        }
        return opcao;
    }

//    public static String inputString(){
//        String opcao = " ";
//        try {
//            opcao = sc.nextLine();
//            return opcao;
//        } catch(InputMismatchException e){
//            System.out.println("Ops! Era esperado um nome mas algo diferente foi digitado.");
//            sc.next();
//        }
//        return opcao;
//    }
}
