package com.kh.chap05_assist2.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.kh.chap05_assist2.model.vo.Phone;

public class ObjectDao {

	
	public void fileSave(String filename) {
		
		Phone ph = new Phone("010-1234-1234", "z-plip4", 600000);
		
		// 객체를 파일에 출력하고자 할 때 필요한 스트림
		// objectOutputStream : 객체단위로 출력할 수 있는 "보조" 스트림
		// FileOutPutStream : 파일에 데이터를 출력하는 기반스트림
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(filename))){
			
			oos.writeObject(ph);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1byte로 읽어들이는 기반 스트림
		// ObjectInputStream : 스트림으로부터 객체댄위로 입력받기 위해 사용되는 보조스트림
		
		try( ObjectInputStream ois = new ObjectInputStream( new FileInputStream("phone.txt"))) {
			
			Phone ph = (Phone) ois.readObject();	// 형변환
			System.out.println(ph);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
