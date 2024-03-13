package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {

	// 프로그램 ---> 외부매체(파일)
	
	public void filesave() {
		
		// FileWriter : 파일로 데이터를 2byte씩 출력하는 스트림
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt");
			
			
			fw.write("ABCDE\n");
			fw.write("송다연\n");
			fw.write("와!! io 어렵다");
			fw.write("푸바오 보고싶다");
			
			fw.write('a');
			fw.write('b');
			
			char[] cArr = {'a', 'p', 'p', 'l','e'};
			fw.write(cArr);
			
			fw.flush(); 	// 스트림내부에 잔존하는 데이터를 외부매체로 보내기
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fw.close();		// .flush() 함수 자동 호출
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	// 프로그램 <--- 파일
	public void fileread() {
		
		// FileReader : 파일로부터 데이터를 2byte단위로 입력받는 스트림
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
//			System.out.print((char)fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
//			System.out.println(fr.read());
			
			
			int value = 0;
			while( (value = fr.read()) != -1) {
				System.out.print((char) value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
