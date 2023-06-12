package Incapsulation;

import java.util.Scanner;

// Awal object User
class user{
    protected String username;
    protected String password;
    // Awal method register
    void register(String username,String password){
        this.username= username;
        this.password= password;
        System.out.println("username ="+this.username);
        System.out.println("password ="+this.password);
    }
    // Akhir method register
    // Awal method notification
    void notification(){
        System.out.println("user created by user");
    }
    // Akhir method notification
    
}
// Akhir object User
// Awal object Admin yang inheritence
class admin extends user{
    private final String role = "admin";
    // Awal Method create user
    void createUser(String username,String password){
        this.username = username;
        this.password = password;
    }
    // Akhir Method create user
// polymorphism
@Override
// awal method notification yang di override
void notification(){
    System.out.println("user created by "+role);
}
// akhir method notification yang di override
// polymorphism
}
// Akhir object Admin yang inheritence

public class incapsulation {
    public static void main(String[] args) {
        // inputan
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
                
                // Awal Pemanggilan Object 
                user user1 = new user();
                user1.register(usernameUser, passwordUser);
                user1.notification();
                // Akhir Pemanggilan Object
                    break;
                case 2:
                System.out.println("REGISTRASI");
                System.out.println("masukkan username = ");
                String usernameAdmin =input.nextLine();
                System.out.println("masukkan password = ");
                String passwordAdmin =input.nextLine();
                
                // Awal Pemanggilan Object 
                admin user2 = new admin();
                user2.register(usernameAdmin, passwordAdmin);
                user2.notification();
                // Akhir Pemanggilan Object
                    break;
            
                default:
                    break;
            }

        }
    }
}
