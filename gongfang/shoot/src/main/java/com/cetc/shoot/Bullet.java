package com.cetc.shoot;

public class Bullet extends FlyingObject{
	
	private int speed = 3; //�߲�����
	
	/** ���췽��   x:�ӵ���x����   y:�ӵ���y����*/
	public Bullet(int x,int y){
		image = ShootGame.bullet; //ͼƬ
		this.x = x; //x����:��Ӣ�ۻ��й�
		this.y = y; //y����:��Ӣ�ۻ��й�
	}

}
