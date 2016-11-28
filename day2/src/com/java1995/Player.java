package com.java1995;

public class Player {
	private String name;
	private int jifen;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJifen() {
		return jifen;
	}
	public void setJifen(int jifen) {
		this.jifen = jifen;
	}
	public Player(String name,int jifen){
		super();
		this.name=name;
		this.jifen=jifen;
	}
	
	public String toString(){
		return this.getName()+":"+this.getJifen();
	}
}
