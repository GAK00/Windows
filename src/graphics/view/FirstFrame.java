package graphics.view;

import java.awt.Dimension;

import graphics.controller.GraphicsController;

import javax.swing.JFrame;

public class FirstFrame extends JFrame
{
	private GraphicsController controller;
	private FirstPanel windowPanel;

	public FirstFrame(GraphicsController controller)
	{
		super();
		this.controller = controller;
		windowPanel = new FirstPanel(controller); 
		
		setup();
	}

	private void setup()
	{
		this.setContentPane(windowPanel);
		this.setTitle("Window");
		this.setSize(new Dimension(500,500));
		this.setVisible(true);
	}
}
