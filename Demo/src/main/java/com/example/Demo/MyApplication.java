package com.example.Demo;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
//@Theme("app")
public class MyApplication  extends UI{

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout lay = new VerticalLayout();
		lay.addComponent(new Label("Login Form"));
		lay.addComponent(new TextField("Username"));
		setContent(lay);
		
	}

}
