package numberz;

import com.fasterxml.jackson.annotation.JsonFormat;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY;

public class Numbers {

    @JsonFormat(shape = ARRAY)
    private final int[] numbers;

    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }
}
