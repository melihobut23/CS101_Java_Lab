
/**
 *
 * @author melihobut
 * @date 30.10.2019
 */
interface Selectable {
   boolean select = false;
   
   @Override
   public boolean getSelected() {
      return select;
   }
   public void setSelected(boolean setSelect) {
      this.select = setSelect;
   }
//   public void shapeContains( int x, int y ){
//      
//   }
   
}
