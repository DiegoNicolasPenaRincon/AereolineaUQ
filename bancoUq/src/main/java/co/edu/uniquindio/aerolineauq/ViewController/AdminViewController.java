package co.edu.uniquindio.aerolineauq.ViewController;

import co.edu.uniquindio.aerolineauq.AerolineaApplication;
import co.edu.uniquindio.aerolineauq.Listas.ListaSimple;
import co.edu.uniquindio.aerolineauq.controller.ModelFactoryController;
import co.edu.uniquindio.aerolineauq.model.Avion;
import co.edu.uniquindio.aerolineauq.model.RolTripulante;
import co.edu.uniquindio.aerolineauq.model.Ruta;
import co.edu.uniquindio.aerolineauq.model.Tripulante;
import co.edu.uniquindio.aerolineauq.utils.Persistencia;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class AdminViewController {

    @FXML
    private AnchorPane AnchorNavegacion;

    @FXML
    private AnchorPane anchorAeronaves;

    @FXML
    private AnchorPane anchorTripulantes;

    @FXML
    private ComboBox<String> avionComboBox;

    @FXML
    private Label avionLbl;

    @FXML
    private Label avionMostrarlbl;

    @FXML
    private Label avionlbl;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnAgregarAsignacion;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnEliminarAsignacion;

    @FXML
    private Button btnGestionAeronaves;

    @FXML
    private Button btnGestionEmbarque;

    @FXML
    private Button btnGestionTripulantes;

    @FXML
    private Button btnModificar;

    @FXML
    private TableColumn<Tripulante, String> columnApellido;

    @FXML
    private TableColumn<Tripulante, String> columnCorreo;

    @FXML
    private TableColumn<Tripulante, String> columnCorreoAsignado;

    @FXML
    private TableColumn<Tripulante, String> columnDireccion;

    @FXML
    private TableColumn<Tripulante, String> columnEstudios;

    @FXML
    private TableColumn<Tripulante, String> columnFecha;

    @FXML
    private TableColumn<Tripulante, String> columnID;

    @FXML
    private TableColumn<Tripulante, String> columnIDAsignado;

    @FXML
    private TableColumn<Tripulante, String> columnNombre;

    @FXML
    private TableColumn<Tripulante, String> columnNombreAsignado;

    @FXML
    private TableColumn<Tripulante, String> columnRol;

    @FXML
    private TableColumn<Tripulante, String> columnRolAsignado;

    @FXML
    private DatePicker dateNacimiento;

    @FXML
    private ComboBox<String> rutaComboBox;

    @FXML
    private TableView<Tripulante> tableTripulantes;

    @FXML
    private TableView<Tripulante> tableTripulantesAsignados;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtEstudios;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtNombre;
    @FXML
    private ComboBox<Tripulante> cbRol;

    private ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();

    private AerolineaApplication aplicacion;

    public AdminViewController() throws IOException {
    }

    public void setAplicacion(AerolineaApplication aplicacion) {
        this.aplicacion = aplicacion;
    }
/*
    public void initialize() {
        //Collection<Ruta> coleccionRuta=modelFactoryController.getAerolinea().getRutasAerolinea().toCollection();
        //Collection<Tripulante> coleccionTripulantes=modelFactoryController.getAerolinea().getListaTripulantes().toCollection();
        //Collection<Avion> coleccionAviones=modelFactoryController.getAerolinea().getListaAviones().toCollection();
        rutaComboBox.getItems().addAll(coleccionRuta);

        avionComboBox.getItems().addAll(coleccionAviones);

        columnNombreAsignado.setCellValueFactory( cellData -> new SimpleStringProperty( cellData.getValue().getNombre()) );
        columnIDAsignado.setCellValueFactory( cellData -> new SimpleStringProperty( cellData.getValue().getId() ));
        columnRolAsignado.setCellValueFactory( cellData -> new SimpleStringProperty( String.valueOf(cellData.getValue().getRolTripulante()) ) );
        columnCorreoAsignado.setCellValueFactory( cellData -> new SimpleStringProperty( cellData.getValue().getCorreo()) );

        tableTripulantesAsignados.setItems(FXCollections.observableList((List<Tripulante>) coleccionTripulantes));
        anchorAeronaves.setVisible(true);
        anchorTripulantes.setVisible(false);
    }

 */
/*
    @FXML
    void agregarTripulanteEvent(ActionEvent event) {
        String id = txtID.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String correo = txtCorreo.getText();
        String direccion = txtDireccion.getText();
        LocalDate fechaNacimiento = dateNacimiento.getValue();
        String estudios = txtEstudios.getText();


        if (id.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || direccion.isEmpty() || estudios.isEmpty() || fechaNacimiento == null) {
            mostrarAlerta("Error", "Todos los campos son obligatorios", Alert.AlertType.ERROR);
            return;
        }

        modelFactoryController.registrarTripulante(id, nombre , direccion, fechaNacimiento, correo, estudios,);
        registrarAccionesSistema("Registro Tripulante", 1, "Se registro el tripulante "+ nombre);

        mostrarAlerta("Éxito", "Tripulante registrado correctamente", Alert.AlertType.INFORMATION);

        limpiarCampos();
    }
hgfkyutg


    giyygiyikyhg

 */

    private void limpiarCampos() {
        txtID.clear();
        txtNombre.clear();
        txtApellido.clear();
        txtCorreo.clear();
        txtDireccion.clear();
        txtEstudios.clear();
        dateNacimiento.setValue(null);
        registrarAccionesSistema("Limpiar campos", 1, "Se limpiaron los campos ");
    }

    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
    public void registrarAccionesSistema(String mensaje, int nivel, String accion) {
        Persistencia.guardaRegistroLog(mensaje, nivel, accion);
    }

    @FXML
    void eliminarTripulanteEvent(ActionEvent event) {

    }

    @FXML
    void modificarTripulanteEvent(ActionEvent event) {

    }



    @FXML
    void cerrarSesion(ActionEvent event) {
        try{
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle(("Confirmación"));
            alert.setHeaderText(null);
            alert.setHeaderText("¿Esta seguro de que desea cerrar sesión?");
            Optional<ButtonType> option=alert.showAndWait();

            if(option.get().equals(ButtonType.OK)){
                aplicacion.mostrarVentanaPrincipal();
            }
        }catch(Exception e){
            System.out.println("Error al abrir la ventana."+e);
        }
    }

    @FXML
    public void mostrarAeronaves() {
        anchorAeronaves.setVisible(true);
        anchorTripulantes.setVisible(false);
    }

    @FXML
    public void mostrarTripulantes() {
        anchorAeronaves.setVisible(false);
        anchorTripulantes.setVisible(true);
    }
    

}
