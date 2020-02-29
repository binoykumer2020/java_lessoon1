package introduction;
// String in java is an object class/ buffer/builder class : sequence of characters
public class Lesson8 {
    public static void main(String[] args) {

        String s1 = "Binoy Kumer";
        String s2 = new String ("binoy Kumer");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.length());
        System.out.println(s2.length());

        if(s1==s1){
            System.out.println("Print Equals");
        } else{
            System.out.println("Not Equals");
        }

        if (s1.contains(s2)) {
            System.out.println("Contains equally");
        }else{
            System.out.println("Not contains equally");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Contains equally");
        }else{
            System.out.println("Not contains equally");
        }

        System.out.println(s1.contains("abi"));
        System.out.println(s2.isEmpty());

        String firstName = "Binoy";
        String lastName = " Dasgupta";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        System.out.println(firstName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        boolean b = firstName.startsWith("B");
        System.out.println(b);
        System.out.println(lastName.endsWith("a"));
        System.out.println(s2.equalsIgnoreCase("binoy kumer"));

        String replaceChar = "My name is Ishaan";

        System.out.println(replaceChar.replace('i', 'I'));

        String [] splitString = replaceChar.split(" ");
        for (String x: splitString) {
            System.out.println(x);

            //String buffer as we can append without reference to other object

            StringBuffer stringBuffer = new StringBuffer("Binoy");
            stringBuffer.append(" Kumer dasgupta");
            stringBuffer.append(007);
            System.out.println(stringBuffer);
            //System.out.println(stringBuffer.reverse());
           // System.out.println(stringBuffer.delete(19,3));

            stringBuffer.setLength(2);
            System.out.println(stringBuffer);

            //Palindrome




        }

    }
}
