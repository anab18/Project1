package Project2;
/*
Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
● Valid email consider to be only yahoo
● Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid passwords cannot contain
userName
 */
public class CreateRegistration {
    private String email;
    private String userName;
    private String passWord;


    public void setEmail(String email) {
        this.email = email;
        if (email.endsWith("@yahoo.com")) {
            System.out.println("Valid email");
        } else {
            System.out.println("invalid email ,must be only yahoo");
        }
    }
                public void setUserName(String userName) {
                    this.userName = userName;
                    if (userName.length() > 6) {
                        System.out.println("Valid userName ");
                    } else {
                        System.out.println("invalid user name,should be length larger than 6 characters ");
                    }
                }
                public void setPassWord(String passWord){
            if(passWord.length()>6 &&!passWord.contains(userName)){
                System.out.println("Valid password");
            }else{
                System.out.println("Invalid passwords cannot contain userName");
            }
                }

    public static void main(String[] args) {
        CreateRegistration a=new CreateRegistration();
       a.setEmail("syntax@gmail.com");
       a.setUserName("Syntax5");
       a.setPassWord("Syntax5");
    }

}
