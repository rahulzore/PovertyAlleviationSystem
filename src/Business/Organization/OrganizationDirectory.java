/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.NGO.ChildrenNGOOrganization;
import Business.Organization.NGO.HomelessNGOOrganization;
import Business.Organization.NGO.OldAgeNGOOrganization;
import Business.Organization.NGO.RaceNGOOrganization;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Rahul Zore
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
     public Organization createOrganization(Organization.Type type,String name){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.DataCollector.getValue())){
            organization = new DataCollectorOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.JobProvider.getValue())){
            organization = new JobProviderOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.JobManager.getValue())){
            organization = new JobRequestManagerOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.TrainingManager.getValue())){
            organization = new TrainingRequestManagerOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Restaurant.getValue())){
            organization = new RestaurantOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.OldAge.getValue())){
            organization = new OldAgeNGOOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.RaceBased.getValue())){
            organization = new RaceNGOOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Childern.getValue())){
            organization = new ChildrenNGOOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Homeless.getValue())){
            organization = new HomelessNGOOrganization(name);
            organizationList.add(organization);
        }
        
        return organization;
    }
}
