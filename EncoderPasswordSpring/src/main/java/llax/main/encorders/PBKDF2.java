package llax.main.encorders;

import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;



public class PBKDF2 {
    
    Pbkdf2PasswordEncoder encoder = new Pbkdf2PasswordEncoder();
    
    public String encode (String forEncoder){
        String result = encoder.encode(forEncoder);
        return result;
    }
    
    public boolean math (String resultEncode, String userInput){
        return encoder.matches(userInput, resultEncode);
    }
}
