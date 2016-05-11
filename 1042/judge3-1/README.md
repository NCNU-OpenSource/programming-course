# NCNU Programming 1042 Judge 3-1

號稱暨大股神老魚，總能洞燭先機了解目前經濟脈落，然而好景不常，近年來股市一片綠油油，股民們哀鴻遍野，老魚也不例外。

某次下班回家途中，意外看見公益彩券的招牌寫著『給自己一次機會，向夢想下單』，老魚心念一動，或許我可以來寫一支程式，讓我好好練習我的選號技巧。

老魚公務繁忙，無暇寫這支樂透程式，身為學生的我們，就來一起幫助老師，完成美夢吧！

### 本樂透規則
總共有 49 個號碼，一次可選 6 個數。
範圍在`1～49` 內，超出視為無效；輸入的數 `不可重複`。

### Bonus 計算
答對 5 個：獲得五分之一的獎金。
答對 6 個：獲得全部的獎金。
其他：沒獲得任何錢 QQ

第一次會輸入每期金額，如果答玩後有剩下會累積至下一期。
## 輸入說明
- 輸入 `(int)每期頭獎金額`，此 `金額` 會一直累積。
- 輸入 `(int)6個樂透號碼`，不可 `超過範圍`，不可 `重複`，系統很貼心會體醒你，還可以輸入 `幾個數字`。
- 輸入 `Y` 可繼續猜數字，進入下一期。

## 輸出說明
- 為方便判斷是否中獎，需先把產生的樂透 `Answer` 由 `小到大` 列出。 
-  印出 `每期頭獎金額`，`請輸入 6 個樂透號碼`，幫助輸入對應的值。
- 判斷輸入的號碼是否符合，太大 `請勿超過49`，太小 `請勿小於1`。
- 每次輸入一個數後，會告訴使用者 `還剩下幾個數沒輸入`。
- `沒有答對` 印出 `加油R`。
- `答對5個` 印出 `答對5個`，`獲得Bonus的五分之一的錢+運算錢數`。
- `全對` 印出 `夢想達成了`，`獲得全部bonus的錢+運過算錢數`。
-  印出 `是否要再挑戰夢想`，判斷是否要繼續遊戲。
- 從第二期開始，都會告知 `累積頭彩上看+累積錢數`。

## 輸入輸出範例
#### 示範輸入流程再全對下的情形
![](https://i.imgur.com/rygPBQE.gif)

#### 示範槓龜＆獎金累積
![](https://i.imgur.com/4ALza2r.png)

#### 示範答對五個
![](https://i.imgur.com/RxThrLl.png)

## Hint
### Class `Scanner` from `java.util.Scanner`
- `public Scanner(InputStream source)`
  
  Constructs a new Scanner that produces values scanned from the specified input stream. Bytes from the stream are converted into characters using the underlying platform's default charset.

  ex.Scanner input = new Scanner( System.in );
### Class `Math `from `java.lang.Math`
- `public static double random()`
  
  Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.

