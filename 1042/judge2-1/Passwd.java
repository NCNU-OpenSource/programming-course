import java.util.Scanner;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Passwd extends JFrame implements ActionListener {
    JLabel label,elabel ,dlabel,answer ;
    JTextField textField,eTextField,dTextField;
    private Passwd(){
        this.setSize(500,700);
        this.setTitle("");
        this.setLayout(new GridLayout(7,1));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("key");
        label.setFont(new Font(Font.MONOSPACED,Font.BOLD,50));
        this.add(label );
        textField = new JTextField(15);
        this.add(textField);
        textField.addActionListener(this);
        elabel = new JLabel("Encryption");
        elabel.setFont(new Font(Font.MONOSPACED,Font.BOLD,50));
        this.add(elabel );
        eTextField = new JTextField(15);
        this.add(eTextField);
        eTextField.addActionListener(this);
        dlabel = new JLabel("Decryption");
        dlabel.setFont(new Font(Font.MONOSPACED,Font.BOLD,50));
        this.add(dlabel );
        dTextField = new JTextField(15);
        this.add(dTextField);
        dTextField.addActionListener(this);
        answer = new JLabel("answer");
        answer.setFont(new Font(Font.MONOSPACED,Font.BOLD,50));
        this.add(answer);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        int key = 0;
        String plain =  "";
        String chiper = "";

        try{
            plain =  eTextField.getText();
            chiper = dTextField.getText();
            key = Integer.parseInt(textField.getText());
            if(!dTextField.getText().equals("") && !textField.getText().equals("")&& !eTextField.getText().equals("")){
                String message="請不要填滿他！";
                JOptionPane.showMessageDialog(this,message);
            }
            else if(eTextField.getText().equals("")&& !textField.getText().equals("")&&dTextField.getText().equals("") ){
                String message="請至少輸入一個整數Key ＆  加密或解秘法 ";
                JOptionPane.showMessageDialog(this,message);
                answer.setText("");
            }
            else if(dTextField.getText().equals("") && !textField.getText().equals("")){
                Encryption(key,plain);
            }
            else if(eTextField.getText().equals("")&& !textField.getText().equals("")){
                Decryption(key,chiper);
            }
        }catch(NumberFormatException err){
                String message="請至少輸入一個整數Key ＆  加密或解秘法 ";
                JOptionPane.showMessageDialog(this,message);
                answer.setText("");
        }
        finally{
            textField.setText("");
            eTextField.setText("");
            dTextField.setText("");

        }
    }

    public String Encryption(int key,String plain){
        char[] d =new char[plain.length()];
        for ( int i = 0; i < plain.length(); ++i ) {
            char c = plain.charAt( i );
            //int change for char
            int n = (int) c;
            //A~Z
            if(n<91 && n>64){
                n=n+key-65;
                n=n % 26;
                n+=65;
            }
            //a~z
            if(n<123 && n>96){
                n=n+key-97;
                n=n%26;
                n+=97;
            }
            if(n < 43 && n > 32){
                n = n+key - 33;
                n = n% 10;
                n += 33;
            }
            //0~9
            if(n<58 && n>47){
                n=n+key-48;
                n=n%10;
                n+=48;
            }
            d[i]= (char)n;
        }
        answer.setText(String.valueOf(d));
        return "";
    }

    public String Decryption(int key,String chiper){
        char[] d =new char[chiper.length()];
        for ( int i = 0; i < chiper.length(); ++i ) {
            char c = chiper.charAt( i );
            int n = (int) c;
            if(n<91 && n>64){
                n=n-key-65;
                if(n<0)
                    n=n+(26*key);
                n=n%26;
                n+=65;
            }
            if(n<123 && n>96){
                    n=n-key-97;
                    if(n<0)
                            n=n+(26*key);
                    n=n%26;
                    n+=97;
            }
            if(n<58 && n>47){
                    n=n-key-48;
                    if(n<0)
                            n=n+(10*key);
                    n=n%10;
                    n+=48;
            }
            d[i]= (char)n;
        }
        answer.setText(String.valueOf(d));
        //System.out.println(d);
        return "";
    }
    public static void main(String[] args) {
        new Passwd();
        /*Scanner input  =new Scanner(System.in);
        System.out.println("key:");
        int key=input.nextInt();
        System.out.println(" 輸入本文:" );
        String plain=input.next();
        char[] d =new char[plain.length()];
        Encryption(key , plain);
        System.out.println("輸入密文:");
        String cipher=input.next();
        Decryption(key , cipher);*/
    }
}
