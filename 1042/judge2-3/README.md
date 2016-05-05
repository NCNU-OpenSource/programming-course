# NCNU Programming 1042 Judge 2-3

展瑩應徵了一個新個工作 - 計程車司機

可是展瑩因為備受大家喜愛，所以擁有了許多顧客，需要一個乘客清單，一天最多可以接受 10 位顧客，不然展瑩會太操勞，先預約的要先去程載客人。

## 輸入說明
一個尺寸為 `800Ｘ800` 的視窗，使用 `GridLayout` 排版方式，擁有十個 Label 顯示乘客對象的名稱/綽號、十個 Label 顯示已經乘載完的顧客名單、一個輸入框作為輸入、一個 Button 作為完成。

## 輸出說明
- 待辦清單名稱若為 `null`，表示尚未放值，請顯示 `空`。
- 完成清單名稱若為 `null`，表示尚未放值，請顯示 `未完成`。
- 輸入名稱以及完成後，請即時更新名稱列表。
- 當無乘客可完成時，請彈出對話框警告。
- 當無空位可放置時，請彈出對話框警告。
- 當「已完成」已經滿的時候，符合兩個情況，請請彈出對話框警告。
	- 不得繼續輸入至「客人清單」
	- 不得繼續完成


## 輸入、輸出範例

### 剛開始，Queue 都是空的
![](http://i.imgur.com/NOHdGkK.png)

### 展瑩輸入新的顧客名單
![](http://i.imgur.com/cL7eYoI.png)

### 系統將之加入到 Queue 中
![](http://i.imgur.com/Vc4SQZA.png)

### 在輸入四位後，先從 Queue 取用一位
![](http://i.imgur.com/M6TD30f.png)

### 當 Queue 是空的，提醒展瑩
![](http://i.imgur.com/uCU6Puy.png)

### 當 Queue 是滿的，展瑩還想多接客人
![](http://i.imgur.com/ygjv0GW.png)

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
- `public void setVisible(boolean b)`
  
  Shows or hides this component(Frame is a kind of Component) depending on the value of parameter b.
  
### Class `JOptionPane` from `javax.swing.JOptionPane`
- `public static void showMessageDialog(Component parentComponent, Object message) throws HeadlessException`
  
  Brings up an information-message dialog titled "Message".
  
  `parentComponent` - determines the Frame in which the dialog is displayed; if `null`, or if the `parentComponent` has no Frame, a default Frame is used message - the Object to display

### Class `Integer` from `java.lang.Integer`
- `public static int parseInt(String s) throws NumberFormatException`
  
  Parses the string argument as a signed decimal integer. The characters in the string must all be decimal digits, except that the first character may be an ASCII minus sign '-' ('\u002D') to indicate a negative value or an ASCII plus sign '+' ('\u002B') to indicate a positive value. The resulting integer value is returned, exactly as if the argument and the radix 10 were given as arguments to the parseInt(java.lang.String, int) method.

### Class `JTextField` from `javax.swing.JTextField`
- `public void setText(String text)`
  
  Defines the single line of text this component will display. If the value of text is null or empty string, nothing is displayed.
- `public void addActionListener(ActionListener l)`
  
  Adds the specified action listener to receive action events from this button. Action events occur when a user presses or releases the mouse over this button. If l is null, no exception is thrown and no action is performed.
  
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