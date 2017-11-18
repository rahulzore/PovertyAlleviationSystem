/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import java.nio.channels.NetworkChannel;
import java.util.ArrayList;

/**
 *
 * @author Rahul Zore
 */
public class EcoSystem extends Organization{

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    
    public static EcoSystem getInstance() {
        
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    
    public EcoSystem(){
        super(null);
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
