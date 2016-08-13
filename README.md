

# MiniLoader

## Simple Android Custom Loader


![alt](http://link)

### Usage 
 ---
 Create your own MiniLoader
 ``` 
    //Create your own MiniLoader

    MiniLoader mloader = new MiniLoader (this,new Callback<T>({

    @Override public T loadInBackground() {
      
    return T;
  }
);
``` 
Register in OnCreate of LoaderManager.LoaderCallback
```
@Override public Loader<T> onCreateLoader(int id, Bundle args) {
    return miniLoader;
  }


```

    

    

