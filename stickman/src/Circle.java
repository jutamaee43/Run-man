public class Circle extends Shape implements Selectable {

    protected int radius;
    private boolean selected;
    public Circle( int radius) {
        
        this.radius = radius;
        selected = false;
    }
    public double getArea() {
        
        return Math.PI * radius * radius;
    }
    
    
   
    public boolean getSelected() {
        
        return selected;
    }
    
    
    public void setSelected(boolean selected) {
        
        this.selected = selected;
    }
    
    
    public Shape contains(int x, int y) {
        
        if ( (x - getX()) * (x - getX()) + (y - getY()) * (y - getY()) <= this.radius * this.radius) {
          return this;
        }
        return null;
    }
}
