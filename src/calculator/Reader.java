package calculator;

public interface Reader {
    ResponseType readResponseType();
    OperationType readOperationType() throws OperationNotFoundException;
    double readDouble();
}
