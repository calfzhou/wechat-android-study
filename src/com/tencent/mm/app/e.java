package com.tencent.mm.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import com.tencent.mm.k;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cq;
import com.tencent.mm.platformtools.b;
import com.tencent.mm.plugin.f.c.j;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.chatting.InitCallBackImageView;
import com.tencent.mm.ui.chatting.InitCallBackLayout;
import java.io.IOException;

public final class e
{
  private static e cFP;
  private View aL;
  private FrameLayout cFQ;
  private WindowManager cFR;
  private WindowManager.LayoutParams cFS;
  private ViewGroup.LayoutParams cFT;
  private boolean cFU;
  private boolean cFV;
  private BitmapDrawable cFW = null;

  @Deprecated
  public Boolean cFX = Boolean.valueOf(false);
  private final int cFY = 5;
  protected Object mLock = new Object();

  private void a(Activity paramActivity, View paramView)
  {
    if ((paramActivity instanceof Activity))
      paramActivity.setContentView(paramView);
    while ((this.cFQ != null) && (this.cFR != null))
      return;
    this.cFS = new WindowManager.LayoutParams();
    this.cFS.height = -1;
    this.cFS.width = -1;
    this.cFR = ((WindowManager)paramActivity.getSystemService("window"));
    this.cFS.x = 0;
    this.cFS.y = 0;
    this.cFS.type = 2002;
    this.aL = paramView;
    this.cFS.gravity = 51;
    this.cFS.format = 1;
    this.cFQ = new FrameLayout(paramActivity);
    this.cFQ.setPadding(0, 0, 0, 0);
    this.cFT = new ViewGroup.LayoutParams(-1, -1);
    this.cFQ.addView(this.aL, this.cFT);
    this.cFR.addView(this.cFQ, this.cFS);
    this.cFV = true;
  }

  public static e hN()
  {
    if (cFP == null)
      cFP = new e();
    return cFP;
  }

  public final void d(Activity paramActivity)
  {
    boolean bool1 = bg.ra();
    boolean bool2 = bf.dkH.z("login_user_name", "").equals("");
    int i;
    f localf;
    long l;
    if ((!bool1) && (bool2))
    {
      i = 1;
      j.js(15);
      j.js(16);
      if (this.cFV)
        hP();
      localf = new f(this);
      cq.rO().rP();
      l = System.currentTimeMillis();
      if (i == 0)
        break label194;
      InitCallBackLayout localInitCallBackLayout = (InitCallBackLayout)LayoutInflater.from(paramActivity).inflate(k.bqs, null);
      localInitCallBackLayout.a(localf);
      z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN initWindow  Last1: " + (System.currentTimeMillis() - l));
      a(paramActivity, localInitCallBackLayout);
    }
    while (true)
    {
      z.d("!24@/B4Tb64lLpKk4tudMInS/w==", "start time check initWindow  Last: " + (System.currentTimeMillis() - l));
      z.d("!24@/B4Tb64lLpKk4tudMInS/w==", "start time check APPCreate to Window Show Last: " + (System.currentTimeMillis() - LauncherUI.iJC));
      return;
      i = 0;
      break;
      label194: this.cFW = null;
      try
      {
        this.cFW = new BitmapDrawable(b.decodeStream(paramActivity.getAssets().open("resource/welcome.jpg")));
        z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN BitmapFactory.decodeStream " + (System.currentTimeMillis() - l));
        label249: InitCallBackImageView localInitCallBackImageView = new InitCallBackImageView(paramActivity, localf);
        localInitCallBackImageView.setImageDrawable(this.cFW);
        localInitCallBackImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        a(paramActivity, localInitCallBackImageView);
        if (this.cFW == null)
          continue;
        this.cFW.setCallback(null);
        this.cFW = null;
      }
      catch (IOException localIOException)
      {
        break label249;
      }
    }
  }

  public final boolean hO()
  {
    return this.cFV;
  }

  public final void hP()
  {
    try
    {
      synchronized (this.mLock)
      {
        if (this.cFR != null)
        {
          if (this.cFQ != null)
            this.cFR.removeView(this.cFQ);
          this.cFR = null;
        }
        if (this.cFQ != null)
        {
          this.cFQ.removeAllViews();
          this.cFQ = null;
        }
        this.aL = null;
        this.cFV = false;
        label70: this.cFV = false;
        return;
      }
    }
    catch (Exception localException)
    {
      break label70;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.e
 * JD-Core Version:    0.6.2
 */