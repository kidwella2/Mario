import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mario
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setTitle("Mario");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MarioPanel panel = new MarioPanel();
		panel.setFocusable(true);			// needed for KeyListener to work
		frame.getContentPane().add(panel);
		frame.setSize(1200, 400);
		frame.setVisible(true);
	}


	// the TypePanel will extend JPanel so we can use the Graphics class and will
	// implement MouseListener to move the cursor when the mouse is clicked and
	// KeyListener so that the user can type

	private static class MarioPanel extends JPanel implements ActionListener, KeyListener
	{
		private int x, y, dx, dy, ex, ey, ex1, ey1, gravity, ty, deaths, bx, by, bdy, bx1, 
			by1, bdy1, bx2, by2, bdy2, bx3, by3, bdy3, bx4, by4, bdy4, points, px, py;

		private boolean collide, collide0, collide2, collide21, collide22, collide23, collide24, 
			collide3, collide31, collide32, collide33, collide34, collide35, collide36, collide37, 
				collide38, collide39, collide4;
		
		public MarioPanel()
		{
			x=20;
			y=300;
			px=40;
			py=258;
			gravity=1;
			ty=200;
			dx=0;
			dy=0;
			ex=1180;
			ey=325;
			ex1=20;
			ey1=325;
			deaths=0;
			points=0;
			bx=180;
			by=210;
			bx1=380;
			by1=210;
			bx2=580;
			by2=210;
			bx3=800;
			by3=210;
			bx4=1030;
			by4=210;
			bdy=0;
			bdy1=0;
			bdy2=0;
			bdy3=0;
			bdy4=0;
			boolean collide=false;
			boolean collide0=false;
			boolean collide2=false;
			boolean collide21=false;
			boolean collide22=false;
			boolean collide23=false;
			boolean collide24=false;
			boolean collide3=false;
			boolean collide31=false;
			boolean collide32=false;
			boolean collide33=false;
			boolean collide34=false;
			boolean collide35=false;
			boolean collide36=false;
			boolean collide37=false;
			boolean collide38=false;
			boolean collide39=false;
			boolean collide4=false;				
			addKeyListener(this);
			Timer t=new Timer(20,this);
			t.start();
		}
		
		public void fall ()
    	{
        	dy = dy + gravity;
        	if (dy > ty)
       		{
            	dy = ty;
        	}
        	y = y - dy;
   		}
   		   				
   		public boolean collide(int x,int y,int ex,int ey)
		{
			if(Math.abs(x-ex)<15&&Math.abs(y-ey)<16)
				return true;
			else return false;
		}
		
		public boolean collide0(int x,int y,int ex1,int ey1)
		{
			if(Math.abs(x-ex1)<15&&Math.abs(y-ey1)<16)
				return true;
			else return false;
		}
		
		public boolean collide2(int x,int y,int bx,int by, int bdy)
		{
			if(Math.abs(x-bx)<15&&Math.abs(y-by)<20)
				return true;	
			else return false;
		}
		
		public boolean collide21(int x,int y,int bx1,int by1, int bdy1)
		{
			if(Math.abs(x-bx1)<15&&Math.abs(y-by1)<20)
				return true;	
			else return false;
		}
		
		public boolean collide22(int x,int y,int bx2,int by2, int bdy2)
		{
			if(Math.abs(x-bx2)<15&&Math.abs(y-by2)<20)
				return true;	
			else return false;
		}
		
		public boolean collide23(int x,int y,int bx3,int by3, int bdy3)
		{
			if(Math.abs(x-bx3)<15&&Math.abs(y-by3)<20)
				return true;	
			else return false;
		}
		
		public boolean collide24(int x,int y,int bx4,int by4, int bdy4)
		{
			if(Math.abs(x-bx4)<15&&Math.abs(y-by4)<20)
				return true;	
			else return false;
		}
		public boolean collide3(int ex,int ey,int bx,int by, int bdy)
		{
			if(Math.abs(ex-bx)<20&&Math.abs(ey-by)<16)
				return true;
			else return false;
		}
		
		public boolean collide31(int ex,int ey,int bx1,int by1, int bdy1)
		{
			if(Math.abs(ex-bx1)<20&&Math.abs(ey-by1)<16)
				return true;
			else return false;
		}
		
		public boolean collide32(int ex,int ey,int bx2,int by2, int bdy2)
		{
			if(Math.abs(ex-bx2)<20&&Math.abs(ey-by2)<16)
				return true;
			else return false;
		}
		
		public boolean collide33(int ex,int ey,int bx3,int by3, int bdy3)
		{
			if(Math.abs(ex-bx3)<20&&Math.abs(ey-by3)<16)
				return true;
			else return false;
		}
		
		public boolean collide34(int ex,int ey,int bx4,int by4, int bdy4)
		{
			if(Math.abs(ex-bx4)<20&&Math.abs(ey-by4)<16)
				return true;
			else return false;
		}
		
		public boolean collide35(int ex1,int ey1,int bx,int by, int bdy)
		{
			if(Math.abs(ex1-bx)<20&&Math.abs(ey1-by)<16)
				return true;
			else return false;
		}
		
		public boolean collide36(int ex1,int ey1,int bx1,int by1, int bdy1)
		{
			if(Math.abs(ex1-bx1)<20&&Math.abs(ey1-by1)<16)
				return true;
			else return false;
		}
		
		public boolean collide37(int ex1,int ey1,int bx2,int by2, int bdy2)
		{
			if(Math.abs(ex1-bx2)<20&&Math.abs(ey1-by2)<16)
				return true;
			else return false;
		}
		
		public boolean collide38(int ex1,int ey1,int bx3,int by3, int bdy3)
		{
			if(Math.abs(ex1-bx3)<20&&Math.abs(ey1-by3)<16)
				return true;
			else return false;
		}
		
		public boolean collide39(int ex1,int ey1,int bx4,int by4, int bdy4)
		{
			if(Math.abs(ex1-bx4)<20&&Math.abs(ey1-by4)<16)
				return true;
			else return false;
		}
		
		public boolean collide4(int x,int y,int px,int py)
		{
			if(x-px<4&&py-y<16)
				return true;
			else return false;
		}
		  	    
		public void keyPressed(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_LEFT)
				
				dx-=5;
				if(dx<=-10)
					dx=-5;
			else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
				
				dx+=5;
				if(dx>=10)
					dx=5;
			else if(e.getKeyCode()==KeyEvent.VK_DOWN)
				dy++;
			else if(e.getKeyCode()==KeyEvent.VK_UP)
			{				
					dy-=15;
					if(y+dy<=300)
						dy=2;				
			}				
		}
		
		public void actionPerformed(ActionEvent e)
		{
			x=x+dx;
			y=y+dy;
			dy = dy + gravity;
        	if (dy > ty)
       		{
            	dy = ty;
        	}
        	
			if(x<20)
			{
				dx=0;
				x=20;
			}
			else if(x>1180)
			{
				dx=0;
				x=1180;
			}
			if(y<20)
			{
				dy=0;
				y=20;
			}
			else if(y>320)
			{
				dy=0;
				y=320;
			}						
			ex-=5;
			ex1+=4;					
			if(ex<20) ex=1180;			
			if(ex1>1180) ex1=20;
			if(collide(x,y,ex,ey))
			{
				deaths++;
				points--;
				x=20;				
			}
			if(collide(x,y,ex1,ey1))
			{
				deaths++;
				points--;
				x=20;				
			}
			if(collide2(x,y,bx,by,bdy))
			{
				by=by+bdy;
				bdy=+5;				
			}
			if(collide21(x,y,bx1,by1,bdy1))
			{
				by1=by1+bdy;
				bdy1=+5;				
			}
			if(collide22(x,y,bx2,by2,bdy2))
			{
				by2=by2+bdy;
				bdy2=+5;				
			}
			if(collide23(x,y,bx3,by3,bdy3))
			{
				by3=by3+bdy;
				bdy3=+5;				
			}
			if(collide24(x,y,bx4,by4,bdy4))
			{
				by4=by4+bdy;
				bdy4=+5;				
			}
			if(collide3(ex,ey,bx,by,bdy))
			{				
				ex=1180;
				points++;				
			}
			if(collide31(ex,ey,bx1,by1,bdy1))
			{				
				ex=1180;
				points++;				
			}
			if(collide32(ex,ey,bx2,by2,bdy2))
			{				
				ex=1180;
				points++;				
			}
			if(collide33(ex,ey,bx3,by3,bdy3))
			{				
				ex=1180;
				points++;				
			}
			if(collide34(ex,ey,bx4,by4,bdy4))
			{				
				ex=1180;
				points++;				
			}
			if(collide35(ex1,ey1,bx,by,bdy))
			{				
				ex1=20;
				points++;				
			}
			if(collide36(ex1,ey1,bx1,by1,bdy1))
			{				
				ex1=20;
				points++;				
			}
			if(collide37(ex1,ey1,bx2,by2,bdy2))
			{				
				ex1=20;
				points++;				
			}
			if(collide38(ex1,ey1,bx3,by3,bdy3))
			{				
				ex1=20;
				points++;				
			}
			if(collide39(ex1,ey1,bx4,by4,bdy4))
			{				
				ex1=20;
				points++;				
			}
			if(collide4(x,y,px,py))
			{
				do{				
				y=240;
				}while(y<240&&x<40);				
			}
			by=by+bdy;
			by1=by1+bdy1;
			by2=by2+bdy2;
			by3=by3+bdy3;
			by4=by4+bdy4;
			if(by>210&&by>360)
				bdy=+5;
			else if(by>=360)
			{
				by=210;
				bx=180;
				bdy=0;
			}
			if(by1>210&&by1>360)
				bdy1=+5;
			else if(by1>=360)
			{
				by1=210;
				bx1=380;
				bdy1=0;
			}
			if(by2>210&&by2>360)
				bdy2=+5;
			else if(by2>=360)
			{
				by2=210;
				bx2=580;
				bdy2=0;
			}
			if(by3>210&&by3>360)
				bdy3=+5;
			else if(by3>=360)
			{
				by3=210;
				bx3=800;
				bdy3=0;
			}
			if(by4>210&&by4>360)
				bdy4=+5;
			else if(by4>=360)
			{
				by4=210;
				bx4=1030;
				bdy4=0;
			}																																					
			repaint();
		}
				
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);			
			g.setColor(new Color(31, 150, 255));	//background
			g.fillRect(0,0,1200,338);
			g.setColor(Color.white);
			g.fillOval(90,60,40,32);
			g.fillOval(70,61,40,30);
			g.fillOval(110,61,40,30);
			g.fillOval(520,60,40,32);
			g.fillOval(500,61,40,30);
			g.fillOval(540,61,40,30);
			g.fillOval(970,60,40,32);
			g.fillOval(950,61,40,30);
			g.fillOval(990,61,40,30);
			g.setColor(Color.green);
			g.fillRect(0,338,1200,340);
			g.setColor(new Color(136, 93, 82));
			g.fillRect(0,342,1200,400);			
			g.setColor(Color.orange);	//platform
			g.fillRect(px-30,py+2,30,2);			
			g.setColor(Color.black);	//character
			g.fillRect(x,y+10,4,10);
			g.fillRect(x+6,y+10,4,10);
			g.fillRect(x,y+10,10,3);
			g.setColor(Color.red);
			g.fillRect(x+2,y,6,10);
			g.fillRect(x,y,10,4);
			g.setColor(new Color(226, 182, 159));
			g.fillRect(x,y+4,2,3);
			g.fillRect(x+8,y+4,2,3);
			g.fillRect(x+2,y-7,7,7);					
			g.setColor(new Color(136, 93, 82));
			g.fillOval(x-2,y+16,6,4);
			g.fillOval(x+6,y+16,6,4);			
			g.setColor(Color.white);
			g.fillOval(x+2,y-7,4,4);
			g.fillOval(x+6,y-7,4,4);
			g.setColor(Color.black);
			g.fillOval(x+3,y-6,2,2);
			g.fillOval(x+7,y-6,2,2);
			g.fillRect(x+1,y-9,9,2);
			g.drawLine(x+3,y-2,x+7,y-2);			
			g.setColor(Color.black);	//enemy
			g.fillOval(ex,ey,20,12);
			g.fillRect(ex+5,ey+9,3,6);
			g.fillRect(ex+12,ey+9,3,6);
			g.setColor(Color.white);
			g.fillOval(ex+2,ey+3,4,4);
			g.setColor(Color.black);
			g.fillOval(ex+3,ey+4,2,2);
			g.setColor(Color.black);
			g.fillOval(ex1,ey1,20,12);
			g.fillRect(ex1+6,ey1+9,3,6);
			g.fillRect(ex1+13,ey1+9,3,6);
			g.setColor(Color.white);
			g.fillOval(ex1+14,ey1+3,4,4);
			g.setColor(Color.black);
			g.fillOval(ex1+15,ey1+4,2,2);			
			g.setColor(new Color(136, 93, 82));	//boxes
			g.fillRect(bx,by,20,20);
			g.fillRect(bx1,by1,20,20);
			g.fillRect(bx2,by2,20,20);
			g.fillRect(bx3,by3,20,20);
			g.fillRect(bx4,by4,20,20);
			g.setColor(Color.yellow);
			g.fillRect(bx+6,by+4,3,4);
			g.fillRect(bx+6,by+4,8,2);
			g.fillRect(bx+11,by+4,3,7);
			g.fillRect(bx+9,by+9,3,4);
			g.fillOval(bx+8,by+14,4,4);
			g.fillRect(bx1+6,by1+4,3,4);
			g.fillRect(bx1+6,by1+4,8,2);
			g.fillRect(bx1+11,by1+4,3,7);
			g.fillRect(bx1+9,by1+9,3,4);
			g.fillOval(bx1+8,by1+14,4,4);
			g.fillRect(bx2+6,by2+4,3,4);
			g.fillRect(bx2+6,by2+4,8,2);
			g.fillRect(bx2+11,by2+4,3,7);
			g.fillRect(bx2+9,by2+9,3,4);
			g.fillOval(bx2+8,by2+14,4,4);
			g.fillRect(bx3+6,by3+4,3,4);
			g.fillRect(bx3+6,by3+4,8,2);
			g.fillRect(bx3+11,by3+4,3,7);
			g.fillRect(bx3+9,by3+9,3,4);
			g.fillOval(bx3+8,by3+14,4,4);
			g.fillRect(bx4+6,by4+4,3,4);
			g.fillRect(bx4+6,by4+4,8,2);
			g.fillRect(bx4+11,by4+4,3,7);
			g.fillRect(bx4+9,by4+9,3,4);
			g.fillOval(bx4+8,by4+14,4,4);			
			g.setColor(Color.white);	//score
			g.drawString("Deaths = "+deaths, 20,20);
			g.drawString("Points = "+points, 100,20);
			if(points<=-5)
			{
				g.setColor(Color.red);
				Font stringFont = new Font( "SansSerif", Font.PLAIN, 72 );
				g.setFont( stringFont );		
				g.drawString("Game Over", 350,170);
				x=0;
				y=380;
				dx=0;
				dy=0;
				ex=1180;
				ex1=40;
				bdy=0;
			}
			if(points>=5)
			{
				g.setColor(Color.green);
				Font stringFont = new Font( "SansSerif", Font.PLAIN, 72 );
				g.setFont( stringFont );			
				g.drawString("You Win!", 390,170);
				x=0;
				y=380;
				dx=0;
				dy=0;
				ex=1180;
				ex1=40;
				bdy=0;
			}								
		}
		
		public void keyTyped(KeyEvent e){}
		public void keyReleased(KeyEvent e)
		{
			if(e.getKeyCode()==KeyEvent.VK_LEFT)
				dx=0;
			else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
				dx=0;
			else if(e.getKeyCode()==KeyEvent.VK_DOWN)
				dy=0;		
		}
	}
}