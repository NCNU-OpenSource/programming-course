import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TeachShape extends JFrame implements ActionListener{
    JLabel label;
    JTextField textField;
    double x,y;
    String findshape;
    int longanswer,threeanswer,circleanswer;
    String[] shape = new String[]{"三角形","長方形","圓形"};
    public void actionPerformed(ActionEvent e){
        String touch = e.getActionCommand();
        if(touch.equals("找圖形")){
            int randomshape = (int)(Math.random()*3);
            x = Math.random()*20+1;
            y = Math.random()*20+1;
            longanswer = ((int)x*(int)y);
            threeanswer = ((int)x*(int)y)/2;
            circleanswer = ((int)x*(int)x)*3;
            if(shape[randomshape] == "三角形"){
                label.setText(shape[randomshape]+ " 底" + (int)x + "cm" + " 高" +(int)y +"cm");
            }else if(shape[randomshape] == "長方形"){
                label.setText(shape[randomshape]+ " 長" + (int)x + "cm" + " 寬" +(int)y +"cm");
            }else if(shape[randomshape] == "圓形"){
                label.setText(shape[randomshape]);
                label.setText(shape[randomshape]+ " 半徑" + (int)x + "cm" + " Pi:" +3 +"cm");
            }
        }
        else if (touch.equals("確認")){
                try{
                    int area = Integer.parseInt(textField.getText());
                    if(longanswer == area || threeanswer ==area || circleanswer == area){
                        String message="答對了~GOOD！小朋友你答對了.";
                        JOptionPane.showMessageDialog(this,message);
                    }else{
                        String message="答錯了!沒關係我們再來一次.";
                        JOptionPane.showMessageDialog(this,message);
                    }
                }
                catch(Exception err){
                    String message="這裡放的是面積喔!";
                    JOptionPane.showMessageDialog(this,message);
                }
                finally{
                    textField.setText("");
                }
            }
    }
    public TeachShape(){
        this.setSize(500,500);
        this.setTitle("圖形教學");

        label = new JLabel("圖形教學", JLabel.CENTER);
        label.setFont(new Font(Font.MONOSPACED,Font.BOLD,100));
        this.add(label,BorderLayout.NORTH );
        label.setOpaque(true);
        label.setForeground(Color.magenta);

        JButton find = new JButton("找圖形");
        find.setFont(new Font(Font.MONOSPACED,Font.BOLD,40));
        this.add(find,BorderLayout.CENTER);
        find.addActionListener(this);

        label = new JLabel("考圖形喔！", JLabel.CENTER);
        label.setFont(new Font(Font.MONOSPACED,Font.BOLD,30));
        this.add(label,BorderLayout.EAST);
        JButton sure = new JButton("確認");
        sure.addActionListener(this);
        textField  = new JTextField("area",15);
        textField.selectAll();
        textField.addActionListener(this);
        JPanel panel=new JPanel();
        panel.add(textField);
        panel.add(sure);
        this.add(panel,BorderLayout.SOUTH);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] argv){
        new TeachShape();
    }
}
