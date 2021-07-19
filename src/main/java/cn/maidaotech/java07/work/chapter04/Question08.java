package cn.maidaotech.java07.work.chapter04;

import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.HashBag;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question08 {
    public static void main(String[] args) {

        List<Integer> list =new ArrayList<>();

        while (list.size() < new Random().nextInt(30)+1){
            list.add(new Random().nextInt(10)+1);
        }

        System.out.println("初始化的集合为："+list);

        //打印出结果
        /**
         * 方法一：
         */
        // printMaxFrequency1(list);
        /**
         * 方法二：
         */
        // printMaxFrequency2(list);
        /**
         * 方法三：
         */
        printMaxFrequency3(list);

    }

    /**
     * 统计出现频率最高的数，并打印
     * @param list
     */
    public static void printMaxFrequency1(List<Integer> list){
        //利用 groupingBy 进行多字段分组    把相同的数分成一组，在统计出现次数，放入map集合中
        Map<Integer, Long> map = list.stream()
                                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("集合统计表为：" );
        map.forEach((k, v)->{
            System.out.println("k= "+k+", v= "+v);
        });
        //找到最大的次数
        Integer max = Integer.parseInt(Collections.max(map.values()).toString());
        System.out.println("出现最大的次数："+max);
        for (Map.Entry entry:map.entrySet()) {
            Integer value = Integer.parseInt(entry.getValue().toString());
            if (value == max){
                System.out.println("出现频率最大的数为："+entry.getKey());
            }
        }
    }

    /**
     * 统计出现频率最高的数，并打印
     * @param list
     */
    public static void printMaxFrequency2(List<Integer> list){
        Bag bag = new HashBag(list);
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer numObj:list) {
            map.put(numObj,bag.getCount(numObj));
        }
        printMap(map);
    }

    /**
     * 统计出现频率最高的数，并打印
     * @param list
     */
    public static void printMaxFrequency3(List<Integer> list){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer numObj:list) {
            Integer count = map.get(numObj);
            map.put(numObj,(count == null)?1:count+1);
        }
        printMap(map);
    }

    //打印Map
    public static void printMap(Map<Integer,Integer> map){
        System.out.println("集合统计表为：");
        map.forEach((k, v)->{
            System.out.println("k= "+k+", v= "+v);
        });
        //找到最大的次数
        Integer max = Collections.max(map.values());
        System.out.println("出现最大的次数："+max);
        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
            if (entry.getValue() == max){
                System.out.println("出现频率最大的数为："+entry.getKey());
            }
        }
    }

    //在集合中找到最大的次数
    /**
     * 方法一:
     */
    //        for (Object obj:values) {
    //            Integer num = Integer.parseInt(obj.toString());
    //            if (max < num){
    //                max = num;
    //            }
    //        }
    //        System.out.println(max);
    /** 
     * 方式二：
     */
    //        Object[] objects = values.toArray();
    //        Arrays.sort(objects);
    //        max =Integer.parseInt(objects[objects.length-1].toString());
    //        System.out.println(max);
    /**
     * 方法三：
     */
    // max = Integer.parseInt(Collections.max(values).toString());
    // System.out.println(max);
    //引入apache-commons-collections依赖，创建Bag对象，调用统计方法
    //Java 8允许在接口中加入具体方法。接口中的具体方法有两种，default方法和static方法，identity()就是Function接口的一个静态方法。
    //Function.identity()返回一个输出跟输入一样的Lambda表达式对象，等价于形如t -> t形式的Lambda表达式
}