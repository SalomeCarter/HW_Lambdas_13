package calculator;

@FunctionalInterface
public interface Calculator {
    double calculate(double num1, double num2, OperationType type);
}

