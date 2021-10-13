import  java.util.ArrayList;

/**
 *
 * @author melihobut
 * @date 30.10.2019
 */
public class ShapeContainer {
   Arraylist<Selectable> shapeContainer1;
   
   public ShapeContainer() {
      shapeContainer1 = new Arraylist<Selectable>();
   }
   
   public void add(Selectable S){
      shapeContainer1.add(S);
   }
   public double getArea(){
      int sum;
      
      sum=0;
      
      for (int i = 0; i < shapeContainer1.size(); i++) {
         sum += ((Shape)shapeContainer1.get(i)).getArea();
      }
      
      return sum;
   }
   
   @Override
   public String toString(){
      String result;
      
      result = "Shape container has : ";
      for(int i=0; i<shapeContainer1.size();i++){
         result+= shapeContainer1.get(i).toString();
      }
      
      return result;
   }
}
