import java.util.ArrayList;

public class Main {
	public double total2D;
	public double total3D;
	public double total;
	
	public static void main(String[] args){
		//polymorhism

		/*ArrayList<Shape> shapes2D = new ArrayList<Shape>();
		shapes2D.add(new Circle("G11",3.0));
		shapes2D.add(new Rectangle("G12",2.0,8.0));

		ArrayList<Shape> shapes3D = new ArrayList<Shape>();
		shapes3D.add(new Shpere("C1",3.0));
		shapes3D.add(new Cylinder("C2",3.0,2.0)); 
		shapes3D.add(new Cuboid("E1",2.0,8.0,3.0));*/
	}
    zoomAll(shapes2D,2.0);
	
	//2D+3D
	Circle c =  new circle("G12",3.0);
	System.out.println("Toatl Area of 2D :" +total2D);
	System.out.println("Toatl Volume of 2D : 0" );
	System.out.println(" " );
	
	//2D
	Rectangle r =  new Rectangle("G12",2.0,8.0);
	System.out.println("Toatl Area of 2D :" +total2D);
	System.out.println("Toatl Volume of 2D : 0" );
	System.out.println(" " );

	total2D = c.getArea()+r.getArea();

	//3D
	Sphere sp =   new Sphere("C",3.0);
	Cylinder cy = new Cylinder("D",3.0,2.0);
	Cuboid  cu =new Cuboid("E",2.0,8.0,3.0);
	System.out.println("Toatl Area of 3D :" +totalArea3D);
	System.out.println("Toatl Volume of 3D : "+totalVol3D );
	
	totalArea3D =sp.getArea()+cy.getArea()+cu.getArea();
	totalVol3D = sp.getVolume()+cy.getVolume()+cu.getVolume();

	//2D+3D
	total2D = c.getArea()+r.getArea();
	otalArea3D =sp.getArea()+cy.getArea()+cu.getArea();
	totalVol3D = sp.getVolume()+cy.getVolume()+cu.getVolume();
	

	public static void zoomAll(ArrayList<Shape> shapes2D, double factor){
		for(Shape s : shapes2D){
			if(s instanceof Zoomable){
				Zoomable z = (Zoomable)s;
				z.zoom(factor);
			}
		}

	}

}