package view.custom;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.JButton;





public class Button extends JButton implements MouseListener{

public Button(){
    super();
    initialize();
}

private void initialize(){
     setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
     setPreferredSize(new java.awt.Dimension(125, 30));
     setSize(new java.awt.Dimension(125, 30));
}

public Button(String text){
    super(text);
    initialize();
}

public Button(String text, Icon icon){
    super(text, icon);
    initialize();
}

public void setEnabled(boolean enabled){
    super.setEnabled(enabled);
    if(enabled){
        if(isBorderPainted()){
            setBorderPainted(false);
            repaint();
        }
    }
}

@Override
public void mouseClicked(MouseEvent me) {

}

@Override
public void mousePressed(MouseEvent me) {

}

@Override
public void mouseReleased(MouseEvent me) {

}

@Override
public void mouseEntered(MouseEvent me) {
   if(!isBorderPainted() && isEnabled()){
       setBorderPainted(true);
       repaint();
   }
}

@Override
public void mouseExited(MouseEvent me) {
    if(isBorderPainted()){
        setBorderPainted(false);
        repaint();
    }
}
}
   