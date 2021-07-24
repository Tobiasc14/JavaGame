import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseInput extends MouseAdapter {
	
	
	private Handler handler;
	long timeClick;
	
	
	public MouseInput(Handler handler){
		this.handler = handler;
		timeClick = System.currentTimeMillis();
	}
	
	public void mousePressed(MouseEvent e){
		
		
		
		if (e.getButton()== 1&& handler.isAlive()&&System.currentTimeMillis()-timeClick >1500){
			//System.out.println("Left Click");
			int xp = handler.object.get(handler.findPlayer()).getX();
			int yp = handler.object.get(handler.findPlayer()).getY();
			int xt = e.getX();
			int yt = e.getY();
			handler.addObject(new Bullets(xp, yp, ID.Bullet, Game.WIDTH, Game.HEIGHT, xt, yt));
			timeClick = System.currentTimeMillis();
			
		}
		if (e.getButton()== 3){
			//System.out.println("Right Click");
		}
		if (e.getButton()== 2){
			//System.out.println("Middle Click");
		}
		
	}

}
