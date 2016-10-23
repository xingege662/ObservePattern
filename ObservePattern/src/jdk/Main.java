package jdk;

/**
 * Created by cx on 2016/10/23.
 */
public class Main {
    public static void main(String[] args) {

        Boy boy = new Boy(12000);
        Girl girl = new Girl();
        girl.addObserver(boy);
        girl.notifycation(boy.getSalary());


    }
}
