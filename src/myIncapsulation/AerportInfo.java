package myIncapsulation;

public class AerportInfo {

    AerportInfo(){

    }


    private  String name;
    private  String address;
    private  String qntTerminals;



    public void setName(String airPortName){
        this.name = airPortName;
    }

    public String getName(){
        return name;
    }



    public void setAddress(String addressOgAirport){
        this.address = addressOgAirport;
    }

    public String getAddress(){
        return address;
    }


    public void setQntTerminals(String qntTerminal){
        this.qntTerminals = qntTerminal;
    }

    public String getQntTerminals(){
        return qntTerminals;
    }


}
