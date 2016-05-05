import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RPS extends JFrame implements ActionListener {
    private static RPS[] players = new RPS[2];
    private byte status;
    private JLabel screen;
    private JButton[] beats;

    public static void setPlayer(RPS p1, RPS p2) {
        players[0] = p1;
        players[1] = p2;
        initStatus();
    }

    private static void initStatus() {
        players[0].status = 0;
        players[1].status = 0;
    }

    public static void checkStatus() {
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

    private static void setText(String s) {
        players[0].screen.setText(s);
        players[1].screen.setText(s);
        players[0].screen.setHorizontalAlignment(JTextField.CENTER);
        players[1].screen.setHorizontalAlignment(JTextField.CENTER);
    }

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
        initStatus();
    }

    private RPS(String playerName) {
        setTitle("Player " + playerName);
        setSize(200,400);
        setLayout( new GridLayout(4, 1) );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        screen = new JLabel();
        add(screen);

        beats = new JButton[3];
        beats[0] = new JButton("剪刀");
        beats[1] = new JButton("石頭");
        beats[2] = new JButton("布");
        for (int i = 0; i < beats.length; i++) {
            beats[i].addActionListener(this);
            add(beats[i]);
        }

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if ( cmd.equals("剪刀") ) {
            status = 1;
        } else if (cmd.equals("石頭") ) {
            status = 2;
        } else if ( cmd.equals("布") ) {
            status = 3;
        }
        checkStatus();
    }

    public static void main(String[] args) {
        setPlayer(new RPS("p1"), new RPS("p2"));
    }
}
