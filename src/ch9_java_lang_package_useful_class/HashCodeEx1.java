package ch9_java_lang_package_useful_class;

public class HashCodeEx1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));

        /*
        String 객체는 hashcode 가 오버라이딩 되어 있어서
        문자열이 같으면 같은 hashCode 값을 반환한다.
        */
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }

}
