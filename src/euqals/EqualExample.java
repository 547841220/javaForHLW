package euqals;

/**
 * Description: EqualExample
 *
 * @author jijie
 * @date 2021/9/28 @time 17:52
 */
public class EqualExample {

    private int x;
    private int y;
    private int z;

    public EqualExample(int x,int y,int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //重写了equals方法
    @Override
    public boolean equals(Object o) {

        if(this == o) return true; //检查是否是同一个对象引用
        if(o == null || getClass() != o.getClass()) {
            return false;//如果不是同一个对象的引用，我们这里判断是否是同一个类型
        }
        EqualExample that = (EqualExample) o;//进行转型
        //比较判断每个关键域是否相等
        if (x != that.x) return false;
        if (y != that.y) return false;
        return z == that.z;
    }

    //重写了hashCode方法
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result +x;
        result = 31 * result +y;
        result = 31 * result +z;
        return result;
    }


}
