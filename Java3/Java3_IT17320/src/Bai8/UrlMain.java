
package Bai8;

import java.net.URL;

public class UrlMain {
    public static void main(String[] args) {
        try {
            String uString="https://viblo.asia/p/tim-hieu-ve-uri-url-va-urn-maGK7WxaKj2";
            URL url = new URL(uString);
            System.out.println("Host name:"+url.getHost());
            System.out.println("Protocal:"+url.getProtocol());
            System.out.println("Host port:"+url.getPort());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
