

# MiniLoader

## Simple Android Custom Loader

![alt](https://github.com/ye-lin-aung/MiniLoader/blob/master/icon.png?raw=true)

## Download AAR

<a href="https://raw.githubusercontent.com/ye-lin-aung/MKot/master/jars/MKot-1.1.2.jar" target="_blank"><img src="http://cognition.ouc.ac.cy/cclab/images/DownloadButton.png" alt="IMAGE ALT TEXT HERE" width="100" height="100"  />
</a>



### Usage 
 ---
 Implements MiniLoaderManager
 ``` 

class MainActivity extends AppCompatActivity implements MiniLoaderManager<Product>{


    @Override public Loader<Product> onCreateLoader(int id, Bundle args) {
    return miniLoader;
  }

  @Override public void onLoaderReset(Loader<Product> loader) {

  }

  @Override public void onLoadFinished(Loader<Product> loader, Product data) {
    Log.d("Hey yo! ", data.getProductName());
  }

  @Override public String loadInBackground() {
    //Write custom Logic Here;
    return DataRepo.getProduct();
  }

 } 

);
``` 
Create MiniLoader 
``` 
MiniLoader miniLoader  = new MiniLoader(ctx,this)

```

Init Now

``` 
getSupportLoaderManager().initLoader(1,null,this);
```




    

    

