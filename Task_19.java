 class Rectangle{
    double length;
    double width;
    Rectangle()
    {
        length = 1.0;
        width = 1.0;
    }
    Rectangle(double side)
    {
        length = side;
        width = side;
    }
    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    void calculateArea()
    {
        System.out.println("Area: " + (length * width));
    }
 }
 class Task_19{
    public static void main(String [] args){
        Rectangle a =new Rectangle();  
        Rectangle b =new Rectangle(5.0);
        Rectangle c =new Rectangle(4.0, 6.0);   
        a.calculateArea();
        b.calculateArea();
        c.calculateArea();
        }
 }