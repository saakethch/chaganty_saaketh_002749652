package Business;

import Library.Library;
import UserAccount.UserAccountDirectory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15512
 */
public class Branch {
    String name;
    UserAccountDirectory branchUad;
    Library library; 

    Branch(String name, String lib_building) {
        this.name = name;
        this.library = new Library(lib_building);
        this.branchUad = new UserAccountDirectory();
    }

    public UserAccountDirectory getBranchUad() {
        return branchUad;
    }

    public void setBranchUad(UserAccountDirectory branchUad) {
        this.branchUad = branchUad;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
