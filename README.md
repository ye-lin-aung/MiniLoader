

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

# License #
```
DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE Version 2, December 2004

Copyright (C) 2004 Sam Hocevar sam@hocevar.net

Everyone is permitted to copy and distribute verbatim or modified copies of this license document, and changing it is allowed as long as the name is changed.

        DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION

You just DO WHAT THE FUCK YOU WANT TO.

```




    

    

