package interceptorAuthenticationFilter;

public interface Filter {
    public boolean execute(String request,String ip);
}
