public class Rectangle {
    private int height;
    private int width;

    private void setHeight(int height){
        this.height = height;
    }

    private int getHeight(){
        return height;
    }

    private void setWidth(int width){
        this.width = width;
    }

    private int getWidth(){
        return width;
    }

    public Rectangle(int height, int width){
        System.out.println("Rectangle object is being constructed!");
        setHeight(height);
        setWidth(width);
    }

    public int getArea(int height, int width){
        return height * width;
    }

    public int getPerimeter(int height, int width){
        return (height + width) * 2;
    }

    public void printData() {
        System.out.println("Height: " + height + "; Width: " + width);
        System.out.println("This Rectangle's area is: " + getArea(height, width));
        System.out.println("This Rectangle's perimeter is: " + getPerimeter(height, width));
    }
}
