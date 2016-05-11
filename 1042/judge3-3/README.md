# NCNU Programming 1042 Judge 3-3

展瑩使用了一個禮拜的 List 覺得不太方便

希望可以自己新增其他的 Todo list，希望每個 List 功能有 `add`、`remove`、`list`、`end`可以幫忙列出來到底有哪些事情還沒有做，一樣每個清單最多只能有 10 個待辦事項。

## 輸入說明

- 新增一個清單：`new [list name]`
- 新增一個 task：`add [list name] [task name]`
- 刪除一個 task：`remove [list name] [task name]`
- 列出清單代辦事項：`list [list name]`
- 結束輸入並印出所有 List：`end`

## 輸出說明
- 待辦清單名稱若為 `null`，表示尚未放值，請顯示 `空`。
- 若待辦事項滿了，若想繼續新增請回應`這個清單已經滿了`。
- 若待辦事項沒有東西，若想繼續刪除請回應`這個清單沒有東西`。

## 輸入範例

```
new mylist
add mylist 程設好難
add mylist 國文報告
new MOLi
add MOLi 設備清單
remove mylist
add MOLi MOLiDay
add mylist 心得未寫
remove MOLi
end
```

## 輸出範例

```
mylist 待辦事項：
Stack
心得未寫
空
空
空
空
空
空
空
空

MOLi 待辦事項：
MOLiDay
空
空
空
空
空
空
空
空
空
```



