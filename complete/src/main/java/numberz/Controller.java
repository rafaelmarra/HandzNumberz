package numberz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static numberz.Application.numbers;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class Controller {

    @RequestMapping(value = "/numbers", method = GET)
    public Numbers getNumbers() {
        return new Numbers(numbers);
    }
}