import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MathGame extends JFrame implements ActionListener {
    private static int start = 0, last = 0;
    private Label labelX, labelY, labelCmd;
    private Button[] option = new Button[5];
    private int operationType = 0;
    private int finalAnswer = 0;
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        boolean win = false;

        if(finalAnswer == Integer.valueOf(cmd)) {
            JOptionPane.showMessageDialog(this, "好棒棒哦！下一題！", "冰崩冰崩！！", JOptionPane.INFORMATION_MESSAGE);
            restart();
        } else {
            JOptionPane.showMessageDialog(this, "別灰心，再想一下！", "答錯，哭惹", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void restart() {
        start = (int)(Math.random()*999+1);
        last = (int)(Math.random()*999+1);

        String[] operation = {"+", "-", "*", "/", "%"};
        operationType = (int)(Math.random()*5);
        int[] answer = new int[5];
        
        // 5 Button 答案
        answer[0] = start + last;
        answer[1] = start - last;
        answer[2] = start * last;
        answer[3] = start / last;
        answer[4] = start % last;

        // 預存最終解答
        finalAnswer = answer[operationType];

        // 打亂答案
        for(int i = 0 ; i < 5 ; i++) {
            int RandomNum = (int)(Math.random()*5);
            int tmp = answer[RandomNum];
            answer[RandomNum] = answer[i];
            answer[i] = tmp;
        }

        // 設定 Label & Button 內容
        labelCmd.setText(operation[operationType]);
        labelX.setText(Integer.toString(start));
        labelY.setText(Integer.toString(last));
        for(int i = 0 ; i < 5 ; i++) {
            option[i].setLabel(Integer.toString(answer[i]));
        }
    }

    private MathGame() {
        //Create and set up the window.
        super("Guess Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);

        // Frame's label & button.
        this.setLayout(new GridLayout(2,5));

        labelX = new Label("", Label.CENTER);
        labelY = new Label("", Label.CENTER);
        labelCmd = new Label("", Label.CENTER);

        this.add(labelX);
        this.add(labelCmd);
        this.add(labelY);
        this.add(new Label("=", Label.CENTER));
        this.add(new Label("？", Label.CENTER));

        for(int i = 0 ; i < 5 ; i++) {
            option[i] = new Button("");
            option[i].addActionListener(this);
            this.add(option[i]);
        }

        this.restart();

        //Display the window.
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MathGame();
    }
}
