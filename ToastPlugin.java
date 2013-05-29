package com.phonegap.munnadroid.plugin;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import android.widget.Toast;

public class ToastPlugin extends CordovaPlugin {

	@Override 
	public boolean execute(String action, JSONArray data, CallbackContext callback) {
		
		int tmpDuration;
		String tmpText = "none";
		
		try {
			tmpText = data.getString(0);
		} catch (JSONException e) {
			callback.error("Parsing Text Exception");
			return false;
		} 
		try {
			tmpDuration = data.getInt(1);
		} catch (JSONException e) {
			callback.error("Parsing Duration Exception");
			return false;
		}
		
		final String Text = tmpText;
		final int Duration = tmpDuration;
		//final CordovaInterface currentCtx = cordova;
		 
		
		Runnable runnable = new Runnable() { 
			public void run() {
				Toast.makeText(cordova.getActivity().getApplicationContext() ,Text, Duration).show();
			 }
		}; 
		
		cordova.getActivity().runOnUiThread(runnable);
		
		return true;
	}

}
