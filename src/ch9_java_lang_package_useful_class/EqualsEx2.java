package ch9_java_lang_package_useful_class;

import java.util.Objects;

public class EqualsEx2 {

    public static void main(String[] args) {
        Person p1 = new Person(12345);
        Person p2 = new Person(12345);


        if(p1 == p2){
            System.out.println("p1과 p2는 같은 사람입니다.");
        }else{
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
        if(p1.equals(p2)){
            System.out.println("p1과 p2는 같은 사람입니다.");
        }else{
            System.out.println("p1과 p2는 다른 사람입니다.");
        }

        System.out.println("Hash Code 오버라이딩 후 데이터");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println();
        System.out.println("객체 기존 HashCode");
        System.out.println(System.identityHashCode(p1));
        System.out.println(System.identityHashCode(p2));


    }


}

class Person {
    long id;


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean equals(Object obj){
        if(obj != null && obj instanceof Person){
            return this.id == ((Person)obj).id;
        } else{
            return false;
        }
    }
    Person (long id){
        this.id =id;
    }
}



