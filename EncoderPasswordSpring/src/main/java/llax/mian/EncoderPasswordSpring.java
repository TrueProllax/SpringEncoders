package llax.mian;

import llax.main.encorders.PBKDF2;
import llax.main.encorders.argon2;
import llax.main.encorders.bcrypt;
import llax.main.encorders.scrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EncoderPasswordSpring {
    
    private static final Logger log = LoggerFactory.getLogger(EncoderPasswordSpring.class);

    public static void main(String[] args) {
        SpringApplication.run(EncoderPasswordSpring.class, args);
        
        // BCrypt encoder
        
        bcrypt bc = new bcrypt();
        String encodeBC = bc.encode("Password");
        log.info("for Password: " + bc.math(encodeBC, "Password")); 
        log.info("for NotPassword: " + bc.math(encodeBC, "NotPassword")); 
        
        // PBKDF2 encoder
        
        PBKDF2 pb = new PBKDF2();
        String encodePB = pb.encode("Password");
        log.info("for Password: " + pb.math(encodePB, "Password")); 
        log.info("for NotPassword: " + pb.math(encodePB, "NotPassword")); 
        
        // argon2 encoder
        
        argon2 ar = new argon2();
        String encodeA2 = ar.encode("Password");
        log.info("for Password: " + ar.math(encodeA2, "Password")); 
        log.info("for NotPassword: " + ar.math(encodeA2, "NotPassword")); 
        
        // scrypt encoder
        
        scrypt sc = new scrypt();
        String encodeSC = sc.encode("Password");
        log.info("for Password: " + sc.math(encodeSC, "Password")); 
        log.info("for NotPassword: " + sc.math(encodeSC, "NotPassword")); 
    }
}
