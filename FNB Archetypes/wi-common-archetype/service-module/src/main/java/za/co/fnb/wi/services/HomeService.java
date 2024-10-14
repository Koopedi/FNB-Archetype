package za.co.fnb.wi.services;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public String getMessage() {
        return "Hello from Service Module!";
    }
}
