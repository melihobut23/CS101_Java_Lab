import cs101.sosgame.SOS;
import java.awt.*;
import javax.swing.*;

/**
 * SOSCanvas program is related with the layout
 * 
 * @date 21.11.2019
 * @author Melih Obut
 * 
 */
public class SOSCanvas extends JPanel
{
   
   SOS newSos;
   int side = 400;
   
   public SOSCanvas(SOS newSos)
   {
      this.newSos = newSos;
      setVisible(true);
      repaint();
   }
   
   /**
    * Dimension are sized in here.
    * 
    * @return new Dimension(400, 400)
    * 
    */
   
   
   @Override
   public Dimension getPreferredSize() {
      return new Dimension(400, 400);
   }
   
   /**
    * This is creating lines and places which enables user to play the game.
    * 
    * @param Graphics g
    * 
    */
   
   public void paintComponent(Graphics g)
   {
      int fontSize = 20;
      g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
      g.setColor(Color.blue); 
      
      int x = getWidth();
      int y = getHeight();
      
      for ( int k = 0; k < newSos.getDimension(); k++ )
      {
         g.drawLine(0, k * (side / newSos.getDimension()), side, k * (side / newSos.getDimension()) );
         g.drawLine( k * (side / newSos.getDimension()), 0, k * (side / newSos.getDimension()), side);
         
         for(int l = 0; l <= newSos.getDimension(); l++)
         {
            if(k != newSos.getDimension() && l != newSos.getDimension())
            {
               int kLine = (int) (( 2 * k + 1) / (double) 2 *x/newSos.getDimension());
               int lLine = (int)((2*l+1)/(double)2*x/newSos.getDimension());
               
               g.drawString(""+ newSos.getCellContents(k,l), kLine,lLine);
            }
         }    
      }
      
      repaint();
   }
}



