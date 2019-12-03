package pl.put.poznan.transformer.logic;

/**
 * Class of room
 */
public class Room implements ILocation {
    private int id;
    private String name;
    private float area;
    private float volume;
    private float heatingLevel;
    private float lightPower;

    /**
     * Constructor with id, every room has to have id
     * @param id Id of new room
     */
    public Room(int id) {
        this.id = id;
        name = "";
        area = 0.0f;
        volume = 0.0f;
        heatingLevel = 0.0f;
        lightPower = 0.0f;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    /**
     * constructor with every property
     * @param id Id of new room
     * @param name Name of new room
     * @param area Area of new room
     * @param volume volume of room
     * @param heatingLevel heating level of new room
     * @param lightPower lightPower of new room
     */
    public Room(int id, String name, float area, float volume, float heatingLevel, float lightPower) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.volume = volume;
        this.heatingLevel = heatingLevel;
        this.lightPower = lightPower;
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
}
