import java.util.ArrayList;

public class Main {
	public double total2D;
	public double total3D;
	public double total;
	
	public static void main(String[] args){
		//polymorhism

		ArrayList<Shape> shapes2D = new ArrayList<Shape>();
		shapes2D.add(new Circle("G11",3.0));
		shapes2D.add(new Rectangle("G12",2.0,8.0));

		ArrayList<Shape> shapes3D = new ArrayList<Shape>();
		shapes3D.add(new Shpere("C1",3.0));
		shapes3D.add(new Cylinder("C2",3.0,2.0)); 
		shapes3D.add(new Cuboid("E1",2.0,8.0,3.0));
	}
    zoomAll(shapes2D,2.0);
	
	//2D
	for(Shape s : shapes2D){
		total2D += 2d.getArea();
		System.out.println("Area of " + 2d.getName() + " is " + 2D.getArea());
	}
	//3D
	for(Shape s : shapes2D){
		total3D += 3d.getArea();
	System.out.println("Area of " + er.getName() + " is " + er.getArea());
    System.out.println("Volume of " + er.getName() + " is " + er.getVolume());
	}
	//2D+3D


	public static void zoomAll(ArrayList<Shape> shapes2D, double factor){
		for(Shape s : shapes2D){
			if(s instanceof Zoomable){
				Zoomable z = (Zoomable)s;
				z.zoom(factor);
			}
		}

	}

}