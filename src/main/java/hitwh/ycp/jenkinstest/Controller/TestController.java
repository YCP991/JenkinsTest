package hitwh.ycp.jenkinstest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/JenkinsTest")
    String Test(){
        return "test2 17:50";
    }

}
