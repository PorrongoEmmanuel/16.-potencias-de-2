import java.util.Scanner;
public class generar {

    public  void pote(){
        Scanner i = new Scanner(System.in);
        int numero;
        System.out.println("Potencia de 2");
        System.out.print("Ingresa un numero: ");
        numero = i.nextInt();
        Potencia(numero);
    }

    public static void Potencia(int numero){
        int i;
        for(i = 0; i <= numero; i++){
            System.out.println(i + "^2 = " + (int)(Math.pow(i,2)) );
        }


    }
}
