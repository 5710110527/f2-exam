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
		return width * height;
    }
    
    public double getVolume(){
		return width * height *length;
    }
    
    public void zoom(double factor){
		radius = radius * factor;
        height = height * factor;
    }
    

    
}