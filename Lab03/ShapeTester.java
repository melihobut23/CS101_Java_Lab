import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author melihobut
 * @date 30.10.2019
 */
public class ShapeTester {
        @SuppressWarnings("empty-statement")
 public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int height;
            int width;
            int side;
            int radius;
            int x;
            int y;
            int input; 
            String selectedShape;
            ShapeContainer container = null;
            do{
                System.out.println("************************************");
                System.out.println("1- Empty set of shapes");
                System.out.println("2- Add ");
                System.out.println("3- Compute total surface");
                System.out.println("4- Print all shapes");
                System.out.println("5- Quit");
                System.out.println("************************************");
                
                System.out.println("Enter your option");
                input = scan.nextInt();
                
                if( input  == 1 ){
                    container = new ShapeContainer();
                    System.out.println("Congratulations! You created a new shape container");
                }
                else if(input  == 2 ){
                    
                    System.out.println("Enter the cordinates ");
                    System.out.println("X :");
                    x = scan.nextInt();
                    System.out.println("Y :");
                    y = scan.nextInt();
                    
                    System.out.println(" Choose a shape A-Rectangle B-Circle C-Square");
                    selectedShape = scan.next();
                    
                    
                    if (selectedShape.equals("a") || selectedShape.equals("A") ) {
                    
                        System.out.println("Height :");
                        height = scan.nextInt();
                        System.out.println("Width :");
                        width = scan.nextInt();
                        System.out.println("Side :");
                        side = scan.nextInt();
                    
                         Rectangle rectangle = new Rectangle(width, height, side);
                         rectangle.setLocation(x, y);
                         container.add(rectangle);
                    }
                
                    else if (selectedShape.equals("b") || selectedShape.equals("B") ) {
                    
                        System.out.println("Radius of circle:");
                        radius = scan.nextInt();
                        
                        Circle circle1 = new Circle(radius);
                        circle1.setLocation(x, y);
                        container.add(circle1);
                    }
                    
                    else if (selectedShape.equals("c") || selectedShape.equals("C") ) {
                    
                        System.out.println("Side of square");
                        side = scan.nextInt();
                        
                        Square square1 = new Square(side);
                        square1.setLocation(x, y);
                        container.add(square1);
                    }
                    else{
                        System.out.println("It is invalid");
                    }
                }
                else if(input  == 3 ){
                    
                    System.out.println("Surface area is:" + container.getArea());
                }
                else if(input  ==  4 ){
                    System.out.println(container);
                }

            }while(input !=5);
            
            
            
 }
 // End of the ShapeTester class
}
