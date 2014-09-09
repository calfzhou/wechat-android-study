package com.tencent.mm.pluginsdk.downloader.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;

public class ProgressDialogUI extends Activity
{
  private aa dQr;
  private ay dWw;
  public ProgressBar eBw;
  public long htC;
  private com.tencent.mm.pluginsdk.model.downloader.n htQ;

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.htC = getIntent().getLongExtra("Intent_task_id", 0L);
    ad localad = new ad(this);
    localad.BK(getString(com.tencent.mm.n.cDQ));
    localad.d(com.tencent.mm.n.cDO, new a(this));
    localad.e(com.tencent.mm.n.cDP, new b(this));
    localad.b(new c(this));
    try
    {
      View localView = ((LayoutInflater)getSystemService("layout_inflater")).inflate(k.cBz, null);
      this.eBw = ((ProgressBar)localView.findViewById(i.cir));
      this.eBw.setMax(100);
      localad.ao(localView);
      this.dQr = localad.aRB();
      this.dQr.show();
      this.htQ = new d(this);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        z.printErrStackTrace("!44@/B4Tb64lLpJ4RAx5Vc4Ilfekj5Ps3ABrS1gn2P55iIs=", localException, localException.toString(), new Object[0]);
    }
  }

  protected void onStart()
  {
    super.onStart();
    z.d("!44@/B4Tb64lLpJ4RAx5Vc4Ilfekj5Ps3ABrS1gn2P55iIs=", "onStart");
    com.tencent.mm.pluginsdk.downloader.c.bcs().jRZ.a(this.htQ);
    if (this.dWw == null)
      this.dWw = new ay(new e(this), true);
    this.dWw.cP(400L);
  }

  protected void onStop()
  {
    super.onStop();
    this.dQr.dismiss();
    z.d("!44@/B4Tb64lLpJ4RAx5Vc4Ilfekj5Ps3ABrS1gn2P55iIs=", "onStop");
    com.tencent.mm.pluginsdk.downloader.c.bcs().jRZ.b(this.htQ);
    if (this.dWw != null)
      this.dWw.aNu();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.ui.ProgressDialogUI
 * JD-Core Version:    0.6.2
 */