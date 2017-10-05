import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JMovieFrame extends JFrame
{
    private JButton nb = new JButton("North Button");
    private JButton sb = new JButton("South Button");
    private JButton eb = new JButton("East Button");
    private JButton wb = new JButton("West Button");
    private JButton cb = new JButton("Center Button");
    private Container con = getContentPane();
    public JMovieFrame()
    {
        con.setLayout(new BorderLayout());
        con.add(nb, BorderLayout.NORTH);
        nb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nb.setText("Allah");
            }
        });
        con.add(sb, BorderLayout.SOUTH);
        sb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                sb.setText("Released in 1775");
            }
        });
        con.add(eb, BorderLayout.EAST);
        eb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                eb.setText("Released yesterday");
            }
        });
        con.add(wb, BorderLayout.WEST);
        wb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                wb.setText("Released 1444");
            }
        });
        con.add(cb, BorderLayout.CENTER);
        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                cb.setText("Released Today");
            }
        });
        setSize(400, 150);
    }
    public static void main(String[] args)
    {
        JDemoBorderLayout frame = new JDemoBorderLayout();
        frame.setVisible(true);
    }
}
