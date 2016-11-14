package graphics.view;

import java.awt.Color;

import graphics.controller.GraphicsController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Random;
import javax.swing.SpringLayout;

public class FirstPanel extends JPanel
{

	private GraphicsController controller;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout layout;
	private Random rand;
	private JTextField hexInput;
	

	public FirstPanel(GraphicsController controller)
	{
		super();
		this.controller = controller;
		layout = new SpringLayout();
		rand = new Random();
		colorButton = new JButton("Color!");
		hexInput = new JTextField();
		layout.putConstraint(SpringLayout.NORTH, hexInput, -1, SpringLayout.NORTH, colorButton);
		layout.putConstraint(SpringLayout.WEST, hexInput, 25, SpringLayout.EAST, colorButton);
		layout.putConstraint(SpringLayout.EAST, hexInput, 120, SpringLayout.EAST, colorButton);
		randomButton = new JButton("Random");

		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(layout);
		this.setBackground(Color.CYAN);
		this.add(colorButton);
		this.add(randomButton);
		this.add(hexInput);

	}

	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, colorButton, 56, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, colorButton, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, randomButton, 0, SpringLayout.WEST, colorButton);
		layout.putConstraint(SpringLayout.SOUTH, randomButton, -6, SpringLayout.NORTH, colorButton);
	}
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				colorButtonClicked();
			}
		});
		randomButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				colorRandomClicked();
			}
		}
				);
	}
	
	private void colorRandomClicked(){
		
		Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		this.setBackground(randomColor);
		
	}
	private void colorButtonClicked(){
		if(hexInput.getText().equals("")||hexInput.getText().equals("#")){
			this.setBackground(Color.WHITE);
		}
		else{
			String hexCode;
			if(!hexInput.getText().startsWith("#")){
				hexCode = "#"+hexInput.getText();
			}
			else{
				hexCode = hexInput.getText();
			}
		this.setBackground(Color.decode(hexCode));}
	}

}
