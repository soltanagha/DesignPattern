package interceptorAuthenticationFilter;

public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public boolean sendRequest(String request,String ip){
        return filterManager.filterRequest(request,ip);
    }
}
