
/**
 *
 * @author melihobut
 * @date 30.10.2019
 */
public class Rectangle extends Shape implements Selectable {
    
    int width;
    int height;
    boolean select;
    
    public Rectangle( int sides, int width, int height){
        super();
        
        this.height = height;
        this. width = width;
        select = false;
    }
    
    @Override
    public double getArea() {
    return sides * height * width;
}

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
  return "Rectangle with heigth :" + height + " and width :" + width + " (x,y = " + x + "," + y + ") " + selected
    + '\n';
 }
    
}
