package com.company;

public class Main {

    public static void main(String[] args) {
         Transport[] transports = new Transport[]{createObject("Mustang"),
                 createObject("Mercedes"),createObject("Lexus")};
        for (int i = 0; i < transports.length; i++) {
            transports[i].print();
        }
    }
public static Transport createObject(String className){
        switch (className){
            case "Mercedes":
                Mercedes mercedes = new Mercedes("340",2.6 );
               return mercedes;
             case "Lexus":
                    Lexus lexus = new  Lexus( "rx300","Blue",222);
            return lexus;
            case "Mustang":
                Mustang mustang = new Mustang("rt40",2006);
                return  mustang;

        }
        
return  null;
}



}

