import org.junit.jupiter.api.Assertions;
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
    public void testTheClass(){
        Mockito.lenient().when(service.getValue()).thenReturn("Testing");
        Assertions.assertEquals("Testing", testedService.methodThatReturnsWhatTheInterfaceImplReturns());
    }

}
