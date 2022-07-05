public class ClassToTest {

    private InterfaceToMock service = new InterfaceImplToMock();

    public String methodThatReturnsWhatTheInterfaceImplReturns(){
        return service.getValue();
    }
}
