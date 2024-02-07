package ch8_Exception_Handling;

public class ChainedExceptionEx {

    public static void main(String[] args) {
        try {
            install();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void install() throws InstallException{
        try {
            startInstall();
            copyFile();
        }catch (SpaceException2 e){
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(e);
            throw ie;
        } catch (MemoryException2 me){
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(me);
            throw ie;
        }finally {
            deleteTempFiles();
        }
    }
    static void startInstall() throws SpaceException2,MemoryException2{
        if(!enoughSpace()) throw new SpaceException2("설치 공간이 부족합니다."); // 충분한 설치 공간이 없으면 ...
        if(!enoughMemory()) throw new MemoryException2("메모리가 부족합니다.");
    }
    static boolean enoughSpace(){
        return false;
    }
    static boolean enoughMemory(){
        return false;
    }
    static void copyFile() {}
    static void deleteTempFiles(){}
}

class InstallException extends Exception{
    InstallException(String msg){
        super(msg);
    }
}

class SpaceException2 extends Exception{
    SpaceException2(String msg){
        super(msg);
    }
}

class MemoryException2 extends Exception{
    MemoryException2(String msg){
        super(msg);
    }
}
