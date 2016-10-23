import java.util.ArrayList;
import java.util.List;

/**
 * Created by cx on 2016/10/23.
 */
public class Girl {
    private List<Boy> observerList = new ArrayList<>();

    public  void add(Boy boy){
        observerList.add(boy);
    }

    public void notification(){
        System.out.println("妹子说:妹子我看你们挺不错的!");
        for(int i = 0 ;i < observerList.size();i++){
            observerList.get(i).update();
        }
    }
}
