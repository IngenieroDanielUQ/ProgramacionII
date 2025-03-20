package co.edu.uniquindio.crud.crudapp.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.crud.crudapp.Model.Proyecto;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ProyectoController {

    private Proyecto proyectoSeleccionado;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnCrear;

    @FXML
    private Button btnObtener;

    @FXML
    private Button btnRemove;

    @FXML
    private TableColumn<Proyecto, String> codigoProyecto;

    @FXML
    private TableColumn<Proyecto, String> nombreProyecto;

    @FXML
    private TextField txtCodigoProyecto;

    @FXML
    private TextField txtNombreProyecto;

    @FXML
    private TableView<Proyecto> tablaInformacion;

    @FXML
    void initialize() {
        // Configurar columnas
        codigoProyecto.setCellValueFactory(cellData -> new SimpleStringProperty
                (cellData.getValue().getCodigo()));
        nombreProyecto.setCellValueFactory(cellData -> new SimpleStringProperty
                (cellData.getValue().getNombre()));

        // Evento al seleccionar fila
        tablaInformacion.getSelectionModel().selectedItemProperty().addListener
                ((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                proyectoSeleccionado = newSelection;
                txtNombreProyecto.setText(proyectoSeleccionado.getNombre());
                txtCodigoProyecto.setText(proyectoSeleccionado.getCodigo());
            }
        });
    }

    // CREATE
    @FXML
    void onCrearProyecto(ActionEvent event) {
        String nombre = txtNombreProyecto.getText();
        String codigo = txtCodigoProyecto.getText();

        if (nombre.isEmpty() || codigo.isEmpty()) {
            mostrarAlerta("Campos vacíos", "Debes llenar ambos campos.");
            return;
        }

        Proyecto nuevo = new Proyecto();
        nuevo.setNombre(nombre);
        nuevo.setCodigo(codigo);

        tablaInformacion.getItems().add(nuevo);
        limpiarCampos();
    }

    // READ (OBTENER SELECCIONADO)
    @FXML
    void onObtenerProyecto(ActionEvent event) {
        Proyecto proyecto = tablaInformacion.getSelectionModel().getSelectedItem();
        if (proyecto != null) {
            txtNombreProyecto.setText(proyecto.getNombre());
            txtCodigoProyecto.setText(proyecto.getCodigo());
        } else {
            mostrarAlerta("Selección vacía", "Debes seleccionar un proyecto.");
        }
    }

    // UPDATE
    @FXML
    void onActualizarProyecto(ActionEvent event) {
        if (proyectoSeleccionado != null) {
            proyectoSeleccionado.setNombre(txtNombreProyecto.getText());
            proyectoSeleccionado.setCodigo(txtCodigoProyecto.getText());
            tablaInformacion.refresh();
            limpiarCampos();
        } else {
            mostrarAlerta("Selección vacía", "Debes seleccionar un proyecto para actualizar.");
        }
    }

    // DELETE
    @FXML
    void onRemoverProyecto(ActionEvent event) {
        Proyecto proyecto = tablaInformacion.getSelectionModel().getSelectedItem();
        if (proyecto != null) {
            tablaInformacion.getItems().remove(proyecto);
            limpiarCampos();
        } else {
            mostrarAlerta("Selección vacía", "Debes seleccionar un proyecto para eliminar.");
        }
    }

    private void limpiarCampos() {
        txtNombreProyecto.clear();
        txtCodigoProyecto.clear();
        proyectoSeleccionado = null;
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}