module co.edu.uniquindio.prueba.crudapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.crud.crudapp to javafx.fxml;
    exports co.edu.uniquindio.crud.crudapp;
    opens co.edu.uniquindio.crud.crudapp.Controller to javafx.fxml;
    exports co.edu.uniquindio.crud.crudapp.Controller;
}