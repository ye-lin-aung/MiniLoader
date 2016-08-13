package com.wecook.customloader;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

/**
 * Created by user on 8/13/16.
 */
public class MiniLoader<T> extends AsyncTaskLoader<T> {

  private Callback<T> callback;

  public MiniLoader(Context context, Callback<T> callback) {
    super(context);
    this.callback = callback;
  }

  @Override public void deliverResult(T data) {
    if (isReset()) {
      return;
    }
    if (isStarted()) {
      super.deliverResult(data);
    }
  }

  @Override public T loadInBackground() {
    return callback.loadInBackground();
  }

  @Override protected void onStartLoading() {
    forceLoad();
  }

  public void notifyDatas() {
    if (isStarted()) {
      forceLoad();
    }
  }

  @Override protected void onReset() {
    onStopLoading();
    super.onReset();
  }
}
