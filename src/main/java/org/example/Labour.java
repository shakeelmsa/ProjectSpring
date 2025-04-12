package org.example;

public class Labour {

    // instance variable
  private  int labid;

    // Constructor
    public Labour(){

        System.out.println("Constructor for Labour");
    }

    public int getLabid() {
        return labid;
    }

    public void setLabid(int labid) {
        this.labid = labid;
    }

    public void labourenrollment(){

        System.out.println("Labour Department");
    }
}
