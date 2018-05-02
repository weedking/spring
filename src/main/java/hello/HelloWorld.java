package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
//        LocalTime currentTime = new LocalTime("yyyy-MM-dd HH:mm:ss");
//        System.out.println("The current local time is: " + currentTime);
        Greater greater = new Greater();
        System.out.println(greater.sayHello());
    }
}
