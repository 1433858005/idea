package com.cetc.shoot;

public interface Award {
	
	public int DOUBLE_FIRE = 0; //火力
	public int LIFE = 1; //命
	
	/** 获取奖励类型 0为火力 1为命 */
	public int getType();


}
