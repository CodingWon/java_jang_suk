package ch8_Exception_Handling;

public class FincallyTest {
    public static void main(String[] args) {
        FincallyTest.method1();
    }

    static void method1(){
        try{
            startInstall();
            copyFiles();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            deleteTempFiles();  // Exception 이 걸리든 안걸리든 무조건 실행 되어야함
        }
    }


    static void startInstall(){
        System.out.println("프로그램 설치...");
        /* 프로그램 설치에 필요한 준비를 하는 코드를 적는다. */
    }

    static void copyFiles(){
        System.out.println("파일 복사...");
        /* 파일들을 복사하는 코드를 적는다. */
    }

    static void deleteTempFiles(){
        System.out.println("임시 파일 삭제...");
        /* 임시파일들을 삭제하는 코드를 적는다.*/
    }
}
