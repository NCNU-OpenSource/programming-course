# NCNU Programming 1042 Judge 3-4
展瑩學計概時，算進位轉換總是算得很頭痛。  
同樣的運算動作要做很多次，展瑩覺得很費時。  
Windows 的計算機雖然也可以做進位轉換，但只有四種進位可選擇。  
因此他想要做一個「n 進位轉換計算機」。

## 輸入說明
- 使用者需輸入一組「二進位」數字。
- 輸入的數若不符合二進位格式（`0`、`1`以外的數字），則必須重新輸入。
- 指定轉成 n 進位的數字（最大 16 進位，`n <= 16`）。
- n 若輸入大於 16，則重新輸入 n。

## 輸出說明
- 輸入「二進位數字」、「幾進位」兩項參數後，最後要顯示運算結果。
- 超過 10 進位，以英文字母表示：  
  `10` => `A`  
  `11` => `B`  
  `12` => `C`  
  `13` => `D`  
  `14` => `E`  
  `15` => `F`  
  （例： 二進位 `1101110` => 十進位 `110` => 十六進位 `6E`）
  
## 輸入、輸出範例
### 正確示範
![](https://i.imgur.com/dLKjrVR.gif)

### Error1 - 輸入 Value 不是二進位數
![](https://i.imgur.com/hLaXqph.gif)

### Error2 - 輸入的 n 超過 16
![](https://i.imgur.com/HvoReYb.gif)

## Hint
##### 計概進位學得好，此題撰寫沒煩惱。

### Class `Scanner` from `java.util.Scanner`
- `public String next()`

  Finds and returns the next complete token from this scanner.

- `public int nextInt()`

  Scans the next token of the input as an int.
  
### Class `String` from `java.lang.String`
- `public int length()`

  Returns the length of this string. The length is equal to the number of Unicode code units in the string.

- `public char charAt(int index)`

  Returns the char value at the specified index. An index ranges from 0 to length() - 1. The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
  If the char value specified by the index is a surrogate, the surrogate value is returned.
  
### Class `Integer` from `java.lang.Integer`
- `public static int parseInt(String s)`

  Parses the string argument as a signed decimal integer.
  
### Class `Math` from `java.lang.Math`
- `public static double pow(double a, double b)`

  Returns the value of the first argument raised to the power of the second argument.
  