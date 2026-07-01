package fr.timothe.pipeline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PipelineApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void fakeTest() {
        Assertions.assertEquals(2, 1+1);
    }
}
