package com.grannylauncher;

import android.app.Activity;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class HomeActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton allAppsImageButton = findViewById(R.id.all_apps_image_button);
        allAppsImageButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openAllAppsActivity();
            }
        });

        LinearLayout phoneLinearLayout = findViewById(R.id.phone_linear_layout);
        phoneLinearLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openPhoneApp();
            }
        });

        LinearLayout messagesLinearLayout = findViewById(R.id.messages_linear_layout);
        messagesLinearLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openMessagesApp();
            }
        });

        LinearLayout contactsLinearLayout = findViewById(R.id.contacts_linear_layout);
        contactsLinearLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openContactsApp();
            }
        });

        LinearLayout googleLinearLayout = findViewById(R.id.google_linear_layout);
        googleLinearLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openGoogleApp();
            }
        });

        LinearLayout cameraLinearLayout = findViewById(R.id.camera_linear_layout);
        cameraLinearLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openCameraApp();
            }
        });

        LinearLayout settingsLinearLayout = findViewById(R.id.settings_linear_layout);
        settingsLinearLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openSettingsApp();
            }
        });
    }

    private void openAllAppsActivity()
    {
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        if (vibrator != null)
        {
            // Make the device vibrate if te all apps button was pressed.
            vibrator.vibrate(10);
        }

        // Start the AllAppsActivity.
        Intent allAppsActivityIntent = new Intent(this, AllAppsActivity.class);
        startActivity(allAppsActivityIntent);
    }

    private void openPhoneApp()
    {
        Intent phoneAppIntent = new Intent(Intent.ACTION_DIAL);
        startActivity(phoneAppIntent);
    }

    private void openMessagesApp()
    {
        Intent settingsAppIntent = new Intent(android.provider.Settings.ACTION_SETTINGS);
        startActivity(settingsAppIntent);
    }

    private void openContactsApp()
    {
        Intent settingsAppIntent = new Intent(android.provider.Settings.ACTION_SETTINGS);
        startActivity(settingsAppIntent);
    }

    private void openGoogleApp()
    {
        Intent browserAppIntent = new Intent(Intent.ACTION_MAIN);
        browserAppIntent.addCategory(Intent.CATEGORY_APP_BROWSER);
        startActivity(browserAppIntent);
    }

    private void openCameraApp()
    {
        Intent settingsAppIntent = new Intent(android.provider.Settings.ACTION_SETTINGS);
        startActivity(settingsAppIntent);
    }

    private void openSettingsApp()
    {
        Intent settingsAppIntent = new Intent(android.provider.Settings.ACTION_SETTINGS);
        startActivity(settingsAppIntent);
    }

    @Override
    public void onBackPressed()
    {
        // Do nothing
    }
}
