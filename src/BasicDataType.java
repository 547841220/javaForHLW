/**
 * <p>Description: </p>
 *
 * @author jijie
 * @Date 2021/5/17 11:11
 */
public class BasicDataType {

    /*
    *
    * 前提：字节，字，bit（位）的关系
    1字 = 2字节
    1字节 = 8位
    位：是计算机内部数据存储的最小单位

    java中分8大基本数据类型
    1.byte(1字节，8bit)
    2.char(2字节，16bit)
    3.short(2字节，16bit)
    4.int(4字节，32bit)
    5.long(8字节，64bit)
    6.float(4字节，32bit)
    7.double(8字节，64bit)
    8.boolean(1字节，8位)

    基本数据类型都有其对应的包装类

    可以实现自动拆箱，自动装箱
    自动装箱就是调用包装类的valueOf();方法
    自动拆箱是调用基本数据类型的xxValue();方法
    * */
    public static void main(StringTest[] args) {
        //byte 1字节
        byte b = 1;
        Byte Bb = b;
        System.out.println("byte类型包装类，Byte");
        //char
        char c = 1;
        Character c2 = c;
        System.out.println("char类型包装类：Character");
        //short
        short s = 1;
        Short s2 = s;
        System.out.println("short类型包装类：Short");
        //int
        int i = 1;
        Integer i2 = i;
        System.out.println("int类型包装类：Integer");
        //long
        long l = 1;
        Long l2 = l;
        System.out.println("long类型包装类：Long");
        //float
        float f = 1f;
        Float f2 = f;
        System.out.println("float类型包装类：Float");
        //double
        double d = 1;
        Double d2 = d;
        System.out.println("double类型包装类：Double");
//        float f2 = d;
        //boolean
        boolean b1 = true;
        Boolean b2 = b1;
        System.out.println("boolean类型包装类：Boolean");

    }

}
