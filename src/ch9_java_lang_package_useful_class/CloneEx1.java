package ch9_java_lang_package_useful_class;

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3,5);
        Point copy = (Point) original.clone();

        System.out.println(original);
        System.out.println(copy);

        /*
        * 서로 다른 hashcode 로 다른 clone 시 다른 객체가 복사되어 만들어진다.
        * */
        System.out.println(original.hashCode());
        System.out.println(copy.hashCode());
    }
}
class Point implements Cloneable {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    /*
    *
    *  protected native Object clone() throws CloneNotSupportedException;
    *  clone 은 OS가 제공해주는 interface 메소드 이다.
    *  개발자가 직접 구현할 필요가 없다.
    */

    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){}

        return obj;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
