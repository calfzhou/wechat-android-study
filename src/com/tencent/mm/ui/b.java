package com.tencent.mm.ui;

import android.os.Bundle;
import android.view.KeyEvent;

public abstract class b extends com.tencent.mm.ui.base.preference.z
  implements aj
{
  private boolean iHJ;
  private boolean iHK;
  private Bundle iHL;
  private boolean iHM;
  private boolean iHN;
  protected boolean iHO = false;
  protected boolean iHP = false;
  protected boolean iHQ;

  protected abstract void aOc();

  protected abstract void aOd();

  protected abstract void aOe();

  protected abstract void aOf();

  protected abstract void aOg();

  protected abstract void aOh();

  public final void aOl()
  {
    aOj();
    this.iHM = true;
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
        aOk();
        this.iHM = false;
      }
      aOd();
      com.tencent.mm.sdk.platformtools.z.d("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN " + toString() + " OnTabResume last : " + (System.currentTimeMillis() - l));
      this.iHN = true;
      this.iHO = false;
      return;
      if (this.iHJ)
      {
        aOh();
        aOc();
        com.tencent.mm.sdk.platformtools.z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN tab onRecreate ");
        this.iHJ = false;
      }
    }
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.iHL = paramBundle;
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
    com.tencent.mm.sdk.platformtools.z.d("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN " + toString() + " onTabPause last : " + (System.currentTimeMillis() - l));
    this.iHN = false;
    this.iHQ = false;
  }

  public final void onResume()
  {
    super.onResume();
    aOm();
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

  public final void onStart()
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
 * Qualified Name:     com.tencent.mm.ui.b
 * JD-Core Version:    0.6.2
 */