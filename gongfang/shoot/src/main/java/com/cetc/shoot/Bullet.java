package com.cetc.shoot;

public class Bullet extends FlyingObject{
	
	private int speed = 3; //走步步数
	
	/** 构造方法   x:子弹的x坐标   y:子弹的y坐标*/
	public Bullet(int x,int y){
		image = ShootGame.bullet; //图片
		this.x = x; //x坐标:与英雄机有关
		this.y = y; //y坐标:与英雄机有关
	}

}
