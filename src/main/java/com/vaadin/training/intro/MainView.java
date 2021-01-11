package com.vaadin.training.intro;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.server.VaadinSession;

import java.util.Locale;

/**
 * The main view contains a button and a click listener.
 */
@Route
public class MainView extends VerticalLayout {
    public MainView() {
        ProductForm productForm = new ProductForm();
        add(productForm);
    }
}


