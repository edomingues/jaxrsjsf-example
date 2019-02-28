package com.edomingues.jaxrsjsf.rest;

import com.edomingues.jaxrsjsf.model.Message;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Arrays;
import java.util.List;

@Path("/messages")
public class MessagesRestService {

    @GET
    public List<Message> getMessages() {
        return Arrays.asList(new Message("Message 1"), new Message("Message 2"));
    }

    @POST
    public void sendMessage(String sender, String receiver, Message message) {

    }
}
