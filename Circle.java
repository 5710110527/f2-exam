public class Circle extends Shape implements AreaCalculable {
    private double radius;

    public Circle(String name, double radius){
		super(name);
		this.radius = radius;
    }
    
    public double getArea(){
		return Math.PI * radius * radius;
    }
    
}