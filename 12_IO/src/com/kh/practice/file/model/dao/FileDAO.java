package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	
	
	
	public boolean checkName (String file) {
		// File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌
		// 해당 파일이 있는지 없는지에 대한 boolean 값을 반환
		
		File f = new File(file);

		return f.isFile();		// .isFile() == File 존재여부 확인
		//==	f.exists();		
	}
	
	
	public void fileSave(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고
		// String에 써서 저장
		
		FileWriter fw = null;

		try {
			fw = new FileWriter(file);
		// fw에 매개변수로 받은 file명으로 File 생성함.

			fw.write(s);
			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public StringBuilder fileOpen (String file) {
		// 매개변수로 들어온 file로 파일을 찾아 StringBuilder에 값들 저장하여 반환
		
		FileReader fr = null;
		StringBuilder sb = new StringBuilder();

		try {
			fr = new FileReader(file);

			int value = 0;
			while ((value = fr.read()) != -1) {
				sb.append((char) value);
				// System.out.print((char) value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb;
	}

	
	public void fileEdit(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고
		// String에 써서 저장하되 이어서 저장될 수 있도록 함
		
		
		
		FileWriter fw = null;

		try {
			fw = new FileWriter(file,  true);
		// fw에 매개변수로 받은 file명으로 File 생성함.

			fw.write(s);
			fw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
