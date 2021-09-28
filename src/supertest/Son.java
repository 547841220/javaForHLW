package supertest;

/**
 * Description: Son
 *
 * @author jijie
 * @date 2021/9/28 @time 19:01
 */
public class Son extends Father{

    private int s;

    public Son() {
        //super();//这里不写也行，默认会执行父类的构造方法
        super.fun();//这里通过super来调用父类的方法
        this.s = super.f;
        System.out.println("我继承了父类的属性，s="+s);
        System.out.println("my name is son");
    }
}
