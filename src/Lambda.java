import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {

    public static BiFunction<Double, Double, Double> getMax() {
        return (Double x, Double y) -> (x > y ? x : y);
    }

    public static Function<Double, Double> getSqrt() {
        return Math::sqrt;
    }
}