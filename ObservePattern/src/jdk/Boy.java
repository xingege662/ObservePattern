package jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cx on 2016/10/23.
 */
public class Boy implements Observer {

    private int salary;

    public int getSalary() {
        return salary;
    }

    public Boy(int salary) {
        this.salary = salary;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我这个月的零花钱为" + arg);
    }
}
