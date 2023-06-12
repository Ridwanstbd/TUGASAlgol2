package Incapsulation;

import java.util.Scanner;


class user{
    protected String username;
    protected String password;
    void register(String username,String password){
        this.username= username;
        this.password= password;
        System.out.println("username ="+this.username);
        System.out.println("password ="+this.password);
    }
    void notification(){
        System.out.println("user created by user");
    }

}

class admin extends user{
    private final String role = "admin";
    void createUser(String username,String password){
        this.username = username;
        this.password = password;
    }
@Override
void notification(){
    System.out.println("user created by "+role);
}
}
public class incapsulation {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Anda daftar sebagai apa?\n1. User\n2.Admin \n pilihan Anda : ");
            int pilihan = input.nextInt();input.nextLine();
            switch(pilihan){
                case 1:
                System.out.println("REGISTRASI");
                System.out.println("masukkan username = ");
                String usernameUser =input.nextLine();
                System.out.println("masukkan password = ");
                String passwordUser =input.nextLine();
                user user1 = new user();
                user1.register(usernameUser, passwordUser);
                user1.notification();
                    break;
                case 2:
                System.out.println("REGISTRASI");
                System.out.println("masukkan username = ");
                String usernameAdmin =input.nextLine();
                System.out.println("masukkan password = ");
                String passwordAdmin =input.nextLine();
                admin user2 = new admin();
                user2.register(usernameAdmin, passwordAdmin);
                user2.notification();
                    break;
            
                default:
                System.out.println("masukkan anda salah");
                    break;
            }

        }
    }
}
