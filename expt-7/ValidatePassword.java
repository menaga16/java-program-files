import java.util.Scanner;
public class ValidatePassword 
{
  public static void main(String[] args) 
  {
    String status="new";
    while(!"STATUS:Valid Password".equals(status))
    {
    String inputPassword;
    Scanner obj = new Scanner(System.in);
    System.out.print("enter the new Password: ");
    String Password = obj.next();
    System.out.println(Checking(Password));
    status=Checking(Password);
    }
    System.out.print(" your password is confirmed");
  }

  public static String Checking(String Password) 
  {
    String status = "STATUS:Valid Password";
    int length = 0;
    int numCount = 0;
    int capCount = 0;
    for (int x = 0; x < Password.length(); x++)
    {
    
     if ((Password.charAt(x) > 47 && Password.charAt(x) < 58))
      {
        numCount++;
      }
     if ((Password.charAt(x) > 64 && Password.charAt(x) < 91))
     {
        capCount++;
      }
      length = (x + 1);
    }
    if (numCount < 2) 
    {
      status = "STATUS: unsuccessfull (contains less Numbers in Password)";
    }
    if (capCount < 2) {
      status = "STATUS: unsuccessfull (there is no Enough Capital Letters in Password)";
    }
    if (length < 2) {
      status = "STATUS: unsuccessfull  (Password is Too Short)";
    }
    return (status);
  }
}