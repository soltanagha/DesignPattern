package interceptorAuthenticationFilter;

public class InterceptingFilterDemo {
    public static void main(String[] args) {
        String request = "Authentication done successfully";//request object.

        boolean errorFound = false;
        CheckDDOSAttackFilter checkDDOSAttackFilter = new CheckDDOSAttackFilter();

        for (int a = 0; a < 101; a++) {
            FilterManager filterManager = new FilterManager(new ExecuteRequest());
            filterManager.setFilter(checkDDOSAttackFilter);
            filterManager.setFilter(new AuthenticationFilter());
            filterManager.setFilter(new DebuggingFilter());

            Client client = new Client();
            client.setFilterManager(filterManager);
            errorFound = client.sendRequest(request, "123456789");

            if (errorFound)
                break;
        }
    }
}
