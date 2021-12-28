
public class Level {

	private Handler handler;
	private HUD hud;
	boolean hasRendered = true;
	boolean isReady = false;
	boolean restart = false;
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
		hasRendered = true;
		isReady = false;

		


//Nothing Changed, just checking git
	}
	public void tick(){
		//need to update barrier spawning in game
		//System.out.println("Level " + level);
		 
		
		int enemies = handler.countEnemies();
		if (enemies <= 0) {

			handler.removeAllObjects();
			hasRendered = false;
			hud.levelName++;
			
			
			
		}
		if (level == 0 && restart) {
			System.out.println(handler.countEnemies());
			handler.removeAllObjects();
			System.out.println(handler.countEnemies());
			handler.addObject(new Player(0, 0, ID.Player, Game.WIDTH, Game.HEIGHT));


			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));

			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			
			hasRendered = true;
			isReady = false;
			//handler.countEnemies();
			restart = false;
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
		if (level == 2 && !hasRendered && isReady) {

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
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));

			hasRendered = true;
			isReady = false;
			handler.countEnemies();

		}
		if (level == 3 && !hasRendered && isReady) {

			handler.addObject(new Player(0, 0, ID.Player, Game.WIDTH, Game.HEIGHT));


			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));

			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));

			hasRendered = true;
			isReady = false;
			handler.countEnemies();

		}
		if (level == 4 && !hasRendered && isReady) {

			handler.addObject(new Player(0, 0, ID.Player, Game.WIDTH, Game.HEIGHT));


			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));
			handler.addObject(new Barrier(0,0, ID.Barrier, Game.WIDTH, Game.HEIGHT));

			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));
			handler.addObject(new BasicEnemy(Game.WIDTH/2, Game.HEIGHT/2, ID.BasicEnemy, Game.WIDTH, Game.HEIGHT, 100));

			hasRendered = true;
			isReady = false;
			handler.countEnemies();
			
		}
		if (level == 4 && !hasRendered && isReady) {
			
		}


	}




	public void ready() {
		isReady = true;
	}

}
