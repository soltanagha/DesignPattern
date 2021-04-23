package interceptorAuthenticationFilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckDDOSAttackFilter implements Filter {
    List<String> listIP = new ArrayList<String>();

    @Override
    public boolean execute(String request, String ip) {
        listIP.add(ip);
        boolean ddosAttack = (Collections.frequency(listIP, ip) < 100);

        if (ddosAttack)
            System.out.println("DDOS request not found: " + request);
        else
            System.out.println("DDOS request found: " + request + " IP:" + ip);

        return !ddosAttack;
    }
}
