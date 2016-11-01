package graphics.view;

import graphics.controller.GraphicsController;

import javax.swing.JFrame;

public class FirstFrame extends JFrame
{
	private GraphicsController controller;
	
	
	public FirstFrame(GraphicsController controller){
		super();
		this.controller = controller;
	}
}
