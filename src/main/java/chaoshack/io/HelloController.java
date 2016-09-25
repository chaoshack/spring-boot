package chaoshack.io;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by macmini on 2016. 9. 26..
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }
}
