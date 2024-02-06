package ch8_Exception_Handling;

public class NewExceptionTest {

    public static void main(String[] args) {
    		method1();
    }

    
    static void method1(){
        try{
        	NewExceptionTest.startInstall();			// 프로그램 설치에 필요한 준비를 한다.
            copyFiles();			// 파일을 복사한다.
        }catch (SpaceException e){
            System.out.println("에러 메시지 : " + e.getMessage());
        	e.printStackTrace();
        	System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        }catch (MemoryException me){
            System.out.println("에러 메시지 : " + me.getMessage());
        	me.printStackTrace();
        	System.gc();			// Garbage Collection 을 수행하여 메모리를 늘려준다.
        	System.out.println("다시 설치를 시도하세요");
        }finally {
            deleteTempFiles();  // Exception 이 걸리든 안걸리든 무조건 실행 되어야함
        }
    }


    static void startInstall() throws SpaceException, MemoryException{

    	if(!enoughSpace()) throw new SpaceException("설치할 공간이 없습니다.");
    	if(!enoughMemory()) throw new MemoryException("메모리가 부족합니다.");
    }

    static void copyFiles(){
        System.out.println("파일 복사...");
        /* 파일들을 복사하는 코드를 적는다. */
    }

    static void deleteTempFiles(){
        System.out.println("임시 파일 삭제...");
        /* 임시파일들을 삭제하는 코드를 적는다.*/
    }
    
    
    static boolean enoughSpace() {
    	// 설치하는데 필요한 공간이 있는지 확인하는 코드작성
    	
    	return false;
    }
    
    static boolean enoughMemory() {
    	// 설치하는데 필요한 메모리공간이 있는지 확인하는 코드작성
    	
    	return false;
    }
}

class SpaceException extends Exception{
	
	private final int ERR_CODE = 400;
	
	public SpaceException(String msg) {
		super(msg);
	}
	
	
	public int getErrCode() {
		return ERR_CODE;
	}
}


class MemoryException extends Exception{
	private final int ERR_CODE = 300;
	
	public MemoryException(String msg){
		super(msg);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
	
}