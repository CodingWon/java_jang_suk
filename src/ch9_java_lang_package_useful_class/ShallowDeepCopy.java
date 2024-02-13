package ch9_java_lang_package_useful_class;


class Circle implements Cloneable{

    Point2 p;
    double r;

    Circle(Point2 p, double r){
        this.p = p;
        this.r = r;
    }
    public Circle shallowCopy() { // 얕은 복사
        Object obj = null;
        try {
            obj = super.clone();
        }catch (CloneNotSupportedException e){ }
        return (Circle)obj;
    }
    public Circle deepCopy(){   //깊은 복사
        Object obj = null;

        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){}

        Circle c = (Circle) obj;
        c.p = new Point2(this.p.x , this.p.y);

        return  c;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "p=" + p +
                ", r=" + r +
                '}';
    }
}

class Point2 {
    int x;
    int y;

    Point2(int x,int y){
        this.x =x;
        this.y =y;
    }

    @Override
    public String toString() {
        return "Point2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point2(1,1),2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);
        System.out.println("c3 : " + c3);

        System.out.println("c1 : " + c1.hashCode());
        System.out.println("c2 : " + c2.hashCode());
        System.out.println("c3 : " + c3.hashCode());

        c1.p.x = 9;
        c1.p.y = 9;

        System.out.println("after c1 : " + c1);
        System.out.println("after c2 : " + c2);
        System.out.println("after c3 : " + c3);

    }
}
