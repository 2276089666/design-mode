package mode.structuralType.flyweight;

// string的常量池也是用的享元模式
public class JustTestString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s3 == s4);
        System.out.println(s3.intern() == s1);    // s3.intern()表示s3这个在堆里面new的对象还会去池种找有没有"abc"这个常量,有就返回池中那个常量的引用
        System.out.println(s3.intern() == s4.intern());
    }
}
