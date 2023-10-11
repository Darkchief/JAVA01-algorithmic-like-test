import java.util.*;
public class Main {
    public static void main(String[] args) {
      try{
        Scanner scanner = new Scanner(System.in);
        String string = "";
         while(scanner.hasNext()){
             string = string + scanner.next() + " ";
         }
          System.out.print(string.trim());
//          System.out.println(scanner.next());
        
      } catch(Exception e){
        System.out.println("An error was found ");
      }
      
    }
}
