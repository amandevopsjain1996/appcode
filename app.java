### code for printing welcome to 2022 and user agent info
import java.util.scanner;
public class Message {
  public static void main(String[] args) {
    System.out.println(""Welcome to 2022);
    String userAgentInfo = getUserAgentInfo();
    System.out.println(userAgentInfo);
  }
  public static String getUserAgentInfo() {
     Scanner s = new Scanner(System.in);
     System.out.print("Enter useragent")
     String userAgentInfo = s.nextLine();
     s.close();
    return userAgentInfo;
  }
}
      
  
