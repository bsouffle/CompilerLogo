/*
 * Created on 12 sept. 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class Traceur {
	private static Traceur instance;
	private Graphics2D g2d;
	private double initx = 300, inity = 300;   // position initiale
	private double posx = initx, posy = inity; // position courante
	private int angle = 90;
	private double teta;
	private boolean traceOn=true;
	
	public int getAngle() {		return angle;	}	public void setAngle(int angle) {		this.angle = angle % 360;	}	public Traceur() {
		setTeta();
	}

	public void setGraphics(Graphics g) {
		g2d = (Graphics2D) g;	
	}
	
	private int toInt(double a) {
		return (int) Math.round(a);
	}
	
	private void setTraceOn(boolean bool){
		traceOn=bool;		
	}
	
	public void avance(double r) {
		double a = posx + r * Math.cos(teta) ;
		double b = posy - r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if(traceOn==true)
			g2d.drawLine(x1,y1,x2,y2);
		posx = a;
		posy = b;
	}
	
	public void recule(double r) {/*A verifier*/
		double a = posx - r * Math.cos(teta) ;
		double b = posy + r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if(traceOn==true)
			g2d.drawLine(x1,y1,x2,y2);
		posx = a;
		posy = b;
	}
	
	
	public void td(double r) {
		angle = (angle - toInt(r)) % 360;		if(angle<0)			angle+=360;
		setTeta();
	}
	
	public void tg(double r) {
		angle = (angle + toInt(r)) % 360;		if(angle<0)			angle+=360;
		setTeta();
	}
	
	public void fpos(double n1,double n2){
		posx = n1;
		posy = n2;
	}
	
	public void fcc(int double1){
		switch(double1){
			case 0:
				g2d.setColor(Color.BLACK);
			break;
			case 1:
				g2d.setColor(Color.RED);
			break;
			case 2:
				g2d.setColor(Color.GREEN);
			break;
			case 3:
				g2d.setColor(Color.YELLOW);
			break;
			case 4:
				g2d.setColor(Color.BLUE);
			break;
			case 5:
				g2d.setColor(new Color(160,32,240));
			break;
			case 6:
				g2d.setColor(Color.CYAN);
			break;
			case 7:
				g2d.setColor(Color.WHITE);
			break;
		}
	}
	public void lc()
	{
		setTraceOn(false);
	}
	
	public void bc()
	{
		setTraceOn(true);
	}
	public void ve(){
		g2d.clearRect(0, 0, LogoFrame.SIZE, LogoFrame.SIZE);
	}		
	private void setTeta() {
		teta = Math.toRadians(angle);
	}
}
