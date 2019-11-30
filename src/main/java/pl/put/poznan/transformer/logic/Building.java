package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.List;

public class Building implements ILocation{
    private int id;
    private String name;
    private float area;
    private float volume;
    private float heatingLevel;
    private float lightPower;

    public List<ILocation> getFloors() {
        return floors;
    }

    public void setFloors(List<ILocation> floors) {
        this.floors = floors;
    }

    private List<ILocation> floors = new ArrayList<ILocation>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Building(){}

    public Building(int id) {
        this.id = id;
        name = "";
        area = 0.0f;
        volume = 0.0f;
        heatingLevel = 0.0f;
        lightPower = 0.0f;
    }
    public Building(int id, String name) {
        this.id = id;
        this.name = name;
        area = 0.0f;
        volume = 0.0f;
        heatingLevel = 0.0f;
        lightPower = 0.0f;
    }

    public Building addFloor(ILocation location) {
        this.area += location.getArea();
        this.volume += location.getVolume();
        this.heatingLevel += location.getHeatingLevel();
        this.lightPower += location.getLightPower();
        floors.add(location);
        return this;
    }
    public void removeFloor(ILocation location) {
        this.area -= location.getArea();
        this.volume -= location.getVolume();
        this.heatingLevel -= location.getHeatingLevel();
        this.lightPower -= location.getLightPower();
        floors.remove(location);
    }

    public float getArea() {
        return area;
    }
    public float getVolume() {
        return volume;
    }
    public float getHeatingLevel() {
        return heatingLevel;
    }
    public float getLightPower() {
        return lightPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
