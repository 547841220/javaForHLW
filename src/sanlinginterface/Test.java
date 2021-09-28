package sanlinginterface;

/**
 * Description: sanlinginterface.Test
 *
 * @author jijie
 * @date 2021/9/28 @time 12:06
 */
public class Test {
    public static void main(String[] args) {
        A a = new B();
        a.syaHello();//打印结果：HelloA HelloB HelloA
        //原因解释：new sanlinginterface.B()的时候，是将B的引用指向A对象，
    }
}
