package com.tripper.dropboxUtil;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.dropbox.sync.android.DbxAccount;
import com.dropbox.sync.android.DbxAccountManager;
import com.tripper.R;

/**
 * User: SG0219139
 * Date: 11/3/13
 */
public class DropboxLinker extends Activity {
    private DbxAccountManager accountManager;
    private Context appContext;
    private String APP_KEY;
    private String SECRET_KEY;

    public DropboxLinker(Context context){
        APP_KEY = context.getString(R.string.DROPBOX_APP_KEY);
        SECRET_KEY = context.getString(R.string.DROPBOX_SECRET_KEY);
        accountManager  = DbxAccountManager.getInstance(context,APP_KEY,SECRET_KEY);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        savedInstanceState.get("cos");
    }

}
