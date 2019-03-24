package lesterspdrnt;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  @GetMapping("/hello")
  @ResponseBody
  public Car getCar(@RequestParam(name="manufacturer", required=false, defaultValue="Proton") String manufacturer,
    @RequestParam(name="name", required=false, defaultValue="Saga") String name) {

    return new Car(manufacturer, name);
  }
}
