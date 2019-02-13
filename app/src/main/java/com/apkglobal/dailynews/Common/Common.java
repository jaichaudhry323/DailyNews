package com.apkglobal.dailynews.Common;

import com.apkglobal.dailynews.Interface.IconBetterIdeaService;
import com.apkglobal.dailynews.Interface.NewsService;
import com.apkglobal.dailynews.Remote.IconBetterIdeaClient;
import com.apkglobal.dailynews.Remote.RetrofitClient;

/**
 * Created by reale on 10/4/2017.
 */

public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public  static final String API_KEY="75715332a8f54cd0aa5565b783cb5324";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    public static String getAPIUrl(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }


}
