package com.jsdttec.gfg.tradeclient.common;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gfg on 3/30 0030.
 */
public class WebDataHelper {

    public static String GetData(String url) {
        String result = "";
        //创建一个http客户端
        HttpClient client = new DefaultHttpClient();
//创建一个POST请求
        HttpPost httpPost = new HttpPost(url);
//组装数据放到HttpEntity中发送到服务器
    /*    final List dataList = new ArrayList();
        dataList.add(new BasicNameValuePair("productName", "cat"));
        dataList.add(new BasicNameValuePair("price", "14.87"));
        HttpEntity entity = new UrlEncodedFormEntity(dataList, "UTF-8");
        httpPost.setEntity(entity);*/
//向服务器发送POST请求并获取服务器返回的结果，可能是增加成功返回商品ID，或者失败等信息
        try {
            HttpResponse response = client.execute(httpPost);
        } catch (ClientProtocolException ex) {
            result = ex.getMessage();
        } catch (IOException ex) {
            result = ex.getMessage();
        }

        return result;
    }
}
