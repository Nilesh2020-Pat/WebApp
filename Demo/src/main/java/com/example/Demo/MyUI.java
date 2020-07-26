package com.example.Demo;



import java.awt.HeadlessException;
import java.io.File;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.function.DoubleToIntFunction;

import javax.servlet.annotation.WebServlet;
import javax.sound.midi.Synthesizer;
import javax.swing.Icon;
import javax.xml.bind.Binder;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.event.ItemClickEvent;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.BrowserWindowOpener;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.FileResource;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Page;
import com.vaadin.server.Sizeable;
import com.vaadin.server.StreamResource;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.UserError;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.Position;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.shared.ui.datefield.Resolution;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.shared.ui.slider.SliderOrientation;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.AbstractSelect.ItemCaptionMode;
import com.vaadin.ui.AbstractSelect.NewItemHandler;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Form;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.MultiSelectionModel;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Grid.SelectionModel;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Image;
import com.vaadin.ui.InlineDateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Link;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.ProgressBar;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.Slider;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TabSheet.Tab;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;
import com.vaadin.ui.Table.ColumnResizeEvent;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Tree;
import com.vaadin.ui.TreeTable;
import com.vaadin.ui.TwinColSelect;
import com.vaadin.ui.UI;
import com.vaadin.ui.Upload;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;
import com.vaadin.ui.Window;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.ui.Button.ClickEvent;


/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    
    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	/*VerticalLayout layout = new VerticalLayout();
    	final Table tbl = new Table();
    	
    	//final Grid tbl = new Grid();
    	//tbl.setSelectionMode(SelectionMode.SINGLE);
    	//tbl.setSelectable(true);
    	//tbl.setMultiSelect(true);
    	//tbl.setEditorEnabled(true);
    	final BeanItemContainer<Data> bic = new BeanItemContainer<Data>(Data.class);
    	
        bic.addBean(new Data(1, "Tester"));
        bic.addBean(new Data(2, "SecondTester"));
        tbl.setContainerDataSource(bic);
        layout.addComponent(tbl);
        layout.setMargin(true);
        setContent(layout);
        Button btn = new Button("Button");
        btn.addClickListener(new Button. ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				Data dt = (Data) tbl.getValue();
				
				bic.removeItem(dt);
				
			}
		});
        layout.addComponent(btn);*/
    	/*boolean flag = true;
    	Panel pnl =  new Panel("Login");
    	VerticalLayout layout = new VerticalLayout();
    	pnl.setContent(layout);
    	TextField id= new TextField("ID");
    	TextField name= new TextField("Fname");
    	TextField age = new TextField("Age");
    	layout.addComponents(id,name,age);
    	
    	DBConnection dbobj = new DBConnection();
    	Button btn = new Button("Button");
    	btn.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
			   // System.out.print(id.getValue() +" " + name.getValue() );
				Person p1 = new Person();
		    	p1.setId(Integer.parseInt(id.getValue()));
		    	if(name != null && !name.equals(""))
		    	p1.setFname(name.getValue());
		    	if(age != null && age = " ")
		    	p1.setAge(Integer.parseInt(age.getValue()));
			    try {
			    	if(!flag){
			    	   dbobj.insertdataintoDB(p1);
			    	}else{
			    		//dbobj.updateData(p1);
			    		dbobj.deleteId(Integer.parseInt(id.getValue()));
			    	}
					//dbobj.insertdataintoDB(Integer.parseInt(id.getValue()),name.getValue(),Integer.parseInt(age.getValue()));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
    	layout.addComponent(btn);
    	setContent(pnl);
*/    	/*final VerticalLayout layout = new VerticalLayout();
    	layout.addComponent(grid);
    	filtertex.setInputPrompt("Filter by name....");
    	filtertex.addTextChangeListener(e->{
    		grid.setContainerDataSource(new BeanItemContainer<>(Customer.class,service.findAll(e.getText())));
    	});
    	Button btn = new Button(FontAwesome.TIMES);
    	btn.addClickListener(e->{
    		filtertex.clear();
    	});
    	CssLayout lay = new CssLayout();
    	lay.setStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
    	lay.addComponents(filtertex,btn);
    	grid.setColumns("id","firstName", "lastName", "email");
    	layout.addComponents(lay,grid);
    	updateList();
    	layout.setMargin(true);
    	setContent(layout);
    	*/
    	
    	
    	VerticalLayout layout = new VerticalLayout();
    	 Table  tbl = new Table("Person"); 
    	tbl.setHeight("50%");
    	tbl.setWidth("50%");
    	//tbl.setSelectable(true);
    	//tbl.setImmediate(true);
    	tbl.setColumnCollapsingAllowed(true);
    	tbl.addContainerProperty("id", Link.class, null);
    	tbl.addContainerProperty("fname", String.class, null);
    	tbl.addContainerProperty("age", Integer.class, null);
    	
    	DBConnection dbobj = new DBConnection();
			List<Person> list = null;
			try {
				list = dbobj.getPersonDetails();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BeanItemContainer<Person> container = new BeanItemContainer<Person>(Person.class);
			for(Person pe:list){
                Link link = new Link(String.valueOf(pe.getId()),new ExternalResource("#"));
                container.addItem(link);
				container.addBean(pe);
				System.out.println("persona:"+ pe+" "+tbl);
			}
			tbl.setContainerDataSource(container);
			tbl.setVisibleColumns( new Object[] {"id", "fname","age"} );
			tbl.setColumnHeaders(new String[]{"ID","First Name","Age"});
			tbl.addGeneratedColumn("generated", new ColumnGenerator() {

		        public Component generateCell(Table source,
		                    final Object itemId, Object columnId) {
		        	CheckBox cb = new CheckBox("checks");
		        	/*Link link = new Link("Click Me!",
		        	        new ExternalResource(""));

		            Button button = new Button("caption");
		            //Listener for the button
		            button.addClickListener(Event -> {
		                Notification.show("Hello");
		            });
*/		           
		        	return cb;
		        }          
		});		
			layout.addComponent(tbl);
			setContent(layout);
			/*Button btn = new Button("Button");
			btn.addClickListener(new Button.ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {

					getUI().getPage().setLocation("http://www.google.com");

					
				}
			});
			VerticalLayout popupContent = new VerticalLayout();
			popupContent.addComponent(new TextField("Textfield"));
			popupContent.addComponent(new Button("Button"));
			PopupView popup = new PopupView("Pop it up", popupContent);
			BrowserWindowOpener opener = new BrowserWindowOpener(MyApplication.class);// "http://google.com"
			opener.setFeatures("height=500,width=500,resizable");
			//opener.setWindowName("_blank");// _new, _blank, _top, etc.
			Button newWindowButton = new Button("Open Sesame");
			opener.extend(newWindowButton);
			//opener.setParameter("foo", "bar");
			//opener.setUriFragment("myfrigment");
			layout.addComponents(tbl,btn,popup,newWindowButton);
	    	setContent(layout);
	    	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/    	/*Panel pnl = new Panel("Fruits details");
    	GridLayout layout = new GridLayout();
    	pnl.setContent(layout);
    	Tree tree = new Tree("My Tree");
    	tree.addStyleName("tr");
    	tree.addItem("Mango");
    	tree.addItem("DevGad");
    	tree.setChildrenAllowed("DevGad", false);
    	tree.setParent("DevGad", "Mango");
    	tree.expandItem("Mango");
    	tree.addItem("Banana");
    	
    	HorizontalLayout hlayout = new HorizontalLayout();*/
    	/*TreeTable tbl = new TreeTable("My Table");
    	tbl.addStyleName("tbl");
    	tbl.addContainerProperty("Name", String.class , null);
    	tbl.addContainerProperty("Address", String.class, null);
    	tbl.addContainerProperty("MobileNumber", Integer.class, null);
    	tbl.setHeight("300px");
    	tbl.setWidth("300px");
    	tbl.addItem(new Object[]{"Nilesh",null,null},0);
    	tbl.addItem(new Object[]{"Banti","pune",9405},1);
    	tbl.setParent(1, 0);
    	tbl.addItem(new Object[]{"dydyh","shak",9405},2);
    	tbl.setParent(2,0);
    	tbl.addItem(new Object[]{"Coffee", "nn",25}, 3);
    	tbl.addItem(new Object[]{"Tea","dhhd", 42}, 4);
*/    	
    	/*Object newItemId = tbl.addItem();
    	Item row = tbl.getItem(newItemId);  
    	row.getItemProperty("Name").setValue("Nilesh");
    	row.getItemProperty("Address").setValue("adhe");
    	row.getItemProperty("MobileNumber").setValue(9862);
    	tbl.addItem(new Object[]{"fdf","fd",94049},2);
    	tbl.addItem(new Object[]{"dfd","vv",94049},3);*/
    /*	Collection<Planet> people = Arrays.asList(new Planet(12, "Nicolaus"),
    			new Planet(15, "Copernicus"),
    			new Planet(25, "Johannes"));
    	BeanItemContainer<Planet> container = new BeanItemContainer<Planet>(Planet.class,people);*/
    	/*Grid grid = new Grid("Student");
    	grid.addColumn("Standard",Integer.class);
    	grid.addColumn("Name",String.class);
    	
    	grid.setColumnOrder("Standard","Name");
    	grid.setSelectionMode(SelectionMode.SINGLE);
    	Object[][]  peopl = {{5,"Nukes"},{6,"yyshs"}};
    	for(Object[] pi:peopl){
    		grid.addRow(pi);
    	}
    	final Label  selection = new Label("-");
    	layout.addComponent(selection);
    	MenuBar.Command myCommand = new MenuBar. Command() {
			
			@Override
			public void menuSelected(MenuItem selectedItem) {
				selection.setValue("Ordered a"+ selectedItem.getText() +"from menu");
				
			}
		};
    	MenuBar bar = new MenuBar();
    	MenuItem drink = bar.addItem("Beverages", null);
    	MenuItem  hots = drink.addItem("Hot", null);
    	hots.addItem("Tea", new ThemeResource("icons/coffee-16px.png"),myCommand);
    	hots.addItem("Coffee", new ThemeResource("icons/coffee-16px.png"),myCommand);
    	 MenuItem cold = drink.addItem("Cold", null);
    	 cold.addItem("Milk", new ThemeResource("icons/coffee-16px.png"),myCommand);
    	 cold.addItem("Weissbier", new ThemeResource("icons/coffee-16px.png"),myCommand);
    	 
    	 ProgressBar bar1 = new ProgressBar(0.0f);
         bar1.setImmediate(false);    	 
         bar1.setCaption("50 percentage");
         Slider slid = new Slider(1,100);
         slid.setOrientation(SliderOrientation.VERTICAL);
         VerticalLayout popupContent = new VerticalLayout();
         popupContent.addComponent(new TextField("Textfield"));
         popupContent.addComponent(new Button("Button"));

    	  PopupView popup = new PopupView("Popup it",popupContent);
    	  GregorianCalendar start = new GregorianCalendar();   */
    	  //	grid.setFrozenColumnCount(2);
    	//grid.addRow("Nilesh",5);
    	//grid.addRow("Pankaj",8);
    	//grid.setSelectio nMode(SelectionMode.SINGLE);
    	//grid.setColumnOrder("id","name");
    	
    	//Button btn = new Button("Button");
    	//layout.addComponent(component);
    	/*BeanItemContainer<Planet> container = new BeanItemContainer<Planet>(Planet.class);
    	container.addItem(new Planet(1, "Mercury"));
        container.addItem(new Planet(2, "Venus"));
        container.addItem(new Planet(3, "Earth"));
        container.addItem(new Planet(4, "Mars"));
        */
        /*hlayout.addComponents(grid,bar,bar1,slid,popup);
    	layout.addComponents(tree,hlayout);
    	setContent(pnl);*/
    	
    	
    	
    	
    	
    	/*// Panel 1
    	Panel pn1 = new Panel("Main View");
    	pn1.addStyleName("pnl");
    	pn1.setHeight("300px");
    	pn1.setWidth("300px");
    	VerticalLayout layout = new VerticalLayout();
    	// Couple of horizontally laid out components
        Tree tree = new Tree("My Tree" );
        tree.addItem("One");
        tree.addItem("Four");
        tree.setChildrenAllowed("Four", false);
        tree.setParent("Four","One");
        tree.expandItem("One");
        
        tree.addItem("Five");
        tree.setChildrenAllowed("Five", false);
        tree.setParent("Five","One");
        tree.expandItem("One");
        
        tree.addItem("Six");
        tree.setChildrenAllowed("Six", false);
        tree.setParent("Six","One");
        tree.expandItem("One");
        
        tree.addItem("Two");
        tree.addItem("Seven");
        tree.setChildrenAllowed("Seven", false);
        tree.setParent("Seven","Two");
        tree.expandItem("Two");
        
        tree.addItem("Eight");
        tree.setChildrenAllowed("Eight", false);
        tree.setParent("Eight","Two");
        tree.expandItem("Two");
        layout.addComponent(tree);
    	
    	pn1.setContent(layout);
    	// Panel 2
    	Panel pn2 = new Panel("Login View");
    	pn2.addStyleName("pnl2");
    	pn2.setHeight("300px");
    	pn2.setWidth("300px");
    	FormLayout layout2 = new FormLayout();
    	layout2.addComponent(new TextField("Username"));
    	layout2.addComponent(new TextField("Password"));
    	Link link = new Link("Register",new ExternalResource(""));
    	link.addStyleName("stylenm");
    	Button btn = new Button("Login");
    	btn.addStyleName(ValoTheme.BUTTON_SMALL); 
    	layout2.addComponents(link,btn);
    	pn2.setContent(layout2);
                

    	// Panel 3
    	Panel pn3 = new Panel("Help View");
    	pn3.addStyleName("pnl3");
    	pn3.setHeight("300px");
    	pn3.setWidth("300px");
    	HorizontalLayout layout3 = new HorizontalLayout();
    	Label lbl = new Label("Help On Boxes");
    	lbl.setContentMode(ContentMode.PREFORMATTED);
    	Label lbl3 = new Label("Boxes are things than can be \n"+
    	"somewhere while not .\n"+ "being in some other place");
    	layout3.addComponents(lbl,lbl3);
    	pn3.setContent(layout3);
  
    	// Panel 4
    	Panel pn4 = new Panel("Registration View");
    	pn4.addStyleName("pnl4");
    	pn4.setHeight("300px");
    	pn4.setWidth("300px");
    	FormLayout flayout2 = new FormLayout();
        flayout2.addComponent(new TextField("Name"));
        flayout2.addComponent(new TextField("UserName"));
        flayout2.addComponent(new TextField("Email"));
        flayout2.addComponent(new TextField("..."));
    	pn4.setContent(flayout2);
  
    	
    	// Merging Layout
    	VerticalLayout lay3 = new VerticalLayout();
    	lay3.addStyleName("custom-margins");
    	lay3.addStyleName("mergeLayout");
        lay3.addComponents(pn1,pn2,pn3,pn4);
    	setContent(lay3);
*/    	
    	
    	/*Panel pnl = new Panel("Login View");
    	pnl.setHeight("350px");
    	pnl.setWidth("350px");
    	CheckBox checkboc= new CheckBox();
    	checkboc.setCaption("Radio");
    	checkboc.setValue(true);
    	FormLayout flayout = new FormLayout();
    	pnl.setContent(flayout);
    	flayout.addStyleName("layo");
    	flayout.addComponent(new TextField("Username"));
    	flayout.addComponent(new TextField("Password"));
    	flayout.addComponent(checkboc);
    	Link link = new Link("Register",new ExternalResource(""));
    	link.addStyleName("stylenm");
    	Button btn = new Button("Login");
    	btn.addStyleName(ValoTheme.BUTTON_SMALL);
    	flayout.addComponents(link,btn);
    	//flayout.setComponentAlignment(pnl, Alignment.TOP_LEFT);
    	
    	
    	Window subwin = new Window();
    	Panel pnl2 = new Panel("Registration View");
    	pnl2.setHeight("350px");
    	pnl2.setWidth("350px");
    	FormLayout flayout2 = new FormLayout();
        pnl2.setContent(flayout2);
        flayout2.addComponent(new TextField("Name"));
        flayout2.addComponent(new TextField("UserName"));
        flayout2.addComponent(new TextField("Email"));
        flayout2.addComponent(new TextField("..."));
        subwin.setContent(pnl2);
        subwin.center();
    	addWindow(subwin);
        //setContent(pnl);
        
        
        //pnl.setContent(pnl2);
    	setContent(pnl);*/
    	//setContent(pnl2);
    	/*TextField myTextField = new TextField("remo");
    	myTextField.setValue("myfield");
    	myTextField.addStyleName("stylenm");

    	VerticalLayout ly = new VerticalLayout();
    	Panel pnl = new Panel("General");
    	FormLayout layout = new FormLayout();
    	Label lbl = new Label("Registraion");
    	pnl.setContent(layout);
    	//pnl.setHeight("500px");
    	//pnl.setWidth("500px");
    	pnl.setSizeUndefined();
    	ly.addComponent(pnl);
    	DateField dt= new DateField("Login Time");
    	layout.addComponents(dt);
    	layout.addComponent(new TextField("IP address"));
    	layout.addComponent(new TextField("Unique Identifier"));
    	layout.addComponent(new TextField("Version"));
    	DateField lastup= new DateField("Last Update Timestamp");
    	DateField cu= new DateField("Creation Timestamp");
    	layout.addComponents(lastup,cu,lbl,myTextField);
    	Layout lay = getformLayout();
    	layout.addComponent(lay);
    	HorizontalLayout horlayout = new HorizontalLayout();
    	Button btn = new  Button("Save");
    	//btn.addStyleName("left");
    	btn.setIcon(FontAwesome.SUPPORT);
    	Button btn2 = new  Button("Cancel");
    	//btn2.addStyleName("mystyle");
    	btn2.setIcon(FontAwesome.ALIGN_JUSTIFY);
    	btn.addStyleName(ValoTheme.BUTTON_FRIENDLY);
    	btn2.addStyleName(ValoTheme.BUTTON_SMALL);
    	horlayout.setMargin(true);
    	horlayout.setSpacing(true);
    	horlayout.addComponents(btn,btn2);
    	layout.addComponent(horlayout);
    	//ly.addComponent(layout);
    	
    	//horlayout.setComponentAlignment(btn, Alignment.MIDDLE_CENTER);
    	//horlayout.setComponentAlignment(btn2, Alignment.BOTTOM_LEFT);
    	ly.setComponentAlignment(pnl, Alignment.TOP_CENTER);
    	
    	
    	setContent(ly);
   	    
    	
*/    //	
    	
    	
    	
   // }
    	/*Panel pn1 = new Panel("Vertical Panel");
    	VerticalLayout verlay = new VerticalLayout();
    	pn1.setContent(verlay);
    	pn1.setHeight("500px");
    	pn1.setWidth("500px");
    	verlay.addComponent(new Label("Login"));
    	verlay.addComponent(new TextField("Username"));
    	verlay.addComponent(new TextField("Password"));
    	Button btn = new Button("Login");
    	btn.addStyleName(ValoTheme.BUTTON_FRIENDLY);
    	verlay.setMargin(true);
    	verlay.setSpacing(true);
    	verlay.addComponent(btn);
    	VerticalLayout li = new VerticalLayout();
    	Panel lout = getHoriLayout();
    	li.addComponents(pn1,lout);
    	//lout.setContent(pn1);
    	//pn1.setContent(lout);
    	setContent(li);
*/    	//setContent(pn1);
    	/*Panel pn = new Panel("Horizonal Panel");
    	HorizontalLayout horlay = new HorizontalLayout();
    	pn.setContent(horlay);
    	horlay.addComponent(new Label("Registration"));
    	horlay.addComponent(new TextField("Username"));
    	horlay.addComponent(new Button("Login"));
    	horlay.setMargin(true);
    	horlay.setSpacing(true);*/
    	//setContent(content);
    	//verlay.addComponent(pn);
    	//setContent(pn);
    	//setContent(pn1);
    	//setContent(horlay);
    	

		/*Panel pn = new Panel("Login");
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeUndefined();
        pn.setContent(layout);
        
        pn.setHeight("300px");
        pn.setWidth("400px");
        //pn.addStyleName("test");
    //  pn.setVisible(BorderStyle.MINIMAL);
        TextField tx = new TextField("Username");
        layout.addComponent(tx);
       // layout.addComponent(new TextField("Username"));
        layout.addComponent(new TextField("Password"));
        
        layout.setMargin(true);
        layout.setSpacing(true);
        DateField date = new DateField();
        date.setValue(new Date());
        //date.setLocale(new Locale("en","IND"));

        Button btn = new Button("Login");
        btn.addStyleName(ValoTheme.BUTTON_FRIENDLY);
        layout.addComponents(btn,date);
        layout.setComponentAlignment(date, Alignment.BOTTOM_CENTER);
        setContent(pn);
*/        
       // layout.setComponentAlignment(btn, Alignment.MIDDLE_CENTER);
       
        
        
       // layout.setComponentAlignment(btn, Alignment.BOTTOM_RIGHT);
        //layout.setComponentAlignment(pn, Alignment.MIDDLE_CENTER);
        
           
    	
    	// vertical layout
    	/*setContent(new Label("Here is MY UI"));
    	Window subwindow = new Window();
    	subwindow.setHeight("200px");
    	subwindow.setWidth("200px");
    	VerticalLayout layout = new VerticalLayout();
    	layout.setMargin(true);
    	layout.setSpa
    	cing(true);
    	 subwindow.setContent(layout);
    	 layout.addComponent(new Label("Meatball sub"));
    	 layout.addComponent(new Button("Awlright"));
    	 subwindow.center();
    	 addWindow(subwindow);
    	*/
    	    	 //layout.addComponent(hsplit);

    	// Create the content
    	/*FormLayout content = new FormLayout();
    	content.addStyleName("mypanelcontent");
    	content.addComponent(new TextField("Participant"));
    	content.addComponent(new TextField("Organization"));
    	content.setSizeUndefined(); // Shrink to fit
    	content.setMargin(true);
    	panel.setContent(content);
*/
        // The composition root MUST be set
        //setCompositionRoot(pnl);

    	/*vertlayout.addComponent(new TextField("Name"));
    	vertlayout.addComponent(new TextField("Street address"));
    	vertlayout.addComponent(new TextField("Postal code"));
    	Button btn = new Button("Click Me!");
    	btn.addClickListener(click->Notification.show("Don't press"));
    	ListSelect sel = new ListSelect("the list");
    	sel.addItems("Mercury", "Venus", "Earth");
    	sel.setNullSelectionAllowed(false);
    	sel.setRows(5);
    	NativeSelect nsel = new NativeSelect();
    	nsel.addItem("sjjs");
    	nsel.addItem("dnd");
    	nsel.addItem("dd");
    
    	ComboBox bx = new ComboBox("como");
    	bx.addItem("sjjs");
    	bx.addItem("dnd");
    	bx.addItem("dd");
    	bx.setFilteringMode(FilteringMode.STARTSWITH);
    	  vertlayout.addComponents(btn,bx,sel,nsel);*/
    	/*TextField txf = new TextField("Name");
    	Button btn = new Button("Button ");
    	vertlayout.setMargin(true);
    	vertlayout.setSpacing(true);
    	vertlayout.addComponents(txf,btn);
 */   	//setContent(vertlayout);
    	
        // Horizontal layout
    	/*HorizontalLayout horlayout = new HorizontalLayout();
    	Label lbl = new Label();     
        lbl.setValue("Register");
        TextArea txarea = new TextArea();
        txarea.setValue("new student \n"+"Registraction");
        CheckBox ch = new CheckBox("Option");
       // horlayout.setMargin(true);
        horlayout.setSpacing(true);
        ListSelect se = new ListSelect("List");
        se.addItems("lsit","ksksj","dbdhn","abc");
       
        NativeSelect ss = new NativeSelect("Native Select");
        ss.addItems("Mercury","Venus");
        // radio button
        ComboBox cb = new ComboBox("Combo Box");
        cb.addItems("djd","dndjd","saj","abc");
        cb.setFilteringMode(FilteringMode.STARTSWITH);
        // radion button
        OptionGroup opgrp = new OptionGroup("option");
        opgrp.addItems("Single", "Sola", "Yksi");
        // check box
        OptionGroup  multi = new OptionGroup("Multiple selection");
        multi.setMultiSelect(true);
        multi.addItems("Many", "Muchos", "Monta");
        multi.setItemEnabled("Muchos", false);*/
        /*Grid grd = new Grid();
        grd.setSelectionMode(SelectionMode.MULTI);
        grd.addColumn("Name",String.class);
        grd.addColumn("Age",Integer.class);
        Object[][] people = { {"Nicolaus Copernicus", 1543},
                {"Galileo Galilei", 1564},
                {"Johannes Kepler", 1571}};
        for(Object[] per:people)
        grd.addRow(per);*/
        
       // host.addItem("Tea", new ThemeResource("icons/tea-16px.png"));
        //horlayout.addComponent(bar);
         /* grd.addRow("Nilesh",25);
         grd.addRow("banti",52);
        */ 
        
        /*Tree tree = new Tree();
        tree.addItem("Mercury");
        tree.addItem("mers");
        tree.setChildrenAllowed("mers", false);
        tree.setParent("mers","Mercury");
        tree.expandItem("Mercury");
        tree.addItem("Earth");
        tree.addItem("The moon");
        tree.setChildrenAllowed("The moon", false);
        tree.setParent("The moon","Earth");
        tree.expandItem("Earth");
        tree.addItem("ddhsj");
        */

        /*  final ProgressBar bar = new ProgressBar();
         bar.setImmediate(true);
         VerticalLayout popupContent = new VerticalLayout();
         popupContent.addComponent(new TextField("Textfield"));
         popupContent.addComponent(new Button("Button"));

         // The component itself
         PopupView popup = new PopupView("Pop it up", popupContent);
         //layout.addComponent(popup);

         Slider verslid = new Slider(1,100);
         verslid.setOrientation(SliderOrientation.VERTICAL);
        horlayout.addComponents(txarea,ch,ss,se,cb,opgrp,multi,bar,verslid);
        vertlayout.addComponent(horlayout);
*/        
        /*Table tbl = new Table("My table");
        tbl.addContainerProperty("Name", String.class, null);
        tbl.addContainerProperty("Address", String.class, null);
        tbl.addContainerProperty("Mobile Number", Integer.class, null);
        Object newobj = tbl.addItem();
        Item row = tbl.getItem(newobj);
        row.getItemProperty("Name").setValue("Nilesh");
        row.getItemProperty("Address").setValue("aadhe");
        row.getItemProperty("Mobile Number").setValue(9404);

         tbl.addItem(new Object[]{"Anns","ssj",9856},2); 
         tbl.addItem(new Object[]{"hdh","dgd",9856},3);
         tbl.addItem(new Object[]{"ete","ssj",9856},4);
         CheckBox editable = new CheckBox("Editable", true);
         editable.addValueChangeListener(valueChange -> // Java 8
             tbl.setEditable((Boolean) editable.getValue()));
*/         
         
       /* TwinColSelect  selc = new TwinColSelect("Select Targets");
        selc.addItems("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        selc.setRows(selc.size());
        selc.setValue(new HashSet<String>(Arrays.asList("Venus", "Earth", "Mars")));
        selc.addValueChangeListener(event -> horlayout.addComponent(new Label("Select:" + event.getProperty().getValue())));       
       */ 
        
        
        //vertlayout.setExpandRatio(horlayout, 1);
        
    	/*final VerticalLayout layout = new VerticalLayout();
    	final GridLayout layout2 = new GridLayout();
    	 Label label = new Label("Registration Form");
    	 label.setContentMode(ContentMode.PREFORMATTED);
    	 TextField name = new TextField("Name");
    	
    	 Button bt = new Button("byt ");
    	 TextArea tarea = new TextArea();
    	 tarea.setWordwrap(true);
    	 tarea.setValue("A row \n "+"Another row \n "+ "yet another row");
    	 PasswordField pwd = new PasswordField("Keep it secret");
    	 pwd.setValue("hsjsj");
    	 
    	 DateField date = new DateField();
    	 date.setDateFormat("yyyy-MM-dd");
    	 date.setValue(new Date());
    	 layout2.addComponents(label,name,tarea,pwd,date,bt);
*/    	 /*link.setTargetName("_blank");
    	 link.setIcon(new ThemeResource("img/nicubunu_Chain.png"));
    	 link.addStyleName   ("icon-after-captio");
    	 
*/    	
    	 //setContent(layout2);
    	 
    	 //setContent(layout2);
       /* final VerticalLayout layout = new VerticalLayout();
        TextField name = new TextField("Name:	");
        Button btn = new Button("\n Button");
        btn.setDescription("This is google web toolkit");
        Panel pn = new Panel("Panel containing");
        pn.setWidth("300px");
        pn.setContent(new Label("This is a Label inside a Panel. There is " +
              "enough text in t he label to make the text " +
              "get truncated when it exceeds the width of the panel."));
        Link link = new Link("Click Me",new ExternalResource("https://facebook.com"));
        link.setIcon(new ThemeResource("icons/external-link.png"));
        link.setTargetName("_blank");
        link.addStyleName("icon-after-caption");
        layout.addComponents(name,btn,pn,link);*/
       /*
        final TextField name = new TextField();
        name.setCaption("Type your name here:");
        TextField tf = new TextField("A Field");

     // Put some initial content in it
       tf.setValue("Stuff in the field");

    // Handle changes in the value
       tf.addValueChangeListener(event ->
               // Do something with the value
               Notification.show("Value is: " + ((Label) event).getValue()));

        Button button = new Button("Click Me");
        button.addClickListener( e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });
        
        layout.addComponents(name, button);
        layout.setMargin(true);
        layout.setSpacing(true);
        
*/        
        //setContent(layout);
   // }
     
    	}
    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = true)
    public static class MyUIServlet extends VaadinServlet {
    }
}
