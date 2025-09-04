package pe.edu.upeu.asistencia.control;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;



@Controller
public class MainguiController {

    @FXML
    private MenuItem menuItem1,menuItem2;
    @FXML
    private MenuBar menuBar;
    @FXML
    private TabPane tabPane;
    @Autowired
    private ApplicationContext context;
    @FXML
    public void initialize(){

    }
     class MEnuIemListener {


         public void handle(ActionEvent event) {
         }

         public void abrirArchivoFML(String filename, String tittle){
          try {

              FXMLLoader loader = new FXMLLoader(getClass().getResource(filename));
              loader.setControllerFactory(context::getBean);
              Parent root = loader.load();

              ScrollPane scrollPane = (ScrollPane) root;
              scrollPane.setFitToHeight(true);
              scrollPane.setFitToHeight(true);
              Tab newTab=new Tab(tittle,   scrollPane);
              tabPane.getTabs().add(newTab);
              tabPane.getTabs().add(newTab);
          } catch (Exception e) {
              throw new RuntimeException(e);
          }




     }

     class MenuListener{
        public void handle (ActionEvent event){

        }
     }
}
