package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {

	
	// 프로그램 ---> 파일(외부매체)
	public void fileSave() {
		
		// 보조스트림을 활용한 파일 저장메서드 작업순서
		
//		1) 기반스트림 객체 생성
//		기반스트림이 Reader / Writer 계열이면 보조스트림도 Reader / Writer // 문자기반
//		기반스트림이 InPut / OutPut 계열이면 보조스트림도 InPut / OutPut  // byte기반
		
		//FileWriter fw = new FileWriter("c_buffer.txt");
		
		
//		2) 보조스트림 객체 생성
//		BufferedWriter bw = null;
		
		//bw = new BufferedWriter(fw);
		
		
//	1)기존 방법
		
//		try {
//			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
//			
//			bw.write("안녕하세요");
//			bw.newLine();	// 개행을 넣어주는 메서드 (직접 \n 개행문자 넣어도 되지만 메서드 활용하기)
//			bw.write("반갑습니다 \n");
//			bw.write("안녕히 가세요");
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bw.close();		// 보조스트림 close시 기반스트림도 함께 close됨.
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		// try ~ with ~ resource 구문. (자원의 자동반납) (자바 7버젼 이후 사용가능)
		
//		try(스트림객체생성; 스트림객체생성;) {
//			// 예외가 발생할 수 있는 구분
//		} catch (예외클래스명 e) {
//			// 예외 발생시 실행할 구문
//		}
//		
//		스트림자원을 try의 매개변수로 넣어버리면 스트림객체 생성 후 직접 자원을 반납하지 않아도
//		try블록의 구문실행 완료 후 자동으로 자원이 반납ㄴ된다.
		
		
		
//	2)	try ~ with ~ resource 구문 사용 (더 간결하게 사용가능함)
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			
			bw.write("안녕하세요");
			bw.newLine();	// 개행을 넣어주는 메서드 (직접 \n 개행문자 넣어도 되지만 메서드 활용하기)
			bw.write("반갑습니다 \n");
			bw.write("안녕히 가세요");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
		
		public void fileRead() {
			
			// FileReader
			// BufferedReader
			
			
			try(BufferedReader br = new BufferedReader( new FileReader("c_buffer.txt"))){
//				System.out.println(br.readLine());
//				System.out.println(br.readLine());
//				System.out.println(br.readLine());
//				System.out.println(br.readLine());
				
				String value = null;
				while( ( value = br.readLine() ) != null ) {	
					System.out.println(value);
				}	
			} catch (FileNotFoundException e) {
				e.printStackTrace();	
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
					
			
			
			
			
		}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
}