/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author HP
 */
public class Manager extends Karyawan{
    private float jamKerja = 7.5f;
    
    public float getjamKerja(){
        return jamKerja;
    }
    
    public float getGajiManager(){
        return getGaji();
    }
    public void setjamKerja(float jam){
        this.jamKerja = jam;
    }
}
