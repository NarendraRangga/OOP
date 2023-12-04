/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;
import java.util.Date;

/**
 *
 * @author HP
 */
public class OverloadingConstructor {
    int idUser;
    String userName;
    int level;
    Date lastLogin;
    public OverloadingConstructor() {
    } 
    public OverloadingConstructor(int idUser, 
        String userName) {
        this.idUser = idUser;
        this.userName = userName;
    }
    public class Pet{
        private String nama;
        
        public void beriNama(String beriNama){
            this.nama = nama;
        }
        public String panggilNama(){
        return this.nama;
        }

        public String perilaku(){
        return "Hewan Penurut";
        }
    }
}

