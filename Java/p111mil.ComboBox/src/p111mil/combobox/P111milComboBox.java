/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p111mil.combobox;

import java.util.ArrayList;
import javax.swing.UIManager;
import p111mil.combobox.model.Usuario;
import p11mil.combobox.ui.FormularioCombo;

/**
 *
 * @author admin
 */
public class P111milComboBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Creamos una lista de usuarios */
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        //int id, String email, String nombreUsuario, String nombre, String apellido, String numeroTelefono
        usuarios.add(new Usuario (1, "juan.perez@gmail.com", "juanpe", "Juan", "Perez", "02926 421234"));
        usuarios.add(new Usuario (2, "mariagonzalez@yahoo.com.ar", "mgonzalez123", "Maria", "Gonzalez", "02926 511234"));
        usuarios.add(new Usuario (3, "esteban_garcia@hotmail.com", "garcia_esteban", "Esteban", "Garcia", "011 45671234"));
        
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        FormularioCombo formularioCombo = new FormularioCombo();
        
        /* Pasamos los usuarios al formulario y luego el metodo cargarCombo los carga en el combo */
        formularioCombo.setUsuarios(usuarios);
        formularioCombo.cargarCombo();
        
        formularioCombo.setLocationRelativeTo(null);
        formularioCombo.setVisible(true);
    }    
}
