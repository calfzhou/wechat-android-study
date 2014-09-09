package com.tencent.mm.plugin.gwallet;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.jg.JgClassChecked;
import com.tencent.mm.plugin.gwallet.a.b;
import com.tencent.mm.sdk.platformtools.z;

@JgClassChecked(author=31, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK, com.jg.EType.RECEIVERCHECK})
public class GWalletUI extends Activity
{
  BroadcastReceiver eiR = new f(this);
  private b fdo = null;

  public final void bl(boolean paramBoolean)
  {
    this.fdo.a("inapp", new h(this, paramBoolean));
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.fdo.a(paramInt1, paramIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    z.d("!32@/B4Tb64lLpJlq3g3dssAocibZs9nb5Th", "Creating IAB helper.");
    this.fdo = new b(this);
    z.d("!32@/B4Tb64lLpJlq3g3dssAocibZs9nb5Th", "Starting setup.");
    this.fdo.a(new d(this));
  }

  protected void onDestroy()
  {
    z.d("!32@/B4Tb64lLpJlq3g3dssAocibZs9nb5Th", "Destroying helper.");
    if (this.fdo != null)
      this.fdo.dispose();
    this.fdo = null;
    super.onDestroy();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    if ("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST".equals(paramIntent.getAction()))
      bl(paramIntent.getBooleanExtra("is_direct", true));
    super.onNewIntent(paramIntent);
  }

  public void onStart()
  {
    super.onStart();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
    registerReceiver(this.eiR, localIntentFilter);
  }

  protected void onStop()
  {
    super.onStop();
    unregisterReceiver(this.eiR);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.GWalletUI
 * JD-Core Version:    0.6.2
 */