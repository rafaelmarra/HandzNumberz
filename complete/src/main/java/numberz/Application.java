package numberz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Application {

    static int[] numbers = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        NumberRefresher numberRefresher = new NumberRefresher();
        numberRefresher.refreshNumbers();
    }
}
