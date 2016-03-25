package duoy.cn.meplusrobottest.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.facebook.shimmer.ShimmerFrameLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import duoy.cn.meplusrobottest.MainActivity;
import duoy.cn.meplusrobottest.R;
import duoy.cn.meplusrobottest.utils.IntentUtils;

public class LogoActivity extends BaseActivity implements Handler.Callback{

    private Handler handler;
    @Bind(R.id.shimmer_view_container)
    ShimmerFrameLayout mShimmerFrameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        ButterKnife.bind(this);
        mShimmerFrameLayout.startShimmerAnimation();
        handler = new Handler(this);
        handler.sendEmptyMessageDelayed(1,3000);
    }

    @Override
    public boolean handleMessage(Message msg) {
        if (msg.what == 1) {
            startActivity(IntentUtils.generateIntent(this, MainActivity.class));
            finish();
            return true;
        }
        return false;
    }
}
