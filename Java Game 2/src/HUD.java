import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HUD {
	
	int health = 200;
	private Handler handler;
	long curTime = System.currentTimeMillis();
	int score = 0;
	
	
	
	public HUD(Handler handler){
		this.handler = handler;
		
	}
	public void restoreHealth(){
		health = 200;
	}
	
	public void tick(){
		
		if(handler.isAlive()){
			GameObject player = handler.object.get(handler.findPlayer());
			GameObject tempObject = handler.object.get(0);
			for(int i = 0; i<handler.object.size();i++){
				tempObject = handler.object.get(i);
				if(tempObject.getID() == ID.BasicEnemy && player.getBounds().intersects(tempObject.getBounds())){
					health= health-2;
				}
			}
			if(health <=0 && handler.isAlive()){
				handler.setLifeStatus(false);
				health = 200;
				
			}
			score = handler.scoreBonus;
		}
		
		
		Game.clamp(health, 0, 200);
		
	}
	public void render(Graphics g){
		g.setColor(Color.gray);
		g.fillRect(10, 10, 200, 20);
		g.setColor(Color.green);
		g.fillRect(10, 10, health, 20);
		g.setColor(Color.white);
		g.drawRect(10, 10, 200, 20);
		if(handler.alive){
			g.setColor(Color.GRAY);
			g.setFont(new Font("Verdana", Font.BOLD, 18));
			g.drawString("Score:" + score, 220, 30);
			
		}
		
		if(!handler.alive){
			curTime = System.currentTimeMillis();
			handler.scoreBonus=0;
			g.setColor(Color.green);
			Font font1 = new Font("Verdana", Font.BOLD, 34);
			g.setFont(font1);
			g.drawString("You Died!", Game.WIDTH/2,Game.HEIGHT/2);			
			g.setFont(new Font("Verdana", Font.BOLD, 12));
			g.drawString("press R to respawn", Game.WIDTH/2,Game.HEIGHT/2+30);
		}
	}

}