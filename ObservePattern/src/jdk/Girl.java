package jdk;

import java.util.Observable;

/**
 * Created by cx on 2016/10/23.
 */
public class Girl extends Observable {
    private int MyCount;

    public void notifycation(int MyCount) {
        if (MyCount > 10000) {
            setChanged();
            notifyObservers(100);
        } else {
            setChanged();
            notifyObservers(50);

        }

    }
}
