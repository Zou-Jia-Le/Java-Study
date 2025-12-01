import java.util.LinkedList;
import java.util.List;

public class Practice_14_17_2 {
    public static void main(String[] args) {
        List<String> xiaomuMusiclist = new LinkedList<>();
        xiaomuMusiclist.add("又见炊烟");
        xiaomuMusiclist.add("可能");
        xiaomuMusiclist.add("大风吹");
        xiaomuMusiclist.add("今天");
        xiaomuMusiclist.add("再回首");

        List<String> myMusiclist = new LinkedList<>();
        myMusiclist.add("青花瓷");
        myMusiclist.add("过年好");

        System.out.println(myMusiclist);
        myMusiclist.remove(1);
        System.out.println(myMusiclist);
        myMusiclist.add(xiaomuMusiclist.get(0));
        myMusiclist.add(xiaomuMusiclist.get(2));
        myMusiclist.add(xiaomuMusiclist.get(4));
        System.out.println(myMusiclist);
        System.out.println("我的音乐播放列表总共有 " + myMusiclist.size() + " 首歌");
    }
}
