package Day_03;

public class String_methods {
    public static void main(String[] args) {
       /* String bike = "BMW1000RR";
        String biker = "Mukul Vats";
        String bike2 = "BMW1000Rr";
        int length = bike.length();
        System.out.println(length);
        char c = bike.charAt(length - 3 );
        System.out.println(c);
        System.out.println(bike.equalsIgnoreCase(bike));
        */

//        String name = "Mukul Vats";
//        String substring =  name.substring(5 );
//        System.out.println(substring);

        String name = "mukul vats";
        System.out.println(name.trim()  );


        String new_name = name.replace("vats","sharma");
        System.out.println(new_name);

//        check contain the character or not
        System.out.println(name.contains("vats"));

//        start with the containing character or not
        System.out.println(name.startsWith("mu"));

//        Empty string check it ;
        String str = " "; //if it has no character then say it true or no spaces
        System.out.println(str.isEmpty());
//        BLank or not
        System.out.println(str.isBlank());

//        check the index of character in strings
        int i = name.indexOf("m");
        System.out.println(i);

//        convert the integers in strings
        int age_of_females = 40;
        String a = String.valueOf(age_of_females);
        System.out.println(a);


    }
}
