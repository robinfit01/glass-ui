package com.rokid.glass.ui.autosize;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/**
 * auto size init
 */
public class InitProvider extends ContentProvider {
    @Override
    public boolean onCreate() {
        Context application = getContext().getApplicationContext();
        if (application == null) {
            application = AutoSizeUtils.getApplicationByReflect();
        }

        AutoSizeConfig.getInstance()
                .init((Application) application);
        return true;
    }

    @Override
    public Cursor query( Uri uri,  String[] projection,  String selection,  String[] selectionArgs,  String sortOrder) {
        return null;
    }

    
    @Override
    public String getType( Uri uri) {
        return null;
    }

    
    @Override
    public Uri insert( Uri uri,  ContentValues values) {
        return null;
    }

    @Override
    public int delete( Uri uri,  String selection,  String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update( Uri uri,  ContentValues values,  String selection,  String[] selectionArgs) {
        return 0;
    }
}
