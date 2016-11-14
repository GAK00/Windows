package graphics.view;

import java.awt.Dimension;

import graphics.controller.GraphicsController;

import javax.swing.JFrame;

public class FirstFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GraphicsController controller;
	private FirstPanel windowPanel;

	public FirstFrame(GraphicsController controller)
	{
		super();
		this.setController(controller);
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

	public GraphicsController getController()
	{
		return controller;
	}

	public void setController(GraphicsController controller)
	{
		this.controller = controller;
	}
}
