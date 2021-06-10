package com.kekui.retrofit_android_demo.activity;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.kekui.retrofit_android_demo.R;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "xxx";
    public static final String BASE_URL = "https://api.github.com/";
    private static Retrofit retrofit = null;

    private final static String REPO_PATH = "repo:square/retrofit merge:false sort:author-date-desc";
    private final static String HEADER_AUTH = "application/vnd.github.cloak-preview";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectAndGetApiData();
    }

    public void connectAndGetApiData(){
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        GithubApiService commitApiService = retrofit.create(GithubApiService.class);

        Call<ResponseBean> call = commitApiService.getReposCommits(HEADER_AUTH,REPO_PATH);

        call.enqueue(new Callback<ResponseBean>() {
            @Override
            public void onResponse(Call<ResponseBean> call, Response<ResponseBean> response) {
                List<ResponseBean.ItemsBean> commits = response.body().getItems();
                Log.d(TAG, "Number of commits received: " + commits.size());
            }

            @Override
            public void onFailure(Call<ResponseBean> call, Throwable throwable) {
                Log.e(TAG, throwable.toString());
            }
        });
    }
}
