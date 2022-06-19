import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        int conteo;
        int menor = Integer.MAX_VALUE;
        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas veces quieres que se pida un numero, el limite es 10");
        conteo = scanner.nextInt();
        if(conteo < 10){
            System.out.println("El numero tiene que ser mayor que 10");
            System.exit(1);
        }

        for(int i = 0; i < conteo; i++){
            System.out.println("Ingrese el numero "+ (i+1) +":");
            numero = scanner.nextInt();
            menor = numero < menor ? numero : menor;
        }

        System.out.println("El menor de los numeros es: " + menor);

        if(menor < 10){
            System.out.println("El numero final es menor que 10");
        }else{
            System.out.println("El numero es mayor o igual que 10");
        }


    }
    
}
