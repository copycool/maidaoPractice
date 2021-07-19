package cn.maidaotech.java07.work.chapter04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;
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
        playersList.stream().forEach(
                players -> System.out.println(players.getName()+"的牌为："+players.getPoker())
        );
        //底牌为：
        System.out.println("底牌为："+aHandList);

        //抢地主：随机一名游戏者获得3张底牌
        grabTheLandlord(aHandList,playersList);

        //看牌：打印输出每位游戏者的手牌
        System.out.println("抢完地主后三位玩家的牌：");
        playersList.stream().forEach(
                players -> System.out.println(players.getName()+"的牌为："+players.getPoker())
        );
    }

    /**
     * 洗牌
     * @param list
     */
    public static void shufflePoker(List<String> list){
        Collections.shuffle(list);
    }

    /**
     * 分牌
     * @param list
     * @param playersList
     * @param aHandList
     */
    public static void playersPlayCards(List<String> list,List<Players> playersList,List<String>  aHandList){
        Players player1 = new Players("张三",new ArrayList<>());
        Players player2 = new Players("李四",new ArrayList<>());
        Players player3 = new Players("王五",new ArrayList<>());
        for (int i = 0; i < list.size(); i++) {
            if (i >= 0 && i < 17){
                player1.getPoker().add(list.get(i));
                continue;
            }
            if (i >= 17 && i < 34){
                player2.getPoker().add(list.get(i));
                continue;
            }
            if (i >= 34 && i < 51){
                player3.getPoker().add(list.get(i));
                continue;
            }
            if (i >= 51 && i < 54 ){
                aHandList.add(list.get(i));
                continue;
            }
        }
        playersList.add(player1);
        playersList.add(player2);
        playersList.add(player3);
    }

    /**
     * 抢地主,并把底牌给地主
     * @param aHandList
     * @param list
     */
    public static void grabTheLandlord(List<String> aHandList,List<Players> list){
        //随机获取一位玩家
        Players players = list.get(new Random().nextInt(2)+1);
        players.getPoker().addAll(aHandList);
        System.err.println("地主为:"+players.getName());
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
