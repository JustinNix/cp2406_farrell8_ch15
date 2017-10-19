import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JavaJuniorCollege extends JFrame implements ActionListener
{
    JMenuBar main = new JMenuBar();
    JMenu files = new JMenu("File");
    JMenu campuses = new JMenu("Campuses");
    JMenu degrees = new JMenu("Degrees");
    JMenu majors = new JMenu("Majors");
    JMenuItem acctng = new JMenuItem("Accounting");
    JMenuItem IT = new JMenuItem("Information Technology");
    JMenuItem cooking = new JMenuItem("cooking");
    JMenuItem debate = new JMenuItem("Debate club");
    JMenuItem hoodTalk = new JMenuItem("hoodTalk");
    JLabel label1 = new JLabel("    College -     ");
    JLabel lineLabel = new JLabel(" we do -");
    JLabel label2 = new JLabel();
    JMenuItem exit = new JMenuItem("Exit");
    JMenuItem east = new JMenuItem("East");
    JMenuItem south = new JMenuItem("South");
    public JavaJuniorCollege()
    {
        setTitle("The bois");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setJMenuBar(main);
        main.add(files);
        main.add(campuses);
        main.add(degrees);
        main.add(majors);
        files.add(exit);
        campuses.add(east);
        campuses.add(south);
        degrees.add(acctng);
        degrees.add(IT);
        degrees.add(cooking);
        majors.add(debate);
        majors.add(hoodTalk);
        exit.addActionListener(this);
        east.addActionListener(this);
        south.addActionListener(this);
        acctng.addActionListener(this);
        IT.addActionListener(this);
        cooking.addActionListener(this);
        debate.addActionListener(this);
        hoodTalk.addActionListener(this);
        add(label1);
        label1.setFont(new Font("Arial", Font.BOLD, 16));
        lineLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(lineLabel);
        add(label2);
        label2.setFont(new Font("Arial", Font.ITALIC, 16));
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        String text = "  ";
        if(source == exit)
            System.exit(0);
        else if(source == south)
            text = "South campus on the banks of a beautiful river";
        else if(source == east)
            text = "East campus convenient to downtown";
        else if(source == acctng)
            text = "Accounting counts accounts";
        else if(source == IT)
            text = "I.T classes include bill of gates and paint";
        else  if(source == cooking)
            text = "cooking classes with real-world experience";
        else  if(source == debate)
            text = "talk alot";
        else
            text = "hoodlings in the hood";
        label2.setText(text);
    }

    public static void main(String[] args)
    {
        JavaJuniorCollege frame = new JavaJuniorCollege();
        final int WIDTH = 500;
        final int HEIGHT = 200;
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}