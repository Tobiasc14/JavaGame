import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullets extends GameObject{
	
	int time = (int) System.currentTimeMillis();
	int curTime = 0;
	public boolean timedOut = false;

	
	public Bullets(int xp, int yp, ID id, int gameWidth, int gameHeight, int xt, int yt) {
		super(xp+12, yp+28, id, gameWidth, gameHeight);
		
		int velocity = 7;
		double theta = 0;
				
		double tempX = xt-12-xp;
		double tempY = yt-28-yp;
		theta = Math.atan(tempY/tempX);
		
		if(tempX<0){
			velocity=-7;
		}
		velocityX = (int) (velocity*Math.cos(theta));
		velocityY = (int) (velocity*Math.sin(theta));
		velocityX = Game.clamp(velocityX, -7, 7);
		velocityY = Game.clamp(velocityY, -7, 7);
	}

	@Override
	public void tick() {
		curTime = (int) System.currentTimeMillis();
		//removes bullet after x time
		if (curTime-time>5500){
			this.setID(ID.TimedOut);
		}
		// TODO Auto-generated method stub
		x+=velocityX;
		y+=velocityY;
		
		x = Game.clamp(x, 0, gameWidth-11);
		y = Game.clamp(y, 0, gameHeight-40);
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(x, y, 5, 5);
	}

	@Override
	public Rectangle getBounds() {
		Rectangle bounds = new Rectangle();
		bounds.setBounds(x, y, 5, 5);
		return bounds;
	}

}
