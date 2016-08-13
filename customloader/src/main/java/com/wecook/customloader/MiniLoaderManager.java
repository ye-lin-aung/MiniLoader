package com.wecook.customloader;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;

/**
 * Created by user on 8/13/16.
 */

public interface MiniLoaderManager<T> extends LoaderManager.LoaderCallbacks<T>, Callback<T> {
  @Override Loader<T> onCreateLoader(int id, Bundle args);

  @Override void onLoaderReset(Loader<T> loader);

  @Override void onLoadFinished(Loader<T> loader, T data);

  @Override T loadInBackground();
}
