public class Shpere extends Shape implements AreaCalculable, VolumeCalculable{
    
    public Shpere(){
        
    }

    public double getArea(){
        return 4*Math.PI*radius*radius;
    }

   public double getVolume(){
       return (4/3)*Math.PI*radius*radius*radius;
   }
   
   public void zoom(double factor){
       radius = radius*factor;
   }
}