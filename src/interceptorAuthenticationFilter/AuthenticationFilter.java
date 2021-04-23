package interceptorAuthenticationFilter;

public class AuthenticationFilter implements Filter {
    @Override
    public boolean execute(String request,String ip) {
        System.out.println("Authenticating request: " + request);
        return false;
    }
}
