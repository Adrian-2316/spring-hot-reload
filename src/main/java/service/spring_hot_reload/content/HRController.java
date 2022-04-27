package service.spring_hot_reload.content;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hot-reloading")
public class HRController {

    public static String value = "Value";

    @GetMapping
    public String getValue(){
        return this.value;
    }
}
