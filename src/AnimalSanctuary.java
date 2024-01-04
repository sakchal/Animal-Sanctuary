import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Represents an Animal Sanctuary Application.
 * @author Saketh Chaluvadi
 * @version 1
 */
public class AnimalSanctuary extends Application {

    /**
     * The main method.
     * @param args takes in string args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * The start method.
     * @param primaryStage takes in a primary stage
     */
    @Override
    public void start(Stage primaryStage) {
        // Create scene and background image
        StackPane pane = new StackPane();
        Image image = new Image("Animalfarm.jpeg");
        ImageView view = new ImageView(image);
        pane.getChildren().add(view);
        // An array for labels in the rectangle and rectangles in the grid view
        ArrayList<Label> rectangleLabels = new ArrayList<>();
        ArrayList<Rectangle> allRectangles = new ArrayList<>();

        // Title
        Text title = new Text("The Animal Sanctuary");
        title.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 45));

        BorderPane viewStuff = new BorderPane();
        viewStuff.setTop(title);
        BorderPane.setAlignment(title, Pos.TOP_CENTER);

        pane.getChildren().add(viewStuff);

        // BorderPane -> title, gridpane for animal view, and then another gridpane for
        // input form

        // Pane for user handles at bottom of screen
        GridPane userInput = new GridPane();
        userInput.setAlignment(Pos.BOTTOM_CENTER);
        userInput.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        userInput.setHgap(5.5);
        userInput.setVgap(5.5);
        Label nameLabel = new Label("Type name here: ");
        nameLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15));
        userInput.add(nameLabel, 0, 0);
        TextField name = new TextField();
        userInput.add(name, 0, 1);
        Label healthLab = new Label("Type health here: ");
        healthLab.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15));
        userInput.add(healthLab, 1, 0);
        TextField health = new TextField();
        userInput.add(health, 1, 1);
        Label animalTyp = new Label("Pick animal type: ");
        userInput.add(animalTyp, 2, 0);
        animalTyp.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15));
        ComboBox<Animal> animalType = new ComboBox<>();
        animalType.getItems().addAll(Animal.DOG, Animal.CAT, Animal.SQUIRREL, Animal.BIRD);
        animalType.setStyle("-fx-color: #EB0D1B");
        animalType.setValue(null);
        userInput.add(animalType, 2, 1);
        Button addAnimal = new Button("Add Animal");
        userInput.add(addAnimal, 3, 1);
        viewStuff.setBottom(userInput);

        // STACK PANES FOR RECTANGLES
        // StackPane for rectangle 1
        StackPane p1 = new StackPane();
        Rectangle r1 = new Rectangle(150, 150);
        allRectangles.add(r1);
        r1.setFill(Color.WHITE);
        r1.setStroke(Color.BLACK);
        Label l1 = new Label("Empty");
        rectangleLabels.add(l1);
        p1.getChildren().add(r1);
        p1.getChildren().add(l1);
        // StackPane for rectangle 2
        StackPane p2 = new StackPane();
        Rectangle r2 = new Rectangle(150, 150);
        allRectangles.add(r2);
        r2.setFill(Color.WHITE);
        r2.setStroke(Color.BLACK);
        Label l2 = new Label("Empty");
        rectangleLabels.add(l2);
        p2.getChildren().add(r2);
        p2.getChildren().add(l2);
        // StackPane for rectangle 3
        StackPane p3 = new StackPane();
        Rectangle r3 = new Rectangle(150, 150);
        allRectangles.add(r3);
        r3.setFill(Color.WHITE);
        r3.setStroke(Color.BLACK);
        Label l3 = new Label("Empty");
        rectangleLabels.add(l3);
        p3.getChildren().add(r3);
        p3.getChildren().add(l3);
        // StackPane for rectangle 4
        StackPane p4 = new StackPane();
        Rectangle r4 = new Rectangle(150, 150);
        allRectangles.add(r4);
        r4.setFill(Color.WHITE);
        r4.setStroke(Color.BLACK);
        Label l4 = new Label("Empty");
        rectangleLabels.add(l4);
        p4.getChildren().add(r4);
        p4.getChildren().add(l4);
        // StackPane for rectangle 5
        StackPane p5 = new StackPane();
        Rectangle r5 = new Rectangle(150, 150);
        allRectangles.add(r5);
        r5.setFill(Color.WHITE);
        r5.setStroke(Color.BLACK);
        Label l5 = new Label("Empty");
        rectangleLabels.add(l5);
        p5.getChildren().add(r5);
        p5.getChildren().add(l5);
        // StackPane for rectangle 5
        StackPane p6 = new StackPane();
        Rectangle r6 = new Rectangle(150, 150);
        allRectangles.add(r6);
        r6.setFill(Color.WHITE);
        r6.setStroke(Color.BLACK);
        Label l6 = new Label("Empty");
        rectangleLabels.add(l6);
        p6.getChildren().add(r6);
        p6.getChildren().add(l6);

        // Grid Pane for rectangles
        GridPane rectangles = new GridPane();
        rectangles.setAlignment(Pos.CENTER);
        rectangles.add(p1, 0, 0, 1, 1);
        rectangles.add(p2, 1, 0, 1, 1);
        rectangles.add(p3, 2, 0, 1, 1);
        rectangles.add(p4, 0, 1, 1, 1);
        rectangles.add(p5, 1, 1, 1, 1);
        rectangles.add(p6, 2, 1, 1, 1);
        viewStuff.setCenter(rectangles);

        // Event Handlers And Action Events
        addAnimal.setOnAction((ActionEvent e) -> {
            boolean newValue = false;
            for (int i = 0; i < rectangleLabels.size(); i++) {
                if (Integer.valueOf(health.getText()) > 5 || Integer.valueOf(health.getText()) < 0
                        || health.getText().equals(null)) {
                    health.setText("5");
                }
                if (rectangleLabels.get(i).getText().equals("Empty")) {
                    rectangleLabels.get(i).setText((name.getText().equals("") ? "No Name Yet" : name.getText()) + "\n"
                            + health.getText() + "\n" + animalType.getValue().name()); // Remember to add animal type
                    allRectangles.get(i).setFill(Color.RED);
                    name.setText(null);
                    health.setText(null);
                    animalType.setValue(null);
                    newValue = true;
                    break;
                }
            }
            if (!newValue) {
                Alert error = new Alert(Alert.AlertType.ERROR, "There is no more space!");
                error.showAndWait();
            }

        });

        // Mouse click events
        r1.setOnMouseClicked(e -> {
            l1.setText("Empty");
            r1.setFill(Color.WHITE);
        });
        r2.setOnMouseClicked(e -> {
            l2.setText("Empty");
            r2.setFill(Color.WHITE);
        });
        r3.setOnMouseClicked(e -> {
            l3.setText("Empty");
            r3.setFill(Color.WHITE);
        });
        r4.setOnMouseClicked(e -> {
            l4.setText("Empty");
            r4.setFill(Color.WHITE);
        });
        r5.setOnMouseClicked(e -> {
            l5.setText("Empty");
            r5.setFill(Color.WHITE);
        });
        r6.setOnMouseClicked(e -> {
            l6.setText("Empty");
            r6.setFill(Color.WHITE);
        });

        // Main scene and stage
        primaryStage.setTitle("My Animal Sanctuary");
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
