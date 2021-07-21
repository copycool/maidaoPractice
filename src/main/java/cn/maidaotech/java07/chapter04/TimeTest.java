package cn.maidaotech.java07.chapter04;

// 运行结果：
// ---------- 运行 ----------
// ArrayList添加1000个数据用时：568312纳秒
// ArrayList删除1000个数据用时：105195纳秒
// LinkedList添加1000个数据用时：325207纳秒
// LinkedList删除1000个数据用时：290250纳秒
// 输出完成 (耗时 0 秒) - 正常终止
// 分析：
// 通过以上结果，我们可以看出LinkedList在对进行添加和删除的操作中，耗费时间少于ArrayList,效率上有明显的优势。
// ArrayList集合底层的数据结构是数组，所以对定向查找速度比较快
// LinkedList集合底层数据结构是链表，链表结构的特点是增删改速度比较快。


import java.util.*;
class TimeTest 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		long startTimeAddal = System.nanoTime();
		for(int i=0;i<1000;i++)
		{
			al.add(i);
		}
		long endTimeAddal = System.nanoTime();
		System.out.println("ArrayList添加1000个数据用时：" + (endTimeAddal - startTimeAddal) + "纳秒");
		long startTimeRemoveal = System.nanoTime();
		for(int i=999;i>=0;i--)
		{
			al.remove(i);
		}
		long endTimeRemoveal = System.nanoTime();
		System.out.println("ArrayList删除1000个数据用时：" + (endTimeRemoveal - startTimeRemoveal) + "纳秒");
 
		LinkedList<Integer> ll = new LinkedList<Integer>();
		long startTimeAddll = System.nanoTime();
		for(int i=0;i<1000;i++)
		{
			ll.add(i);
		}
		long endTimeAddll = System.nanoTime();
		System.out.println("LinkedList添加1000个数据用时：" + (endTimeAddll - startTimeAddll) + "纳秒");
		long startTimeRemovell = System.nanoTime();
		for(int i=999;i>=0;i--)
		{
			ll.remove(i);
		}
		long endTimeRemovell = System.nanoTime();
		System.out.println("LinkedList删除1000个数据用时：" + (endTimeRemovell - startTimeRemovell) + "纳秒");
	}
}
