import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;


public class Semaforo extends JComponent
{
	
	
private String luz="rojo";


public void paintComponent(Graphics g)
{
	
super.paintComponent(getGraphics());

int ancho=getWidth();
int alto=getHeight();
int altoluz=alto/3;

if (luz.equals("rojo"))
	g.setColor(Color.RED);
		else
		g.setColor(Color.BLACK);
		g.fillOval(0, 0, ancho, altoluz);
if (luz.equals("amarilla"))
	g.setColor(Color.YELLOW);
		else
		g.setColor(Color.BLACK);
		g.fillOval(0, altoluz, ancho, altoluz);
if (luz.equals("verde"))
	g.setColor(Color.GREEN);
		else
		g.setColor(Color.BLACK);
		g.fillOval(0, altoluz*2, ancho, altoluz);

}


public void cambiar()
{
if (luz.equals("verde"))
	luz="amarilla";
	else
	if (luz.equals("amarilla"))
		luz="rojo";
		else
			if (luz.equals("rojo"))
				luz="verde";
repaint();
}


public String retornarLuz()
{
return luz;
}


}