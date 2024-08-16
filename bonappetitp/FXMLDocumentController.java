/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package bonappetitp;

/*All IMPORT HERE*/
import bonappetitp.Popup;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javafx.util.Duration; 
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FXMLDocumentController implements Initializable {
 
    /* For All Sounds */
    String path= "C:\\Users\\noufa\\Downloads\\BONAPPETITP\\src\\image\\buttonClickedAudio.mp3";
    Media media =new Media(new File(path).toURI().toString());
    MediaPlayer  mediaPalyer =new MediaPlayer(media);
    /*_________________________________________________________________________________________________________________________*/     
    /* First Interface */
    @FXML
    private ImageView BonAppetit;
    @FXML
    private Button LOGINONE;
    @FXML
    private Button CreateAccount;
    /*_________________________________________________________________________________________________________________________*/
    /* Second Interface */
    @FXML
    private Button LOGINTWO;
    @FXML
    private TextField OneEmailField;
    @FXML
    private PasswordField OnePasswordField;
    /*_________________________________________________________________________________________________________________________*/
    /* Third Interface */
    @FXML
    private Button SIGNIN; 
    @FXML
    private TextField FullName;
    @FXML
    private TextField SecondEmailField;
    @FXML
    private TextField PhoneNumber;
    @FXML
    private PasswordField SecondPasswordField;
    @FXML
    private PasswordField CPassword;
    
    /* DatePicker Age */
    @FXML
    private Label Age;
    @FXML
    private Label BindAge;
    @FXML 
    private DatePicker Birth;
    
    /* RadioButton F,M */
    @FXML
    private RadioButton Female;
    @FXML
    private RadioButton Male;
    
    /* ComboBox Cities */
    @FXML
    public String [] CityItems = {"Mecca","Jeddah"};
    @FXML
    public ObservableList<String> City = FXCollections.observableArrayList(CityItems);
    @FXML
    ComboBox<String> ComboBox = new ComboBox<>();
    /*_________________________________________________________________________________________________________________________*/
    /* Fourth Interface */
    @FXML
    private Button DicortionB;
    @FXML
    private Button MainCourseB;
    @FXML
    private Button AppetizersB;
    @FXML
    private Button SweetB;
    @FXML
    private Button DrinkB;
    /*_________________________________________________________________________________________________________________________*/
    /* Five-Six-Seven-Eight-Nine Interfaces */
    @FXML
    private Button cartAll;
    @FXML
    private Button backAll;
    /*_________________________________________________________________________________________________________________________*/
    /* Nine Interface */
    @FXML
    private Button CoordinationBTN;
    @FXML
    private Button DJBTN;
    /*_________________________________________________________________________________________________________________________*/
    /* Ten-Twelve Interfaces */
    @FXML
    private Button backNine;
    /*_________________________________________________________________________________________________________________________*/
    /* Thirteen Interfaces */
    @FXML
    private Button add; 
    @FXML
    private Button remove;
    @FXML
    private Button send;
    @FXML
    private TextField items;
    @FXML
    private TextArea noteTextArea; 
    @FXML
    private ListView <String> listItems;
    @FXML
    private ListView <Integer> listNumber;
    @FXML
    private Button orders;
    @FXML
    private Button Toorders;
    @FXML
    private ListView <String> orderList;
    @FXML
    private ListView <String> noteList;
    @FXML
    List<userProfile> users = new ArrayList();
    @FXML
    private Button OrderToHome;
    @FXML
    private Button sendOrder;
    @FXML
    private Button logout;
    @FXML
    private Button logout2;
    // key
    int PhoneNum;
    String userName;
    /*________________________________________________________________________*/
    @FXML
    private Object root;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    /*________________________________________________________________________*/   
    
    /* Start All Methods                                                      */
    
    /*Buttons In First Interface                                              */
    @FXML
    private void Logout(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("First.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void nextLOGINONE(ActionEvent event) throws Exception {
        /* For Sound */
        mediaPalyer.play();
        /* End Sound */
        
        // start user
        
        Session sessionR = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Query q = sessionR.createQuery("from userProfile");
        users = q.list();
        sessionR.close();
        root = FXMLLoader.load(getClass().getResource("Second.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void nextCreateAccount(ActionEvent event) throws Exception {
        /* For Sound */
        mediaPalyer.play();
        /* End Sound */
        root = FXMLLoader.load(getClass().getResource("Third.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    /*End Buttons In First Interface                                          */
    
    /*________________________________________________________________________*/    
    
    /*Button In Second Interface                                              */
    @FXML
    private void nextLOGINTWO(ActionEvent event) throws Exception {
        /* For Sound */
        mediaPalyer.play();
        /* End Sound */
        /* For Validition Second Interface */
            Window owner = LOGINTWO.getScene().getWindow();
        if (OneEmailField.getText().isEmpty()) {
            showAlertone(Alert.AlertType.ERROR, owner, "Error , Please enter your email !!");
            return;
        }        
        if (OnePasswordField.getText().isEmpty()|| OnePasswordField.getText().matches("[a-zA-Z ]*")) {
            showAlertone(Alert.AlertType.ERROR, owner, "Error , Please enter your Password using NUMBERS & CHARACTER or ONLY NUMBERS!!");
            return;
        } 
        /* End Validition Second Interface */
//        List<userProfile> users = new ArrayList();
        Session sessionR = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Query q = sessionR.createQuery("from userProfile");
        users = q.list();
        sessionR.close();
        for(userProfile user :users){
            if(OneEmailField.getText().equals(user.getEmail()) && OnePasswordField.getText().equals(user.getPassword())){
//                if(OnePasswordField.getText().equals(user.getPassword())){
//                   String userName= user.getName();
                root = FXMLLoader.load(getClass().getResource("Fourth.fxml"));
                stage = (Stage)((Node) event.getSource()).getScene().getWindow();
                scene = new Scene((Parent) root);
                stage.setScene(scene);
                stage.show(); 
                break;
               // welcome.setText("Weclome " + user.getName());
                //}
//                else{
//                showAlertone(Alert.AlertType.ERROR, owner, "Error , Wrong email or password, TRY AGAIN");
//            return;
//            }
            }
            else{
                showAlertone(Alert.AlertType.ERROR, owner, "Error , Wrong email or password, TRY AGAIN");
            }
//           welcome.setText(userName);
        }
    } 
    @FXML
    private static void showAlertone(Alert.AlertType alertType, Window owner, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
    private void showAlert(Alert.AlertType alertType, Window owner, String successful_, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /*End Button In Second Interface                                          */
    
    /*________________________________________________________________________*/
    
    /*Button In Third Interface For Age                                       */
    @FXML
    private void showAge(ActionEvent e){
        //Age.textProperty().Bind(Birth.valueProperty());
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int birthYear = (Birth.getValue().getYear());
        int show = year-birthYear;
        BindAge.setText(Integer.toString(show));
        Age.textProperty().bind(BindAge.textProperty());
    }
    /*End Button In Third Interface For Age                                   */
    
    /*Button In Third Interface                                               */
    @FXML
    private void nextSIGNIN(ActionEvent event) throws Exception {
        /* For Sound */
        mediaPalyer.play();
        /* End Sound */
        
        /* For Validition Third Interface */
        Window ownertwo = SIGNIN.getScene().getWindow();
        if (FullName.getText().isEmpty() || FullName.getText().matches("[0-9]*")) {
            showAlerttwo(Alert.AlertType.ERROR, ownertwo, "Error , Please enter your full name with ONLY STRINGS !!");            
            return;
        }
        if (SecondEmailField.getText().isEmpty()) {
            showAlerttwo(Alert.AlertType.ERROR, ownertwo, "Error , Please enter your email  !!");
            return;
        }
        if (PhoneNumber.getText().isEmpty() || PhoneNumber.getText().matches("[a-zA-Z ]*")) {
            showAlerttwo(Alert.AlertType.ERROR, ownertwo, "Error , Please enter your phone number using ONLY NUMBERS  !!");
            return;
        }
        if (SecondPasswordField.getText().isEmpty()|| SecondPasswordField.getText().matches("[a-zA-Z ]*")) {
            showAlerttwo(Alert.AlertType.ERROR, ownertwo, "Error , Please enter your Password using NUMBERS & CHARACTER or ONLY NUMBERS !!");
            return;
        }
        if (CPassword.getText().isEmpty()|| CPassword.getText().matches("[a-zA-Z ]*")) {
            showAlerttwo(Alert.AlertType.ERROR, ownertwo, "Error , Please enter your Password using NUMBERS & CHARACTER or ONLY NUMBERS !!");
            return;
        }
        /* End Validition Third Interface */
        
        else{
            userProfile c = new userProfile();
            c.setFullname(FullName.getText());
            int phoneNum = Integer.parseInt(PhoneNumber.getText());
            c.setPhoneNum(phoneNum);
            PhoneNum = phoneNum;
            c.setEmail(SecondEmailField.getText());
            c.setPassword(SecondPasswordField.getText());
            c.setCity(ComboBox.getValue());
            c.setDop(Birth.getValue().toString());
            if (Female.isSelected()){
                c.setGender("Female");
            }
            else{
                c.setGender("Male");
            }
            Session session = HibernateUtil.getSessionFactory().openSession();
        //    session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            session.save(c);
            tx.commit();
             session.close();
        root = FXMLLoader.load(getClass().getResource("Fourth.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    } }
    @FXML
    private static void showAlerttwo(Alert.AlertType alertType, Window owner, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
    private void showAlert(Alert.AlertType alertType, Window ownertwo, String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /*End Button Third Interface                                              */    
    
    /*________________________________________________________________________*/
    
    /*Buttons In Secound-Third Interfaces KeyActions                          */
    @FXML
    public void switchFieldOne(KeyEvent event) throws Exception {
        if (event.getCode() == KeyCode.UP) {
                    OneEmailField.requestFocus();
                } if (event.getCode() == KeyCode.DOWN) {
                    OnePasswordField.requestFocus();
                } else if (event.getCode() == KeyCode.DOWN) {
                }} 
    @FXML
    public void switchFieldTwo(KeyEvent event) throws Exception {
                  if (event.getCode() == KeyCode.UP) {
                    SecondPasswordField.requestFocus();     
                } if (event.getCode() == KeyCode.DOWN){
                    CPassword.requestFocus();
                } else if (event.getCode() == KeyCode.DOWN) {
                }}
    @FXML
    public void switchFieldThree(KeyEvent event) throws Exception {
                  if (event.getCode() == KeyCode.UP) {
                    Female.requestFocus();     
                } if (event.getCode() == KeyCode.DOWN){
                    Male.requestFocus();
                } else if (event.getCode() == KeyCode.DOWN) {
                }}
    /*End Buttons In Secound-Third Interfaces KeyActions                      */
     
    /*________________________________________________________________________*/

    /*Buttons In Fourth Interface                                             */
    @FXML
    public void switchToMainCourse(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("Five.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToSweet(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("Six.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToAppetizers(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("Seven.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToDrinks(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("Eight.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void switchToDecoration(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("Nine.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    /*End Buttons In Fourth Interface                                         */

    /*________________________________________________________________________*/
    
    /*Back Buttons In 5-6-7-8-9-13 Interfaces                                 */
    @FXML
    public void switchToBack(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("Fourth.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    /*End Back Buttons In 5-6-7-8-9-13 Interfaces                             */
    
    /*Cart Button In 5-6-7-8-9-10-12 Interfaces                               */
    @FXML
    public void switchToCart(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("Thirteen.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    /*End Cart Button In 5-6-7-8-9-10-12 Interfaces                           */

    /*________________________________________________________________________*/    
    
    /*Buttons In Nine Interface                                               */
    @FXML
    public void switchToCoordinationBTN(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("Ten.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
     @FXML
    public void switchToDJBTN(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("Twelve.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    /*End Buttons In Nine Interface                                           */
    
    /*________________________________________________________________________*/
   
    /*Buttons In 10-12 Interfaces                                             */
    @FXML
    public void switchToBackNine(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("Nine.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    /*End Buttons In 10-12 Interfaces                                         */
    
    /*________________________________________________________________________*/
   
    /*Buttons In Thirteen Interface MouseAction                               */
    @FXML
    public void addList(ActionEvent event) throws Exception {
        listItems.getItems().add(items.getText());
        int random = (int)(1 +(Math.random()*30));  
        listNumber.getItems().add(random);
        orders order = new orders();
        order.setdishes(items.getText());
        order.setNote(noteTextArea.getText());
        //order.setPhoneNum(PhoneNum);
        order.setNum(random);
        Session session = HibernateUtil.getSessionFactory().openSession();
        //session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(order);
        tx.commit();
        session.close();
        
    }
    @FXML
    public void removeList(MouseEvent event)throws Exception {
             orders c = new orders();
                int index = listItems.getSelectionModel().getSelectedIndex();
                c.setdishes(listItems.getItems().get(index));
                c.setNum(listNumber.getItems().get(index));
                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction tx = session.beginTransaction();
                session.delete(c);
                tx.commit();
                session.close();
      // int selectedID = listItems.getSelectionModel().getSelectedIndex();
       listItems.getItems().remove(index);
       listNumber.getItems().remove(index);
    }
    /*End Buttons In Thirteen Interface MouseAction                           */

    /*________________________________________________________________________*/
    
    public void displayOrder(ActionEvent even){
        List<orders> user = new ArrayList();
        Session sessionR = HibernateUtil.getSessionFactory().openSession();
       // sessionR = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Query q = sessionR.createQuery("from orders");
        user = q.list();
        sessionR.close();
        for(orders c : user){
        orderList.getItems().add(c.getdishes());
        noteList.getItems().add(c.getNote());
        }
    }
    
    public void ToOrders(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("fourteen.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
    }
    public void send(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Fourth.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene((Parent) root);
        stage.setScene(scene);
        stage.show();
        Popup.display();
    }
    
    @Override
    public void initialize(URL FXMLDocumentController, ResourceBundle resources) {
    /*Animation In First Interface                                            */
        FadeTransition fadeTransition;
        fadeTransition = new FadeTransition(Duration.seconds(5), BonAppetit);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(3);     
        fadeTransition.play();
    /*End Animation In First Interface                                        */
    
    /*Cities In Third Interface                                               */
        ComboBox.setItems(City);
    /*End Cities In Third Interface                                           */
}}