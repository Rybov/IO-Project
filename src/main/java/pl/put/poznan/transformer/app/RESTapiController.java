package pl.put.poznan.transformer.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.Building;
import pl.put.poznan.transformer.logic.Logic;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/{text}")
public class RESTapiController {

    private static final Logger logger = LoggerFactory.getLogger(RESTapiController.class);

    @Autowired
    BuildingService buildingService;

    @GetMapping(produces = "application/json")
    public List<Building> getBuildings() {
        List<Building> buildings = buildingService.getBuildings();
        return buildings;
    }

    @GetMapping()
    public Building getBuilding(){
        return buildingService.get
    }



}


