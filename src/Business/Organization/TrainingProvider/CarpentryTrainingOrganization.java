/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.TrainingProvider;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.TrainingProviderRole;
import java.util.ArrayList;

/**
 *
 * @author sanch
 */
public class CarpentryTrainingOrganization extends Organization{

    public CarpentryTrainingOrganization(String name) {
        super(name, "");
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
       roles.add(new TrainingProviderRole());
       return roles;
    }
    
}
