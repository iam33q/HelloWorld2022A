import java.util.Scanner;
public class LoginScript {
    public static void main(String[] args){
        String username = "admin"; // not case-sensitive
        String password = "Password123!";
        String uname;
        String pass;
        int tryNum = 3;
        do
        {
            try
            {
                Scanner input1 = new Scanner(System.in);
                Scanner input2 = new Scanner(System.in);
                System.out.println("Please enter your username: ");
                uname = input1.next();
                System.out.println("Now enter your password: ");
                pass = input2.next();

                if ((uname.equals(username)) && (pass.equals(password)))
                {
                    System.out.println("Login successful!");
                    tryNum = 0;
                }
                else
                {
                    throw new Exception("Invalid Credentials.");
                }
            }
            catch (Exception e)
            {
                tryNum--;
                System.out.println("Invalid credentials. \nNumber of tries left: "+tryNum);
                if (tryNum == 0)
                {
                    System.out.println("Login Unsuccessful. Please contact your administrator!");
                }
            }
        }   while (tryNum > 0);
    }
}
