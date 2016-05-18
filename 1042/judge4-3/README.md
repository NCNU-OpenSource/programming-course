# NCNU Programming 1042 Judge 4-3

李悅很懶惰，所以想搭電梯到頂樓。

電梯只能讓先進去的人，最後出來，也就是越後進去的必須得先出來。
而一班電梯最多容納 6 個人，並乘載重量 450 kg，不得超過


## 輸入說明

- 新增一名乘客，並讓乘客的體重隨機產生，體重範圍則是 50～150 kg：`enter [乘客姓名]`
- 最後進電梯的一名乘客會離開電梯：`leave`
- 列出目前所有電題乘客姓名與重量，並計算目前總乘客重量：`list`
- 結束輸入並結束程式：`end`

## 輸出說明
- 如果乘客數量超過 6 人，請回應`電梯最多容納 6 人，請搭下一班電梯`
- 如果乘客重量超過 450 kg，請回應`電梯最多容納 450 kg，請搭下一班電梯`
- 如果電梯裡沒人卻還要 `leave`，請回應`電梯裡沒有人囉`
- `leave`： `[乘客姓名] 走出電梯了`

## 輸入範例

### list
![](https://i.imgur.com/b7JBy9u.png)

### leave + 超過重量
![](https://i.imgur.com/cTjZt2b.png)


## 提示

```java=
import java.util.Scanner;

class Person {
	// some variables
	
    public Person() {
        // constructor of Person 
    }

}

class Stack {
    // some variables
	
    public void push(/* some parameter */) {
    }  

    public String pop() {
    }  
	
	// maybe you have some funcitons
}

public class Elevator {
    public static void main(String[] argv) {
    	// your code    
    }
}
```