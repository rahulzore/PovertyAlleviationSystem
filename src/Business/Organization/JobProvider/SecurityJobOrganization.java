/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.JobProvider;

import Business.Organization.Organization;
import Business.Role.JobProviderRole;
import Business.Role.Role;
import Business.Role.TrainingProviderRole;
import java.util.ArrayList;

/**
 *
 * @author sanch
 */
public class SecurityJobOrganization extends Organization {
private int seats;
    public SecurityJobOrganization(String name) {
        super(name, "");
        seats = 0;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
       roles.add(new JobProviderRole());
       return roles;  
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
