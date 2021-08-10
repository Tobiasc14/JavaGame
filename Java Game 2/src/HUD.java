import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Objects;

public class HUD {
	
	int health = 200;
	private Handler handler;
	private Level level;
	long curTime = System.currentTimeMillis();
	int score = 0;
	int levelName;
	
	
	
	public HUD(Handler handler, Level level){
		this.handler = handler;
		this.level = level;
		
	}
	public void restoreHealth(){
		health = 200;
	}
	
	public void tick(){
		
		if(handler.isAlive() && handler.enemies){
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
		if (Objects.isNull(level)) {
			levelName = 1;
		}
		else {
			levelName = level.level + 1;
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
		
		if(handler.alive || health>=0){
			g.setColor(Color.GRAY);
			g.setFont(new Font("Verdana", Font.BOLD, 18));
			g.drawString("Score:" + score, 220, 30);
			
			//g.drawString("Level:" + levelName, Game.WIDTH - 100, 30);
			
			
		}
		
		if(!handler.alive){
			curTime = System.currentTimeMillis();
			handler.scoreBonus=0;
			g.setColor(Color.red);
			Font font1 = new Font("Verdana", Font.BOLD, 34);
			g.setFont(font1);
			g.drawString("You Died!", Game.WIDTH/2,Game.HEIGHT/2);			
			g.setFont(new Font("Verdana", Font.BOLD, 12));
			g.drawString("press R to Respawn", Game.WIDTH/2,Game.HEIGHT/2+30);
			g.drawString("press T to Start Over", Game.WIDTH/2,Game.HEIGHT/2+45);
		}
		if(!handler.enemies) {
			curTime = System.currentTimeMillis();
			g.setColor(Color.red);
			Font font1 = new Font("Verdana", Font.BOLD, 34);
			g.setFont(font1);
			g.drawString("You Won!", Game.WIDTH/2,Game.HEIGHT/2);	
			g.setFont(new Font("Verdana", Font.BOLD, 12));
			g.drawString("Press 'N' for Next Level", Game.WIDTH/2,Game.HEIGHT/2+30);
		}
	}

}
