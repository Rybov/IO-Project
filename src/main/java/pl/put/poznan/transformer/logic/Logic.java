package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class Logic {

    private List<ILocation> buildings = new ArrayList<ILocation>();

    public Logic(){

    }

    public String run(String text){
        Building x = new Building(0);
        String result = "dont work";
        switch (text) {
            case "area": {
                result = Float.toString(x.getArea());
            }
        }

        return result;
    }
}
