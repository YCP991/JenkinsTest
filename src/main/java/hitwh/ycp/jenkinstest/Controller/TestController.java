package hitwh.ycp.jenkinstest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/JenkinsTest")
    String Test(){
        return "成功了！！！";
    }

}
