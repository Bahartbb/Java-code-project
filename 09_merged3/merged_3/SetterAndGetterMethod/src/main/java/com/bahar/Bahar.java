package com.bahar;

//variable hayi ke private moarefi shodan va baraye class haye dige accessable nistan,
//baraye inke beshe beheshun dastresi dasht bayad az setter va getter estefade konim (command+N)

public class Bahar {

    //data haye yek class ro mikhaym barash sathe dastresiye moshakhasi tarif konim,
    //ta hameye classa be dataha mostaghim dastresri nadashte bashan
    //va az tarighe setter ve getter ma beheshoon dastresi bedim

    private String name;
    private String familyName;
    private int age;
    private String phoneNumber;
    private String idNumber;
    private String postalCode;
    private String birtDate;
    private String address;

    //ina hame private hastan, baraye inke dasresi bedim az class haye dg betunan azin estefade konan
    //az setter va getter estefade mikonim
    //ye seri moshkahst ro inja set mikonim, ta jaye dg betunim get konim



    //getter setter for name:
    //access modifier + method type + method name + { + return + parameter + ; + }
    public String getName() {
        return name;
    }

    //access modifier + method type + method name + (input) + { + this. + parameter + = + parameter + ; + }
    public void setName(String firstname) {
        this.name = firstname;
    }
//_________________________________________________________________________________________________________
    //getter setter for familyName:

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String lastName) {
        this.familyName = lastName;
    }

    //_________________________________________________________________________________________________________

    //getter setter for age:

    public int getAge(){
        return age;
    }

    public void setAge(int age){    //age e voroodi va nahayi yeki hastan
        this.age = age;
    }

    //_________________________________________________________________________________________________________

    //getter setter for phoneNumber:

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String Number){
        this.phoneNumber = Number;
    }

    //_________________________________________________________________________________________________________

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNum) {
        this.idNumber = idNum;
    }

    //_________________________________________________________________________________________________________

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postCode) {
        this.postalCode = postCode;
    }

    //_________________________________________________________________________________________________________

    public String getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(String Date) {
        this.birtDate = Date;
    }

    //_________________________________________________________________________________________________________

    public String getAddress() {
        return address;
    }

    public void setAddress(String addr) {
        this.address = addr;
    }
}
