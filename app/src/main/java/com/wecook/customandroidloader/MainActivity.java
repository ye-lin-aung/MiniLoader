package com.wecook.customandroidloader;

import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.wecook.customloader.MiniLoader;
import com.wecook.customloader.MiniLoaderManager;

public class MainActivity extends AppCompatActivity implements MiniLoaderManager<String> {

  private MiniLoader miniLoader;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    miniLoader = new MiniLoader<>(this, this);

    getSupportLoaderManager().initLoader(1, null, this);
  }

  @Override public Loader<String> onCreateLoader(int id, Bundle args) {
    return miniLoader;
  }

  @Override public void onLoaderReset(Loader<String> loader) {

  }

  @Override public void onLoadFinished(Loader<String> loader, String data) {
    Log.d("Hey yo! ", data);
  }

  @Override public String loadInBackground() {
    return "Helloworld from mini-loader";
  }
}
