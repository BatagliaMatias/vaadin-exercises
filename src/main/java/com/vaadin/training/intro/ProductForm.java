package com.vaadin.training.intro;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.ThemeUtil;


public class ProductForm extends VerticalLayout {
    public ProductForm(){
        TextField name = new TextField("Name");
        add(name);

        TextArea description = new TextArea("Description");
        add(description);

        NumberField price = new NumberField("Price");
        price.setSuffixComponent(new Span("€"));
        price.setStep(0.01);
        add(price);

        DatePicker available = new DatePicker("Available");
        add(available);

        ComboBox<String> category = new ComboBox<>("Category");
        category.setItems("A","B","C");
        add(category);

        HorizontalLayout buttons = new HorizontalLayout();
        Button save = new Button("Save");
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        Button cancel = new Button("Cancel");
        buttons.add(save,cancel);
        add(buttons);


    }
}
