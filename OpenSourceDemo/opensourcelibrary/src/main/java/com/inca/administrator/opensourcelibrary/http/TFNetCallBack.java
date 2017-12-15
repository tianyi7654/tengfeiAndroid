package com.inca.administrator.opensourcelibrary.http;

import com.loopj.android.http.JsonHttpResponseHandler;

import org.apache.http.Header;
import org.json.JSONObject;

public abstract class TFNetCallBack extends JsonHttpResponseHandler {

	@Override
	public abstract void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse);

	@Override
	public abstract void onSuccess(int statusCode, Header[] headers,JSONObject response);

	

}
