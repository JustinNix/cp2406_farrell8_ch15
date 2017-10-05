import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class JVowelConsonant extends JFrame
{
    Random rand = new Random();

    public JVowelConsonant()
    {
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel(new GridLayout(2,2,5,5));
        JPanel panel2 = new JPanel(new GridLayout(2,2,5,5));
        JPanel label = new JPanel(new GridLayout(1,1,5,5));
        JLabel labelText = new JLabel();

        add(label);
        add(panel1);
        add(panel2);

        label.add(labelText);

        JButton[] buttons = new JButton[26];
        int count = 0;
        for(char alphabet = 'a';  alphabet <= 'z'; alphabet++ ){
            buttons[count] = new JButton(String.valueOf(alphabet));
            count++;
        }

        for(int i = 0; i<4; i++){
            int buttonPicked = rand.nextInt(24);
            panel1.add(buttons[buttonPicked]);
            buttons[buttonPicked].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(buttons[buttonPicked].getText().equals("a") || buttons[buttonPicked].getText().equals("e") || buttons[buttonPicked].getText().equals("i") ||buttons[buttonPicked].getText().equals("o") || buttons[buttonPicked].getText().equals("u"))
                    labelText.setText("vowel");
                    else labelText.setText("Consonant");
                }
            });
        }
        for(int i = 0; i<4; i++){
            int buttonPicked = rand.nextInt(24);
            panel2.add(buttons[buttonPicked]);
            buttons[buttonPicked].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(buttons[buttonPicked].getText().equals("a") || buttons[buttonPicked].getText().equals("e") || buttons[buttonPicked].getText().equals("i") ||buttons[buttonPicked].getText().equals("o") || buttons[buttonPicked].getText().equals("u"))
                        labelText.setText("vowel");
                    else labelText.setText("Consonant");
                }
            });
        }

        setSize(500, 500);
    }

    public static void main(String[] args)
    {
        JVowelConsonant frame = new JVowelConsonant();
        frame.setVisible(true);
    }
}
