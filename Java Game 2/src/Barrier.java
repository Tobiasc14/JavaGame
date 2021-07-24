import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Barrier extends GameObject{
	
	int width;
	int height;

	public Barrier(int x, int y, ID id, int gameWidth, int gameHeight) {
		super((int)(Math.random()*gameWidth), (int)(Math.random()*gameHeight), id, gameWidth, gameHeight);
		width = (int) (60+Math.random()*50);
		height = 40;
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		x = this.x;
		this.setY(y);
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
		
	}

	@Override
	public Rectangle getBounds() {
		Rectangle r = new Rectangle(x,y,width,height);
		
		
		return r;
	}

}
