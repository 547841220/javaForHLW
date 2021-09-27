/**
 * <p>Description: </p>
 *
 * @author jijie
 * @Date 2021/5/17 11:11
 */
public class StringTest {

    public static void main(String[] args) {

        String s = "123";//指向一个内存地址
        String s1 = new String("123");//指向一个新的内存地址

        System.out.println(s==s1);//false 指向不同的内存地址

        String s2 = "123";
        String s3 = "123";
        System.out.println(s2==s3);//true,指向同一个内存地址

        s2 = "456";
        System.out.println(s2);//456,但是新创建的，原先的123并没有改变。String的不可变性

        setString(s3);
        System.out.println(s3);//123,因为是值传递，



    }

    private static void setString(String s){
        s = "456";
    }

}
