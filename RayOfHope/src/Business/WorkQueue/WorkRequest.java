/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author khyati
 */
public abstract class WorkRequest {
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private int personId;
    private UserAccount receiver;
    private int userId;
    private String personName;
    private String name;
    private String message;
    private UserAccount sender;
    

  
}
