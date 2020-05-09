import java.util.Scanner;

public class Circle extends Shape implements AreaCalculable {
    private double radius;

    public Circle(String name, double radius){
		super(name);
		this.radius = radius;
    }

    public double spliteString(String key){
        try {
        int r = 0;
        Scanner s = new Scanner(new File("data,txt"));
        while(s.hasNextLine()){
            String line = s.nextLine();
            String item = line.splite("_");
            if(item[0].equals(key)){
                r = Integer.pasrseInt(item[1]);
            }
        }
        s.close();
        }catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
        }
    }
    
    public double getArea(){
		return Math.PI * radius * radius;
    }

    public void zoom(double factor){
        radius = radius * factor;
    }


}