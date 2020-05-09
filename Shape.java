public abstract class Shape implements Zoomable {
    public String name;

    public Shape(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}