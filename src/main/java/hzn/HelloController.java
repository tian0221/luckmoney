package hzn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class HelloController {
    @Autowired
    private limitConfig limitConfig;

    @GetMapping("/say")
    public String Say(){
        return "说明:"+limitConfig.getDescription();
    }
}
