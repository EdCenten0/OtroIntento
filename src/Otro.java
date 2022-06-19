import java.util.Scanner;

public class Otro {
    public static void main(String[] args) {
        String[] usernames = new String[2];
        String[] passwords = new String[2];
        usernames[0] = "carlos";
        usernames[1] = "admin";
        passwords[0] = "holaMundo";
        passwords[1] = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el usuario");
        String u = scanner.nextLine();
        System.out.println("Ingrese la contraseña");
        String p = scanner.nextLine();

        boolean bandera = false;

        for(int i = 0; i < usernames.length;i++){
            if(usernames[i].equals(u) && passwords[i].equals(p)){
                bandera = true;
            }
        }

        if(bandera){
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Acceso denegado");
        }


    }
}
