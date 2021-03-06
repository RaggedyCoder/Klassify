package com.betelguese.klassify.appdata;

import android.content.Context;
import android.os.AsyncTask;

import com.betelguese.klassify.json.ProductJson;
import com.betelguese.klassify.utils.Config;

import java.util.ArrayList;

/**
 * Md.Ashraful Islam Reg No. 2010331035 Computer Science and Engineering
 * Shahjalal University of Science and Technology,Sylhet
 */

public class ProductManager extends AsyncTask<String, Void, Void> {
    private ArrayList<Product> categories;
    private ProductAdapter adapter;
    private int task;

    public ProductManager(Context context, ProductAdapter adapter, int task) {
        this.adapter = adapter;
        this.task = task;
        this.categories = new ArrayList<Product>();
    }

    @Override
    protected Void doInBackground(String... url) {
        try {
            ProductJson productJson = new ProductJson(url[0]);
            categories = productJson.getProducts();
            adapter.setPointer(productJson.getPointer());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (categories == null) {
            categories = new ArrayList<Product>();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        switch (task) {
            case Config.TASK_MORE:
                adapter.setMoreData(categories);
                adapter.invalidate();
                break;
            case Config.TASK_REFRESH:
                adapter.setRefreshData(categories);
                adapter.invalidate();
                break;
            default:
                adapter.setData(categories);
                adapter.invalidate();
                break;
        }

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        switch (task) {
            case Config.TASK_MORE:
                adapter.initMore();
                break;
            case Config.TASK_REFRESH:
                adapter.initRefresh();
                break;
            default:
                adapter.initLoad();
                break;
        }

    }

}
