
# NCNU Programming 1042 Judge 1-1

昔日帥氣的展瑩，最近整整瘦了一大圈。

在我們的追問下，他才向我們透漏，為了讓學弟妹學會算圖形的面積，害他都沒有時間好好的接近學妹，他為此感到非常苦惱。這時出現了魔法師茂林，指點了展瑩！

茂林：「齁很雷耶，是不是寫一個程式，讓同學們拿來練習圖形面積就好。」
展瑩：「對耶！可是我餓到無法開機。」

各位，現在就是我們出來拯救展瑩的時刻！讓我們一起小手牽大手，幫助展瑩寫出來吧！ :-)

我們要創造一個程式，左邊有一個`按鈕`可以產生圖形，每個圖形都有自己相對應的`單位`（ex: 三角形 底＆高），底下有一個`輸入框`需要算出上方圖形的面積，`答對`了就很棒棒，`答錯`了展瑩也會安慰你，`沒輸入或亂輸入`會被懲罰喔。

## 輸入、輸出說明
- 產生一個JFrame
    - 畫面下方有`RESER`按鈕、`輸入框`以及`SCORE`，請使用JPanel。
    - 輸入的值會去比對是否為此圖形面積，`正確`、`錯誤`或`未符合輸入`要求都會跳出`對話框`，跳出解過後會自動`清空`。
    - 如果正確則`SCORE`+10分,錯誤則不變。
    - 單位數值： 從 1～20隨機取（方便計算）。
- 圖形： 實作`圓形`、`三角形`、`長方形`隨機取一種圖形並顯示其該有的單位
    - 圓形： 長 ＆ pi＝3
    - 三角形： 底 ＆ 高
    - 長方形： 長 ＆ 寬

## 輸入、輸出範例

## 一開始的畫面,會先隨機產生一組面積
![](http://i.imgur.com/axJ2nUG.png)
## 輸入答對彈出訊息
![](http://i.imgur.com/feyXrMM.png)
## 輸入錯誤面積彈出訊息
![](http://i.imgur.com/TNeLsZl.png)
## 輸入不合規定彈出訊息&按下RESET分數歸零
![](http://i.imgur.com/cvHn2hg.jpg)

## 提示

```java=
public static void main(String[] argv){
    // 1<=x<=100隨機亂數
    int x = Math.random()*100+1;
    // 準備輸出的訊息
    String message="答對了~GOOD！小朋友你答對了.";
    // 彈出訊息
    JOptionPane.showMessageDialog(this,message);
    //,後數字代表所佔columns 
    JTextField textField  = new JTextField("這是JTextField的文字",15);
    JTextField.setText（"JTextField的文字被改了"）;
    //把他放在畫面的west
    this.add(textField,BorderLayout.WEST);
    // 取得testField的文字
    System.out.println("testField.get()");
    //設定文字字型&大小
    label.setFont(new Font(Font.MONOSPACED,Font.BOLD,100));
    //設定顏色為洋紅色
    label.setForeground(Color.magenta);
} 
```
### BorderLayout
![](http://i.imgur.com/RfbmnbQ.gif)
### Class `JFrame` from `javax.swing.JFrame`
- `public void setTitle(String)`
  Sets the title for this frame to the specified string.
- `public void setSize(int width, int height)`
  Resizes this component(Frame is a kind of Component) so that it has width width and height height.
- `public void setLayout(LayoutManager mgr)`
  Sets the layout manager(ex: GridLayout) for this container.
- `public GridLayout(int rows, int cols)`
  Creates a grid layout with the specified number of rows and columns. All components in the layout are given equal size.
- `public Component add(Component comp)`
  Appends the specified component to the end of this container.
  
### Class `JLabel` from `javax.swing.JLabel`
- `public JLabel(String text)`
  Creates a JLabel instance with the specified text. The label is aligned against the leading edge of its display area, and centered vertically.
- `public void setText(String text)`
  Defines the single line of text this component will display. If the value of text is null or empty string, nothing is displayed.

### Class `JButton` from `javax.swing.JButton`
- `public JButton(String text)`
  Creates a button with text.
- `public void addActionListener(ActionListener l)`
  Adds the specified action listener to receive action events from this button. Action events occur when a user presses or releases the mouse over this button. If l is null, no exception is thrown and no action is performed.

### Class `ActionEvent` from `java.awt.event.ActionEvent`
- `public String getActionCommand()`
  Returns the command string associated with this action. This string allows a "modal" component to specify one of several commands, depending on its state. For example, a single button might toggle between "show details" and "hide details". The source object and the event would be the same in each case, but the command string would identify the intended action.

### Interface `ActionListener` from `java.awt.event`
- `void actionPerformed(ActionEvent e)`
  Invoked when an action occurs.
  