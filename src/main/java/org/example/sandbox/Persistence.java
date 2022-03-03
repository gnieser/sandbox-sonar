package org.example.sandbox;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class Persistence {

    private static final org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger(Persistence.class);

    public List<MessageEntity> findMessages() {
        List<MessageEntity> messages = MessageEntity.listAll();
        log.debugf("Messages: %s%n", messages.stream().map(MessageEntity::getMessage).collect(Collectors.joining()));
        return messages;
    }

    public List<ExampleEntity> findExamples() {
        List<ExampleEntity> examples = ExampleEntity.listAll();
        log.debugf("Examples: %s%n", examples.stream().map(ExampleEntity::getExample).collect(Collectors.joining()));
        return examples;
    }
}
