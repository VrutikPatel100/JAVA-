package Test;
public class MyString {
    public static void main(String[] args) {
        // 1) StringImmutable operation
        String name1 = "vrutik";
        System.out.println("Name1 : " + name1 + "----" + name1.hashCode());
        name1 = name1.concat(" patel");
        System.out.println("Name1: " + name1 + "--" + name1.hashCode());

        // 2) StringBuilder / StringBuffer----Mutable operation
        StringBuilder sb = new StringBuilder("vrutik");
        StringBuffer sb1 = new StringBuffer("vrutik");
        System.out.println(sb + "----" + sb.hashCode());
        sb.append(" patel");
        System.out.println(sb + "----" + sb.hashCode());
    }
}