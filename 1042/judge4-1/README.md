# NCNU Programming 1042 Judge 4-1

小婷自小便立志成為精靈寶夢大師，13歲的她踏上了旅途，途中遇到各種艱困的阻礙，她都能迎刃而解"，直到這天他遇到了火箭隊。

『盡然你誠心誠意的發問了，我就大發慈悲的告訴你......』小婷和火箭隊發生激戰，最後小婷敵不過火箭隊，所有神奇寶貝被搶走，可憐的小婷決心要打敗他們。

於是她決定要寫一直可以讓神奇寶貝自己訓練，進化的程式，讓我們一起幫幫可憐的小婷。

最後
『大家也去收服神奇寶貝吧！』

## 功能說明
- 因為身上最多可以攜帶`6個`神奇寶貝，所以一開始輸入６個`nickname`，會隨機產生`妙蛙種子`，`小火龍`，`傑尼龜`共６隻。

- 輸入`train` 會隨機訓練獲得經驗值。
  - 隨機方式 `(Math.sqrt((Math.random() * 1000)) * 50)`
- 輸入`list` 會列出目前背包所有神奇寶貝的狀態。
- `train`所獲得的經驗值，會作為進化使用，經驗值累積計算成等級，等級超過`16`，`36`，`50`會進化。（三種皆適用）
  - 等級計算方式，每升一級需獲得`經驗值 >= 當前等級平方+1 ex: 5->6 需得到26經驗值才可升級`。
 

 
## 進化說明
- 龜甲寶可夢 : `傑尼龜 -> 卡咪龜 -> 水箭龜 -> 超級水箭龜`
- 蜥蜴寶可夢 : `小火龍 -> 火恐龍 -> 噴火龍 -> 超級噴火龍`
- 種子寶可夢 :`妙蛙種子 -> 妙蛙草 -> 妙蛙花 -> 超級妙蛙花`
#### 龜甲寶可夢
![](https://i.imgur.com/U0i0ca9.png)

#### 蜥蜴寶可夢
![](https://i.imgur.com/ujLCUZ5.png)

#### 種子寶可夢
![](https://i.imgur.com/g5P4OS2.png)

## 輸入＆輸出說明
- 輸入`6個nickname`
- 輸入`train`會訓練，各別得到`隨機`的經驗值。
- 輸入`list` 顯示目前背包中寶可夢們狀態。

## 輸入＆輸出範例
##### 展瑩，憲一，老魚進化了！
![](https://i.imgur.com/KES2VtV.png)

## 必達條件
- 實作出`class 種子寶可夢`，`蜥蜴寶可夢`，`龜甲寶可夢`。
- 使用`Hint內`程式碼改寫完成
## Hint
```java=
public abstract class Pokemon {
    //暱稱
    private String nickname;
    //經驗值
    private int exp;
    //等級
    private int level;
    //進化到哪個階段
    private int 進化階段;
    public Pokemon(String nickname) {
        //設定經驗值從0開始
        //設定nickname
    }
    public void check進化() {
        //依據等級檢查目前進化的到那個階段
    }
    public int getLevel() {
        //得到目前等級
    }
    public String getNickname() {
        //取得nickname
    }
    public String calcName() {
        //取得進化階段的名子ex.(卡咪龜->水箭龜)
    }
    public int train() {
        //訓練，並獲得經驗值	
    } 
    //呼叫calaName()回傳名字    
    public abstract String getName();    
}

```

### Class `Scanner` from `java.util.Scanner`
- `public Scanner(InputStream source)`
	
  Constructs a new Scanner that produces values scanned from the specified input stream. Bytes from the stream are converted into characters using the underlying platform's default charset.

  ex.Scanner input = new Scanner( System.in );

- `public String next()`

  Finds and returns the next complete token from this scanner. A complete token is preceded and followed by input that matches the delimiter pattern. This method may block while waiting for input to scan, even if a previous invocation of hasNext() returned true.


