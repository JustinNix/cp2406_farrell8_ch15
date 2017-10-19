import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JLeftorRight extends JFrame implements MouseListener
{
    JLabel label = new JLabel("Click to see value");
    public JLeftorRight()
    {
        setTitle("Left Or Right");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(label);
        addMouseListener(this);
    }
    public static void main(String [ ] args)
    {
        JLeftorRight leftorRight = new JLeftorRight();
        leftorRight.setSize(300,200);
        leftorRight.setVisible(true);
    }
    @Override
    public void mouseReleased(MouseEvent e)
    {
        label.setText("value: " + e.getModifiers());
    }
    @Override
    public void mousePressed(MouseEvent e)
    {
    }
    @Override
    public void mouseClicked(MouseEvent e)
    {
    }
    @Override
    public void mouseEntered(MouseEvent e)
    {
    }
    @Override
    public void mouseExited(MouseEvent e)
    {
    }
}
