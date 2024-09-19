/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;

/**
 *
 * @author CAMARGO
 */
public class Programa {

    private String url = "jdbc:mysql://localhost:3306/Restaurante";
    private String user = "root";
    private String senha = "";
    Connection conexao(){
        try {
        Connection conexao = DriveManager.getConnection(url, user, senha);
        return conexao;
        }
    }
}
