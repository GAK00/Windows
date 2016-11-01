package graphics.controller;

import graphics.view.FirstFrame;

public class GraphicsController {
	
	
	private FirstFrame windowFrame;
	
	
	public GraphicsController(){
		
		windowFrame = new FirstFrame(this);
	}
	
	public void start(){}

}
