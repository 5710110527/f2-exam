public class Shpere extends Shape implements AreaCalculable, VolumeCalculable{
    private double radius;

    public Shpere(String name, double radius){
        super(name);
        this.radius = radius;
    }

    public double getArea(){
        return 4 * Math.PI * radius * radius;
    }

   public double getVolume(){
       return (4/3) * Math.PI * radius * radius * radius;
   }

   public void zoom(double factor){
       radius = radius * factor;
   }
   public static void main(String[] args){
    Shpere cc = new Shpere("C1",3.0);
    System.out.println("Area of " + cc.getName() + " is " + cc.getArea());
    System.out.println("Volume of " + cc.getName() + " is " + cc.getVolume());
}
}