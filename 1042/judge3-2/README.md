# NCNU Programming 1042 Judge 3-2

彥昀是一位對真相窮追不捨得奇怪孩子，他希望得知所有可能的真相，缺一不可。

有一天，彥昀在整理房間時發現了一本小時候的數學習題本。因年代久遠，房間又常屋漏偏逢連夜雨，這習題本已殘破不堪，每一題的題目、解答都有所污損。

但彥昀不相信，他不妥協。他決定把所有的可能性列出來，找出所有的可能，以向真理致上最高的尊敬。

看著他傻傻的心算實在不捨，請你幫著彥昀好嗎？

## 輸入說明
輸入 3 行文字 `x`, `y`, `z`

每行文字字數不限，會參雜數字與非數字。

## 輸出說明
輸出所有 `x` $\times$ `y` $=$ `z` 成立的組合。

## 輸入範例

```
a1b2
3c
4d5ef
```

## 輸出範例

```
1122 * 37 = 41514
1142 * 39 = 44538
1172 * 38 = 44536
1182 * 36 = 42552
1192 * 34 = 40528
```

## Hint

窮舉即可。

### Class `String` from `java.lang.String`
- `public int length()`

  Returns the length of this string. The length is equal to the number of Unicode code units in the string.
	
- `public char charAt(int index)`

  Returns the char value at the specified index. An index ranges from 0 to length() - 1. The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.If the char value specified by the index is a surrogate, the surrogate value is returned.

### Class `Math` from `java.lang.Math`
- public static double pow(double a, double b)
  
  Returns the value of the first argument raised to the power of the second argument. Special cases:

### Class `Scanner` from `java.util.Scanner`
- `public Scanner(InputStream source)`
	
  Constructs a new Scanner that produces values scanned from the specified input stream. Bytes from the stream are converted into characters using the underlying platform's default charset.

  ex.Scanner input = new Scanner( System.in );

- `public String nextLine()`

  Advances this scanner past the current line and returns the input that was skipped. This method returns the rest of the current line, excluding any line separator at the end. The position is set to the beginning of the next line.
  Since this method continues to search through the input looking for a line separator, it may buffer all of the input searching for the line to skip if no line separators are present.


