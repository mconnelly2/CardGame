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
      		super("Card A");
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
		int yDi[] = {90,100,110,100};
		di = new Polygon(xDi, yDi, xDi.length);
      		g.setColor(Color.black);//boarder
      		g.drawRect(0, 0, 150, 200);
		g.drawString("A",10,20);
		g.drawString("A",130,190);
		g.fillPolygon(di);
	
   }
}