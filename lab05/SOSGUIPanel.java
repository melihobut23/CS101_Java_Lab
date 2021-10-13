import cs101.sosgame.SOS;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;

/**
 * SOSGUIPanel program is creating the panels, labels and buttons. Also show message about result
 * 
 * @date 21.11.2019
 * @author Melih Obut
 * 
 */
public class SOSGUIPanel extends JPanel
{
   // properties
   
   JPanel newPanel;
   SOSCanvas newCanvas;
   JLabel firstPlayerLabel,secondPlayerLabel;
   String player1,player2;
   int score1 = 0;
   int score2 = 0;
   boolean selected = true;
   JRadioButton buttonS =new JRadioButton("s",selected);
   JRadioButton buttonO =new JRadioButton("o",!selected);
   
   
   // constructors
   public SOSGUIPanel(SOS newSos, String player1, String player2)
   {
      this.player1 = player1;
      this.player2 = player2;
      
      newPanel = new JPanel(); 
      newCanvas = new SOSCanvas(newSos);
      
      newCanvas.setBackground(Color.orange); 
      newPanel.setBackground(Color.yellow); 
      
      add(newPanel, BorderLayout.EAST);
      add(newCanvas, BorderLayout.SOUTH);
      
      ButtonGroup letter= new ButtonGroup();
      letter.add(buttonS);
      letter.add(buttonO);
      buttonS.setActionCommand("s");  
      buttonO.setActionCommand("o");  
      buttonS.setBackground(Color.yellow);
      buttonO.setBackground(Color.blue);
      
      firstPlayerLabel = new JLabel("1. Player's Score: " + newSos.getPlayerScore1());
      secondPlayerLabel = new JLabel("2. Player's Score: " + newSos.getPlayerScore2());
      
      newPanel.add(firstPlayerLabel);
      newPanel.add(secondPlayerLabel);
      newPanel.add(buttonS);
      newPanel.add(buttonO);
      
         
   /**
    * This method adds a feature to the mouse and also 
    * 
    * @return game result
    * @param MouseEvent e
    * 
    */
      newCanvas.addMouseListener(new MouseAdapter(){
         public void mousePressed(MouseEvent e)
         {
            String selectedLetter =  letter.getSelection().getActionCommand();
            char selectedletter = selectedLetter.charAt(0);
            int width = (newCanvas.getWidth()/ newSos.getDimension());
            int height = (newCanvas.getHeight() / newSos.getDimension());  
            
            int line= (e.getX() / width) + 1;
            int row = (e.getY() / height) + 1;
            
            int outcome = newSos.play(selectedletter,line,row);
            
            
            firstPlayerLabel.setText("1. Player's Score: " + newSos.getPlayerScore1());
            secondPlayerLabel.setText("2. Player's Score: "+ newSos.getPlayerScore2());
            
            JFrame frame = new JFrame();
            if(newSos.isGameOver())
            {
               if(newSos.getPlayerScore1() > newSos.getPlayerScore2() )
                  JOptionPane.showMessageDialog(frame,"Gamer1 is the winner ");
               else if(newSos.getPlayerScore1() < newSos.getPlayerScore2() )
                  JOptionPane.showMessageDialog(frame,"Gamer2 is the winner ");
               else if(newSos.getPlayerScore1() == newSos.getPlayerScore2() )
                  JOptionPane.showMessageDialog(frame,"Scores are equals.");
                  System.exit(0);
            }
         }
      });
      
   }
   
}