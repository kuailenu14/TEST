package com.java1995;

import java.util.Scanner;

public class Game {
	private Player player;
	
	
	public Game(Player player){
		this.player=player;
	}
	public void Start(){
		System.out.println("开始游戏");
		System.out.println("欢迎"+player.getName()+"进入游戏，当前积分为"+player.getJifen());
		String[] arr= new String[]{"剪刀","石头","布"};
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.print("请输入剪刀、石头、布");
		String s1=sc.next();
		int count=(int )Math.random()*3;
		String s2=arr[count];
		int flag=rule(s1,s2);
		if(flag>0){
			System.out.println("恭喜你"+player.getName()+"赢了，奖励10积分");
			player.setJifen(player.getJifen()+10);
		}
		else if(flag<0){
			System.out.println("对不起"+player.getName()+"输了，扣除10积分");
			player.setJifen(player.getJifen()-10);
		}
		else{
			System.out.println("平局");
		}
		System.out.println("您的积分为"+player.getJifen());
		}
	}
	public int rule(String s1,String s2){
		if(s1.equals(s2)){
			return 0;
		}
		if(s1.equals("剪刀")){
			if(s2.equals("石头")){
				return -1;
			}
			if(s2.equals("布")){
				return 1;
			}
		}
		if(s1.equals("石头")){
			if(s2.equals("剪刀")){
				return 1;
			}
			if(s2.equals("布")){
				return -1;
			}
		}
		if(s1.equals("布")){
			if(s2.equals("剪刀")){
				return -1;
			}
			if(s2.equals("石头")){
				return 1;
			}
		}
		return 0;
	}
	
}
