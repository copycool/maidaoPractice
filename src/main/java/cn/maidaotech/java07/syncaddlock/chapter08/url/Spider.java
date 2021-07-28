package cn.maidaotech.java07.syncaddlock.chapter08.url;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spider {
    public static void main(String[] args) throws IOException {
        String url = "http://edu.maidaotech.cn/"; String file = "F:\\SiteURL.txt";
        handle(url, file);
    }
    public static void handle(String webSite, String file) throws IOException {
        URL url = null;
        URLConnection urlconn = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        // String regex = "http://[\\w+\\.?/?]+\\.[A-Za-z]+";
        String regex = "https://[\\w+\\.?/?]+\\.[A-Za-z]+";//url 匹配规则
        Pattern p = Pattern.compile(regex);
        try {
            url = new URL(webSite);//爬取的网址
            urlconn = url.openConnection(); //将爬取到的链接放到 D 盘的 SiteURL 文件中
            pw = new PrintWriter(new FileWriter(file), true);
            br = new BufferedReader(new InputStreamReader(
                    urlconn.getInputStream())); String buf = null; while ((buf = br.readLine()) != null) {
                Matcher buf_m = p.matcher(buf); while (buf_m.find()) {
                    pw.println(buf_m.group());
                }
            }

                    System.out.println("爬取成功^_^");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            pw.close();
        }
    }
}