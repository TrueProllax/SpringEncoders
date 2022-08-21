
package llax.main.encorders;

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;



public class argon2 {
    
    Argon2PasswordEncoder encoder = new Argon2PasswordEncoder();
    
    public String encode (String forEncoder){
        String result = encoder.encode(forEncoder);
        return result;
    }
    
    public boolean math (String resultEncode, String userInput){
        return encoder.matches(userInput, resultEncode);
    }
}
