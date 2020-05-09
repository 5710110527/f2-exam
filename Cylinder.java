public class Cylinder extends Shape implements AreaCalculable, VolumeCalculable{
    private double radius;
    private double height;

    public Cylinder(String name, double radius, double height){
        super(name);
        this.radius = radius;
		this.height = height;
    }

    public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = height;
    }
    
    public double getArea(){
		return Math.PI * radius * radius * height;
    }
    
    public double getVolume(){
		return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
    
    public void zoom(double factor){
		radius = radius * factor;
        height = height * factor;
    }
    
    public static void main(String[] args){
        Cylinder d = new Cylinder("C2",3.0,2.0);
        System.out.println("Area of " + d.getName() + " is " + d.getArea());
        System.out.println("Volume of " + d.getName() + " is " + d.getVolume());
    }
    
}