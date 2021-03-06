package com.hamalatcom;

import com.facebook.react.ReactActivity;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import static com.facebook.FacebookSdk.getApplicationContext;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "HamalatCom";
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            MainApplication.getCallbackManager().onActivityResult(requestCode, resultCode, data);
            I18nUtil sharedI18nUtilInstance = I18nUtil.getInstance();
            Context context = getApplicationContext();
            sharedI18nUtilInstance.allowRTL(context, true);
    }
}
