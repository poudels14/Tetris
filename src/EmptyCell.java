import java.awt.Color;
import java.awt.Graphics;


public class EmptyCell implements Cell{
	private int size;
	private Color color;
	private int POS_X = 0;
	private int POS_Y = 0;
	
	public EmptyCell(int x, int y, int s, Color c){
		POS_X = x;
		POS_Y = y;
		size = s;
		color = c;
	}
	
	public void draw(Graphics g){
		g.setColor(color);
		g.drawRect(POS_X, POS_Y, size, size);
	}
	
	public int getI(){
		return (POS_X / size);
	}
	
	public int getJ(){
		return (POS_Y / size);
	}
}
