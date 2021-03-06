/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.edu.kfupm.sapms.data;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class ExceptionInvalidStudentID extends Exception
{

    private final String studentKFUPMID;
    private final Date accessTime;

    public ExceptionInvalidStudentID(Date time, String kfupmID)
    {
        this.accessTime = time;
        this.studentKFUPMID = kfupmID;
    }

    @Override
    public String toString()
    {
        return "Student " + studentKFUPMID + " does not exist in the SAPMS datastore on:" + accessTime.toString();
    }
}
