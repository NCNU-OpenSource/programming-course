import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MathTest extends JFrame implements ActionListener{
    private static int start = 0, last = 0, result = 0;
    private Label labelX, labelY, labelZ;

    private MathTest() {
        // Create and set up the window.
        super("Math Test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);

        // Initialize frame's labels & buttons.
        this.setLayout(new GridLayout(2,4));

        String[] ButtonString = {"+", "-", "*", "/", "%"};

        labelX = new Label("", Label.CENTER);
        labelY = new Label("", Label.CENTER);
        labelZ = new Label("", Label.CENTER);

        this.add(labelX);
        this.add(new Label("？", Label.CENTER));
        this.add(labelY);
        this.add(new Label("=", Label.CENTER));
        this.add(labelZ);

        for(int i = 0 ; i < ButtonString.length ; i++) {
            Button option = new Button(ButtonString[i]);
            option.addActionListener(this);
            this.add(option);
        }

        // Setting Labels and Buttons content.
        // And mathematical expression's parameter.
        this.restart();

        //Display the window.
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        boolean win = false;

        // Check result from each click.
        switch(cmd) {
            case "+":
                if(start + last == result) {
                    win = true;
                }
                break;

            case "-":
                if(start - last == result) {
                    win = true;
                }
                break;

            case "*":
                if(start * last == result) {
                    win = true;
                }
                break;

            case "/":
                if(start / last == result) {
                    win = true;
                }
                break;

            case "%":
                if(start % last == result) {
                    win = true;
                }
                break;
        }

        if(win == true) {
            JOptionPane.showMessageDialog(this, "好棒棒哦！下一題！", "冰崩冰崩！！", JOptionPane.INFORMATION_MESSAGE);
            this.restart();
        } else {
            JOptionPane.showMessageDialog(this, "別灰心，再想一下！", "答錯，哭惹", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void restart() {
        start = (int)(Math.random()*999+1);
        last = (int)(Math.random()*999+1);

        int operation = (int)(Math.random()*5); // 0:+, 1:-, 2:*, 3:/, 4:%
        result = 0;

        // Computing result.
        switch (operation) {
            case 0:
                result = start + last;
                break;

            case 1:
                result = start - last;
                break;

            case 2:
                result = start * last;
                break;

            case 3:
                result = start / last;
                break;

            case 4:
                result = start % last;
                break;
        }

        labelX.setText(Integer.toString(start));
        labelY.setText(Integer.toString(last));
        labelZ.setText(Integer.toString(result));
    }

    public static void main(String[] args) {
        new MathTest();
    }
}