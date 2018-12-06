import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    private static ExampleTel exampleTel;

    private static final String[] valiTel = new String[] {"(84)-(0878489648)", "(84)-(0878439648)", "(84)-(0960489648)"};
    private static final String[] invaliTel = new String[] {"(a8)-(08434222222)", "(84)-(09894t222)", "(84)-(09784322)"};

    public static void main(String[] args) {
        exampleTel = new ExampleTel();

        for (String tel:valiTel) {
            boolean isVali = exampleTel.validate(tel);
            System.out.println("Telephone is " + tel + " is valid: "+isVali);
        }


        for (String tel:invaliTel) {
            boolean isVali = exampleTel.validate(tel);
            System.out.println("Telephone is " + tel + " is valid: "+isVali);
        }

    }
}

class ExampleTel {
    private static final String TEL_REGEX = "^[(]\\d{2}[)][-][(]\\d{10}[)]$";

    public ExampleTel(){

    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(TEL_REGEX);
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }
}
