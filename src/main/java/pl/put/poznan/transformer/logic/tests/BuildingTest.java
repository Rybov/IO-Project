package pl.put.poznan.transformer.logic.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.transformer.logic.Building;
import pl.put.poznan.transformer.logic.Floor;
import pl.put.poznan.transformer.logic.Room;

class BuildingTest {

    Building building;

    @BeforeEach
    void setUp() {
        building = new Building(1, "building_name");
    }

    @Test
    void addFloor() {
        Room room1 = new Room(1, "room_name", 10.0f, 50.0f, 15.0f, 5.0f);
        Room room2 = new Room(2, "room_name", 10.0f, 50.0f, 15.0f, 5.0f);
        Floor floor = new Floor(1, "floor_name");
        floor.addRoom(room1);
        floor.addRoom(room2);
        building.addFloor(floor);
        Assertions.assertEquals(2, floor.getRooms().size());
        Assertions.assertEquals(1, building.getFloors().size());
    }

    @Test
    void removeFloor() {
        Floor floor = new Floor(1, "floor_name");
        building.addFloor(floor);
        building.addFloor(floor);
        building.addFloor(floor);
        Assertions.assertEquals(3, building.getFloors().size());
        building.removeFloor(floor);
        Assertions.assertEquals(2, building.getFloors().size());
        building.removeFloor(floor);
        Assertions.assertEquals(1, building.getFloors().size());
        building.removeFloor(floor);
        Assertions.assertEquals(0, building.getFloors().size());
    }

    @Test
    void getId() {
        Assertions.assertEquals(1, building.getId());
    }

    @Test
    void setId() {
        building.setId(2);
        Assertions.assertEquals(2, building.getId());
    }
}