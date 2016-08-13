

# MiniLoader

## Simple Android Custom Loader

![alt](https://github.com/ye-lin-aung/MiniLoader/blob/master/icon.png?raw=true)

## Download AAR

<a href="https://github.com/ye-lin-aung/MiniLoader/blob/master/download/customloader-v1.0.0.aar?raw=true" target="_blank"><img src="http://cognition.ouc.ac.cy/cclab/images/DownloadButton.png" alt="IMAGE ALT TEXT HERE" width="100" height="100"  />
</a>



### Usage 
 ---

 Create MiniLoader 
``` 
MiniLoader miniLoader  = new MiniLoader(ctx,this)

```


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

Init Now

``` 
getSupportLoaderManager().initLoader(1,null,this);
```




    

    

