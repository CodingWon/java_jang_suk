package ch9_java_lang_package_useful_class;

final class Card {
    String kind;
    int num;

    Card(){
        this("SPADE",1);
    }

    Card(String kind, int num){
        this.kind = kind;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Card{" +
                "kind='" + kind + '\'' +
                ", num=" + num +
                '}';
    }
}



public class ClassEx1 {
    public static void main(String[] args) {
        Card c = new Card("HEART",3);
        Card c2;
        try {
            c2 = Card.class.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Class cObj = c.getClass();

        System.out.println("c : " + c);
        System.out.println("c2 : " + c2);
        System.out.println("cObj.getName() : " + cObj.getName());
        System.out.println("cObj.toGenericString() : " +  cObj.toGenericString());
        System.out.println("cObj.toString() : " + cObj.toString());

    }
}
