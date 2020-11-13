public class Rectangle extends Shape implements Selectable {
    private int width, height;
    private boolean selected;
    public Rectangle ( int width, int height) {   
        this.width = width;
        this.height = height;
        selected = false;
    }
    @Override
    public double getArea() {
        
        return width * height;
    }     
   
    public boolean getSelected() {
        
        return selected;
    }
    
    
    public void setSelected( boolean selected) {
        
        this.selected = selected;
    }
    
    public Shape contains(int x, int y) {       
        if ( x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height)
            return this;
        return null;
    }

}
