# NCNU Programming 1042 Judge 3-5

編碼是把一段訊息由一種格式轉換成另一種格式，目前存在許多種編碼方式，本題要處理的是一種稱為「紀錄重複次數編碼」（Run-Length Encoding）的簡易編碼、解碼方式。


「紀錄重複次數編碼」是一種簡單易懂的資料壓縮方式，它把連續出現的字元以該字元及其重複次數來取代，例如 `AAA` 表示 A 連續出現 3 次，故以 `A3` 來取代 AAA。另一個例子是 `AABBBBDAA` 換成 `A2B4D1A2`。本題要求把編碼後的字串轉回原來的字串(即進行解碼)，舉例來說 `A2B4D1A2` 要能夠解譯成 `AABBBBDAA`。


那相反的，如果把解碼後的字串進行編碼，那麼會變成原來的字串，例如 `AAABBBBBCCCCCCCCC` 經過編碼得 `A3B5C9`。


本題要能夠進行雙向的編碼及解碼，輸入 `end` 及程式結束。
假設重複字出現的字數不超過 9 次。


## 輸入範例

```
AAAABBRRS
G3R4D1F5
A1S1D1F1Q1W1E2
QWER
end
```

## 輸出範例

```
A4B2R2S1
GGGRRRRDFFFFF
ASDFQWEE
Q1W1E1R1
```
---------------------------------

#### 若輸入編碼，則輸出解碼結果
![](https://i.imgur.com/y8Fexn4.png)
![](https://i.imgur.com/0yuL6wG.png)
#### 若輸入解碼，則輸出編碼結果
![](https://i.imgur.com/2NEickV.png)
![](https://i.imgur.com/RJtkcOi.png)

#### 以此類推，能夠輸入編碼(or解碼)，得到解碼(or編碼)
![](https://i.imgur.com/NjOzi9Z.png)
#### 最後輸入 end 能跳離程式
![](https://i.imgur.com/3bEaEZ2.png)

## Hint


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



### Class `Scanner` from `java.util.Scanner`
- `public Scanner(InputStream source)`

  Constructs a new Scanner that produces values scanned from the specified input stream. Bytes from the stream are converted into characters using the underlying platform's default charset.

  ex.Scanner input = new Scanner( System.in );

### Class `Integer` from `java.lang.Integer`
- `public static int parseInt(String s)throws NumberFormatException`

	Parses the string argument as a signed decimal integer. The characters in the string must all be decimal digits, except that the first character may be an ASCII minus sign '-' ('\u002D') to indicate a negative value or an ASCII plus sign '+' ('\u002B') to indicate a positive value. The resulting integer value is returned, exactly as if the argument and the radix 10 were given as arguments to the parseInt(java.lang.String, int) method.
	

### Class `Character` from `java.lang.Integer`
- `public static int getNumericValue(char ch)`

  Returns the int value that the specified Unicode character represents. For example, the character '\u216C' (the roman numeral fifty) will return an int with a value of 50.
	The letters A-Z in their uppercase ('\u0041' through '\u005A'), lowercase ('\u0061' through '\u007A'), and full width variant ('\uFF21' through '\uFF3A' and '\uFF41' through '\uFF5A') forms have numeric values from 10 through 35. This is independent of the Unicode specification, which does not assign numeric values to these char values.
	If the character does not have a numeric value, then -1 is returned. If the character has a numeric value that cannot be represented as a nonnegative integer (for example, a fractional value), then -2 is returned. 
	
	

