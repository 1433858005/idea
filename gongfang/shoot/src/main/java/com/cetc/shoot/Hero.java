package com.cetc.shoot;

import java.awt.image.BufferedImage;

/** Ӣ�ۻ�: �Ƿ����� */
public class Hero extends FlyingObject {
	private int life; //��
	private int doubleFire; //����ֵ
	private BufferedImage[] images = {}; //ͼƬ�л�����
	private int index = 0; //Э��ͼƬ�л�
	
	/** ���췽�� */
	public Hero(){
		image = ShootGame.hero0; //ͼƬ
		width = image.getWidth();   //��
		height = image.getHeight(); //��
		x = 150; //x����:�̶���ֵ
		y = 400; //y����:�̶���ֵ
		life = 3; //����Ϊ3
		doubleFire = 0; //����ֵΪ0(��������)
		images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1}; //����ͼƬ�л�
	}

	
}

