import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
     * 
     */
    private static final long serialVersionUID = 7057541440811488699L;

            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
//                        g.setColor(Color.BLACK);
//                        g.fillRect(x1, y1, width + 1, height + 1);
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        g.setColor(Color.blue);
//                        g.drawRect(x1+2, y1+2, width-3, height-3);
//                        
//                        //Draw line
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
                        
//                        //Draw second line 
//                        g.setColor(Color.ORANGE);
//                        g.drawLine(x1, y1+getHeight(), x2, y2-getHeight());
                        
                          //Draw Oval
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(width/2-55/2, height/2-55/2, 55, 55);
//                        
                        
                          //Draw Arrow 
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
//                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73 +15);
                        p2.addPoint(x1 + 41, y1 + 73 +15);
                        p2.addPoint(x1 + 47, y1 + 58 +15);
                        p2.addPoint(x1 + 53, y1 + 73 +15);
                        p2.addPoint(x1 + 69, y1 + 73 +15);
                        p2.addPoint(x1 + 56, y1 + 83 +15);
                        p2.addPoint(x1 + 61, y1 + 98 +15);
                        p2.addPoint(x1 + 47, y1 + 88 +15);
                        p2.addPoint(x1 + 34, y1 + 98 +15);
                        p2.addPoint(x1 + 38, y1 + 83 +15);
                        g.setColor(Color.WHITE);
                        g.drawPolygon(p2);
                        
                        Polygon triangle = new Polygon();
                        triangle.addPoint(0, 0);
                        triangle.addPoint(150, 100);
                        triangle.addPoint(0, 200);
                        
                        g.setColor(Color.RED);
                        g.fillRect(0, 0, 300, 40);
                        g.fillRect(0, 80, 300, 40);
                        g.fillRect(0,160,300,50);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(triangle);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                      
                        
                        
            }
}