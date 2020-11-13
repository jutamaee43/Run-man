import java.awt.Color;
import java.awt.Graphics2D;
public class Square extends Rectangle {
	protected int side;
	public Square( int side) {	
		super(side, side);
		this.side = side;	
	}
}
