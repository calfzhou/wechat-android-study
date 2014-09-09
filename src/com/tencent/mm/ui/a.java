package com.tencent.mm.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.pluginsdk.ui.bm;
import com.tencent.mm.pluginsdk.ui.tools.bg;
import com.tencent.mm.sdk.platformtools.z;

public abstract class a extends dz
  implements bm, bg, aj
{
  private boolean iHJ;
  private boolean iHK;
  private Bundle iHL;
  private boolean iHM;
  protected boolean iHN;
  protected boolean iHO = false;
  protected boolean iHP = false;
  protected boolean iHQ;

  protected abstract void aOc();

  protected abstract void aOd();

  protected abstract void aOe();

  protected abstract void aOf();

  protected abstract void aOg();

  protected abstract void aOh();

  public abstract void aOi();

  public abstract void aOj();

  public abstract void aOk();

  public final void aOl()
  {
    aOj();
    this.iHM = true;
  }

  public final void aOm()
  {
  }

  public final void aOn()
  {
    this.iHP = true;
  }

  public final void aOo()
  {
    if (!this.iHO)
      return;
    if (this.iHK)
    {
      aOc();
      this.iHK = false;
    }
    while (true)
    {
      long l = System.currentTimeMillis();
      if (this.iHM)
      {
        this.iHM = false;
        aOk();
      }
      aOd();
      z.d("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN " + toString() + " OnTabResume last : " + (System.currentTimeMillis() - l));
      this.iHN = true;
      this.iHO = false;
      return;
      if (this.iHJ)
      {
        aOh();
        aOc();
        z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN tab onRecreate " + toString());
        this.iHJ = false;
      }
    }
  }

  protected int getLayoutId()
  {
    return 0;
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.iHK = true;
  }

  public void onDestroy()
  {
    aOh();
    super.onDestroy();
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
      return false;
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public final void onPause()
  {
    super.onPause();
    this.iHQ = true;
    if (this.iHQ)
    {
      if (!this.iHN)
        this.iHQ = false;
    }
    else
      return;
    long l = System.currentTimeMillis();
    aOf();
    z.d("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN " + toString() + " onTabPause last : " + (System.currentTimeMillis() - l));
    this.iHN = false;
    this.iHQ = false;
  }

  public void onResume()
  {
    super.onResume();
    LauncherUI localLauncherUI = LauncherUI.aPm();
    if ((localLauncherUI == null) || (!localLauncherUI.aPb()));
    do
    {
      return;
      this.iHO = true;
    }
    while (!this.iHP);
    aOo();
    this.iHP = false;
  }

  public void onStart()
  {
    super.onStart();
    LauncherUI localLauncherUI = LauncherUI.aPm();
    if ((localLauncherUI == null) || (!localLauncherUI.aPb()))
      return;
    aOe();
  }

  public final void onStop()
  {
    super.onStop();
    aOg();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.a
 * JD-Core Version:    0.6.2
 */