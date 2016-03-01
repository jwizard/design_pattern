package Observer.ko_wiki;

import java.util.Observable;

public class ResponseHandler extends Observable
{
    private String resp;
    public void update (Observable obj, Object arg)
    {
        if (arg instanceof String)
        {
            resp = (String) arg;
            System.out.println("\nReceived Response: "+ resp );
        }
    }
}