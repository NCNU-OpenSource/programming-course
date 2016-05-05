# NCNU Programming 1042 Judge 2-1

悅悅，是一個金牌特務，再電腦還沒普及的時代，他遊走江湖打騙天下無敵手，人們稱他為天下最快的人。
悅悅很快，但悅悅不說。

可惜科技的進步，悅悅的降龍十八掌也越來越沒用，他決定要好好的撰寫一套悅式解祕
器！


於是悅悅撒下英雄帖，邀請各路英雄一起來爭奪天下第一快手的稱號！

趕快來成為天下最快的人吧！
## 輸入、輸出說明
 - 輸入一個`key` & `解密`或`加密`
 - 下方`Jlabel` 會產生一個對應的答案
 - `key`為一個整數，用來設定密碼
 - 需要用`char` 轉 `int` 對應`ASCII`
## 輸入、輸出範例

## 如果輸入key + 加密or解密
![](http://i.imgur.com/n5P63iv.png)
![](http://i.imgur.com/HbyFsN4.png)
## 如果全部輸入滿惹～


## 其他（全部沒有輸入,key不是數字,沒有輸入key)

![](http://i.imgur.com/llsJzPR.png)

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