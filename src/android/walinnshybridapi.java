package com.walinns.walinnshybrid;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.walinns.walinnshybrid.WalinnsAPI;

/**
 * This class echoes a string called from JavaScript.
 */
public class walinnshybridapi extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
     private void trackEvent(String message, CallbackContext callbackContext) {
       if (message != null && message.length() > 0) {
           callbackContext.success(message);
           WalinnsAPI.getInstance().track("button", "Email button clicked");
       } else {
           callbackContext.error("Expected one non-empty string argument.");
       }
   }

   private void trackScreen(String message, CallbackContext callbackContext) {
       if (message != null && message.length() > 0) {
           callbackContext.success(message);
           WalinnsAPI.getInstance().track(message);
       } else {
           callbackContext.error("Expected one non-empty string argument.");
       }
   }
}
