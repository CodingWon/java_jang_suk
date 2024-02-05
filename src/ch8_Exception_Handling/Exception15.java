package ch8_Exception_Handling;

import java.io.File;

public class Exception15 {

	public static void main(String[] args) {
		
		String fileName = "";
		try {
			
			if(args.length <= 0) 
				throw new Exception("파일 이름이 유효하지 않습니다.");
			fileName = args[0];
		}catch (Exception e) {
			e.printStackTrace();
			fileName = "제목없음.txt";
		}
		
		File f = createFile(fileName);
		System.out.println(f.getName() + " 파일이 성공적으로 생성되었습니다.");
	}

	
	private static File createFile(String fileName) {

		try {
			if(fileName.equals("") || fileName == null ) throw new Exception("파일의 이름이 유효하지 않습니다.");
		} catch(Exception e) {
			fileName = "제목없음.txt";
		}finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}

	private static void createNewFile(File f) {
		try {
			f.createNewFile();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
