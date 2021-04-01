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
      		super("Card 3");
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
		int xDi[] = {75,85,75,65};
		int yDi[] = {50,60,70,60};
		di = new Polygon(xDi, yDi, xDi.length);
		Polygon di2;
		int xDi2[] = {75,85,75,65};
		int yDi2[] = {130,140,150,140};
		di2 = new Polygon(xDi2, yDi2, xDi2.length);
		Polygon di3;
		int xDi3[] = {75,85,75,65};
		int yDi3[] = {90,100,110,100};
		di3 = new Polygon(xDi3, yDi3, xDi3.length);
      		g.setColor(Color.black);//boarder
      		g.drawRect(0, 0, 150, 200);
		g.drawString("3",10,20);
		g.drawString("3",130,190);
		g.fillPolygon(di);
		g.fillPolygon(di2);
		g.fillPolygon(di3);
	
   }
}