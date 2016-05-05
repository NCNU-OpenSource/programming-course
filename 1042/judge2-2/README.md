# NCNU Programming 1042 Judge 2-2

猜數字是一個遊戲。
正解會是四個不重複整數。
每猜測一次，數字對且位置對，得 1A；數字對但位置錯，得 1B。

悅兒沒朋友。
悅兒需要同學為他製作一個猜數字的遊戲，讓電腦可以陪他玩。

## 輸入說明
一個尺寸為 `500Ｘ300` 的視窗，使用 `GridLayout` 排版方式，擁有一個 Label 顯示狀態、十個 Button 作為數字輸入。

## 輸出說明
- 一開始即產生一組解答，並顯示於 Label 上以利測試。
  正解必須是四個不重複數字，請隨機產生。
- 每按下四個數字，確認一次結果，並顯示於 Label 上。
  在此假設使用者不會手殘重複按同一個數字。
- 當按下四個正確數字（4A），使用 Dialog 顯示猜測次數。並重新開始遊戲。

## 輸入、輸出範例

### 剛開始時...
隨機產生四個不重複數字。
![](http://i.imgur.com/sAozTVz.png)

### 按完四個數字，顯示結果
![](http://i.imgur.com/pjztluk.png)

### 猜對時，顯示猜測次數
![](http://i.imgur.com/sRmtzGb.png)

### 開始下一回合
![](http://i.imgur.com/bU1zMGD.png)

## 提示

### Class `JFrame` from `javax.swing.JFrame`
- `public void setSize(int width, int height)`
  
  Resizes this component(Frame is a kind of Component) so that it has width width and height height.
- `public void setLayout(LayoutManager mgr)`
  
  Sets the layout manager(ex: GridLayout) for this container.
- `public GridLayout(int rows, int cols)`
  
  Creates a grid layout with the specified number of rows and columns. All components in the layout are given equal size.
- `public Component add(Component comp)`
  
  Appends the specified component to the end of this container.
  
### Class `Canvas` from `java.awt.Canvas`
  A Canvas component represents a blank rectangular area of the screen
  
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

### Class `JOptionPane` from `javax.swing.JOptionPane`
- `public static void showMessageDialog(Component parentComponent,Object message)`

Brings up an information-message dialog titled "Message".

Parameters:
- parentComponent - determines the Frame in which the dialog is displayed; if null, or if the parentComponent has no Frame, a default Frame is used
- message - the Object to display

### Class `ActionEvent` from `java.awt.event.ActionEvent`
- `public String getActionCommand()`
  
  Returns the command string associated with this action. This string allows a "modal" component to specify one of several commands, depending on its state. For example, a single button might toggle between "show details" and "hide details". The source object and the event would be the same in each case, but the command string would identify the intended action.

### Interface `ActionListener` from `java.awt.event`
- `void actionPerformed(ActionEvent e)`
  
  Invoked when an action occurs.
  
### Class `Integer` from `java.lang.Integer`
- `public static String toString(int i)`

  Returns a String object representing the specified integer. The argument is converted to signed decimal representation and returned as a string, exactly as if the argument and radix 10 were given as arguments to the toString(int, int) method.
  
### Class `Math` from `java.lang.Math`
- `public static double random()`

  Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range.