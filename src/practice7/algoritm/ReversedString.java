package practice7.algoritm;

public class ReversedString {

    public static void main(String[] args) {

        String data = "application";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(data);
        String reversedData = stringBuilder.reverse().toString();
        System.out.println(reversedData);


        // find out 2 other way to do the string reverse - homework


    }
}

