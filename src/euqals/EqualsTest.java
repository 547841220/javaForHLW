package euqals;

import java.util.HashSet;

/**
 * Description: euqals.EqualsTest
 *
 * @author jijie
 * @date 2021/9/28 @time 17:51
 */
public class EqualsTest {

    public static void main(String[] args) {
        //新建了两个EqualExample对象，我们这里是希望这两个对象是一样的，但实际不一样
        //因为我们没有重写hashCode方法
        EqualExample e1 = new EqualExample(1,1,1);
        EqualExample e2 = new EqualExample(1,1,1);
        EqualsTest e3 = new EqualsTest();
        EqualExample e4 = new EqualExample(2,1,1);

        System.out.println(e1.equals(e1));//true,原因是同一个对象引用
        System.out.println(e1.equals(e3));//false,原因是不同类型的对象
        System.out.println(e1.equals(e4));//false,原因是x值不同
        System.out.println(e1.equals(e2));//true,原因是我们重写了equals方法

        //假定我们这里认为这两个对象是相等的，我们想将这两个对象放到hashSet中
        //没有重写hashCode之前
        /*HashSet<EqualExample> hashSet = new HashSet<>();
        hashSet.add(e1);
        hashSet.add(e2);
        System.out.println(hashSet.size());//2,原因是hashSet在add的时候，是根据HashCode来添加的，而这两个对象的hashCOde值不同，所以添加了两个。
        System.out.println(hashSet.size());//2,原因是hashSet在add的时候，是根据HashCode来添加的，而这两个对象的hashCOde值不同，所以添加了两个。
*/
        //重写了hashCode之后
        //那么如何达到我们想要的结果呢？
        //解决方法：重写hashCode方法
        HashSet<EqualExample> hashSet = new HashSet<>();
        hashSet.add(e1);
        hashSet.add(e2);
        System.out.println(hashSet.size());//1,原因是我们重写了hashCode



    }


}
