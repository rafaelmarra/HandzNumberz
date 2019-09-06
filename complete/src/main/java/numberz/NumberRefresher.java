package numberz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

import static numberz.Application.numbers;

@Component
class NumberRefresher {

    @Scheduled(cron = "0 0 0 * * *")
    public void customScheduler() {
        refreshNumbers();
    }

    public void refreshNumbers(){
        Random generator = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                numbers[i] = generator.nextInt(80);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
