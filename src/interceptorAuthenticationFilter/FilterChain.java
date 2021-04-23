package interceptorAuthenticationFilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters = new ArrayList();
    private ExecuteRequest target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public boolean execute(String request, String ip) {
        boolean executeNotAllowed = false;
        for (Filter filter : filters) {
            executeNotAllowed = filter.execute(request, ip);
            if (executeNotAllowed)
                return true;
        }

        target.execute(request);

        return false;
    }

    public void setTarget(ExecuteRequest target) {
        this.target = target;
    }
}
