import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Guess extends JFrame implements ActionListener {
    // 猜測次數計數器
    private int counter;
    // 猜測狀態計數器（按下四個數字才算一次猜測）
    private int status;
    // 正解
    private int[] ans;
    // 目前猜的數字
    private int[] guess;
    // 每一次猜測結果（幾 A 幾 B）
    private int[] result;
    // 顯示結果欄
    private JLabel screen;
    // 數字按鈕們
    private JButton[] numpad;

    private Guess() {
        // 初始化所需變數
        guess  = new int[4];
        ans    = new int[4];
        result = new int[2];

        // 設定介面
        setSize(500,300);
        setLayout(new GridLayout(5, 3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 設定顯示結果欄
        screen = new JLabel("～猜數字～", JLabel.CENTER);
        screen.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        // 空無之地，以 Canvas 補於其中
        add(new  Canvas());
        add(screen);
        add(new Canvas());

        // 設定數字按鈕們
        numpad = new JButton[10];
        for (int i = numpad.length-1; i > 0; i--) {
            numpad[i] = new JButton(Integer.toString(i));
            numpad[i].addActionListener(this);
            add(numpad[i]);
        }
        // 數字 0 也沒朋友
        numpad[0] = new JButton("0");
        numpad[0].addActionListener(this);
        add(new Canvas());
        add(numpad[0]);
        add(new Canvas());

        // 開始一場新遊戲
        newGame();

        // Show the Frame
        this.setVisible(true);
    }

    // 設定正解
    private void setAns() {
        // 準備數字們
        int[] seed = new int[10];
        for (int i = 0; i < seed.length; i++) {
            seed[i] = i;
        }
        // 以洗牌法搞亂他們
        for (int i = 0; i < seed.length; i++) {
            int randnum = (int)(Math.random() * 10);
            int temp = seed[i];
            seed[i] = seed[randnum];
            seed[randnum] = temp;
        }
        // 選定正解人選，並顯示於結果欄上
        String ansText = new String();
        for(int i = 0; i < ans.length; i++) {
            ans[i] = seed[i];
            ansText += ans[i];
        }
        screen.setText(ansText);
    }

    // 確認猜測狀態
    private void checkResult() {
        // 數字位置皆正確，得 1A；數字對位置錯，得 1B
        for (int i = 0; i < guess.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (guess[i] == ans[j]) {
                    if (i == j) {
                        result[0]++;
                    } else {
                        result[1]++;
                    }
                }
            }
        }
    }

    // 開始一輪新猜測
    private void newGuess() {
        status = 0;
        for (int i = 0; i < guess.length; i++) {
            guess[i] = 0;
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
        }
    }

    // 開始一回合新遊戲
    private void newGame() {
        counter = 0;
        setAns();
        newGuess();
    }

    // 設定觸發事件
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        try {
            // 嘗試將使用者所按數字存起來
            guess[status] = Integer.parseInt(cmd);
            // 每按了四個數字，檢查猜測結果
            if (status == 3) {
                counter++;
                checkResult();
                screen.setText(result[0] + "A" + result[1] + "B");
                // 猜對，新一個回合；猜錯，新一輪猜測
                if (result[0] == 4) {
                    JOptionPane.showMessageDialog(null, "答對！共猜了 " + counter + "次。");
                    newGame();
                } else {
                    newGuess();
                }
            } else {
                status++;
            }
        } catch(Exception err){
            JOptionPane.showMessageDialog(null, "請輸入數字");
        }
    }

    public static void main(String[] args) {
        new Guess();
    }
}
