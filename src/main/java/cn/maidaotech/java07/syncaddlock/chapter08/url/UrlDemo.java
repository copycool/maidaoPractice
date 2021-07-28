package cn.maidaotech.java07.syncaddlock.chapter08.url;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import sun.net.www.http.HttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class UrlDemo {
    public static void main(String[] args) {
        String url = "http://api.edu.maidaotech.cn/ws/home/lesson?id=38";

        try {
            String result = call(url);
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String call(String str) throws IOException {
        URL url = new URL(str);
        URLConnection urlConnection = url.openConnection();

        if (!(urlConnection instanceof HttpURLConnection)){
            System.out.println("url有误");
            return "";
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        StringBuilder result = new StringBuilder();
        String temp;
        while ((temp = in.readLine()) != null){
            result.append(temp);
        }

        in.close();

        return result.toString();
    }


    public static String call(String url, Map<String,Object> params) throws IOException {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();

        if (StringUtils.isEmpty(url)){
            throw new RuntimeException("url 不能为空");
        }
        ClientHttpRequest request = (ClientHttpRequest) requestFactory.createRequest(URI.create(url), HttpMethod.POST);
        return null;
    }



}
