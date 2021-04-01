import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boarder extends Frame {
   	public static void main(String[] args) {new Boarder();}
	
	
   	Boarder() {
      		super("Card 6");
      		addWindowListener(new WindowAdapter() {
         		public void windowClosing(WindowEvent e) {System.exit(0);}
      });
      		setSize(200, 300);
      		add("Center", new CvBoarder());
      		setVisible(true);
   }
}
class CvBoarder extends Canvas {
	public void paint(Graphics g) {
		Polygon di;
		int xDi[] = {38,48,38,28};
		int yDi[] = {50,60,70,60};
		di = new Polygon(xDi, yDi, xDi.length);
		Polygon di2;
		int xDi2[] = {113,123,113,103};
		int yDi2[] = {140,150,160,150};
		di2 = new Polygon(xDi2, yDi2, xDi2.length);
		Polygon di3;
		di3 = new Polygon(xDi, yDi2, xDi.length);
		Polygon di4;
		di4 = new Polygon(xDi2, yDi, xDi2.length);
		Polygon di5;
		int yDi3[] = {80,90,100,90};
		int yDi4[] = {110,120,130,120};
		di5 = new Polygon(xDi, yDi3, xDi.length);
		Polygon di6;
		di6 = new Polygon(xDi2, yDi3, xDi2.length);
		Polygon di7;
		di7 = new Polygon(xDi, yDi4, xDi.length);
		Polygon di8;
		di8 = new Polygon(xDi2, yDi4, xDi2.length);
      		g.setColor(Color.black);//boarder
      		g.drawRect(0, 0, 150, 200);
		g.drawString("8",10,20);
		g.drawString("8",130,190);
		g.fillPolygon(di);
		g.fillPolygon(di2);
		g.fillPolygon(di3);
		g.fillPolygon(di4);
		g.fillPolygon(di5);
		g.fillPolygon(di6);
		g.fillPolygon(di7);
		g.fillPolygon(di8);
	
   }
}