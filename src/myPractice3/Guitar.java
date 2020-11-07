package myPractice3;

public class Guitar {

    public static void main(String[] args) {
        printNumberOfStrings();
        printGuitarDetails("Rubob");
        printGDetails("Dutor", "2020");
        printNumberOfStrings(5);




    }

    public static void printNumberOfStrings(){
        System.out.println(12);
    }

    public static void printGuitarDetails(String nameOfBrand){
        System.out.println(nameOfBrand);
    }

    public static void printGDetails(String nameOfBrand, String year){
        System.out.println(nameOfBrand+" "+year);
    }

    public static void printNumberOfStrings(int extraString){
        int addString = 11;
        int total = extraString+addString;
        System.out.println(total);
    }
}
