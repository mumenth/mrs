package com.example.mumen.mrs;

import android.app.Application;

import com.parse.Parse;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by mumen on 23/07/17.
 */

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Use for troubleshooting.
        // IMPORTANT: Remove this line for production.
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        // Use OkHttp for monitoring Parse trafic.
        // Can be Level.BASIC, Level.HEADERS, or Level.BODY
        // Go to http://square.github.io/okhttp/3.x/logging-interceptor/ to see the options.
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.networkInterceptors().add(httpLoggingInterceptor);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("com.example.mumen.mrs")
                .clientKey(null)
                .clientBuilder(builder)
                .server("https://mrsf.herokuapp.com/parse/").build());

    }
}