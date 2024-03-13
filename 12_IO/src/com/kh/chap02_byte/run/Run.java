package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class Run {

	public static void main(String[] args) {

		
//		바이트 기반 스트림 ?
//		바이트 스트림 : 1byte 단위로 입출력 할 수 있는 스트림(통로)
//					ex) (xxxInputStream / xxxOutputStream)
//
//		기반 스트림 : 외부매체와 직접적으로 연결되는 통로
//		
//		바이트 기반 스트림 : 외부매체를 지정하고, 직접적으로 연결되는 1byte단위의 통로
//		
//		xxxInputStream : xxx매체로부터 데이터를 "입력"받는 통로를 열겠다.(데이터를 읽어들임)
//		xxxOutputStream : xxx매체로부터 데이터를 "출력"하는 통로를 열겠다.(외부매체로 데이터를 내보냄)
		
		
		
		
		FileByteDao fdb = new FileByteDao();
		
		//fdb.filesave();
		
		fdb.fileread();
		
		
		
		
		
		
		
		
		
		
	}

}
