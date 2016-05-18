# NCNU Programming 1042 Judge 4-4

展瑩開了一家風評很好的布丁店，  
名字叫做「巧谷蕾特」（ChuCooLet）  
廣告 slogan 為「Chu~ Coo~ Let's Go!」  
展瑩賣的布丁很多樣，購買、優惠方式也多，  
所以造成價格有些凌亂，  
顧客有時會不知道要付多少摳摳，  
所以需要大大們，幫忙寫一個購買試算的 JAVA 程式～  

## 題目基本需求

### 購買方式 ＆ 優惠
- 購買方式分為 `現場外帶(toGo)`、`宅配(deliver)`
- `現場外帶`：12 個布丁可裝為一盒，每盒優惠 9 折。
  （以低價位布丁優先裝盒，散裝的布丁以原價計）
- `宅配`：計價方式與 `現場外帶` 一樣，但需付 $100 運費。

## 輸入說明
- 輸入要幾種口味 `[口味數量]`
- 輸入要哪種購買方式 `[方式]` （ `toGo` or `deliver` ）
- 依序輸入每種布丁 `[布丁口味] [價格] [數量]`

## 輸出說明
- 有幾盒 + 散裝幾個
- 總價格

## 輸入、輸出範例
![](https://i.imgur.com/AZMGi8b.png)

## 必達條件
- 一定要有 `class Pudding` 作為儲存布丁的容器。
- `class Pudding` 要有回傳布丁 `數量`、`價錢` 給主程式的 function (簡單來說，就是拿 Hint 修改)

## Hint
```java=
public class Pudding {
    private String flavor;	// 布丁口味
    private int price;		// 布丁價格
    private int quantity;	// 訂購數量

    public Pudding(String f, int p, int q) {
    	// 初始化「布丁口味」、「布丁價格」、「訂購數量」
    }

    public int getPrice() {
    	// 取得布丁價格
    }

    public int getQuantity() {
    	// 取得訂購數量
    }

    public void setQuantity(int q) {
    	// 重新設定訂購數量
    }
}
```

