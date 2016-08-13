

# MiniLoader

## Simple Android Custom Loader

![alt](http://link)

## Download AAR


### Usage 
 ---
 Implements MiniLoaderManager
 ``` 

    class Activity extends AppCompatActivity implements MiniLoaderManager<Product>{


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




    

    

