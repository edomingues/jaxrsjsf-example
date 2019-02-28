package com.edomingues.jaxrsjsf.web;

import com.edomingues.jaxrsjsf.model.Message;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import java.util.List;

public class MessagesClient {

    public List<Message> getMessages() {
        Client client = ClientBuilder.newClient();
        try {
            return client.target("http://localhost:8090/chat/messages").request().get(new GenericType<List<Message>>() { });
        } finally {
            client.close();
        }
    }

}
