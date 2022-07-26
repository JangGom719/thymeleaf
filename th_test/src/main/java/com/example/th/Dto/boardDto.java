package com.example.th.Dto;

public class boardDto {

	private int num;
	private String title;
	private String contents;
	private String date;
	public boardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boardDto(int num, String title, String contents, String date) {
		super();
		this.num = num;
		this.title = title;
		this.contents = contents;
		this.date = date;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
