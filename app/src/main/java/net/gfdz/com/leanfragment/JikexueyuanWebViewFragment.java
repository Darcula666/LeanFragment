package net.gfdz.com.leanfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Administrator on 2015/11/20.
 */
public class JikexueyuanWebViewFragment extends Fragment {
   private WebView wv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.jikexueyuan_webview,container,false);
        wv= (WebView) root.findViewById(R.id.webview01);
        wv.loadUrl("http://www.jikexueyuan.com");
        return root;
    }
}
