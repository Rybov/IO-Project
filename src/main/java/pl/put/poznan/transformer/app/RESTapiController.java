package pl.put.poznan.transformer.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.Building;
import pl.put.poznan.transformer.logic.Floor;
import pl.put.poznan.transformer.logic.Room;

import java.util.List;


/**
 * Our 'meat' of Restapi
 */
@RestController
@RequestMapping("/buildings")
public class RESTapiController {
    private static final Logger logger = LoggerFactory.getLogger(RESTapiController.class);

    @Autowired
    BuildingService buildingService;

    @RequestMapping("/all")
    public List<Building> getBuildings() {
        return buildingService.getBuildings();
    }

    /**
     * @param build Name of building to look
     * @param arg Max value of heating level
     * @return list of rooms
     */
    @RequestMapping(value = "/param/{build}/{arg}", method = RequestMethod.GET, produces = "application/json")
    public List<Room> getBuildingsWithParams(@PathVariable String build, @PathVariable int arg) {
        logger.info("I show rooms with value of heating level above arg");
        return buildingService.getRoomsOverArgument(build, arg);
    }

    /**
     * @param build Name of building
     * @return building with that name
     */
    @RequestMapping("/find/{build}")
    public Building getBuild(@PathVariable String build) {
        List<Building> buildings = buildingService.getBuildings();
        for (int i = 0; i <= buildings.size(); i++) {

            if (buildings.get(i).getName().equals(build))
                logger.info("I show build with name " + build);
                logger.debug("Posted parameter:" + build);
                return buildings.get(i);
        }
        return null;
    }

    /**
     * @param build Name of building
     * @param floor Name of floor
     * @return floor with that name in this building
     */
    @RequestMapping("/find/{build}/{floor}")
    public Floor getFloor(@PathVariable String build, @PathVariable String floor) {
        List<Building> buildings = buildingService.getBuildings();
        for (int i = 0; i <= buildings.size(); i++) {
            System.out.println(floor);
            if (buildings.get(i).getName().equals(build))
                for (int j = 0; j <= buildings.get(i).getFloors().size(); j++)
                    if (buildings.get(i).getFloors().get(j).getName().equals(floor))
                    {
                        logger.info("I show Floor with name " + floor);
                        logger.debug("Posted parameter:" + floor);
                        return buildings.get(i).getFloors().get(j);}
        }
        return null;
    }

    /**
     * @param build Name of building
     * @param floor Name of floor
     * @param room Name of room
     * @return room with that name on this floor in this building
     */
    @RequestMapping("/find/{build}/{floor}/{room}")
    public Room getRoom (@PathVariable String build, @PathVariable String floor, @PathVariable String room) {
        List<Building> buildings = buildingService.getBuildings();
        for (int i = 0; i <= buildings.size(); i++) {
            if (buildings.get(i).getName().equals(build))
                for (int j = 0; j <= buildings.get(i).getFloors().size(); j++)
                    if (buildings.get(i).getFloors().get(j).getName().equals(floor))
                        for (int k = 0; k <= buildings.get(i).getFloors().get(j).getRooms().size(); k++)
                            if (buildings.get(i).getFloors().get(j).getRooms().get(k).getName().equals(room)) {
                                logger.info("I show Room with name " + room);
                                logger.debug("Posted parameter:" + room);
                                return buildings.get(i).getFloors().get(j).getRooms().get(k);
                            }

        }
        return null;
    }


}


