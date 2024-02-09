import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,password;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanici adiniz: ");
        username = scanner.nextLine();

        System.out.println("Sifrenizi giriniz: ");
        password = scanner.nextLine();

        if(username.equals("ekin")&& password.equals("workintech")){
            System.out.println("başarılı giriş");
        }else {
            System.out.println("yanlış giriş");
        }
    }
}