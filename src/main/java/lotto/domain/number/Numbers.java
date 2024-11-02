package lotto.domain.number;

import static lotto.resources.Constants.LOTTO_MAX_NUMBER;
import static lotto.resources.Constants.LOTTO_MIN_NUMBER;
import static lotto.resources.Constants.LOTTO_TOTAL_NUMBERS;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.Objects;

public class Numbers {
    private final List<Number> numbers;

    private Numbers(final List<Number> numbers) {
        this.numbers = numbers;
    }

    public static Numbers of(final List<Integer> numbers) {
        List<Number> createdNumbers = numbers.stream()
                .map(Number::from)
                .toList();

        return new Numbers(createdNumbers);
    }

    public static Numbers generateSixRandomNumbers() {
        List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(LOTTO_MIN_NUMBER, LOTTO_MAX_NUMBER,
                LOTTO_TOTAL_NUMBERS);

        return of(randomNumbers);
    }

    public List<Number> getNumbers() {
        return numbers;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Numbers otherNumbers = (Numbers) obj;
        return Objects.equals(this.numbers, otherNumbers.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numbers);
    }
}
