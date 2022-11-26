/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Donor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khyati
 */
public class DonorDirectory {
    
    List<Donor> donorList;
    
    public DonorDirectory() {
        donorList = new ArrayList<Donor>();
    }
    
    private static DonorDirectory donorDirectory;

    public List<Donor> getDonorList() {
        return donorList;
    }

    public void setDonorList(List<Donor> donorList) {
        this.donorList = donorList;
    }

    public static DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }

    public static void setDonorDirectory(DonorDirectory donorDirectory) {
        DonorDirectory.donorDirectory = donorDirectory;
    }
    
}
