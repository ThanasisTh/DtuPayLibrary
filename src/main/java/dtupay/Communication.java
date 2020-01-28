package dtupay;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

public class Communication
{
    public static String sendRequest(String url, String method, Map<String, String> params) throws Exception
    {
        return sendRequest(url, method, params, null);
    }

    public static String sendRequest(String url, String method, Object data) throws Exception
    {
        return sendRequest(url, method, null, data);
    }

    public static String sendRequest(String url, String method, Map<String, String> params, Object data) throws Exception
    {
        if (params != null)
        {
            StringBuilder query = new StringBuilder();

            for (Map.Entry<String, String> param : params.entrySet())
            {
                if (query.length() != 0)
                {
                    query.append('&');
                }

                query.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                query.append('=');
                query.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
            }

            url = url.concat("?");
            url = url.concat(query.toString());
        }

        HttpURLConnection connection = (HttpURLConnection) (new URL(url)).openConnection();

        try
        {
            connection.setRequestMethod(method);
            connection.setRequestProperty("Content-Type", "application/json");

            if (data != null)
            {
                connection.setDoOutput(true);

                DataOutputStream writer = new DataOutputStream(connection.getOutputStream());
                writer.write((new Gson()).toJson(data).getBytes("UTF-8"));
                writer.flush();
                writer.close();
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder content = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null)
            {
                content.append(line);
                content.append(System.lineSeparator());
            }

            return content.toString();
        }
        catch (Exception e)
        {
            return null;
        }
        finally
        {
            connection.disconnect();
        }
    }
}
