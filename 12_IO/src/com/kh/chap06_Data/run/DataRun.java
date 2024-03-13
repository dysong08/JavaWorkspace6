package com.kh.chap06_Data.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataRun {

	public static void main(String[] args) {

		DataRun dr = new DataRun();
		dr.test2();
		
		// 아래 test1() 메서드 실행시  
		// 1) 메서드명에 static을 넣어 main과 동일하게 static으로 만들던지
		// 2) 자기자신을 객체로 만들어서 메서드를 호출해야 함
		
	}
	
	
	
		public void test1() {
			// DataOutputStream : 기본자료형 + 문자열 값을 출력할 수 있도록 도와주는 보조스트림
			// FileOutputStream : 
			
			File f = new File("sample.dat");
			
			try(DataOutputStream dos = new DataOutputStream( new FileOutputStream(f))){
				
				// 자바의 기본자료형 별로 작성기능을 지원함
				dos.writeBoolean(true);
				dos.write(300);
				dos.writeDouble(3.14);
				dos.writeChar('안');
				dos.writeChar('녕');
				dos.writeUTF("자바자바자바");

				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("작업종료");
			
		}
		
		public void test2() {

			File f = new File("sample.dat");

			try (DataInputStream dis = new DataInputStream(new FileInputStream(f))) {

				// write한 자료명 순서대로 읽어와야 함
				System.out.println(dis.readBoolean());
				System.out.println(dis.readInt());
				System.out.println(dis.readDouble());
				System.out.println(dis.readChar());
				System.out.println(dis.readChar());
				System.out.println(dis.readUTF());
				System.out.println(dis.readUTF());
				
		// java.io.EOFException : 더이상 읽어들일 데이터가 없으면 발생하는 에러 		

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		
		
		
		
		
		
		
		
		
		
		
	

}
