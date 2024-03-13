package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object) : 데이터가 보관되어 있는 공간과 직접 접근해서 데이터를 입,출력할 수 있는 클래스

public class FileByteDao {

	
	// 현재 프로그램 --> 외부매체(파일)
	// == 출력 : 프로그램 내의 데이터를 파일로 내보내기 (파일에 저장)
	public void filesave() {
		
		
//		FileOutputStream : "파일"로 데이터를 1byte단위로 출력하는 스트림
		
		FileOutputStream fos = null;
		
		
//		1. FileOutputStream 객체 생성 => 매개변수로 지정한 파일과 직접적으로 연결되는 통로를 만듬.
//			해당 파일이 존재하지 않으면 해당 파일이 생성되면서 통로가 연결됨. (무조건 파일이 생성됨)
//			이미 존재하는 파일이라면 즉시 통로가 연결됨.
		
		try {
			
//			fos = new FileOutputStream("a_byte.text");		// 객체생성 후 덮어씌우기
			fos = new FileOutputStream("a_byte.txt", true);		// 이어쓰기
		
//			두번째 매개변수로 true 추가시 -> 기존에 해당파일이 있을 경우 "이어쓰기" 가능
//			두번째 매개변수 미작성시 		-> 기존에 해당파일이 있더라도 "덮어씌우기"
		
		
//		2. 연결통로로 데이터를 내보내기(출력) : write()메서드 
//			1byte의 범위 : -128 ~ 127까지의 범위(파일에 기록이 될때 해당 숫자의 고유한 문자가 기록됨)
			
			fos.write(97);		// a
			fos.write('b');		// b
		
		
			byte[] arr = { 99, 100, 101 };
			fos.write(arr);
			fos.write(arr, 1, 2);	// 1번 인덱스부터 2개만 기록해라. 100, 101
			
			
//			3. 스트림을 사용했으면 반드시 자원 반납하기
//			fos.close();	// 위 코드에서 에러가 발생하는 경우 실행이 안될 수 있다.
//								따라서, catch문 마지막에 기술해야 한다.
			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally { // 어떤 예외가 발생하던지 간에 반드시 실행하는 구문.
			
			try {
				fos.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	
	// 외부매체(파일) ---> 프로그램
	// == 입력 : 파일로부터 데이터를 읽어들이겠다.
	public void fileread() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트씩 입력받는 스트림.
		FileInputStream fis = null;
		
		try {
			// 1. FileInputStream 객체로 입력스트림 생성
			fis = new FileInputStream("a_byte.text");  // 실제 존재하는 파일의 경로 제시해야 함
			
			// 2. 통로로 데이터 입력받기
//			System.out.println(fis.read());		// .read() : 1byte단위로 하나씩 읽어들이는 함수
//			System.out.println((char)fis.read());		
//			System.out.println(fis.read());		
//			System.out.println(fis.read());		// 파일에서 더 읽어올 데이터가 없는 경우 -1을 반환함.
			
		// 반복문을 활용하여 파일내부의 모든 데이터 읽어들이기
			
		// 방법1
//			while(true) {
//				int value = 0;
//				value = fis.read();
//				
//				if(value == -1) break;
//				System.out.print((char)value);
//			}
			
		// 방법2 	
			int value = 0;
		
			while((value = fis.read()) != -1) {
				System.out.print((char)value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 3. 다쓴 자원 반납
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
			
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
