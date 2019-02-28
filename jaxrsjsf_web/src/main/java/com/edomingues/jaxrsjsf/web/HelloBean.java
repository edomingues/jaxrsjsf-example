package com.edomingues.jaxrsjsf.web;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

    private static final long serialVersionUID = 1L;

    public String getMessage() {
        return new MessagesClient().getMessages().get(0).getText();
    }

}
