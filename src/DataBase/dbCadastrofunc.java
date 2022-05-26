/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class dbCadastrofunc 
{
    public dbCadastrofunc(String nome, String senha, int idade, String email, String cargo)
    {
        try {
            Connection conexao;
            PreparedStatement st;
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_raphas", "root", "admin123");
            st = conexao.prepareStatement ("INSERT INTO tb_funcionarios VALUES (?, ?, ?, ?, ?)");
            st.setString(1, nome);
            st.setString(2, senha);
            st.setInt(3, idade);
            st.setString(4, email);
            st.setString(5, cargo);
            
            st.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
            
            Telas.MenuCadastro m;
            m = new Telas.MenuCadastro();
            m.setVisible(false);
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Você não tem o driver na biblioteca" + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro no BD está incorreto" + ex);
        }
    }
    }
    

