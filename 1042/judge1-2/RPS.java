import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RPS extends JFrame implements ActionListener {
    // 猜拳遊戲玩家列表（寫死為兩位）
    private static RPS[] players = new RPS[2];
    // 每位玩家的出拳狀態
    private byte status;
    // 顯示結果欄
    private JLabel screen;
    // 出拳選擇按鈕們
    private JButton[] beats;

    // 設定玩家
    public static void setPlayer(RPS p1, RPS p2) {
        players[0] = p1;
        players[1] = p2;
        initStatus();
    }

    // 重置玩家出拳狀態
    private static void initStatus() {
        players[0].status = 0;
        players[1].status = 0;
    }

    // 確認玩家出拳狀態
    public static void checkStatus() {
        // 雙方皆出拳，才開始判斷結果
        if (players[0].status < 0 || players[1].status < 0) {
            setText("Something Wrong...");
        } else if (players[0].status <= 0 && players[1].status <= 0) {
            setText("等待 雙方 出手...");
        } else if (players[0].status <= 0 || players[1].status <= 0) {
            if (players[0].status <= 0) {
                setText("等待 P1 出手...");
            } else {
                setText("等待 P2 出手...");
            }
        } else if (players[0].status > 0 && players[1].status > 0) {
            fight();
        }
    }

    // 設定每位玩家的狀態欄
    private static void setText(String s) {
        players[0].screen.setText(s);
        players[1].screen.setText(s);
        players[0].screen.setHorizontalAlignment(JTextField.CENTER);
        players[1].screen.setHorizontalAlignment(JTextField.CENTER);
    }

    // 判斷比賽結果
    private static void fight() {
        if (players[0].status == players[1].status) {
            setText("和局");
        } else if (players[0].status + players[1].status == 4) {
            if (players[0].status == 1) {
                setText("P1 贏了");
            } else {
                setText("P2 贏了");
            }
        } else {
            if (players[0].status > players[1].status) {
                setText("P1 贏了");
            } else {
                setText("P2 贏了");
            }
        }
        // 每次比完，重置狀態
        initStatus();
    }

    private RPS(String playerName) {
        // 設定介面
        setTitle("Player " + playerName);
        setSize(200,400);
        setLayout( new GridLayout(4, 1) );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 設定狀態欄
        screen = new JLabel();
        add(screen);

        // 設定出拳選擇鈕
        beats = new JButton[3];
        beats[0] = new JButton("剪刀");
        beats[1] = new JButton("石頭");
        beats[2] = new JButton("布");
        for (int i = 0; i < beats.length; i++) {
            beats[i].addActionListener(this);
            add(beats[i]);
        }

        // Show the Frame
        this.setVisible(true);
    }

    // 設定觸發事件
    public void actionPerformed(ActionEvent e) {
        // 取得玩家出什麼拳，並設定之
        String cmd = e.getActionCommand();
        if ( cmd.equals("剪刀") ) {
            status = 1;
        } else if (cmd.equals("石頭") ) {
            status = 2;
        } else if ( cmd.equals("布") ) {
            status = 3;
        }
        // 每次出拳，都確認彼此狀態
        checkStatus();
    }

    public static void main(String[] args) {
        setPlayer(new RPS("p1"), new RPS("p2"));
    }
}

