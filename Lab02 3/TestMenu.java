import java.util.ArrayList;
import java.util.Scanner;

public class TestMenu {
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan;
      String url;
      int input;
      ArrayList<MySimpleURLReader> list;
      int index;
      
      list = new ArrayList<MySimpleURLReader>();
      scan = new Scanner(System.in);
      
      do {
         
         System.out.println("-----------------------------------------------------");
         
         System.out.println("(1) Enter the url of poem to add to collection");
         System.out.println("(2) List all poems in the collection ");
         System.out.println("(3) Quit ");
         
         System.out.println("-----------------------------------------------------");
         
         System.out.println("please enter your choice :");
         input = scan.nextInt();
         
         scan = new Scanner(System.in);
         
         if (input == 1) {
            System.out.println("Enter the url:");
            url = scan.nextLine();
            
            if (url.indexOf("htm")!=-1) {
               HTMLFilteredReader reader = new HTMLFilteredReader(url);
               list.add(reader);
            } else {
               MySimpleURLReader reader = new MySimpleURLReader(url);
               list.add(reader);
            }
         }else if(input ==2){
            for (int i=0 ; i<list.size(); i++){
               System.out.println("--"+i+"--"+list.get(i).getName());
            }
            
            
            System.out.println("please enter the index :");
            index = scan.nextInt();
            
            if(index<list.size() && index >=0){
               System.out.println(list.get(index).getPageContents());
               System.out.println("--------------------------------------");
            }else if( index == list.size()){
               
            }else
               System.out.println("invalid input!");
            
            
            
         }
         
      } while (input != 3);
      
   }
   
}