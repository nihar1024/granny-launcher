package com.grannylauncher;

import android.graphics.drawable.Drawable;

/**
 * This class is used to store all the metadata of an app.
 *
 * @author Nihar Thakkar
 * @version 1.0
 * @since 19/01/2018
 */

class App
{
    private Drawable appIcon;
    private CharSequence appName;

    public Drawable getAppIcon()
    {
        return appIcon;
    }

    public void setAppIcon(Drawable appIcon)
    {
        this.appIcon = appIcon;
    }

    public CharSequence getAppName()
    {
        return appName;
    }

    public void setAppName(CharSequence appName)
    {
        this.appName = appName;
    }
}
