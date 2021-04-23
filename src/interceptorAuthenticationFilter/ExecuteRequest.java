package interceptorAuthenticationFilter;

public class ExecuteRequest {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
