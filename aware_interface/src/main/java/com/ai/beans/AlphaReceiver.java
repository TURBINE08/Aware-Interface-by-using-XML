package com.ai.beans;

public class AlphaReceiver implements IReceiver{

	@Override
	public void tune(int frequency) {
		System.out.println("tuening on alpha receiver at frequency " + frequency );
		
	}

}
