import cs101.sosgame.SOS;
import java.awt.*;
import javax.swing.*;

/**
 * Test program is creating the game
 * 
 * @date 21.11.2019
 * @author Melih Obut
 * 
 */
public class SOSGame1
{
   public static void main(String[] args)
   {
      
      JFrame Frame1 = new JFrame();
      Frame1.setLayout(new BorderLayout());
      Frame1.setVisible(true);
      Frame1.setTitle("SOS GAME");
      Frame1.add(new SOSGUIPanel(new SOS(5),"Gamer1","Gamer2"),BorderLayout.WEST);
      Frame1.add(new SOSGUIPanel(new SOS(3),"Gamer1","Gamer2"),BorderLayout.EAST);
      Frame1.pack();
      

   }
}