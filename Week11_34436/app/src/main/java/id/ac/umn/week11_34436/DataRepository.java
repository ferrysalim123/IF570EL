package id.ac.umn.week11_34436;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataRepository {
    static String placeholderUrl = "https://jsonplaceholder.typicode.com/";
    static final id.ac.umn.week11_34436.PostServices create() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(placeholderUrl)
                .build();
        return retrofit.create(id.ac.umn.week11_34436.PostServices.class);
    }
}