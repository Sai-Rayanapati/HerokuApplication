package com.example.demo;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.awt.*;

@Route("")
public class mainView extends VerticalLayout {

    public mainView(){
        add(new H1("Sai Rayanapati"));
        add(new Paragraph("Fourth year Computer Science student at Trinity College Dublin with experience in Java programming, problem solving and software development seeking a software engineering internship."));

        var linkedIn= new Button("LinkedIn");
        linkedIn.addClickListener(e->{
            UI.getCurrent().getPage().setLocation("https://www.linkedin.com/in/sai-rayanapati/");
        });

        var github = new Button("GitHub");
        github.addClickListener(e->{
            UI.getCurrent().getPage().setLocation("https://github.com/Sai-Rayanapati");
        });

        var clickMe= new Button("Click me to know more");
        var textField= new TextField();
        add(new HorizontalLayout(linkedIn,github));

        clickMe.addClickListener(e->{
            add(new Paragraph("Hello! " + textField.getValue()));
            textField.clear();
            add(new Paragraph("I am Sai Rayanapati"));
        });
    }

}
