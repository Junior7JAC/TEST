package com.test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import classes.Conversation;
import classes.Message;
import services.RenderContent;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(TestApplication.class, args);
		//System.out.println("LOL");
		var messages = new ObjectMapper().readValue(
				new URL("file:src/messages.json"),
				new TypeReference<List<Message>>(){});
		Conversation conversation = new Conversation();

		for (Message message: messages) {
			conversation.getMessageList().add(message);
		}

		RenderContent visitor = new RenderContent();
		conversation.accept(visitor);
	}
}
