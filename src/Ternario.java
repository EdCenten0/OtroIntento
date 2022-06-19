import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        /* int edad = 15;
        int requerida = 18;

        String permiso = edad >= requerida ? "Puede pasar" : "No tiene la suficiente edad";
        System.out.println(permiso);
 */

        
        int matematicas = 0;
        int biologia = 0;
        int literatura = 0;
        int fisica = 0;
        int quimica = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematicas");
        matematicas = scanner.nextInt();
        System.out.println("Ingrese la nota de biologia");
        biologia = scanner.nextInt();
        System.out.println("Ingrese la nota de literatura");
        literatura = scanner.nextInt();
        System.out.println("Ingrese la nota de fisica");
        fisica = scanner.nextInt();
        System.out.println("Ingrese la nota de quimica");
        quimica = scanner.nextInt();


        double promedio = (matematicas+biologia+literatura+fisica+quimica)/5;
        String aprobado = promedio >= 60 ? "Ha aprobado con un promedio de "+promedio: "Ha reprobado con un promedio de " + promedio;
        System.out.println(aprobado);


    }
}
