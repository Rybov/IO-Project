package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.Logic;

import java.util.Arrays;


@RestController
@RequestMapping("/{text}")
public class RESTapiController {

    private static final Logger logger = LoggerFactory.getLogger(RESTapiController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(@PathVariable String text,
                              @RequestParam(value="transforms", defaultValue="upper,escape") String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // do the transformation, you should run your logic here, below just a silly example
        //Logic transformer = new Logic(transforms);
        //return transformer.transform(text);
        Logic logicObject = new Logic();
        return logicObject.run(text);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(@PathVariable String text,
                      @RequestBody String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // do the transformation, you should run your logic here, below just a silly example
        //Logic transformer = new Logic(transforms);
        //return transformer.run(text);
        return "TODO";
    }



}


