package com.wecook.customloader;

/**
 * Created by user on 8/13/16.
 */

public interface Callback<T> {
  T loadInBackground();
}
