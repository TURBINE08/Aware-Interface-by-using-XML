package com.ai.beans;

public class GammaReceiver implements IReceiver 
{

	@Override
	public void tune(int frequency) {
		System.out.println("tuening on gamma receiver at frequency " + frequency );
		
	}

}
