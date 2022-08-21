package llax.main.encorders;

import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;


public class scrypt {
    
    SCryptPasswordEncoder encoder = new SCryptPasswordEncoder();
    
    public String encode (String forEncoder){
        String result = encoder.encode(forEncoder);
        return result;
    }
    
    public boolean math (String resultEncode, String userInput){
        return encoder.matches(userInput, resultEncode);
    }
}
