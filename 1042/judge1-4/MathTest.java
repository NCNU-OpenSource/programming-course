import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MathTest extends JFrame implements ActionListener{
    // 第一個運算數、第二個運算數、運算結果
    private static int start = 0, last = 0, result = 0;
    // 兩個運算數和運算結果的 Label
    private Label labelX, labelY, labelZ;

    private MathTest() {
        // 視窗基本設定
        super("Math Test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);

        // 設定欄數與列數。
        this.setLayout(new GridLayout(2,5));

        // 運算子們，設為陣列易讀、易改，且可用迴圈來做新增 Button 動作。
        String[] ButtonString = {"+", "-", "*", "/", "%"};

        // 運算元們與結果的 Label。因為這個 method 主要目的是設定好每個元件的位置。
        // 因此顯示運算元與結果這種內容會變動的 Label ，Text 先留空，只設定格式。
        // 內容之後由 restart() 賦予。
        labelX = new Label("", Label.CENTER);
        labelY = new Label("", Label.CENTER);
        labelZ = new Label("", Label.CENTER);

        // Frame 加入運算式的 Label。
        this.add(labelX);
        this.add(new Label("？", Label.CENTER));
        this.add(labelY);
        this.add(new Label("=", Label.CENTER));
        this.add(labelZ);

        // Frame 加入運算子的 Button。
        for(int i = 0 ; i < ButtonString.length ; i++) {
            Button option = new Button(ButtonString[i]);
            option.addActionListener(this);
            this.add(option);
        }

        // 初始運算式，產生運算元與結果
        this.restart();

        // Display the window.
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();

        // 是否勝利？預設為 false，表示還沒贏。
        boolean win = false;

        // 題目要求，若同時有兩個以上的運算子為正解，都必須被承認。
        // 因此採用每次點擊運算子，就拿來和運算元檢查是否正確。
        // 正確即修改 win 為 true，表示勝利。
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

        // 每次答題確認是否正確並告知，答案正確則初始運算式（ restart() ）。
        if(win == true) {
            JOptionPane.showMessageDialog(this, "好棒棒哦！下一題！", "冰崩冰崩！！", JOptionPane.INFORMATION_MESSAGE);
            this.restart();
        } else {
            JOptionPane.showMessageDialog(this, "別灰心，再想一下！", "答錯，哭惹", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void restart() {
        // 初始運算元與結果。
        start = (int)(Math.random()*999+1);
        last = (int)(Math.random()*999+1);
        result = 0;

        // 隨機選擇一個運算子。
        int operation = (int)(Math.random()*5); // 0:+, 1:-, 2:*, 3:/, 4:%
        
        // 算出結果。
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

        // 更新運算元們與結果的 Label。
        labelX.setText(Integer.toString(start));
        labelY.setText(Integer.toString(last));
        labelZ.setText(Integer.toString(result));
    }

    public static void main(String[] args) {
        new MathTest();
    }
}
