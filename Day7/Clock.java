//<applet textsize="30px" code = "Clock" WIDTH = "500" HEIGHT = "400"></applet>
import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;

public class Clock extends Applet
 {
  public void paint(Graphics g)
  {
	 Font f1 = new Font("Arial",Font.BOLD,20);
  Calendar cal = new GregorianCalendar();
  Date d=cal.getTime();
  SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
  g.setFont(f1);
  g.drawString(sdf.format(d), 20, 30);
  g.setFont(f1);
  
  }
}