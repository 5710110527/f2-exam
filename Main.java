java.util.*;

public class Main {
    

    zoomAll(sprites, 2.0);
    
    public static void zoomAll(ArrayList<Sprite> sprites, double factor){
		for(Sprite s : sprites){
			if(s instanceof Zoomable){
				Zoomable z = (Zoomable)s;
				z.zoom(factor);
			}
		}

	}

}