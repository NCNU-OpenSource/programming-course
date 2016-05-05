# NCNU Programming 1042 Judge 1-2

某秘密單位探員 ssyu 與 nhss 感情很好，總是喜歡在各種場合分個高下。

最近他們迷上了猜拳。因為他們都很懶，希望能夠動動手指按按鈕，而不用實際伸出手來出拳；但也因為他們感情實在太好了，希望在一台電腦上一起玩就好，正所謂是一人一半，感情不會散。

請你為這兩位探員製作 Java 版本的猜拳遊戲，好嗎？

## 輸入說明
兩個尺寸為 `200Ｘ400` 的視窗，使用 `GridLayout` 排版方式，皆擁有一個 Label 顯示狀態、三個 Button 作為出拳選擇。

## 輸出說明
- 當雙方皆未出拳時，Label 皆顯示 `等待 雙方 出手...`。
- 當有一方未出拳時，Label 皆顯示 `等待 Px 出手...`。
- 雙方皆出拳後，判斷輸贏，並且 Label 皆顯示 `Px 贏了`、`和局`。
- 其中 `x` 為 1 或 2。

## 輸入、輸出範例

### 剛開始時...
此時誰先出拳皆可。

![](http://i.imgur.com/0GqstH9.png)

### 若 P1 先出了剪刀
此時，P2 出拳前，P1 都可改出別的。

![](http://i.imgur.com/ddCGRvr.png)

### P2 也出了剪刀
後出者出拳後，系統判斷結果顯示於雙方畫面中，並將狀態重置。

![](http://i.imgur.com/aMcvZH7.png)

### 換 P2 先出了石頭
同樣的，此時，P1 出拳前，P2 都可改出別的。
![](http://i.imgur.com/iaLBHQw.png)

### P1 出了剪刀
後出者出拳後，系統判斷結果顯示於雙方畫面中，並將狀態重置。

![](http://i.imgur.com/LVhZFhz.png)


## 提示

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
  
### Class `String` from `java.lang.String`
- `public boolean equals(Object anObject)`

  Compares this string to the specified object(String is a kind of Object). The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.