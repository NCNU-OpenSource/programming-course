# NCNU Programming 1042 Judge 2-4
展瑩週末慶祝完母親節，就坐客運回到埔里。
到總站後突然想去墊腳石看書，但是忘記在哪裡了。
因此叫了一台計程車要去墊腳石。
司機覺得很好笑，但司機不說。
然後就載展瑩去巷子裡繞一繞，再折回去墊腳石。
到達墊腳石，司機跟展瑩收了 774 元，展瑩也給了 774 元。
司機覺得這人有病，但司機還是不說。
在墊腳石，展瑩巧遇了憲一，展瑩開心的跟憲一分享剛剛的奇幻旅程。
憲一：「親愛的展瑩，沒想到你真的很雷耶，怎麼可能只有 774 元呢？司機伯伯開車很辛苦的！」
展瑩聽了涕零如雨，深深反省了一番，自責自己的數學怎麼這麼糟糕。
展瑩回到家後，痛定思痛，決定做出一個「數學測驗機」來加強自己的數學。
這個故事告訴我們，5/8 記得跟媽咪說一聲「母親節快樂」。然後記得練習上機考。

## 輸入說明
本題是 1-4 的延伸，介面上有點相似。但選擇的不是「運算符號」，而是「運算結果」。

一個尺寸為 `400x200` 的視窗，使用 `GridLayout` 排版。
- 需要五個 Label 顯示運算式：
-- `運算元(random)` `運算子(random)` `運算元(random)` `＝` `結果(？)`。
-- `運算子` 由 `+`、`-`、`*`、`/`、`%`  中隨機挑選。
- 以及五個 Button 作為五種運算方式之「結果」供選擇。
-- 按鈕上的數字分別為：`+`、`-`、`*`、`/`、`%` 的「運算結果」。
-- 按鈕順序需打亂（有時可能為 `*`、`-`、`%`、`+`、`/` 的結果）。
- 亂數產生兩組 `1 ~ 999` 的 `運算元`。
- 畫面上 `結果` 為未知，選出符合畫面上 運算式答案的選項。

## 輸出說明
- 當有「兩種以上」的 `結果` 可滿足運算式，則所有正確的 `結果` 都應該被承認。
-- 例如 `5 % 3 = ?` ，選項應會出現兩個 `2` 選項，兩個都必須給對。
- 若選擇到「錯誤」的 `結果` ，要彈出訊息視窗，提醒小朋友答錯，並且「同一題繼續作答」。
- 若選擇到「正確」的 `結果` ，要彈出訊息視窗，恭賀小朋友答對，並且「產生新題目」。
- 關閉視窗時，程式不能繼續在背景運行。

## 輸入、輸出範例
### 遊戲剛開始
![](http://i.imgur.com/Wx9csBH.png)

### 選擇到錯誤答案，拍拍他，並叫他繼續作答
![](http://i.imgur.com/IKkzhsv.png)

### 選擇到正確答案，恭喜他，並叫他做下一題
![](http://i.imgur.com/eMuJJSx.png)

### 新的一題
![](http://i.imgur.com/PMzXlFF.png)

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
  
- `public void setLabel(String label)`

  Sets the button's label to be the specified string.

### Class `ActionEvent` from `java.awt.event.ActionEvent`
- `public String getActionCommand()`
  
  Returns the command string associated with this action. This string allows a "modal" component to specify one of several commands, depending on its state. For example, a single button might toggle between "show details" and "hide details". The source object and the event would be the same in each case, but the command string would identify the intended action.

### Interface `ActionListener` from `java.awt.event`
- `void actionPerformed(ActionEvent e)`
  
  Invoked when an action occurs.
  
### Class `Math` from `java.lang.Math`
- `public static double random()`
  
  Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
  
### Class `Integer` from `java.lang.Integer`
- `public static Integer valueOf(int i)`
  
  Returns an Integer instance representing the specified int value. If a new Integer instance is not required, this method should generally be used in preference to the constructor Integer(int), as this method is likely to yield significantly better space and time performance by caching frequently requested values. This method will always cache values in the range -128 to 127, inclusive, and may cache other values outside of this range.

- `public static String toString(int i)`
  
  Returns a String object representing the specified integer. 