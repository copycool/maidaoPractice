package cn.maidaotech.java07.dawn;
//线程的状态
public enum State {
    //新生
    NEW,

    //运行
    RUNNABLE,

    //阻塞
    BLOCKED,

    //等待
    WAITING,

    //超时等待
    TIMED_WAITING,
    
    //终止
    TERMINATED;
}