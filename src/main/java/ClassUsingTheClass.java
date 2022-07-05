public class ClassUsingTheClass {
    private ClassToTest classToTest;

    public ClassUsingTheClass(){
        this.classToTest = new ClassToTest();
    }

    public ClassUsingTheClass(ClassToTest classToTest){
        this.classToTest = classToTest;
    }

    public String doubleCallTesting(){
        return classToTest.methodThatReturnsWhatTheInterfaceImplReturns();
    }

}
