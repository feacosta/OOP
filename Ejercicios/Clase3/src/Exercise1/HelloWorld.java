package Exercise1;

import java.applet.Applet; //Import class names..
import java.awt.Graphics;

public class HelloWorld extends Applet //Class header
{										//Start of body
	public void paint(Graphics g)		//The paint method
	{
		g.drawString("Hello! How are you doing?", 10, 10);
	}	//End of paint
}		//End of HelloWorld
