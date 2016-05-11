import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class  Guess_English extends JFrame implements ActionListener{
    JTextField textField;
    JLabel label,status;
    int mark,no,right,index; //塗黑部分
    String question,frontpart,backpart,ans="";  //問題部分,字前半部,字後半部
    char answer;
    String []words={"Select","Method","Head","Card","Telephone","Book","Water","Cloth",
        "Television","Notebook","Magician","Test","Benefit","Concept","Apple"};
    Boolean []list=new Boolean[words.length];
    public Guess_English(){
        super("英文練習");
        //this.setTitle("Guess Guess");  
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,1));
        //定位在畫面中間
        this.setLocationRelativeTo(null);
        Menu m;
        MenuBar mb;
        this.setMenuBar(mb = new MenuBar());
        mb.add(m = new Menu("遊戲")).add(new MenuItem("新遊戲")).addActionListener(this);
        mb.add(m = new Menu("狀態")).add(new MenuItem("答對單字")).addActionListener(this);
        //JLabel
        status=new JLabel("已做題數:"+no+" 答對題數:"+right,JLabel.CENTER);
        status.setFont(new Font(Font.MONOSPACED,Font.BOLD,25));
        this.add(status);
        label =new JLabel("",JLabel.CENTER);
        label.setFont(new Font(Font.MONOSPACED,Font.BOLD,40));
        this.add(label);
        //JTextfield
        textField=new JTextField();
        textField.addActionListener(this);
        this.add(textField);
        this.setVisible(true);
        newGame();
    }
    //implements ActioListener,need override
    public void actionPerformed(ActionEvent e) {
        String token = e.getActionCommand();
        if(token.equals("新遊戲")){
            newGame();
        }else if(token.equals("答對單字")){
            showList();
        }
        else{
            if(String.valueOf(answer).equals(token)){
                JOptionPane.showMessageDialog(null, "答對了,拯救英文靠你了");
                list[index]=true;
                start();
                right++;
            }else{
                JOptionPane.showMessageDialog(null, "答錯了,魔法師生氣囉!");
                start();
            }
            no++;
            status.setText("已做題數:"+no+" 答對題數:"+right);
            textField.setText("");
        }
    }
    public void start(){
        index=(int)(Math.random()*words.length);
        //random 挑選 mark 部分
        mark=(int)(Math.random()*words[index].length());
        answer=words[index].charAt(mark);
        frontpart=words[index].substring(0,mark);
        backpart=words[index].substring(mark+1,words[index].length());
        question=frontpart+"▉"+backpart;
        label.setText(question);   
    }
    public void showList(){
        for(int i=0;i<list.length;i++){
            if(list[i]==true){

                //System.out.println(words[i]);
                ans+=words[i]+" ";
            }
        }
        JOptionPane.showMessageDialog(null, ans);
        ans="";//字串清空
    }
    public void newGame(){
        no=0;
        right=0;
        status.setText("已做題數:"+no+" 答對題數:"+right);
        for(int i=0;i<list.length;i++){
            list[i]=false;
        }
        start();
    }
    public static void main(String[] argv){
        new Guess_English();
    }   
}