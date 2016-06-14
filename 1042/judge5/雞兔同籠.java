public class 雞兔同籠 {
    private static 籠子[] 好多籠子;
    public static void main(String[] argv) {
        好多籠子 = new 籠子[5];
        for (int i = 0; i < 好多籠子.length; i++) {
            int 動物數量 = (int)(Math.random() * 20+1);
            好多籠子[i] = new 籠子(動物數量);
            濫捕(好多籠子[i]);
            System.out.println(i + " 號籠子");
            System.out.println("總共有：" + 好多籠子[i].取得總腿數() + " 支腳  " + 好多籠子[i].取得隻數() + " 個頭");
            System.out.println("兔兔：" + 好多籠子[i].取得兔兔隻數() + " 隻 / " + "雞雞：" + 好多籠子[i].取得雞雞隻數() + " 隻");
            System.out.println();
        }
    }

    public static void 濫捕(籠子 一個籠子) {
        while ( !一個籠子.isFull() ) {
            if ( (int)(Math.random() * 2) == 0 ) {
                一個籠子.抓進籠子( new 雞雞() );
            } else {
                一個籠子.抓進籠子( new 兔兔() );
            }
        }
    }
}
