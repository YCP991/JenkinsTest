package hitwh.ycp.jenkinstest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("test")
    String Test(){
        return "test1";
    }

}
