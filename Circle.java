public class Circle extends Shape implements AreaCalculable {
    private double radius;

    public Circle(String name, double radius){
		super(name);
		this.radius = radius;
    }
    
    public double getArea(){
		return Math.PI * radius * radius;
    }

    public void zoom(double factor){
        radius = radius * factor;
    }
    public static void main(String[] args){
        Circle g = new Circle("G11",3.0);
        System.out.println("Area of " + g.getName() + " is " + g.getArea());
    }
}