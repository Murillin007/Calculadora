import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int op = 0;
        while(op != 5){
   
             System.err.println("1.adição");
             System.err.println("2.subtração");
             System.err.println("3.multiplicação");
             System.err.println("4.divisao");

             System.out.println("Insira a opção:"); op =  scan.nextInt();
        switch (op) {
            case 1:
                
                adicao add = new adicao();
                System.out.println("Valor 1:");
                int num1Add = scan.nextInt();
                add.setNums1(num1Add);
                System.out.println("Valor 2:");
                int num2Add = scan.nextInt();
                add.setNums2(num2Add);
                System.out.println("O valor é: " + add.soma());
             
                break;
            case 2:
                
                Subtracao sub = new Subtracao();
                System.out.println("Valor 1:");
                int num1Sub = scan. nextInt();
                sub.setNum1(num1Sub);
                System.out.println("Valor 2:");
                int num2Sub = scan.nextInt();
                sub.setNum2(num2Sub);
                System.out.println("O valor é: " + sub.sub());
                
                break;
            case 3:

                
                break;

    }
    }
}
}