package cn.maidaitech.shui966.Char3;
//七
public class bus implements Vehicle {

    @Override
    public void start(String car) {
        System.out.println("公交车起步");

    }

    @Override
    public void stop(String cars) {
        System.out.println("公交车停车");

    }
    
}