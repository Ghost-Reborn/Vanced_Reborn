package in.ghostreborn.vancedreborn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView youtubeWebView = findViewById(R.id.youtube_webview);
        youtubeWebView.setWebViewClient(new WebViewClient());
        youtubeWebView.getSettings().setJavaScriptEnabled(true);
        youtubeWebView.loadUrl("https://youtube.com");

    }
}