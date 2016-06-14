老俞的檸檬汁店非常成功，因此他想繼續拓展他的事業。剛好在檸檬汁店附近有一塊閒置的小空地，他想開闢一個小型停車場，來增加一點收入。  
他要大家為他寫一個程式來模擬管理他的停車場，嘿嘿，你還是別無選擇。  


## 預設
- 小型停車場僅有 10 個停車格。
- 模擬程式採先進先出 (Queue) 的方式，先進場的車子，先離場。  


## 輸入說明
每回合可使用指令：

- 進場 `in` -> `車子車牌 車子品牌`
- 離場 `out` -> `車子車牌 車子品牌`  


## 輸出說明
- 每回合皆要顯示
	- 停車場尚餘位子
- 進場 `in`
	- 停車場已滿時，要顯示 `停車場滿了！`。
- 離場 `out`
	- 每當車子離場，顯示離場車子的資訊（包含 `品牌` 、 `車牌`）
	- 停車場為空時，要顯示 `沒有車可以出去！`。  


## 題目要求
必須用物件導向方式撰寫，需要以下程式結構  
```
class ParkingSpace {

    private String id;
    private String brand;
    
    public ParkingSpace(String i, String b) {
    }

    public String getId() {
    }

    public String getBrand() {
    }
}

class Parking {

    private static ParkingSpace[] ps;
    private static int head;
    private static int tail;
    private static int quantity;

    private static void in(String id, String brand) {
    }

    private static void out() {
    }

    private static boolean isEmpty() {
    }

    private static boolean isFull() {
    }

    private static int getEmptySpace() {
    }

    private static String getCarId(int spaceNumber) {
    }

    private static String getCarBrand(int spaceNumber) {
    }

    public static void main(String[] argv) {
    }
}
```


## 輸入範例  

#### 每回合皆要顯示 `尚餘空位`
![](https://i.imgur.com/dDebD4V.png)  


#### 進場 `in` 時、輸入 `車號、品牌`
![](https://i.imgur.com/4vcaope.png)  


#### 停車場滿了時，無法再接受進場，顯示 `停車場滿了！`
![](https://i.imgur.com/ESUHsoo.png)  


#### 依照 Queue ，車子離場由先進來的車子先離場，離開時顯示該車子的資訊（`品牌` 、 `車號`）
![](https://i.imgur.com/T13XsHa.png)  


#### 停車場為空時，無法再有車子離場，提示 `沒有車可以出去！`
![](https://i.imgur.com/szY71zk.png)  

## Hint
這次題目的 function 較多，因此這裡稍微提示一下  
`class Parking` 可看作是一座停車場  
`class ParkingSpace ` 則是可看作為停車場的每個停車格  
  
停車格 `class ParkingSpace` 負責儲存車子的資訊（車牌、品牌），  
並且具備回覆停放在該格子上的車子資訊的功能。  
  
車子進場、離場，皆由 `class Parking` 做控制（`in()`、`out()`）  
停車場有大小規定，因此進場、離場前要檢查停車場狀況（是空的，還是滿的？）  
`getCarId()` 是作為 `class ParkingSpace` - `function getId()` 在 `class Parking` 的接口。  
在 `class Parking` 中，需要取得哪一停車格的車子車牌，皆由 `getCarId()` 來取得，  
`getCarBrand()` 同理