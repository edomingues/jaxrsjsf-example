package com.edomingues.jaxrsjsf.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/chat")
public class ChatApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public ChatApplication() {
        singletons.add(new MessagesRestService());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
