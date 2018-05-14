package com.grannylauncher;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class AllAppsActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_apps);

        showAllInstalledApps(getAllInstalledApps());
    }

    private ArrayList<App> getAllInstalledApps()
    {
        PackageManager manager;
        ArrayList<App> apps = new ArrayList<>();
        manager = getPackageManager();

        Intent intent = new Intent(Intent.ACTION_MAIN, null);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);

        List<ResolveInfo> availableActivities = manager
                .queryIntentActivities(intent, 0);

        for (ResolveInfo resolveInfo : availableActivities)
        {
            App app = new App();
            app.setAppName(resolveInfo.loadLabel(manager));
            app.setAppIcon(resolveInfo.activityInfo.loadIcon(manager));
            apps.add(app);
        }

        return apps;
    }

    private void showAllInstalledApps(ArrayList<App> apps)
    {

    }
}
