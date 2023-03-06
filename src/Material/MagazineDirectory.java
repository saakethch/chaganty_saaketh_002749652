/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 15512
 */
public class MagazineDirectory {
    ArrayList<Magazine> magazines;
    public MagazineDirectory(){
        this.magazines = new ArrayList<Magazine>();
    }
    
    public Magazine addMagazine(String name, Date registeredDate, String c, String i){
        Magazine mag = new Magazine(name, registeredDate, c, i);
        this.magazines.add(mag);
        return mag;
    }

    public ArrayList<Magazine> getMagazines() {
        return magazines;
    }
    
    public Magazine findMagazineByName(String title){
        for (Magazine m: magazines){
            if (m.getName().equals(title)){
                return m;
            }
        }
        return null;
    }
    
    public Magazine findMagById(String magId){
        for (Magazine m: magazines){
            if (m.getId().equals(magId)){
                return m;
            }
        }
        return null;
    }
}
