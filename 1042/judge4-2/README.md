# NCNU Programming 1042 Judge 4-2

這是一個模擬的世界。

這世界只有一條倫理：「兩人互伴侶，方可傳宗接代。」

也就是：
1. 沒有性別。
2. 沒有亂倫的道德問題。
3. 自身與自身也可互為連理、傳宗接代。
4. 不需忠於伴侶。

在世界誕生之初，只有兩位無雙親之人：展瑩與憲一。

## 輸入說明
輸入指令後，輸入兩個人的名稱（若任一名稱不存在於世上，得繼續輸入。）

- `marry` `A` `B`
  代表 `A` `B` 結為連理。
- `deliver` `A` `B` `C`
  若 `A` `B` 互為伴侶，可生了個叫 `C` 的小孩。
  
 

## 輸出說明
每回合皆顯示世上所有人的`姓名`、`雙親`、`伴侶`。
後兩者，有才顯示。

## 輸入輸出範例

### 互為伴侶才可生小孩
```
[憲一]
[展瑩]

deliver 憲一 展瑩
互為伴侶才能生喔～

[憲一]
[展瑩]

marry 憲一 展瑩

[憲一] 伴侶： 展瑩
[展瑩] 伴侶： 憲一

deliver 憲一 展瑩
請取個名字： 鴨鴨

```
### 指令後，名稱若不存在世上，則要讓使用者輸入到對為止
```
[憲一] 伴侶： 展瑩
[展瑩] 伴侶： 憲一
[鴨鴨] 父母： 憲一 & 展瑩

marry
1
2
憲一
鴨鴨
```

### 雙方皆互為伴侶，才可生孩子。

```
[憲一] 伴侶： 鴨鴨
[展瑩] 伴侶： 憲一
[鴨鴨] 父母： 憲一 & 展瑩 伴侶： 憲一

deliver 憲一 展瑩
互為伴侶才能生喔～
```

### 對伴侶不忠，另結伴侶後仍能生孩子。
（只要兩人互為伴侶即可）

```
[憲一] 伴侶： 鴨鴨
[展瑩] 伴侶： 憲一
[鴨鴨] 父母： 憲一 & 展瑩 伴侶： 憲一

deliver 憲一 鴨鴨
請取個名字： 小鴨
```

### 自己可以跟自己結為連理、生孩子

```
[憲一] 伴侶： 鴨鴨
[展瑩] 伴侶： 憲一
[鴨鴨] 父母： 憲一 & 展瑩 伴侶： 憲一
[小鴨] 父母： 憲一 & 鴨鴨

marry 憲一 憲一

[憲一] 伴侶： 憲一
[展瑩] 伴侶： 憲一
[鴨鴨] 父母： 憲一 & 展瑩 伴侶： 憲一
[小鴨] 父母： 憲一 & 鴨鴨

deliver 憲一 憲一

請取個名字： 三角形

[憲一] 伴侶： 憲一
[展瑩] 伴侶： 憲一
[鴨鴨] 父母： 憲一 & 展瑩 伴侶： 憲一
[小鴨] 父母： 憲一 & 鴨鴨
[三角形] 父母： 憲一 & 憲一
```

## 必達條件

請於世界中 `new` 出 `Human` 作為人。

### Human class 參考

```java=
class Human {
    private String name;
    private Human[] parents;
    private Human companion;

    
    public Human(String name, Human parentA, Human parentB) {
        // 初生之時，會有雙親與姓名
    }

    public Human[] getParents() {
        return this.parents;
    }

    public String getName() {
        return this.name;
    }

    public Human getCompanion() {
        return this.companion;
    }

    public void setCompanion(Human person) {
        this.companion = person;
    }
}

```

## Hint

### Class `Scanner` from `java.util.Scanner`
- `public Scanner(InputStream source)`
	
  Constructs a new Scanner that produces values scanned from the specified input stream. Bytes from the stream are converted into characters using the underlying platform's default charset.

  ex.Scanner input = new Scanner( System.in );

- `public String next()`

  Finds and returns the next complete token from this scanner. A complete token is preceded and followed by input that matches the delimiter pattern. This method may block while waiting for input to scan, even if a previous invocation of hasNext() returned true.



