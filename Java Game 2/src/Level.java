
public class Level {
	
	private Handler handler;
	private HUD hud;
	boolean levelWon = false;
	int level = 0;
	
	Object tempObject;
	
	
	
	public Level(Handler handler,  HUD hud){
		this.handler = handler;
		this.hud = hud;
		
		handler.addObject(new Player(0, 0, ID.Player, Game.WIDTH, Game.HEIGHT));
		
		
		handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
		handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
		handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
		handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
		handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
		
		handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
		
		
		
	}
	public void tick(){
		//this section needs a lot of work
		
		
	}

}
