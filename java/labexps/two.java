package labexps;

// import java.util.Scanner;

public class two{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        try{
            if(args[0].equals("login")){
                System.out.println("[LOGIN]");
                System.out.println("[username]: "+args[1]);
                String username = args[1];
                System.out.println("[password]: "+args[2]);
                String password = args[2];
                // System.out.println(password);
                if(username.equals("admin") && password.equals("123")){
                    System.out.println("[logged in successfully]");
                }
                else{
                    System.out.println("[invalid credentials]");
                }
            }
            else{
                System.out.println(args[0]);
            }
        }
        catch(Exception e){
            System.out.println("error: program needs 3 argumends");
        }
    }
}