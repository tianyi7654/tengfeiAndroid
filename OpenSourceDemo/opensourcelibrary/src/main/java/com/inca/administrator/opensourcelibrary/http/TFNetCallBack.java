package com.inca.administrator.opensourcelibrary.http;

import com.loopj.android.http.JsonHttpResponseHandler;

import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class TFNetCallBack extends JsonHttpResponseHandler {

	@Override
	public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
		onSuccess(statusCode,response);
	}

	@Override
	public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
	onFailure(statusCode,throwable,errorResponse);
	}

	public abstract void onFailure(int statusCode, Throwable throwable, JSONObject errorResponse);


	public abstract void onSuccess(int statusCode,JSONObject response);

}
