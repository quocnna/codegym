package _15_exception_debug.exercise.e1;

public class IllegalTriangleException extends RuntimeException {
    public IllegalTriangleException(String message) {
        super(message);
    }
}
