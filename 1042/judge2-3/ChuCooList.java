import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Queue {
    String[] data = new String[10];
    int head, tail, size;

    public void add(String x) {
        data[tail++] = x;
        tail %= data.length;
        size++;
    }

    public String remove() {
        String tmp = data[head];
        data[head++] = null;
        head %= data.length;
        size--;
        return tmp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }
}

public class ChuCooList extends JFrame implements ActionListener {
    JLabel[] label = new JLabel[20];
    JTextField input;
    Queue todo = new Queue();
    Queue done = new Queue();

    public void setData(){
        for (int i = 0; i < 10; i++) {
            todo.data[i] = null;
        }
    }

    public void CreateJLabel() {
        for (int i = 0; i < label.length; i++) {
            if (i % 2 == 0) {
                label[i] = new JLabel("空", JLabel.CENTER);
            } else{
                label[i] = new JLabel("未完成", JLabel.CENTER);
            }
            label[i].setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
            this.add(label[i]);
        }
    }

    public void actionPerformed(ActionEvent e) {
        String token = e.getActionCommand();

        if (token.equals("Done")) {
            if (done.isFull()) {
                JOptionPane.showMessageDialog(null, "你已經完成所有代辦事項了！");
            } else if (todo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "沒有待辦事項 (⊙◞౪◟⊙)");
            } else {
                done.add(todo.remove());
            }
        } else {
            try {
                if (token != null) {
                    if (todo.isFull()) {
                        JOptionPane.showMessageDialog(null, "你有太多代辦事項唷 (⊙◞౪◟⊙)");
                    } else if(done.isFull()) {
                        JOptionPane.showMessageDialog(null, "你已經完成所有代辦事項了！");
                    } else {
                        todo.add(token);
                    }
                }
            } catch(Exception err){
                JOptionPane.showMessageDialog(null, "輸入錯誤惹 ヽ(｀Д´)ﾉ");
            }
        }
        SetJLabelResult();
        input.setText("");
    }

    //把 Queue 內容設定到Label
    public void SetJLabelResult() {
        for (int i = 0, j = todo.head; i < 20; i += 2, j = (j+1) % 10) {
            if(todo.data[j] != null) {
                label[i].setText(todo.data[j]);
            } else {
                label[i].setText("空");
            }
        }

        for (int i = 1, j = done.head; i < 20; i += 2, j = (j+1) % 10) {
            if(done.data[j] != null) {
                label[i].setText(done.data[j]);
            } else {
                label[i].setText("未完成");
            }
        }
    }

    public ChuCooList() {
        //set layout size
        this.setSize(800,800);
        this.setLayout(new GridLayout(12, 2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set Labels
        CreateJLabel();
        setData();
        //set text input field
        input = new JTextField();
        input.addActionListener(this);
        this.add(input);
        //set remove button
        JButton remove = new JButton("Done");
        remove.addActionListener(this);
        this.add(remove);
        this.setVisible(true);
    }

    public static void main(String[] argv) {
        new ChuCooList();
    }
}
