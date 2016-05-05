# NCNU Programming 1042 Judge 1-4

展瑩家的小朋友數學實在是不太好，加減乘除常常分不清。
為此，孩子的娘非常生氣，交代展瑩一定要把小朋友的數學教好。
最後他想到一個好辦法，做一個遊戲機來訓練小朋友分辨加減乘除。

## 輸入說明

一個尺寸為 `400x200` 的視窗，使用 `GridLayout` 排版。
需要五個 Label 顯示運算式、五個 Button 作五種運算符號按鈕（分別為：`+`、`-`、`*`、`/`、`%`）

運算式基本結構：
`運算元` `運算子` `運算元` `＝` `結果`

本題需求：亂數產生兩組 `1 ~ 999` 的 `運算元`，並隨機取一種 `運算子` 算出 `結果`。
畫面上 `運算子` 為未知，小朋友要透過按鈕，選出正確的 `運算子` 。

## 輸出說明

若選擇到「錯誤」的 `運算子` ，要彈出訊息視窗，提醒小朋友答錯，並且「同一題繼續作答」。
若選擇到「正確」的 `運算子` ，要彈出訊息視窗，恭賀小朋友答對，並且「產生新題目」。

當有「兩種以上」的 `運算子` 可滿足運算式，則所有正確的 `運算子` 都應該被承認。
例如：`5` `？` `2` `=` `2`
則：`/` 、 `%` 皆正確

關閉視窗時，程式不能繼續在背景運行。

## 輸入、輸出範例

### 剛開始遊戲
![](http://i.imgur.com/UEl22T9.png)

### 小朋友選了一個「錯誤」的答案，繼續作答
![](http://i.imgur.com/FtEXcJo.png)

### 小朋友選到正確的答案，可繼續做下一題
![](http://i.imgur.com/4ORNfLr.png)

### 繼續做新的一題
![](http://i.imgur.com/ZDb02ap.png)


## 提示

### Class `JFrame` from `javax.swing.JFrame`
- `public void setSize(int width, int height)`
  
  Resizes this component(Frame is a kind of Component) so that it has width width and height height.
- `public void setDefaultCloseOperation(int operation)`
   
   Sets the operation that will happen by default when the user initiates a "close" on this dialog.
- `public void setLayout(LayoutManager mgr)`
  
  Sets the layout manager(ex: GridLayout) for this container.
- `public Component add(Component comp)`
  
  Appends the specified component to the end of this container.
- `public void setVisible(boolean b)`
  
  Shows or hides this component(Frame is a kind of Component) depending on the value of parameter b.

### Class `JOptionPane` from `javax.swing.JOptionPane`
- `public static void showMessageDialog(Component parentComponent, Object message) throws HeadlessException`
  
  Brings up an information-message dialog titled "Message".
  
  `parentComponent` - determines the Frame in which the dialog is displayed; if `null`, or if the `parentComponent` has no Frame, a default Frame is used message - the Object to display

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
  
### Class `String` from `java.lang.String`
- `public boolean equals(Object anObject)`
  
  Compares this string to the specified object(String is a kind of Object). The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.
  
### Class `Math` from `java.lang.Math`
- `public static double random()`
  
  Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
  
### Class `Integer` from `java.lang.Integer`
- `public static String toString(int i)`
  
  Returns a String object representing the specified integer. 
  