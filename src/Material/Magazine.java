/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Library.Material.Material;
import java.util.Date;

/**
 *
 * @author 15512
 */
public class Magazine extends Material{
    private String company;
    private String issueType;
    
    public Magazine(String name, Date registeredDate, String c, String it){
        super();
        this.name = name;
        this.registeredDate = registeredDate;
        this.company = c;
        this.issueType = it;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
    
    
            
}
