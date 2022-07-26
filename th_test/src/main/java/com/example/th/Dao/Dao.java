package com.example.th.Dao;

import com.example.th.Dto.memberDto;

public interface Dao {

	
	public void joinDao(String id, String pw, String name, String phone);
	//회원가입 dao
	
	public void tempinfoDao(String id);
	//임시 회원정보 dao
	
	public void infoDao(String gender, String address, String email);
	//회원정보 dao
	
	public void boardDao(String id, String title, String contents);
	//게시판 작성 dao
	
	
	
}
