package interceptorAuthenticationFilter;

public class FilterManager {
    FilterChain filterChain;

    public FilterManager(ExecuteRequest target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public boolean filterRequest(String request,String ip){
        return filterChain.execute(request,ip);
    }
}
