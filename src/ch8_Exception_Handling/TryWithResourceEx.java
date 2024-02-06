package ch8_Exception_Handling;

public class TryWithResourceEx {
    public static void main(String[] args) {

        /*정상 close */
        try (CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(false);
        }catch (WorkException e){
            e.printStackTrace();
        }catch (CloseException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        /* 비정상 close case */
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true);
        }catch (WorkException e){
            e.printStackTrace();
        }catch (CloseException e){
            e.printStackTrace();
        }
    }
}

class CloseableResource implements AutoCloseable{

    public void exceptionWork(boolean exception) throws WorkException{
        System.out.println("exceptionWork ("+exception+") 가 호출됨");
        if(exception) throw new WorkException("WorkException 발생 !!!");
    }

    @Override
    public void close() throws CloseException {
        System.out.println("close() 가 호출됨");
        throw new CloseException("CloseException 발생!!!");


    }
}

class WorkException extends Exception{
    WorkException(String msg){ super(msg);}
}

class CloseException extends Exception{
    CloseException(String msg) {super(msg);}
}
