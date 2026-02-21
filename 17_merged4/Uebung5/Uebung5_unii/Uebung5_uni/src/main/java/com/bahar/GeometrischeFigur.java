package com.bahar;

//chera asbstarct estefade mikonim?
//chon ma inja ye mozoo darim be esme masahat ke beyne ashkale hendesi moshtarek hast va masahat yek mafhoome kolli mishe
//ke baraye har shey mitune ye joor hesab bshe(mosalas, dayere ,...), pas raveshaye motefaveti baraye mohasebash darim
//con asbtact ye mafhoome kolli hast be be sheklhaye mokhtalef mitune piyade sazi beshe
// pas ye classe moshtarek beyne hameye classhast ke hadafesh masahate
//pas ye abstarct mige miyad dar 3 class dg raveshaye mokhtalef bara mohasebash mige

public abstract class GeometrischeFigur {

    private double flaeche;

    //constructor:
    public GeometrischeFigur (double flaeche){
        this.flaeche = flaeche;
    }


    //getter:
    //boro masahat ro az 3 ta class begir
    public double getFlaeche(){
        return flaeche;
    }


}
