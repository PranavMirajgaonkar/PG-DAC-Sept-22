interface Shape
{
    double area();            

    void rotate();

    void move(double a, double b);

    void draw();

}

public class Circle implements Shape
{
	double xAxisCoordinate;
	double yAxisCoordinate;
	double radius;
	
	Circle (double x, double y, double r)
	{
		xAxisCoordinate = x;
		yAxisCoordinate = y;
		radius = r;
	}
     public double area()
    {
        return 3.14*radius*radius;
    }
    public void move(double a, double b)
    {
        xAxisCoordinate+=a;
        yAxisCoordinate+=b;
    }
	public  void rotate()
	{
	}
	public  void draw()
	{
	}
    void print()
    {
        System.out.println("Centre : ("+xAxisCoordinate+","+yAxisCoordinate+")");
        System.out.println("Radius : "+radius+"\n");
    }
    public static void main (String[] args) 
	{
		Circle c1 = new Circle(4, 3, 5);
		c1.print();
		
		Circle c2 = new Circle(5, 4, 6.40);
		c2.print();
		
		Rectangle r1 = new Rectangle(4,5,4,5);
		r1.print();
		
		Rectangle r2 = new Rectangle(7,9,7,9);
		r2.print();
		
		Rectangle r3 = new Rectangle(12,18,12,18);
		r3.print();
		
		r1.rotate();
		c1.move(4,5);
		
		c1.print();
		r1.print();  
    }
}

class Rectangle implements Shape
{
    double xAxisCoordinate;
	double yAxisCoordinate;
	double length;
	double width;
	
	Rectangle(double x, double y, double l, double w)
	{
		xAxisCoordinate = x;
		yAxisCoordinate = y;
		length = l;
		width = w;
	}
    
    public double area()
    {
        return length*width;
    }
    
    public void move(double a, double b)
    {
        xAxisCoordinate+=a;
        yAxisCoordinate+=b;
    }
	public  void rotate()
	{
		double temp = length;
		length = width;
		width = temp;
		
	}
    public  void draw()
	{

	}
    
    void print()
    {
        System.out.println("Length : "+length);
        System.out.println("Width : "+width+"\n");
    }
}