/**
 * @author admin Govinda A. Paliwal
 */
package com.govinda.adhaarcardscan;
public class AadhaarCard 
{
    public String uid;
    public String name;
    public String gender;
    public String yob;
    public String co;
    public String house;
    public String lm;
    public String loc;
    public String vtc;
    public String po;
    public String dist;
    public String subdist;
    public String state;
    public String pincode;
    public String dob;
    public String originalXML;

    public String getFormattedUID() {
        if (uid.length() == 12) {
            String newUIDString = uid.substring(0, 4) + " " + uid.substring(4, 8) + " " + uid.substring(8, 12);
            return newUIDString;
        }
        return uid;
    }

    public String getAddress() {
        return house + ", " + lm + ", " + loc + ", " + dist + ", " + subdist + ", " + state + ".\nPincode: " + pincode;
    }
}
