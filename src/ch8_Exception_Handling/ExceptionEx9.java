package ch8_Exception_Handling;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            //Exception e = new Exception("고의로 발생");
            //throw e;
            throw new Exception("고의로 발생시킴");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 정상 종료");
    }
}
