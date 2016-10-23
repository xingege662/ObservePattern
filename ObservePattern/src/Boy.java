/**
 * Created by cx on 2016/10/23.
 */
public class Boy {

    private String name;
    private int id;

    public Boy(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public void update() {
        System.out.println(this.id+this.name+"说:女孩,能要个电话吗?");
    }
}
