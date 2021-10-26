package com.cetc.shoot;

public class Airplane extends FlyingObject implements Enemy{


	private int speed = 2; //????????
	
	/** ??дgetScore() */
	public int getScore(){
		return 0;
	}
	
	/** ?????? */
	public Airplane(){
		image = ShootGame.airplane; //??
		width = image.getWidth();   //??
		height = image.getHeight(); //??
//       x = (int) (Math.random()*(ShootGame.WIDTH-this.width));
//		y = -this.height; //y:????л????
		x=100;
		y=100;

	}


}
