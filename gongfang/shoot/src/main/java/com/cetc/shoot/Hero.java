package com.cetc.shoot;

import java.awt.image.BufferedImage;

/** 英雄机: 是飞行物 */
public class Hero extends FlyingObject {
	private int life; //命
	private int doubleFire; //火力值
	private BufferedImage[] images = {}; //图片切换数组
	private int index = 0; //协助图片切换
	
	/** 构造方法 */
	public Hero(){
		image = ShootGame.hero0; //图片
		width = image.getWidth();   //宽
		height = image.getHeight(); //高
		x = 150; //x坐标:固定的值
		y = 400; //y坐标:固定的值
		life = 3; //命数为3
		doubleFire = 0; //火力值为0(单倍火力)
		images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1}; //两张图片切换
	}

	
}

