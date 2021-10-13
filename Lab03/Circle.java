 /**
 *
 * @author melihobut
 * @date 30.10.2019
 */
public class Circle extends Shape implements Selectable{
    int radius;
    boolean select;
    
    public Circle(int radius) {
        super();
        this.radius = radius;
        select = false;
    }
    
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    /**
     public Shape contains(int x, int y) {

 }
       
     *
    */
    
     /* 
     * @param x
     * @param y
     */
    
    @Override
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean getSelected() {
      return select;
    }

    @Override
    public void setSelected(boolean setSelect) {
       select = setSelect;
    }
    public String toString() {
    String selected;
    if (!select) 
        selected = "unselected"; 
        else {
        selected = "selected";
        }
  return "Circle with radius :" + radius + " (x,y = " + x + "," + y + ") " + selected + '\n';
 }
}
    

