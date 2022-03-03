package org.example.sandbox;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class PersistenceTests {

    @Inject
    Persistence persistence;

    @Test
    void testPanacheEntity() {
        List<MessageEntity> messages = persistence.findMessages();
        assertEquals(1, messages.size());
        assertEquals(1, messages.get(0).getId());
        assertEquals("Hello", messages.get(0).getMessage());
    }

    @Test
    void testPanacheEntityBase() {
        List<ExampleEntity> examples = persistence.findExamples();
        assertEquals(1, examples.size());
        assertEquals(1, examples.get(0).id);
        assertEquals("World", examples.get(0).getExample());
    }
}
