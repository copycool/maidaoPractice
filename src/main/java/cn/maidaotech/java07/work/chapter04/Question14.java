package cn.maidaotech.java07.work.chapter04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question14 {
    public static void main(String[] args) {
        
        //创建一副牌
        String[] typePoker = {"a","b","c","d"};  //分别代表黑、红、花、块

        String[] numPoker = {"1","2","3","4","5","6","7","8","9","10","11","12","13"}; //分别代表13中牌

        List<String> list = new ArrayList<>();
        //生成52张不同类型的牌
        for (int i = 0; i < typePoker.length; i++) {
            for (int j = 0; j < numPoker.length; j++) {
                list.add(typePoker[i].toString()+numPoker[j].toString());
            }
        }
        //添加大小王
        list.add("大王");
        list.add("小王");
        System.out.println(list);

        //洗牌
        shufflePoker(list);

        System.out.println(list);

        //摸牌：3个游戏者轮流一次摸一张直到剩下3张牌

        List<Players> playersList = new ArrayList<>();   //创建三个游戏者
        List<String>  aHandList = new ArrayList<>();     //存放三个底牌
        playersPlayCards(list,playersList,aHandList);
        System.out.println("输出三位玩家的牌：");
        playersList.stream().forEach(players -> System.out.println(players.getName()+"的牌为："+players.getPoker()));
        //底牌为：
        System.out.println("底牌为：");
        aHandList.stream().forEach(s -> System.out.println(s));
    }

    /**
     * 洗牌
     * @param list
     */
    public static void shufflePoker(List<String> list){
        Collections.shuffle(list);
    }

    public static void playersPlayCards(List<String> list,List<Players> playersList,List<String>  aHandList){
        Players player1 = new Players("张三",new ArrayList<>());
        Players player2 = new Players("李四",new ArrayList<>());
        Players player3 = new Players("王五",new ArrayList<>());


        for (int i = 1; i <= list.size(); i++) {

        }

        playersList.add(player1);
        playersList.add(player2);
        playersList.add(player3);
    }
}
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Players{
    private String name;
    private List<String> poker;
}
