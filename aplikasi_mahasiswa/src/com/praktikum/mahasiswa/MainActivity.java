package com.praktikum.mahasiswa;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	ListView list;
	
	JSONParser jParser = new JSONParser();
	ArrayList<Mahasiswa> daftar_mhs = new ArrayList<Mahasiswa>();
	JSONArray daftarMhs = null;
	String url_read_mhs = "http://192.168.1.116/mahasiswa/read_mhs.php";
	
	public static final String TAG_SUCCESS = "succes";
	public static final String TAG_MHS = "mahasiswa";
	public static final String TAG_ID_MHS = "id_mhs";
	public static final String TAG_NAMA_MHS = "nama";
	public static final String TAG_NIM_MHS = "nim";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        list = (ListView) findViewById(R.id.listview_mhs);
        
        ReadMhsTask ReadMhsTask = (ReadMhsTask) new ReadMhsTask().execute();
        
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int urutan,
					long id) {
				String idmhs = ((TextView) view.findViewById(R.id.id_mhs)).getText().toString();
				String nama = ((TextView) view.findViewById(R.id.nama_mhs)).getText().toString();
				String nim = ((TextView) view.findViewById(R.id.nim_mhs)).getText().toString();
				
				Intent i = null;
				i = new Intent(MainActivity.this, UpdateDeleteActivity.class);
				Bundle b = new Bundle();
				b.putString("id_mhs", idmhs);
				b.putString("nama_mhs", nama);
				b.putString("nim_mhs", nim);
				i.putExtras(b);
				startActivity(i);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item){
    	int id = item.getItemId();
    	
    	if (id == R.id.action_add) {
			Intent i = new Intent(MainActivity.this, CreateActivity.class);
			startActivity(i);
			return true;
		}
    	
    	return super.onOptionsItemSelected(item);
    }
    
    class ReadMhsTask extends AsyncTask<String, Void, String> {
    	ProgressDialog pDialog;
    	
    	protected void onPreExecute() {
    		super.onPreExecute();
    		pDialog = new ProgressDialog(MainActivity.this);
    		pDialog.setMessage("Mohon Tunggu..");
    		pDialog.setIndeterminate(true);
    		pDialog.setCancelable(true);
    		pDialog.show();
    	}

		@Override
		protected String doInBackground(String... sText) {
			String returnResult = getMhsList();
			return returnResult;
		}
		
		protected void onPostExecute(String result) {
			super.onPostExecute(result);
			pDialog.dismiss();
			if (result.equalsIgnoreCase("Exception Caught")) {
				Toast.makeText(MainActivity.this, "Unable to Connect to server, please check your internet connection!", Toast.LENGTH_LONG).show();
			}
			
			if (result.equalsIgnoreCase("no results")) {
				Toast.makeText(MainActivity.this, "Data Empty", Toast.LENGTH_LONG).show();
			} else {
				list.setAdapter(new MahasiswaAdapter(MainActivity.this, daftar_mhs));
			}
		}
		
		public String getMhsList() {
			Mahasiswa tempMhs = new Mahasiswa();
			List<NameValuePair> parameter = new ArrayList<NameValuePair>();
			try {
				JSONObject json = jParser.makeHttpRequest(url_read_mhs, "POST", parameter);
				
				int success = json.getInt(TAG_SUCCESS);
				if (success == 1) {
					daftarMhs = json.getJSONArray(TAG_MHS);
					for (int i = 0; i < daftarMhs.length(); i++) {
						JSONObject c = daftarMhs.getJSONObject(i);
						tempMhs = new Mahasiswa();
						tempMhs.setMhsId(c.getString(TAG_ID_MHS));
						tempMhs.setMhsName(c.getString(TAG_NAMA_MHS));
						tempMhs.setMhsNIM(c.getString(TAG_NIM_MHS));
						daftar_mhs.add(tempMhs);
					}
					return "OK";
				} else {
					return "no results";
				}
			} catch (Exception e) {
				e.printStackTrace();
				return "Exception Caught";
			}
		}
    }
    
}
