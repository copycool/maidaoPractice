package cn.maidaotech.java07.chapter04;
import java.util.ArrayList;
import java.util.LinkedList;
//编写程序分别测试对比 ArrayList 和 LinkedList 
//在添加、访问、删除元素时的性能。
//提示：从集 合头部添加、删除元素，从集合尾部访问元素，
//请写出原因
public class TestArrayList {
    public static void main(String[] args) {
        
        ArrayList<Long> arr = new ArrayList<>();  
        LinkedList<Long> link = new LinkedList<>();
        int i = isAQuickThanBinit(arr,link); 
        compareSys("init", i);
        int a = isAQuickThanBAdd(arr, link,10l);
        compareSys("Add", a);
        int s = isAQuickThanBSearch(arr, link,6l);
        compareSys("Search", s);
        int d = isAQuickThanBDelete(arr, link, 5);
        compareSys("Delete", d);

    }

    public static void compareSys(String methodname, int t){
        if(t==2){
            System.out.println("ArrayList和LinkedLis的"+methodname+"方法用时相同！");
            System.out.println("*****************************************************");
        }else if(t==1){
            System.out.println("ArrayLis的"+methodname+"方法比LinkedList用时长");
            System.out.println("*****************************************************");

        }else{
            System.out.println("ArrayLis的"+methodname+"方法比LinkedList用时短");
            System.out.println("*****************************************************");

        }
    }
    public static int compareUseTime(long t1, long t2){
        int re;
        if(t1-t2==0){
            re = 2;
        }else if(t1-t2 > 0){
            re = 1;
        }else{
            re = 0;
        }
        return re;
    }
   


    public static int isAQuickThanBinit(ArrayList<Long> a, LinkedList<Long> b){
        long startTime1 = System.nanoTime();
        System.out.println();
        for(long i=0;i<=9;i++){
            a.add(i);
        }
        long endTime1 = System.nanoTime();  
        long usetime1 = endTime1-startTime1;
        System.out.println("ArrayList初始化添加数据执行用时"+usetime1+"ns");

        long startTime2 = System.nanoTime();
        for(long i=0;i<=9;i++){
            b.add(i);
        }
        long endTime2 = System.nanoTime();  
        long usetime2 = endTime2-startTime2;
        System.out.println("LinkedList初始化添加数据执行用时"+usetime2+"ns");
        int e = compareUseTime(usetime1,usetime2);
        return e;
    }
    public static int isAQuickThanBAdd(ArrayList<Long> a, LinkedList<Long> b,Long data){
        long startTime1 = System.nanoTime();
        a.add(0, data);   
        long endTime1 = System.nanoTime();  
        long usetime1 = endTime1-startTime1;
        System.out.println("ArrayList执行头插法用时"+usetime1+"ns");
       

        long startTime2 = System.nanoTime();
        b.add(0, data);
        long endTime2 = System.nanoTime();  
        long usetime2 = endTime2-startTime2;
        System.out.println("LinkedList执行头插法用时"+usetime2+"ns");
        int e = compareUseTime(usetime1,usetime2);
        return e;
    }
    public static int isAQuickThanBSearch(ArrayList<Long> a, LinkedList<Long> b, Long num){
        long startTime1 = System.nanoTime();
        for(int i=a.size()-1; i>=0; i--){
            if(a.get(i)==null){
                System.out.println("您输入的数据为空!");
                break;
            }else if(a.get(i)==num){
                System.out.println("您要查找的数据在ArrayList中的位置为第"+(i+1)+"个");
                break;
            }
        }
        long endTime1 = System.nanoTime();  
        long usetime1 = endTime1-startTime1;
        System.out.println("ArrayList从尾部查询用时"+usetime1+"ns");

        long startTime2 = System.nanoTime();
        for(int i=a.size()-1; i>=0; i--){
            if(a.get(i)==null){
                System.out.println("您输入的数据为空!");
                break;
            }else if(a.get(i)==num){
                System.out.println("您要查找的数据在ArrayList中的位置为第"+(i+1)+"个");
                break;
            }
        }
        long endTime2 = System.nanoTime();  
        long usetime2 = endTime2-startTime2;
        System.out.println("LinkedList从尾部查询用时"+usetime2+"ns");
        int e = compareUseTime(usetime1,usetime2);
        return e;
    }
    public static int isAQuickThanBDelete(ArrayList<Long> a, LinkedList<Long> b, int index){
        long startTime1 = System.nanoTime();
        a.remove(index);
        long endTime1 = System.nanoTime();  
        long usetime1 = endTime1-startTime1;
        System.out.println("ArrayList删除指定索引位置元素用时"+usetime1+"ns");

        long startTime2 = System.nanoTime();
        a.remove(index);
        long endTime2 = System.nanoTime();  
        long usetime2 = endTime2-startTime2;
        System.out.println("LinkedList删除指定索引位置元素用时"+usetime2+"ns");
        int e = compareUseTime(usetime1,usetime2);
        return e;
    }

}


