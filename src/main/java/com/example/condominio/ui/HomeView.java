package com.example.condominio.ui;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
public class HomeView extends VerticalLayout {
    public HomeView() {
        add(new H1("Home view"));
    }
}
