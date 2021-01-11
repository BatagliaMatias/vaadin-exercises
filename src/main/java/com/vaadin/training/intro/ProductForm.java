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

import java.util.Arrays;
import java.util.Locale;


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

        DatePicker.DatePickerI18n datePickerI18n = new DatePicker.DatePickerI18n();
        datePickerI18n.setWeek("Semana");
        datePickerI18n.setCalendar("Calendario");
        datePickerI18n.setClear("Borrar");
        datePickerI18n.setToday("Hoy");
        datePickerI18n.setCancel("Cancelar");
        datePickerI18n.setWeekdays(Arrays.asList("Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado"));
        datePickerI18n.setWeekdaysShort(Arrays.asList("Dom", "Lun", "Mar", "Mie", "Jue", "Vie", "Sab"));
        datePickerI18n.setMonthNames(Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"));


        available.setI18n(datePickerI18n);


        available.setLocale(Locale.GERMAN );
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
