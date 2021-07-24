
public class Level {
	
	private Handler handler;
	private HUD hud;
	boolean hasRendered = true;
	boolean isReady = false;
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
		System.out.println("Level " + level);
		int enemies = handler.countEnemies();
		if (enemies <= 0) {
			
			handler.removeAllObjects();
			hasRendered = false;
		}
		if (level == 1 && !hasRendered && isReady) {
			
			handler.addObject(new Player(0, 0, ID.Player, Game.WIDTH, Game.HEIGHT));
			
			
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			hasRendered = true;
			isReady = false;
			handler.countEnemies();
			
		}
		
		
	}
	public void ready() {
		isReady = true;
	}

}
