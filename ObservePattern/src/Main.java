public class Main {

    public static void main(String[] args) {
        Boy zhangsan = new Boy("张三", 1);
        Boy wangwu = new Boy("王五", 2);
        Boy lisi = new Boy("李四", 3);

        Girl girl = new Girl();
        girl.add(zhangsan);
        girl.add(wangwu);
        girl.add(lisi);


        girl.notification();
    }
}
