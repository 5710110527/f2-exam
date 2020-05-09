public class Cuboid extends Shape implements AreaCalculable, VolumeCalculable {
    private double width;
    private double height;
    private double length;

    public Cuboid(String name, double width, double height, double length){
		super(name);
		this.width = width;
        this.height = height;
        this.length = length;
    }
    
    public double getWidth(){
		return width;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public double getHeight(){
		return height;
	}

	public void setHeight(double height){
		this.height = height;
	}

    public double getlength(){
		return length;
	}

	public void setlength(double length){
		this.length = length;
    }
    
	public double getArea(){
		return width * height;
    }
    
    public double getVolume(){
		return width * height *length;
	}

	public void zoom(double factor){
		width = width * factor;
        height = height * factor;
        length = length * factor;
    }
    
    public static void main(String[] args){
        Cuboid er = new Cuboid("R2",2.0,8.0,3.0);
        System.out.println("Area of " + er.getName() + " is " + er.getArea());
        System.out.println("Volume of " + er.getName() + " is " + er.getVolume());
    }

}