package com.kh.practice.score.controller;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.kh.practice.score.model.dao.ScoreDAO;

public class ScoreController {

	
	private ScoreDAO sd = new ScoreDAO();
	
	
	
	public void saveScore(String name, int kor, int math, int eng, int sum, double avg) {
		// 매개변수를 DAO에 전달
		
		sd.saveScore(name, kor, eng, math, sum, avg);
		
	}
	
	
	
	public DataInputStream readScore()  throws FileNotFoundException {
		// DAO에 반환 값을 그대로 반환
		
		
		return sd.readScore();
	}
	
	
	
	
}
