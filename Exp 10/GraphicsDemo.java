import java.applet.Applet; 
import java.awt.Color; 
import java.awt.Graphics; 
public class GraphicsDemo extends Applet { 
    public GraphicsDemo() { 
    } 
    public void paint(Graphics var1) { 
        var1.setColor(Color.red); 
        var1.drawString("Welcome", 50, 50); 
        var1.drawLine(20, 30, 20, 300); 
        var1.drawRect(70, 100, 30, 30); 
        var1.fillRect(170, 100, 30, 30); 
        var1.drawOval(70, 200, 30, 30); 
        var1.setColor(Color.pink); 
        var1.fillOval(170, 200, 30, 30); 
        var1.drawArc(90, 150, 30, 30, 30, 270); 
        var1.fillArc(270, 150, 30, 30, 0, 180); 
    } 
} 
