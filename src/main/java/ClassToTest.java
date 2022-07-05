public class ClassToTest {

    private InterfaceToMock service;

    public ClassToTest(){
        service = new InterfaceImplToMock();
    }

    public ClassToTest(InterfaceToMock service){
        this.service = service;
    }

    public String methodThatReturnsWhatTheInterfaceImplReturns(){
        return service.getValue();
    }

}
