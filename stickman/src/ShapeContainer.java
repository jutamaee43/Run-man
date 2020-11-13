import java.util.ArrayList;
import java.util.Iterator;
public class ShapeContainer implements Iterable
{
    private ArrayList<Shape> shapes;
    public ShapeContainer() {
        shapes = new ArrayList<Shape>();
    }
    public void add( Shape s) {
        
        shapes.add(s);
    }
    
    public double getArea() {
        
        double area;
        
        area = 0;
        for (int i = 0; i < shapes.size(); i++)
            area = area + shapes.get(i).getArea();
        return area;
    }

    
    public Shape contains( int x, int y) {
        
        for (Shape shape : shapes) {
            if ( ((Selectable) shape).contains( x, y) != null)
                return shape;
        }
        return null;
    }
    
    public void remove() {
        
        for ( int i = 0; i < shapes.size(); i++) {
            if ( ( ((Selectable) shapes.get(i)).getSelected())) {
                shapes.remove(i);
                i--;
            }
        }
    }
    
    public int size() {
    	
    	return shapes.size();
    }
    
    public int selectAllAt( int x, int y) {
    	
    	int containers;
    	
    	containers = 0;
    	for (Shape shape : shapes) {
            if ( ((Selectable) shape).contains( x, y) != null) {
            	((Selectable) shape).setSelected(true);
            	containers++;
            } 
        }
    	return containers;
    	
    }

	
	public Iterator iterator() {

		return shapes.iterator();
	}
	
	public Shape getShape( int i) {
		return shapes.get(i);
	}
}
