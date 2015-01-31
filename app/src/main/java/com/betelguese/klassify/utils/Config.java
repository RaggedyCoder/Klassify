package com.betelguese.klassify.utils;

import com.betelguese.klassify.model.UserInfo;

/**
 * Md.Ashraful Islam Reg No. 2010331035 Computer Science and Engineering
 * Shahjalal University of Science and Technology,Sylhet
 */

public class Config {
    public static final String ARG_POSITION = "position";
    public static final String ARG_TITLE = "title";
    public static final String ARG_TAG = "tag";
    public static final int TASK_START = 0;
    public static final int TASK_REFRESH = 1;
    public static final int TASK_MORE = 2;

    public static String TABLE_FAVOURITE = "favourite";
    public static String TABLE_IMAGES = "images";
    public static String FavTableItem[] = { "productId","title","description","images","email","createdDate","price" };
    public static String ImageItem[] = { "image_id","imageUrl" };


    public static final String ARG_CATEGORY = "category";
    public static final String ARG_CATEGORY_ITEM = "item_category";
    public static final String PRODUCT = "product";
    public static final String ARG_IMAGES = "images";
    public static final int REQUEST_CODE = 1;
    public static final String ARG_IS_FAVORITE = "is_favorite";
    public static final String ARG_NAV_POSITION = "nav_position";
    public static final int TASK_FAVORITE = 3;

    public static UserInfo userInfo = null;


}
