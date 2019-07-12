package LSP;

public class MainClass {
    static  Rectangle getRect(){ // factory pattern
        return new Rectangle();
    }

    public  static void main(String[] args) {
        Rectangle rectangle = getRect();
        rectangle.setHeingt(20);
        rectangle.setWidth(60);
        System.out.println(rectangle.getSquare());
        Square square = new Square();
        square.setWidth(10);
        System.out.println(square.getSquare());
    }
}
interface Shape{
   int getSquare();
}
class Rectangle implements Shape {
    int width;
    int heingt;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeingt() {
        return heingt;
    }

    public void setHeingt(int heingt) {
        this.heingt = heingt;
    }

    @Override
    public int getSquare() {
        return width * heingt;
    }
}
    // додаєм квадрат
class Square implements Shape{
        int width;


        @Override
        public int getSquare() {
            return width*width;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }
