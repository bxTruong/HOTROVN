package com.example.hotrovn.utilities;

import android.content.Context;

import com.example.hotrovn.model.City;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;

public class HandingJson {
    public static String readStringFromAsset(String fileName, Context context) {
        String json = null;
        try {
            InputStream in = context.getAssets().open(fileName);
            int size = in.available();
            byte[] buffer = new byte[size];
            in.read(buffer);
            in.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    /**
     * phương thức chuyển ArrayObject trong json thành List object
     */
    public static List<City> getCountries(Context context) {
        Gson gson = new Gson();
        String jsObj = HandingJson.readStringFromAsset("data.json", context);
        //Country listData = gson.fromJson(jsObj, Country.class);//truy vấn cho oblect
        Type listType = new TypeToken<List<City>>() {
        }.getType();
        List<City> countryList = gson.fromJson(jsObj, listType);
        return countryList;
    }
}
