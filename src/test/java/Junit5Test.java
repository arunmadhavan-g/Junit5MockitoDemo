import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Junit5Test {
    @Mock private InterfaceToMock service;
    @InjectMocks private ClassToTest testedService;

    @Test
    public void testTheClassInjection(){
        Assertions.assertEquals("Testing", testedService.methodThatReturnsWhatTheInterfaceImplReturns());
    }

    @BeforeEach
    void setup() {
        Mockito.lenient().when(service.getValue()).thenReturn("Testing");
    }

    @Test
    void testDoubleInjectionCase() {
        ClassUsingTheClass testedClass = new ClassUsingTheClass(testedService);
        Assertions.assertEquals("Testing", testedClass.doubleCallTesting());
    }
}
