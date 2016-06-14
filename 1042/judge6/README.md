# NCNU Programming 1042 Judge 6

失去教學熱誠的老俞想退休，他計畫退休後跟鴨鴨開一間檸檬汁店，成為了一個任性的檸檬汁店店長。他要求大家為他撰寫模擬開店。而你別無選擇。

需要可以設定 `創業基金`、`進貨成本`、`賣出價格`。
鴨鴨是店員，他的工作內容為負責店內檸檬汁的`銷售` & `進貨`。當別人買檸檬汁的時候，鴨鴨要判斷檸檬汁是否足夠，當檸檬汁不足時，不能賣出去，但是你可以自行判斷要不要進貨。當要進貨時，也要先判斷預算是否充足。

{%youtube MtN1YnoL46Q %}
https://www.youtube.com/watch?v=MtN1YnoL46Q


## 輸入說明
- 一開始：創業資本額（int）、每杯成本（int）、每杯售價（int）
- 每回合可用指令：
	- 賣出：`sell 杯數`
	- 進貨：`buy 杯數`

## 輸出說明
- 每回合初始顯示：
  - 目前共有多少存貨
  - 目前還上多少預算
- 賣出可能顯示：
	- 貨源不足
	- 已賣出多少杯
- 進貨可能顯示：
	- 預算不夠
	- 已進貨多少杯

## 題目要求
請以物件導向模式設計，需有以下變數及功能。
```
public class LemonadeStore {
    private int budget;
    private int quantity;
    private int purchasePrice;
    private int sellingPrice;
    
    public LemonadeStore() {

    }
    
    public int getQuantity() {

    }
    
    public int getBudget() {

    }
    
    public boolean isLemonadeEnough() {

    }
    
    public boolean isBudgetEnough() {

    }
    
    public void sell() {

    }
	
    public void buy() {

    }
}
```

## 輸出範例
先輸入`創業資金`、`每杯成本`、`每杯售價`
![](https://i.imgur.com/HX0MLU1.png)
![](https://i.imgur.com/ObTLyei.png)

如果輸入 buy 100
![](https://i.imgur.com/ri1mBuq.png)
因為預算不足跑出 `預算不夠`
![](https://i.imgur.com/6FfeARg.png)

如果輸入 buy 10
![](https://i.imgur.com/MIKQfpf.png)
![](https://i.imgur.com/BQ48HRV.png)

再來輸入sell 5
![](https://i.imgur.com/ZhLvt7L.png)
![](https://i.imgur.com/iA9EDUL.png)

如果輸入sell 4000
![](https://i.imgur.com/bSFFLu7.png)
因為貨源不足跑出 `貨源不足`
![](https://i.imgur.com/o7vu4QP.png)




## 提示
無

