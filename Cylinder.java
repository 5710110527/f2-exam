public class Cylinder extends Shape implements AreaCalculable, VolumeCalculable{
    private double radius;
    private double height;

    public Cylinder(String name, double radius, double height){
        super(name);
        this.radius = radius;
		this.height = height;
    }

    
}