package pl.put.poznan.transformer.app;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pl.put.poznan.transformer.logic.*;

import java.util.ArrayList;
import java.util.List;

@Component
public class BuildingService {
      private List<Building> buildings = new ArrayList<Building>();

    public BuildingService() {
        Room room1 = new Room(0, "Pokoj1", 100, 200, 10, 3);
        Room room2 = new Room(1, "Pokoj2", 10, 15, 1, 1);
        Room room3 = new Room(2, "Pokoj3", 100, 2, 5, 5 );
        Floor floor1 = new Floor(3, "Pietro1");
        Floor floor2 = new Floor(4, "Pietro2");
        floor1.addRoom(room1);
        floor1.addRoom(room3);
        floor2.addRoom(room2);
        Building building1 = new Building(5, "Budynek1");
        building1.addFloor(floor1);
        building1.addFloor(floor2);

        buildings.add(building1);
    }

    @Bean
    public List<Building> getBuildings(){
        return buildings;
    }


    public List<Room> getRoomsOverArgument(int arg) {
        List<Room> result = new ArrayList<Room>();
        for ( Building b : buildings) {
            for ( Floor f : b.getFloors()) {
                for ( Room r : f.getRooms()) {
                    if (r.getHeatingLevel() > arg) {
                        result.add(r);
                    }
                }
            }
        }
        return result;
    }

}
