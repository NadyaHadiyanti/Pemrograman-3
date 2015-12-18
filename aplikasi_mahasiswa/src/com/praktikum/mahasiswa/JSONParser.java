package com.praktikum.mahasiswa;

import java.io.*;
import java.net.SocketException;

import org.json.*;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import android.util.Log;

import java.util.List;



public class JSONParser {
	static InputStream is = null;
	static JSONObject jObj = null;
	static String json = "";
	
	//ini milisecond = 10 s
	int timeout = 10000;
	
	// constructor
	public JSONParser() {
		//timeout = new Values().gettimeout();
	}
	
	// function get json from url
	// by making HTTP POST ot GET method
	public JSONObject makeHttpRequest(String url, String method, List<NameValuePair> params) {
		
		// making http request
		try {
			
			HttpParams httpParameters = new BasicHttpParams();
			HttpConnectionParams.setConnectionTimeout(httpParameters, timeout);
			HttpConnectionParams.setSoTimeout(httpParameters, timeout);
			
			// check for request method
			if (method == "POST") {
				// request method in POST
				// defaultHttpClient
				DefaultHttpClient httpClient = new DefaultHttpClient(httpParameters);
				HttpPost httpPost = new HttpPost(url);
				httpPost.setEntity(new UrlEncodedFormEntity(params));
				
				HttpResponse httpResponse = httpClient.execute(httpPost);
				HttpEntity httpEntity = httpResponse.getEntity();
				is = httpEntity.getContent();
			} else if(method == "GET") {
				// request method is GET
				DefaultHttpClient httpClient = new DefaultHttpClient(httpParameters);
				String paramString = URLEncodedUtils.format(params, "utf-8");
				url += "?" + paramString;
				HttpGet httpGet = new HttpGet(url);
				
				HttpResponse httpResponse = httpClient.execute(httpGet);
				HttpEntity httpEntity = httpResponse.getEntity();
				is = httpEntity.getContent();
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (SocketException ste) 
		{
			Log.e("Timeout Exception: ", ste.toString());
		}
		catch (ConnectTimeoutException e) 
		{
			Log.e("Timeout Exception: ", e.toString());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();
			json = sb.toString();
		} catch (Exception e) {
			Log.e("Buffer Error", "Error converting result " + e.toString());
		}
		
		try {
			jObj = new JSONObject(json);
		} catch (JSONException e) {
			Log.e("JSON Parser", "Error parsing data " + e.toString());
		}
		
		return jObj;
	}
}
