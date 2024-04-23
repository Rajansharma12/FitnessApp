package in.rajababu.fitnessapp;


import android.util.Log;

public class GettingDeviceTokenService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh(){
        String DeviceToken = new String();
        Log.d("DEVICE TOKEN",DeviceToken);
    }

}