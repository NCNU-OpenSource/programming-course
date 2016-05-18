# NCNU Programming 1042 Judge 4-5

百獸戰隊是由一群動物機器人所組合而成的，其中有五個動物機器人，`獅子(Lion)`、`老鷹(Eagle)`、鯊魚、白虎、黑牛。

其中取`獅子`及`老鷹`為例子(其他動物本題不會用到)，獅子具有`衝撞(Collide)`及`撕咬(Bite)`的功能，老鷹有`飛行(Fly)`及`撕咬(Bite)`的功能，假設大機器人只要有老鷹及獅子的存在，就能夠進行合體了，合體後的大機器人具有`飛行(Fly)`、`撕咬(Bite)`、`衝撞(Collide)`的功能。



百獸戰隊:https://www.youtube.com/watch?v=FG8uFCXdKHg

## 功能說明
 - 衝撞(Collide)，印出 `我衝死你`
 - 撕咬(Bite)，印出 `我咬死你`
 - 飛行(Fly)，印出 `我飛行`

## 必達題目要求

 - 名稱需宣告為`private`
 - `獅子(Lion)`、`老鷹(Eagle)`、`大機器人(BigRobot)`、繼承自`機器人(Robot)`
 - 功能需使用`interface`實作
 - 獅子及老鷹的名字能被使用者輸入
 - 合體後的大機器人名字=獅子名字+老鷹名字
	ex. 獅子名字:`大獅兄` , 老鷹名字:`狄鷹` 則合體後大機器人名字:`大獅兄狄鷹`
 - 需要產生老鷹及獅子之後，輸入`merge`才能合體，否則印出錯誤
 - 本題只會產生一次老鷹及獅子，如果產生第二次的話則輸出`已出現過!`

`Robot.java`範例code:

```=java
public class Robot implements Bite {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name; 
    }
}
```
## 輸入、輸出說明
首先輸入 `[動物機器人]` `[名稱]`，判斷是老鷹或是獅子，
如果是老鷹，印出`老鷹名稱:[名稱]` `功能:[撕咬] [飛行]`， 
如果是獅子，印出`獅子名稱:[名稱]` `功能:[撕咬] [衝撞]`，
如果都不是，印出`輸入錯誤!`。

如果老鷹(or獅子)已產生一次，再產生老鷹(or獅子)，則印出`已出現過!`

如果老鷹或獅子其中一方沒有產生，而輸入`merge`，印出 `獅子或老鷹還沒產生，無法合體`

如果老鷹及獅子都產生完了，輸入`merge`，印出`合體機器人名稱:[獅子名稱+老鷹名稱]` `功能:[撕咬] [衝撞] [飛行]`，程式結束。




## 輸入、輸出範例
首先輸入要產生老鷹(Eagle)或是獅子(Lion)
![](https://i.imgur.com/jCwLKg8.png)
![](https://i.imgur.com/NYa3yCo.png)
![](https://i.imgur.com/7OnOwX7.png)
![](https://i.imgur.com/IlA7hyq.png)

如果都不是則印出錯誤
![](https://i.imgur.com/sEu1CDm.png)

如果老鷹(or獅子)已產生一次，再產生老鷹(or獅子)，則印出`已出現過!`
![](https://i.imgur.com/uArFHo9.png)
![](https://i.imgur.com/vg5xSNZ.png)
![](https://i.imgur.com/Rhhng2c.png)
![](https://i.imgur.com/b8odSkw.png)

如果老鷹或獅子其中一方沒有產生，而輸入`merge`，印出 `獅子或老鷹還沒產生，無法合體`

![](https://i.imgur.com/5hmWEIs.png)
![](https://i.imgur.com/yYufdPs.png)

如果老鷹及獅子都產生完了，輸入`merge`，印出`合體機器人名稱:[獅子名稱+老鷹名稱]` `功能:[撕咬] [衝撞] [飛行]`，程式結束。
![](https://i.imgur.com/63Ibgit.png)
![](https://i.imgur.com/lzsZpTZ.png)



## 提示
Interface 有三個:`撕咬(Bite)`、`衝撞(Collide)`、`飛行(Fly)`
Class 有五個:
主程式:`Team`、獅子:`Lion`、老鷹:`Eagle`、機器人:`Robot`、合體後大機器人:`BigRobot`

