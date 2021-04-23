package interceptorAuthenticationFilter;

public class DebuggingFilter implements Filter {
    @Override
    public boolean execute(String request,String ip) {
        System.out.println("request log: " + request);
        return false;
    }
}
