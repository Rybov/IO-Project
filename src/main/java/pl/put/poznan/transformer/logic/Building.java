package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Building class
 */
public class Building implements ILocation{
    private int id;
    private String name;
    private float area;
    private float volume;
    private float heatingLevel;
    private float lightPower;
    private float avgVolume;
    private float avgLightPower;
    private List<Floor> floors = new ArrayList<Floor>();

    /**
     * Empty constructor, it is required to Spring
     */
    public Building(){}

    /**
     * Every building has to have id
     * @param id Id of new building
     */
    public Building(int id) {
        this.id = id;
        name = "";
        area = 0.0f;
        volume = 0.0f;
        heatingLevel = 0.0f;
        lightPower = 0.0f;
    }

    /**
     * @param id Id of new building
     * @param name Name of new building
     */
    public Building(int id, String name) {
        this.id = id;
        this.name = name;
        area = 0.0f;
        volume = 0.0f;
        heatingLevel = 0.0f;
        lightPower = 0.0f;
    }

    /**
     * just getter
     * @return floors
     */
    public List<Floor> getFloors() {
        return floors;
    }

    /**
     * jus setter
     * @param floors, new floor
     */
    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    /**
     * just getter
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * just setter
     * @param id new id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * adding new floor
     * @param location new Floor
     * @return this building
     */
    public Building addFloor(Floor location) {
        this.area += location.getArea();
        this.volume += location.getVolume();
        this.heatingLevel += location.getHeatingLevel();
        this.lightPower += location.getLightPower();
        floors.add(location);
        this.avgLightPower = this.lightPower/getFloors().size();
        this.avgVolume = this.volume/getFloors().size();
        return this;
    }

    /**
     * removing floor
     * @param location to remove
     */
    public void removeFloor(Floor location) {
        this.area -= location.getArea();
        this.volume -= location.getVolume();
        this.heatingLevel -= location.getHeatingLevel();
        this.lightPower -= location.getLightPower();
        floors.remove(location);
        this.avgLightPower = this.lightPower/getFloors().size();
        this.avgVolume = this.volume/getFloors().size();
    }

    /**
     * just getter
     * @return area
     */
    public float getArea() {
        return area;
    }

    /**
     * just getter
     * @return volume
     */
    public float getVolume() {
        return volume;
    }

    /**
     * jut getter
     * @return heatingLevel
     */
    public float getHeatingLevel() {
        return heatingLevel;
    }

    /**
     * just getter
     * @return lightPower
     */
    public float getLightPower() {
        return lightPower;
    }

    /**
     * just getter
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *just setter
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }

    public float getAvgVolume() {
        return avgVolume;
    }

    public void setAvgVolume(float avgVolume) {
        this.avgVolume = avgVolume;
    }

    public float getAvgLightPower() {
        return avgLightPower;
    }

    public void setAvgLightPower(float avgLightPower) {
        this.avgLightPower = avgLightPower;
    }
}
