package llax.main.encorders;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class bcrypt {
    
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
    
    public String encode (String forEncoder){
        String result = encoder.encode(forEncoder);
        return result;
    }
    
    public boolean math (String resultEncode, String userInput){
        return encoder.matches(userInput, resultEncode);
    }
    
}
