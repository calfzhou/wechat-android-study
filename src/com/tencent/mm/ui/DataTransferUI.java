package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;

public class DataTransferUI extends Activity
{
  private cr iIO;
  private long startTime = 0L;

  private void s(Intent paramIntent)
  {
    boolean bool = paramIntent.getBooleanExtra("finish_data_transfer", false);
    z.d("!32@/B4Tb64lLpJAUoyR9+C90Nd9wv/xRLUz", "tryFinish, timestamp = " + System.currentTimeMillis() + ", finish = " + bool);
    if (bool)
      finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    z.d("!32@/B4Tb64lLpJAUoyR9+C90Nd9wv/xRLUz", "onCreate, timestamp = " + System.currentTimeMillis());
    this.startTime = System.currentTimeMillis();
    getString(n.buo);
    this.iIO = e.a(this, getString(n.bsR), false, null);
    new y(this).sendEmptyMessageDelayed(0, 60000L);
    s(getIntent());
  }

  protected void onDestroy()
  {
    super.onDestroy();
    z.d("!32@/B4Tb64lLpJAUoyR9+C90Nd9wv/xRLUz", "onDestroy");
    if ((this.iIO != null) && (this.iIO.isShowing()))
      this.iIO.dismiss();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    z.d("!32@/B4Tb64lLpJAUoyR9+C90Nd9wv/xRLUz", "onNewIntent, timestamp = " + System.currentTimeMillis());
    s(paramIntent);
  }

  protected void onPause()
  {
    z.d("!32@/B4Tb64lLpJAUoyR9+C90Nd9wv/xRLUz", "edw DataTransferUI duration time = " + (System.currentTimeMillis() - this.startTime));
    super.onPause();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.DataTransferUI
 * JD-Core Version:    0.6.2
 */