import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import java.time.*;
import java.util.*;

public class GoodPizzaGreatPizza extends Application
{
	public static List<LeaveReply> reply_list = new ArrayList<>();
	public static List<Booking> booking_list = new ArrayList<>();
	public void start(Stage stage)
	{
		home_page(stage);
        stage.show();
    }

    public static void menu_page(Stage stage)
    {
    	VBox vb = new VBox();
    	for(int i=4;i<=10;i++)
    	{
    		Image menu = new Image("/pics/" + i + ".png");
    		ImageView iv = new ImageView(menu);
    		vb.getChildren().add(iv);
    	}
    	
    	ScrollPane sp = new ScrollPane();
    	sp.setContent(vb);
    	sp.setFitToWidth(true);
        
    	Button home = new Button("Home");
    	Button menu = new Button("Menu");
    	Button booking = new Button("Booking");
        Button contact = new Button("Contact Us");
        Button gallery = new Button("Gallery");
        home.setPrefWidth(65);
		home.setPrefHeight(20);
		menu.setPrefWidth(65);
		menu.setPrefHeight(20);
		booking.setPrefWidth(65);
		booking.setPrefHeight(20);
		contact.setPrefWidth(74);
		contact.setPrefHeight(20);
		gallery.setPrefWidth(65);
		gallery.setPrefHeight(20);
        home.setStyle("-fx-background-color: #000000; -fx-text-fill: white;  ");
        menu.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        booking.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        contact.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        gallery.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");

        HBox buttons = new HBox(15);
        buttons.getChildren().addAll(home, menu, booking, gallery, contact);
        buttons.setAlignment(Pos.CENTER_RIGHT);
		buttons.setPadding(new Insets(15, 0, 0 , 0));
		buttons.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
    	BorderPane bp = new BorderPane();
    	bp.setTop(buttons);
        
        bp.setCenter(sp);

		home.setOnAction(e -> home_page(stage));
		gallery.setOnAction(e -> gallery_page(stage));
		contact.setOnAction(e -> contact_page(stage));
		booking.setOnAction(e -> booking_page(stage));
		menu.setOnAction(e -> menu_page(stage));

    	Scene scene = new Scene(bp,975,500);
    	stage.setScene(scene);

    }

    public static void home_page(Stage stage)
    {
    	Image main_page = new Image("/pics/main_page.png");
		BackgroundImage backgroundImage = new BackgroundImage(main_page,
        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));
        Background background = new Background(backgroundImage);

        StackPane pane = new StackPane();
        pane.setBackground(background);

        Button menu = new Button("Menu");
        Button booking = new Button("Booking");
        Button contact = new Button("Contact Us");
        Button gallery = new Button("Gallery");
        Button best = new Button("Best Seller Menu");
        menu.setPrefWidth(74);
		menu.setPrefHeight(26);
		booking.setPrefWidth(74);
		booking.setPrefHeight(26);
		contact.setPrefWidth(74);
		contact.setPrefHeight(26);
		gallery.setPrefWidth(74);
		gallery.setPrefHeight(26);
        menu.setStyle("-fx-background-color: #CA2429; -fx-text-fill: white; -fx-background-radius: 15; -fx-scale-x: 1.25; -fx-scale-y: 1.25;");
        booking.setStyle("-fx-background-color: #CA2429; -fx-text-fill: white; -fx-background-radius: 15; -fx-scale-x: 1.25; -fx-scale-y: 1.25;");
        contact.setStyle("-fx-background-color: #CA2429; -fx-text-fill: white; -fx-background-radius: 15;-fx-scale-x: 1.25; -fx-scale-y: 1.25;");
        gallery.setStyle("-fx-background-color: #CA2429; -fx-text-fill: white; -fx-background-radius: 15;-fx-scale-x: 1.25; -fx-scale-y: 1.25;");
        best.setStyle("-fx-background-color: #37A049; -fx-text-fill: white; -fx-background-radius: 10;-fx-scale-x: 1.25; -fx-scale-y: 1.25;");
        HBox buttons = new HBox(30);
        buttons.getChildren().addAll(menu, booking, gallery, contact);
        buttons.setAlignment(Pos.CENTER);
        VBox vbox = new VBox(15);
        vbox.setAlignment(Pos.CENTER);       
        vbox.getChildren().addAll(buttons, best);
        
		BorderPane bp = new BorderPane();
        bp.setBottom(vbox);
        bp.setPadding(new Insets(20));
		pane.getChildren().add(bp);

		menu.setOnAction(e -> menu_page(stage));
		gallery.setOnAction(e -> gallery_page(stage));
		contact.setOnAction(e -> contact_page(stage));
		booking.setOnAction(e -> booking_page(stage));
		best.setOnAction(e -> best_seller_page(stage));

        Scene scene = new Scene(pane,975,500);
        stage.setScene(scene);
    }

    public static void gallery_page(Stage stage)
    {
    	StackPane pane = new StackPane();
    	ScrollPane scrollPane = new ScrollPane();
    	
    	Random random = new Random();

    	HBox starterBox = new HBox(40);
    	HBox pizzaBox = new HBox(40);
    	HBox soupBox = new HBox(40);
    	HBox pastaBox = new HBox(40);
    	HBox saladBox = new HBox(40);

    	Label starterLabel = new Label("Starters");
    	Label pizzaLabel = new Label("Pizzas");
    	Label soupLabel = new Label("Soups");
    	Label pastaLabel = new Label("Pastas");
    	Label saladLabel = new Label("Salads");
    	starterLabel.setStyle("-fx-font-size: 24px; -fx-text-fill: white; ");
    	pizzaLabel.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");
    	soupLabel.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");
    	pastaLabel.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");
    	saladLabel.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");


    	starterBox.setPadding(new Insets(15));
    	pizzaBox.setPadding(new Insets(15));
    	soupBox.setPadding(new Insets(15));
    	pastaBox.setPadding(new Insets(15));
    	saladBox.setPadding(new Insets(15));

    	int[] a = new int[5];
    	for(int i = 1; i<=4; i++)
    	{
    		int id = random.nextInt(4) + 1;
    		while(a[id]==1)
    		{
    			id = random.nextInt(4) + 1;
    		}
    		a[id] = 1;
    		Image image = new Image ("/pics/gallery_pics/pizza" + id + ".png");
    		ImageView iv = new ImageView(image);
    		pizzaBox.getChildren().add(iv);
    	}
    	int[] b = new int[5];
    	for(int i = 1; i<=4; i++)
    	{
    		int id = random.nextInt(4) + 1;
    		while(b[id]==1)
    		{
    			id = random.nextInt(4) + 1;
    		}
    		b[id] = 1;
    		Image image = new Image ("/pics/gallery_pics/starter" + id + ".png");
    		ImageView iv = new ImageView(image);
    		starterBox.getChildren().add(iv);
    	}
    	int[] c = new int[5];
    	for(int i = 1; i<=4; i++)
    	{
    		int id = random.nextInt(4) + 1;
    		while(c[id]==1)
    		{
    			id = random.nextInt(4) + 1;
    		}
    		c[id] = 1;
    		Image image = new Image ("/pics/gallery_pics/soup" + id + ".png");
    		ImageView iv = new ImageView(image);
    		soupBox.getChildren().add(iv);
    	}
    	int[] d = new int[5];
    	for(int i = 1; i<=4; i++)
    	{
    		int id = random.nextInt(4) + 1;
    		while(d[id]==1)
    		{
    			id = random.nextInt(4) + 1;
    		}
    		d[id] = 1;
    		Image image = new Image ("/pics/gallery_pics/pasta" + id + ".png");
    		ImageView iv = new ImageView(image);
    		pastaBox.getChildren().add(iv);
    	}
    	int[] f = new int[5];
    	for(int i = 1; i<=4; i++)
    	{
    		int id = random.nextInt(4) + 1;
    		while(f[id]==1)
    		{
    			id = random.nextInt(4) + 1;
    		}
    		f[id] = 1;
    		Image image = new Image ("/pics/gallery_pics/salad" + id + ".png");
    		ImageView iv = new ImageView(image);
    		saladBox.getChildren().add(iv);
    	}
    	VBox vbox = new VBox();
    	vbox.getChildren().addAll(starterLabel, starterBox, pizzaLabel, pizzaBox, soupLabel, soupBox, saladLabel, saladBox, pastaLabel, pastaBox);
    	vbox.setStyle("-fx-background-color: black;");
    	vbox.setAlignment(Pos.CENTER);
    	scrollPane.setContent(vbox);
    	Button home = new Button("Home");
    	Button booking = new Button("Booking");
        Button contact = new Button("Contact Us");
        Button menu = new Button("Menu");
        Button gallery = new Button("Gallery");
        home.setPrefWidth(65);
		home.setPrefHeight(20);
		booking.setPrefWidth(65);
		booking.setPrefHeight(20);
		contact.setPrefWidth(74);
		contact.setPrefHeight(20);
		menu.setPrefWidth(65);
		menu.setPrefHeight(20);
		gallery.setPrefWidth(65);
		gallery.setPrefHeight(20);
        home.setStyle("-fx-background-color: #000000; -fx-text-fill: white;  ");
        booking.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        contact.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        menu.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        gallery.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");

        HBox buttons = new HBox(15);
        buttons.getChildren().addAll(home, menu, booking, gallery, contact);
        buttons.setAlignment(Pos.CENTER_RIGHT);
		buttons.setPadding(new Insets(15, 0, 0, 0));
		buttons.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
    	BorderPane bp = new BorderPane();
    	bp.setTop(buttons);

		home.setOnAction(e -> home_page(stage));
		menu.setOnAction(e -> menu_page(stage));
		contact.setOnAction(e -> contact_page(stage));
		booking.setOnAction(e -> booking_page(stage));
		gallery.setOnAction(e -> gallery_page(stage));

        
        bp.setCenter(scrollPane);
		pane.getChildren().addAll(bp);
    	Scene scene = new Scene(pane, 975, 500);
    	stage.setScene(scene);
    }

    public static void contact_page(Stage stage)
    {
    	VBox vb = new VBox();
        Image image1 = new Image("/pics/contact.png");
        ImageView iv1 = new ImageView(image1);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(iv1);

        VBox nameBox = new VBox();
        Label nameLabel = new Label("Name");
    	nameLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: white; ");
        TextField nameText = new TextField();
        nameText.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("[a-zA-Z]*")) {
                nameText.setText(newValue.replaceAll("[^a-zA-Z]", ""));
            }
        });
        nameBox.getChildren().addAll(nameLabel, nameText);

        VBox numberBox = new VBox();
        Label numberLabel = new Label("Phone number");
    	numberLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: white; ");
        TextField numberText = new TextField();
        numberText.setText("8");
        numberText.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                numberText.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        numberText.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > 11) {
                numberText.setText(oldValue); 
            }
        });
        numberBox.getChildren().addAll(numberLabel, numberText);

        HBox name_number = new HBox(20);
        name_number.getChildren().addAll(nameBox, numberBox);

        VBox total = new VBox(20);
        TextArea reply_text = new TextArea();
        reply_text.setPrefSize(300, 200);
        reply_text.setWrapText(true);
        reply_text.setPromptText("Leave your reply here...");

        Button send_button = new Button("Send");
        send_button.setStyle("-fx-background-color: #CA2429; -fx-text-fill: white; -fx-background-radius: 15; -fx-scale-x: 1.25; -fx-scale-y: 1.25;");

        Label error = new Label("Please fill all blanks!");
    	error.setStyle("-fx-font-size: 14px; -fx-text-fill: rgba(255, 255, 255, 0); ");

    	HBox send_button_box = new HBox(20);
    	send_button_box.getChildren().addAll(send_button, error);
        total.getChildren().addAll(name_number, reply_text, send_button_box);
        total.setPadding(new Insets(0, 0, 10 , 0));
        total.setAlignment(Pos.BOTTOM_LEFT);


        TextField reply_field = new TextField();
                total.getChildren().add(reply_field);


        send_button.setOnAction(e -> {
        	if(nameText.getText().equals("") || numberText.getText().equals("") || numberText.getText().length()!=11 || reply_text.getText().equals("") || reply_field.getText().equals(""))
        	{
        		error.setStyle("-fx-font-size: 14px; -fx-text-fill: #CA2429; ");
        	}
        	else
        	{
	        	reply_list.add(new LeaveReply( nameText.getText(), numberText.getText(), reply_text.getText()));
	        	nameText.setText("");
	        	numberText.setText("");
	        	reply_text.setText("");
                reply_field.setText("");
	        	error.setStyle("-fx-font-size: 14px; -fx-text-fill: rgba(255, 255, 255, 0); ");

        	}
        	
        });




        BorderPane borderPane = new BorderPane();
        BorderPane.setMargin(total, new Insets(0, 135, 0, 0));
        borderPane.setRight(total);
        
        stackPane.getChildren().add(borderPane);

    	ScrollPane sp = new ScrollPane();
    	sp.setContent(stackPane);
    	sp.setFitToWidth(true);
        
    	Button home = new Button("Home");
    	Button booking = new Button("Booking");
        Button menu = new Button("Menu");
        Button gallery = new Button("Gallery");
        Button contact = new Button("Contact Us");
        home.setPrefWidth(65);
		home.setPrefHeight(20);
		booking.setPrefWidth(65);
		booking.setPrefHeight(20);
		menu.setPrefWidth(65);
		menu.setPrefHeight(20);
		gallery.setPrefWidth(65);
		gallery.setPrefHeight(20);
		contact.setPrefWidth(74);
		contact.setPrefHeight(20);
        home.setStyle("-fx-background-color: #000000; -fx-text-fill: white;  ");
        booking.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        menu.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        gallery.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        contact.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");

        HBox buttons = new HBox(15);
        buttons.getChildren().addAll(home, menu, booking, gallery, contact);
        buttons.setAlignment(Pos.CENTER_RIGHT);
		buttons.setPadding(new Insets(15, 0, 0 , 0));
		buttons.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
    	BorderPane bp = new BorderPane();
    	bp.setTop(buttons);
        
        bp.setCenter(sp);

		home.setOnAction(e -> home_page(stage));
		gallery.setOnAction(e -> gallery_page(stage));
		menu.setOnAction(e -> menu_page(stage));
		booking.setOnAction(e -> booking_page(stage));
		contact.setOnAction(e -> contact_page(stage));

    	Scene scene = new Scene(bp,975,500);
    	stage.setScene(scene);
    }

    public static void booking_page(Stage stage)
    {
    	Button home = new Button("Home");
    	Button booking = new Button("Booking");
        Button menu = new Button("Menu");
        Button gallery = new Button("Gallery");
        Button contact = new Button("Contact Us");
        home.setPrefWidth(65);
		home.setPrefHeight(20);
		booking.setPrefWidth(65);
		booking.setPrefHeight(20);
		menu.setPrefWidth(65);
		menu.setPrefHeight(20);
		gallery.setPrefWidth(65);
		gallery.setPrefHeight(20);
		contact.setPrefWidth(74);
		contact.setPrefHeight(20);
        home.setStyle("-fx-background-color: #000000; -fx-text-fill: white;  ");
        booking.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        menu.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        gallery.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        contact.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");

        HBox buttons = new HBox(15);
        buttons.getChildren().addAll(home, menu, booking, gallery, contact);
        buttons.setAlignment(Pos.CENTER_RIGHT);
		buttons.setPadding(new Insets(15, 0, 0 , 0));
		buttons.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
    	BorderPane bp = new BorderPane();
    	bp.setTop(buttons);
//**********************
    	Label error = new Label("");
		error.setStyle("-fx-font-size: 14px; -fx-text-fill: #CA2429; ");

    	Label booking_label = new Label("Booking");
    	booking_label.setAlignment(Pos.CENTER);
    	booking_label.setStyle("-fx-text-fill: white; -fx-font-size: 24px; -fx-font-weight: bold;");

    	Label name_label = new Label("Name");
    	name_label.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
    	TextField name_field = new TextField();
        name_field.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("[a-zA-Z]*")) {
                name_field.setText(newValue.replaceAll("[^a-zA-Z]", ""));
            }
        });

        Label email_label = new Label("Email (not required)");
        email_label.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
        TextField email_field = new TextField();

        Label phone_label = new Label("Phone number ");
        phone_label.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
        TextField phone_field = new TextField();
        phone_field.setText("8");
        phone_field.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                phone_field.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        phone_field.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > 11) {
                phone_field.setText(oldValue); 
            }
        });

        Label date_label = new Label("Date");
        date_label.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
        DatePicker calendar = new DatePicker();
        calendar.setValue(LocalDate.now());
        calendar.setOnAction(e -> 
        {
        	LocalDate now = LocalDate.now();
        	LocalDate booking_date = calendar.getValue();
        	if(booking_date.isBefore(now))
        	{
        		error.setStyle("-fx-text-fill: #CA2429");
        		error.setText("Please choose valid Date!");
        	}
        	else
        	{
        		error.setText("");
        	}
        });

        Label time_label = new Label("Time (hh/mm)");
        time_label.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
        ComboBox<Integer> hour = new ComboBox<>();
        ComboBox<Integer> minute = new ComboBox<>();
        for (int i = 9; i <= 22; i++) {
            hour.getItems().add(i);
        }
        hour.getSelectionModel().selectFirst();
        minute.getItems().addAll(00, 15, 30, 45);
        minute.getSelectionModel().selectFirst();
        HBox time = new HBox(10);
        time.getChildren().addAll(hour, minute);
        minute.setOnAction(e -> 
        {
        	LocalTime current_time = LocalTime.now();
        	int hour_int = current_time.getHour();
        	int minute_int = current_time.getMinute();
        	int x = hour.getValue()*60 + minute.getValue();
        	int y = hour_int*60 + minute_int;
        	if(calendar.getValue().isEqual(LocalDate.now()) && x-y < 60)
        	{
        		error.setStyle("-fx-text-fill: #CA2429");
        		error.setText("You can't book a table in less than an hour");
        	}
        	else
        	{
        		error.setText("");
        	}
        });

        Label size_label = new Label("Size");
        size_label.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
        SpinnerValueFactory.IntegerSpinnerValueFactory valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 8, 1); 
        Spinner<Integer> spinner = new Spinner<>();
        spinner.setValueFactory(valueFactory);

        Label description = new Label("Special requests (not required)");
        description.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
        TextArea request_text = new TextArea();
        //request_text.setPrefSize(300, 200);
        request_text.setWrapText(true);
        request_text.setPromptText("Leave your reply here...");

        Button make_booking = new Button("Save");
        make_booking.setStyle("-fx-background-color: #CA2429; -fx-text-fill: white; -fx-background-radius: 15; -fx-scale-x: 1.25; -fx-scale-y: 1.25;");
        make_booking.setOnAction(e -> 
        {
        	LocalDate now = LocalDate.now();
        	LocalDate booking_date = calendar.getValue();
        	LocalTime current_time = LocalTime.now();
        	int hour_int = current_time.getHour();
        	int minute_int = current_time.getMinute();
        	int x = hour.getValue()*60 + minute.getValue();
        	int y = hour_int*60 + minute_int;
        	if(booking_date!=null && booking_date.isBefore(now))
        	{
        		error.setStyle("-fx-text-fill: #CA2429");
        		error.setText("Please choose valid Date!");
        	}
        	else if(calendar.getValue().isEqual(LocalDate.now()) && x-y < 60)
        	{
        		error.setStyle("-fx-text-fill: #CA2429");
        		error.setText("You can't book a table in less than an hour");
        	}
        	else if(name_field.getText().equals("") || phone_field.getText().equals("") || phone_field.getText().length()!=11 || calendar.getValue()==null || hour.getValue()==null || minute.getValue()==null )
        	{
        		error.setStyle("-fx-text-fill: #CA2429");
        		error.setText("Please fill all blanks properly!");
        	}
        	else
        	{
        		error.setText("");
        		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		        alert.setTitle("Confirmation");
		        alert.setHeaderText("Are you sure you want to make a booking?");
		        alert.setContentText("Click OK to confirm or Cancel to abort.");

		        alert.showAndWait().ifPresent(response -> {
		            if (response == ButtonType.OK) {
		                booking_list.add(new Booking( name_field.getText(), email_field.getText(), phone_field.getText(), calendar.getValue(), hour.getValue(), minute.getValue(), spinner.getValue(), request_text.getText()));
		                name_field.setText("");
		                phone_field.setText("8");
		                email_field.setText("");
		                calendar.setValue(LocalDate.now());
		                spinner.getValueFactory().setValue(1);
		                hour.setValue(hour.getItems().get(0));
		                minute.setValue(minute.getItems().get(0));
		            } 
		        });
		        error.setStyle("-fx-text-fill: green");
		        error.setText("Your booking completed successfully!");
        	}

        });

        Button review_booking = new Button("Review current booking");
        review_booking.setStyle("-fx-background-color: #CA2429; -fx-text-fill: white; -fx-background-radius: 15;  -fx-scale-x: 1.25; -fx-scale-y: 1.25;");
        review_booking.setOnAction(e -> 
        {
        	if(booking_list.size()==0)
        	{
        		error.setStyle("-fx-text-fill: #CA2429");
        		error.setText("There is no current booking!");
        	}
        	else
        	{
	        	name_field.setText(booking_list.get(booking_list.size()-1).getName());
	        	phone_field.setText(booking_list.get(booking_list.size()-1).getNumber());
	        	email_field.setText(booking_list.get(booking_list.size()-1).getEmail());
	        	calendar.setValue(booking_list.get(booking_list.size()-1).getDate());
	        	spinner.getValueFactory().setValue(booking_list.get(booking_list.size()-1).getSize());
	        	hour.setValue(booking_list.get(booking_list.size()-1).getHour());
	        	minute.setValue(booking_list.get(booking_list.size()-1).getMin());
        	}
        	
        });
        HBox hbox = new HBox(30);
        hbox.getChildren().addAll(make_booking, review_booking);

        ScrollPane scrollPane = new ScrollPane();
    	BackgroundFill backgroundFill = new BackgroundFill(Color.web("#1A1A1A"), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill);
        

        GridPane gridPane = new GridPane();
        gridPane.setHgap(80);
        gridPane.setVgap(10);
        gridPane.setBackground(background);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(booking_label, 0, 0, 2, 1);
        gridPane.add(name_label, 0, 1, 1, 1);
        gridPane.add(name_field, 0, 2, 1, 1);
        gridPane.add(phone_label, 0, 3, 1, 1);
        gridPane.add(phone_field, 0, 4, 1, 1);
        gridPane.add(time_label, 0, 5, 1, 1);
        gridPane.add(time, 0, 6, 1, 1);

        gridPane.add(email_label, 1, 1, 1, 1);
        gridPane.add(email_field, 1, 2, 1, 1);
        gridPane.add(date_label, 1, 3, 1, 1);
        gridPane.add(calendar, 1, 4, 1, 1);
        gridPane.add(size_label, 1, 5, 1, 1);
        gridPane.add(spinner, 1, 6, 1, 1);

        gridPane.add(description, 0, 7, 2, 1);
        gridPane.add(request_text, 0, 8, 2, 1);
        gridPane.add(hbox, 0, 9, 1, 1);
        gridPane.add(error, 1, 9, 1, 1);
        scrollPane.setContent(gridPane);
        scrollPane.setFitToWidth(true);
		// scrollPane.setFitToHeight(true);
        bp.setCenter(scrollPane); //qwertyewerttrew

		home.setOnAction(e -> home_page(stage));
		gallery.setOnAction(e -> gallery_page(stage));
		menu.setOnAction(e -> menu_page(stage));
		booking.setOnAction(e -> booking_page(stage));
		contact.setOnAction(e -> contact_page(stage));

		Scene scene = new Scene(bp, 975, 500);
		stage.setScene(scene);
    }

    public static void best_seller_page(Stage stage)
    {
    	Button home = new Button("Home");
    	Button booking = new Button("Booking");
        Button menu = new Button("Menu");
        Button gallery = new Button("Gallery");
        Button contact = new Button("Contact Us");
        home.setPrefWidth(65);
		home.setPrefHeight(20);
		booking.setPrefWidth(65);
		booking.setPrefHeight(20);
		menu.setPrefWidth(65);
		menu.setPrefHeight(20);
		gallery.setPrefWidth(65);
		gallery.setPrefHeight(20);
		contact.setPrefWidth(74);
		contact.setPrefHeight(20);
        home.setStyle("-fx-background-color: #000000; -fx-text-fill: white;  ");
        booking.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        menu.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        gallery.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        contact.setStyle("-fx-background-color: #000000; -fx-text-fill: white; ");
        home.setOnAction(e -> home_page(stage));
		menu.setOnAction(e -> menu_page(stage));
		contact.setOnAction(e -> contact_page(stage));
		booking.setOnAction(e -> booking_page(stage));
		gallery.setOnAction(e -> gallery_page(stage));

        HBox buttons = new HBox(15);
        buttons.getChildren().addAll(home, menu, booking, gallery, contact);
        buttons.setAlignment(Pos.CENTER_RIGHT);
		buttons.setPadding(new Insets(15, 0, 0 , 0));
		buttons.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
    	BorderPane bp = new BorderPane();
    	bp.setTop(buttons);

    	Image image = new Image("/pics/best_seller.png");
		ImageView iv = new ImageView(image);
        bp.setCenter(iv);

        Scene scene = new Scene(bp, 975, 500);
        stage.setScene(scene);
    }

}

class LeaveReply 
{
	private String name;
	private String number;
	private String text;

	LeaveReply(){}
	LeaveReply(String name, String number, String text)
	{
		this.name = name;
		this.number = number;
		this.text = text;
	}
}

class Booking 
{
	private String name;
	private String email;
	private String number;
	private LocalDate date;
	private int min;
	private int hour;
	private int size;
	private String description;

	Booking(){}
	Booking(String name, String email, String number, LocalDate date, int hour, int min, int size, String description)
	{
		this.name = name;
		this.email = email;
		this.number = number;
		this.date = date;
		this.min = min;
		this.hour = hour;
		this.size = size;
		this.description = description;
	}

	public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getMin() {
        return min;
    }

    public int getHour() {
        return hour;
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }
}