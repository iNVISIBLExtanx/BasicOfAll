package com.example.basicofall;

public class childModel {

    private int ID ;
    private String OU ;
    private String DOR;
    private String GN_AREA;
    private String REG_NUM ;
    private String NAME_CHILD;
    private String SEX ;
    private String DOB ;
    private String ETHNICITY ;
    private String ADDRESS ;
    private String SECTOR ;
    private String LANDLINE ;
    private String MOBILE ;
    private String NAME_MOTHER ;
    private String NIC ;
    private String MOTHER_DOB ;
    private int NUM_CHILD ;
    private String HIGHEST_EDU ;
    private String OCCUPATION ;
    private String REL_TO_CHILD ;
    private String CAREGIVER_NAME ;
    private int BIRTH_WEIGHT ;
    private int BIRTH_LENGTH ;
    private String TEI ;
    private boolean SYNCED ;

    public childModel(){

    }

    public childModel(String NAME_CHILD, String DOB) {
        this.NAME_CHILD = NAME_CHILD;
        this.DOB = DOB;
    }

    public childModel(int ID, String OU, String DOR, String GN_AREA,
                      String REG_NUM, String NAME_CHILD, String SEX,
                      String DOB, String ETHNICITY, String ADDRESS,
                      String SECTOR, String LANDLINE, String MOBILE,
                      String NAME_MOTHER, String NIC, String MOTHER_DOB,
                      int NUM_CHILD, String HIGHEST_EDU, String OCCUPATION,
                      String REL_TO_CHILD, String CAREGIVER_NAME, int BIRTH_WEIGHT,
                      int BIRTH_LENGTH, String TEI, boolean SYNCED) {
        this.ID = ID;
        this.OU = OU;
        this.DOR = DOR;
        this.GN_AREA = GN_AREA;
        this.REG_NUM = REG_NUM;
        this.NAME_CHILD = NAME_CHILD;
        this.SEX = SEX;
        this.DOB = DOB;
        this.ETHNICITY = ETHNICITY;
        this.ADDRESS = ADDRESS;
        this.SECTOR = SECTOR;
        this.LANDLINE = LANDLINE;
        this.MOBILE = MOBILE;
        this.NAME_MOTHER = NAME_MOTHER;
        this.NIC = NIC;
        this.MOTHER_DOB = MOTHER_DOB;
        this.NUM_CHILD = NUM_CHILD;
        this.HIGHEST_EDU = HIGHEST_EDU;
        this.OCCUPATION = OCCUPATION;
        this.REL_TO_CHILD = REL_TO_CHILD;
        this.CAREGIVER_NAME = CAREGIVER_NAME;
        this.BIRTH_WEIGHT = BIRTH_WEIGHT;
        this.BIRTH_LENGTH = BIRTH_LENGTH;
        this.TEI = TEI;
        this.SYNCED = SYNCED;
    }

    /*
    *   Constructor without ID
    * */
    public childModel(String OU, String DOR, String GN_AREA,
                      String REG_NUM, String NAME_CHILD, String SEX,
                      String DOB, String ETHNICITY, String ADDRESS,
                      String SECTOR, String LANDLINE, String MOBILE,
                      String NAME_MOTHER, String NIC, String MOTHER_DOB,
                      int NUM_CHILD, String HIGHEST_EDU, String OCCUPATION,
                      String REL_TO_CHILD, String CAREGIVER_NAME, int BIRTH_WEIGHT,
                      int BIRTH_LENGTH, String TEI, boolean SYNCED) {
        this.OU = OU;
        this.DOR = DOR;
        this.GN_AREA = GN_AREA;
        this.REG_NUM = REG_NUM;
        this.NAME_CHILD = NAME_CHILD;
        this.SEX = SEX;
        this.DOB = DOB;
        this.ETHNICITY = ETHNICITY;
        this.ADDRESS = ADDRESS;
        this.SECTOR = SECTOR;
        this.LANDLINE = LANDLINE;
        this.MOBILE = MOBILE;
        this.NAME_MOTHER = NAME_MOTHER;
        this.NIC = NIC;
        this.MOTHER_DOB = MOTHER_DOB;
        this.NUM_CHILD = NUM_CHILD;
        this.HIGHEST_EDU = HIGHEST_EDU;
        this.OCCUPATION = OCCUPATION;
        this.REL_TO_CHILD = REL_TO_CHILD;
        this.CAREGIVER_NAME = CAREGIVER_NAME;
        this.BIRTH_WEIGHT = BIRTH_WEIGHT;
        this.BIRTH_LENGTH = BIRTH_LENGTH;
        this.TEI = TEI;
        this.SYNCED = SYNCED;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getOU() {
        return OU;
    }

    public void setOU(String OU) {
        this.OU = OU;
    }

    public String getDOR() {
        return DOR;
    }

    public void setDOR(String DOR) {
        this.DOR = DOR;
    }

    public String getGN_AREA() {
        return GN_AREA;
    }

    public void setGN_AREA(String GN_AREA) {
        this.GN_AREA = GN_AREA;
    }

    public String getREG_NUM() {
        return REG_NUM;
    }

    public void setREG_NUM(String REG_NUM) {
        this.REG_NUM = REG_NUM;
    }

    public String getNAME_CHILD() {
        return NAME_CHILD;
    }

    public void setNAME_CHILD(String NAME_CHILD) {
        this.NAME_CHILD = NAME_CHILD;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getETHNICITY() {
        return ETHNICITY;
    }

    public void setETHNICITY(String ETHNICITY) {
        this.ETHNICITY = ETHNICITY;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getSECTOR() {
        return SECTOR;
    }

    public void setSECTOR(String SECTOR) {
        this.SECTOR = SECTOR;
    }

    public String getLANDLINE() {
        return LANDLINE;
    }

    public void setLANDLINE(String LANDLINE) {
        this.LANDLINE = LANDLINE;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getNAME_MOTHER() {
        return NAME_MOTHER;
    }

    public void setNAME_MOTHER(String NAME_MOTHER) {
        this.NAME_MOTHER = NAME_MOTHER;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getMOTHER_DOB() {
        return MOTHER_DOB;
    }

    public void setMOTHER_DOB(String MOTHER_DOB) {
        this.MOTHER_DOB = MOTHER_DOB;
    }

    public int getNUM_CHILD() {
        return NUM_CHILD;
    }

    public void setNUM_CHILD(int NUM_CHILD) {
        this.NUM_CHILD = NUM_CHILD;
    }

    public String getHIGHEST_EDU() {
        return HIGHEST_EDU;
    }

    public void setHIGHEST_EDU(String HIGHEST_EDU) {
        this.HIGHEST_EDU = HIGHEST_EDU;
    }

    public String getOCCUPATION() {
        return OCCUPATION;
    }

    public void setOCCUPATION(String OCCUPATION) {
        this.OCCUPATION = OCCUPATION;
    }

    public String getREL_TO_CHILD() {
        return REL_TO_CHILD;
    }

    public void setREL_TO_CHILD(String REL_TO_CHILD) {
        this.REL_TO_CHILD = REL_TO_CHILD;
    }

    public String getCAREGIVER_NAME() {
        return CAREGIVER_NAME;
    }

    public void setCAREGIVER_NAME(String CAREGIVER_NAME) {
        this.CAREGIVER_NAME = CAREGIVER_NAME;
    }

    public int getBIRTH_WEIGHT() {
        return BIRTH_WEIGHT;
    }

    public void setBIRTH_WEIGHT(int BIRTH_WEIGHT) {
        this.BIRTH_WEIGHT = BIRTH_WEIGHT;
    }

    public int getBIRTH_LENGTH() {
        return BIRTH_LENGTH;
    }

    public void setBIRTH_LENGTH(int BIRTH_LENGTH) {
        this.BIRTH_LENGTH = BIRTH_LENGTH;
    }

    public String getTEI() {
        return TEI;
    }

    public void setTEI(String TEI) {
        this.TEI = TEI;
    }

    public boolean isSYNCED() {
        return SYNCED;
    }

    public void setSYNCED(boolean SYNCED) {
        this.SYNCED = SYNCED;
    }
}
