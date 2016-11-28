package com.java1995;

import java.util.Scanner;

public class Game {
	private Player player;
	
	
	public Game(Player player){
		this.player=player;
	}
	public void Start(){
		System.out.println("��ʼ��Ϸ");
		System.out.println("��ӭ"+player.getName()+"������Ϸ����ǰ����Ϊ"+player.getJifen());
		String[] arr= new String[]{"����","ʯͷ","��"};
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.print("�����������ʯͷ����");
		String s1=sc.next();
		int count=(int )Math.random()*3;
		String s2=arr[count];
		int flag=rule(s1,s2);
		if(flag>0){
			System.out.println("��ϲ��"+player.getName()+"Ӯ�ˣ�����10����");
			player.setJifen(player.getJifen()+10);
		}
		else if(flag<0){
			System.out.println("�Բ���"+player.getName()+"���ˣ��۳�10����");
			player.setJifen(player.getJifen()-10);
		}
		else{
			System.out.println("ƽ��");
		}
		System.out.println("���Ļ���Ϊ"+player.getJifen());
		}
	}
	public int rule(String s1,String s2){
		if(s1.equals(s2)){
			return 0;
		}
		if(s1.equals("����")){
			if(s2.equals("ʯͷ")){
				return -1;
			}
			if(s2.equals("��")){
				return 1;
			}
		}
		if(s1.equals("ʯͷ")){
			if(s2.equals("����")){
				return 1;
			}
			if(s2.equals("��")){
				return -1;
			}
		}
		if(s1.equals("��")){
			if(s2.equals("����")){
				return -1;
			}
			if(s2.equals("ʯͷ")){
				return 1;
			}
		}
		return 0;
	}
	
}
