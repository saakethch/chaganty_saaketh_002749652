/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.Branch;
import Business.Business;
import UI.BranchManagerPanels.BranchManagerJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author 15512
 */
public class BranchAdminRole extends Role {
    
    private int exp;
    private String designation;
    private int rentalsTotal;

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
   
    
    public int getRentalsTotal() {
        return rentalsTotal;
    }

    @Override
    public JFrame createWorkArea(Business business, Branch branch, UserAccount useraccount) {
       return new BranchManagerJFrame(business, branch, useraccount);
    }
    
}
