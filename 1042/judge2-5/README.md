# NCNU Programming 1042 Judge 2-5

魔法師茂林想要把咒語學習的更好，於是去書局買了單字卡打算增強英文能力，沒想到調皮的展瑩趁魔法師茂林睡著的時候，把每張單字卡中的其中一個單字塗▉，睡醒後的茂林發現自己的單字卡都缺少一個字，勃然大怒，誓言消滅地球上的所有的英語單字，你能夠填滿單字卡上面的缺漏，挽回世界上英文被消滅的命運嗎?

## 單字卡內容
"Select","Method","Head","Card","Telephone","Book","Water","Cloth","Television","Notebook","Magician","Test","Benefit","Concept","Apple"

## 輸入說明
一個尺寸為 `300Ｘ300` 的視窗，使用 `GridLayout` 排版方式，擁有一個 MenuBar 顯示遊戲、一個 Label 顯示答題狀況、一個 Label 顯示單字、一個輸入框作為輸入答案。

## 輸出說明
- 若輸入的單字符合，則彈出對話框顯示答對、已做題數+1、答對題數+1。
- 若輸入的單字不符合，則彈出對話框顯示答錯、已做題數+1。
- 點選新遊戲，則已做題數、答對題數皆歸零

## 輸入、輸出範例

### 剛開始，已做題數、答對題數皆為零，Menu：遊戲裡擁有新遊戲的MenuItem、狀態裡有答對單字MenuItem
![](http://i.imgur.com/k8L7HKS.png)
![](http://i.imgur.com/dkFkztg.png)
![](http://i.imgur.com/ZDNkTy2.png)


### 若輸入的單字正確，則彈出對話框顯示答對，並更新題目狀況
![](http://i.imgur.com/WfpUOYV.png)
![](http://i.imgur.com/QHXH0k0.png)
![](http://i.imgur.com/Oqkp3dD.png)


### 若輸入的單字錯誤，則彈出對話框顯示答錯，並更新題目狀況
![](http://i.imgur.com/DVfX5Jw.png)
![](http://i.imgur.com/0FGcgqy.png)
![](http://i.imgur.com/j0Rz5PC.png)


### 點選新遊戲，題目狀況皆歸零
![](http://i.imgur.com/n9xba4m.png)
![](http://i.imgur.com/RFmG9Sf.png)



### 點選答對單字，會顯示已答對之單字
![](http://i.imgur.com/k5eAfZk.png)


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
  
- `public void setFont(Font font)` 
  Sets the font for this component.

### Class `Menu` from `javax.swing.Menu`
- `public Menu(String label)`
	Constructs a new menu with the specified label.
	

### Class `MenuBar` from `javax.swing.MenuBar`
- `public MenuBar()`
	Creates a new menu bar.
	
- `public Menu add(Menu m)`
  Adds the specified menu to the menu bar.
  



### Class `ActionEvent` from `java.awt.event.ActionEvent`
- `public String getActionCommand()`
  
  Returns the command string associated with this action. This string allows a "modal" component to specify one of several commands, depending on its state. For example, a single button might toggle between "show details" and "hide details". The source object and the event would be the same in each case, but the command string would identify the intended action.

### Interface `ActionListener` from `java.awt.event`
- `void actionPerformed(ActionEvent e)`
  
  Invoked when an action occurs.
  
  
	

### Class `String` from `java.lang.String`
- `public int length()`
	Returns the length of this string. The length is equal to the number of Unicode code units in the string.
	
- `public char charAt(int index)`
  Returns the char value at the specified index. An index ranges from 0 to length() - 1. The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.If the char value specified by the index is a surrogate, the surrogate value is returned.
  
- `public int indexOf(String str)`
  Returns the index within this string of the first occurrence of the specified substring.
  The returned index is the smallest value k for which:

     this.startsWith(str, k)
	 If no such value of k exists, then -1 is returned.
	 
- `public String substring(int beginIndex,int endIndex)`
  Returns a new string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.
  
  Examples:

     "hamburger".substring(4, 8) returns "urge"
     "smiles".substring(1, 5) returns "mile"
	 
- `public static String valueOf(char c)`
  Returns the string representation of the char argument.
  
 - `public boolean equals(Object anObject)`
  
  Compares this string to the specified object(String is a kind of Object). The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.
