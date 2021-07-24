import java.awt.Graphics;
import java.util.LinkedList;

//updates and maintains objects which exist in the game
public class Handler {

	//creates list of game objects called object
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	boolean alive = true;
	int scoreBonus = 0;

	public boolean isAlive(){
		return alive;
	}
	public void setLifeStatus(Boolean lifeStatus){
		alive = lifeStatus;

	}
	public int findPlayer(){
		int location = 0;
		for(int i= 0; i < this.object.size(); i++ ){
			if(object.get(i).getID().equals(ID.Player)){
				location = i;
			}
		}
		return location;
	}

	public void tick(){
		//iterate through list of game objects, to update them accordingly
		//by making them tick
		for(int i = 0; i < object.size();i++){
			GameObject tempObject = object.get(i);
			tempObject.tick();
			for(int j = 0; j < object.size(); j++){
				GameObject tempObject2 = object.get(j);


				if(tempObject.id.equals(ID.TimedOut)){
					removeObject(tempObject);
				}


				//IF Barrier...
				if(tempObject.id.equals(ID.Barrier)){
					if(tempObject.getX()<30 || tempObject.getY()<60){
						removeObject(tempObject);
					}
				}



				//IF Player...
				if(tempObject.id.equals(ID.Player)&&!tempObject2.getID().equals(ID.Player)){
					//Collides with barrier
					if(tempObject2.getID().equals(ID.Barrier)&&tempObject.getBounds().intersects(tempObject2.getBounds())){

						tempObject.setX(tempObject.x-tempObject.getVelocityX());
						tempObject.setY(tempObject.y-tempObject.getVelocityY());

					}
					//Is dead
					if(!this.isAlive()){
						object.remove(tempObject);
					}

				}
				//IF Bullet...
				if(tempObject.getID().equals(ID.Bullet)&&!tempObject2.getID().equals(ID.Bullet)){


					//collides with edge of game
					if(tempObject.getX()>Game.WIDTH-12||tempObject.getX()<2){
						removeObject(tempObject);

					}
					if(tempObject.getY()>Game.HEIGHT-41||tempObject.getY()<5){
						removeObject(tempObject);

					}	
					//collides with another gameObject
					if(tempObject2.getBounds().intersects(tempObject.getBounds())){

						if(tempObject.getBounds().intersects(tempObject2.getBounds())&& tempObject2.getID().equals(ID.Barrier)){
							tempObject.setX(tempObject.x-tempObject.getVelocityX());


							if(tempObject.getBounds().intersects(tempObject2.getBounds())){
								tempObject.setY(tempObject.y-tempObject.getVelocityY());
								tempObject.setVelocityY(-tempObject.velocityY);

							}
							else{
								tempObject.setVelocityX(-tempObject.velocityX);
							}




						}
						//tempObject.setVelocityX(-tempObject.velocityX);
						//removeObject(tempObject);

						else if(tempObject2.getID().equals(ID.BasicEnemy)){
							removeObject(tempObject);
							removeObject(tempObject2);
							scoreBonus = scoreBonus+10;

						}
					}
				}
				//IF Enemy...
				if(tempObject.getID().equals(ID.BasicEnemy)&&!tempObject2.getID().equals(ID.BasicEnemy)){
					//Collides with a Barrier This is important collision detection and adjustment
					if(tempObject.getBounds().intersects(tempObject2.getBounds())&& tempObject2.getID().equals(ID.Barrier)){
						tempObject.setX(tempObject.x-tempObject.getVelocityX());


						if(tempObject.getBounds().intersects(tempObject2.getBounds())){
							tempObject.setY(tempObject.y-tempObject.getVelocityY());
							tempObject.setVelocityY(-tempObject.velocityY);

						}
						else{
							tempObject.setVelocityX(-tempObject.velocityX);
						}




					}
				}


			}
		}



	}


	public void render(Graphics g){
		//same as in tick method
		for(int i = 0; i < object.size(); i ++){
			GameObject tempObject = object.get(i);
			tempObject.render(g);
		}
	}


	public void addObject(GameObject object){
		this.object.add(object);
	}

	public void removeObject(GameObject object){
		this.object.remove(object);
	}
}
