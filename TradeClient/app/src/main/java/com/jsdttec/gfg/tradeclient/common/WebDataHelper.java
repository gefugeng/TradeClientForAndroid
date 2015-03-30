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
        //����һ��http�ͻ���
        HttpClient client = new DefaultHttpClient();
//����һ��POST����
        HttpPost httpPost = new HttpPost(url);
//��װ���ݷŵ�HttpEntity�з��͵�������
    /*    final List dataList = new ArrayList();
        dataList.add(new BasicNameValuePair("productName", "cat"));
        dataList.add(new BasicNameValuePair("price", "14.87"));
        HttpEntity entity = new UrlEncodedFormEntity(dataList, "UTF-8");
        httpPost.setEntity(entity);*/
//�����������POST���󲢻�ȡ���������صĽ�������������ӳɹ�������ƷID������ʧ�ܵ���Ϣ
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
