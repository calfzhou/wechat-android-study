package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.tools.fj;
import java.util.Locale;

public abstract class MMActivity extends MMFragmentActivity
{
  String className;
  protected boolean iLq = false;
  protected cg iLr = new cd(this);
  private ce iLs = new ce();
  private cf iLt = null;

  public static void aPJ()
  {
    cg.aPJ();
  }

  private void aPT()
  {
    if ((this.iLs.iLD != -1) && (this.iLs.iLE != -1))
      super.overridePendingTransition(this.iLs.iLD, this.iLs.iLE);
    while (true)
    {
      this.iLs.reset();
      return;
      super.overridePendingTransition(this.iLs.iLz, this.iLs.iLA);
    }
  }

  public static Locale cg(Context paramContext)
  {
    return cg.cg(paramContext);
  }

  public static void k(Activity paramActivity)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)paramActivity.getSystemService("input_method");
    if (localInputMethodManager == null);
    View localView;
    do
    {
      return;
      localView = paramActivity.getCurrentFocus();
    }
    while ((localView == null) || (localView.getWindowToken() == null));
    localInputMethodManager.toggleSoftInput(0, 2);
  }

  public final void Bt(String paramString)
  {
    this.iLr.Bt(paramString);
  }

  public final void Bu(String paramString)
  {
    this.iLr.Bu(paramString);
  }

  public final void C(int paramInt, String paramString)
  {
    this.iLr.C(paramInt, paramString);
  }

  @Deprecated
  protected void DP()
  {
  }

  protected int It()
  {
    return -1;
  }

  protected void P(View paramView)
  {
    setContentView(paramView);
  }

  public void XF()
  {
    this.iLr.XF();
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.iLr.a(paramInt1, paramInt2, paramInt3, paramOnMenuItemClickListener);
  }

  public final void a(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.iLr.a(paramInt1, paramInt2, paramOnMenuItemClickListener);
  }

  public final void a(int paramInt, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    this.iLr.a(0, paramInt, paramOnMenuItemClickListener, paramOnLongClickListener);
  }

  public void a(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.iLr.a(paramInt, paramString, paramOnMenuItemClickListener);
  }

  public final void a(int paramInt1, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt2)
  {
    this.iLr.a(paramInt1, paramString, paramOnMenuItemClickListener, null, paramInt2);
  }

  public final void a(Dialog paramDialog)
  {
    this.iLr.a(paramDialog);
  }

  public void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.iLr.a(paramOnMenuItemClickListener, 0);
  }

  public final void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    this.iLr.a(paramOnMenuItemClickListener, paramInt);
  }

  public final void a(cf paramcf)
  {
    this.iLt = paramcf;
  }

  public final void a(cf paramcf, Intent paramIntent, int paramInt)
  {
    this.iLt = paramcf;
    startActivityForResult(paramIntent, paramInt);
  }

  public final void a(fj paramfj)
  {
    this.iLr.a(true, paramfj);
  }

  protected final void a(Class paramClass, Intent paramIntent)
  {
    paramIntent.setClass(this, paramClass);
    startActivity(paramIntent);
  }

  public final void a(String paramString, Animation paramAnimation)
  {
    this.iLr.a(paramString, paramAnimation);
  }

  public final cg aPC()
  {
    return this.iLr;
  }

  protected boolean aPD()
  {
    return false;
  }

  public boolean aPE()
  {
    return false;
  }

  public final int aPF()
  {
    return this.iLr.aPF();
  }

  public void aPG()
  {
  }

  public final View aPH()
  {
    return this.iLr.aPH();
  }

  public final ActionBarActivity aPI()
  {
    return this.iLr.aPI();
  }

  public final boolean aPK()
  {
    return this.iLr.aPK();
  }

  protected String aPL()
  {
    return "";
  }

  public final boolean aPM()
  {
    return this.iLr.oU(0);
  }

  public final boolean aPN()
  {
    return this.iLr.oV(0);
  }

  public final void aPO()
  {
    this.iLr.aPO();
  }

  public final void aPP()
  {
    this.iLr.aPP();
  }

  public final void aPQ()
  {
    this.iLr.aPQ();
  }

  public final boolean aPR()
  {
    return this.iLr.aPR();
  }

  public final int aPS()
  {
    return this.iLr.aPS();
  }

  public final void aPU()
  {
    this.iLr.aPU();
  }

  public final boolean aPV()
  {
    return this.iLr.aPV();
  }

  public final void aPW()
  {
    this.iLr.aPW();
  }

  public void aep()
  {
    this.iLr.aep();
  }

  public final void ak(View paramView)
  {
    this.iLr.ak(paramView);
  }

  public final void av(boolean paramBoolean)
  {
    this.iLr.av(paramBoolean);
  }

  protected void axa()
  {
  }

  protected final void d(Class paramClass)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this, paramClass);
    startActivity(localIntent);
  }

  public final void eA(boolean paramBoolean)
  {
    this.iLr.eA(paramBoolean);
  }

  public final void eB(boolean paramBoolean)
  {
    this.iLr.eB(paramBoolean);
  }

  public final void eC(boolean paramBoolean)
  {
    this.iLr.eC(paramBoolean);
  }

  public final void ey(boolean paramBoolean)
  {
    this.iLr.ey(paramBoolean);
  }

  public final void ez(boolean paramBoolean)
  {
    this.iLr.ez(paramBoolean);
  }

  public void finish()
  {
    super.finish();
    int i = getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", -1);
    int j = getIntent().getIntExtra("MMActivity.OverrideExitAnimation", -1);
    if (i != -1)
    {
      super.overridePendingTransition(i, j);
      return;
    }
    if ((this.iLs.iLD != -1) && (this.iLs.iLE != -1))
      super.overridePendingTransition(this.iLs.iLD, this.iLs.iLE);
    while (true)
    {
      this.iLs.reset();
      return;
      super.overridePendingTransition(this.iLs.iLB, this.iLs.iLC);
    }
  }

  protected final View getContentView()
  {
    return this.iLr.getContentView();
  }

  protected abstract int getLayoutId();

  protected void iF(int paramInt)
  {
    this.iLr.getContentView().setVisibility(paramInt);
    if (paramInt == 0)
    {
      this.iLr.aPQ();
      return;
    }
    this.iLr.aPP();
  }

  public final void oM(int paramInt)
  {
    this.iLr.oM(paramInt);
  }

  protected final void oN(int paramInt)
  {
    this.iLr.oN(paramInt);
  }

  public final void oO(int paramInt)
  {
    this.iLr.oO(paramInt);
  }

  public final void oP(int paramInt)
  {
    this.iLr.oP(paramInt);
  }

  public final void oQ(int paramInt)
  {
    this.iLr.oQ(paramInt);
  }

  public final void oR(int paramInt)
  {
    this.iLr.aX(0, paramInt);
  }

  public final boolean oS(int paramInt)
  {
    return this.iLr.oS(paramInt);
  }

  public final void oT(int paramInt)
  {
    this.iLr.oT(paramInt);
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.iLt != null)
      this.iLt.a(paramInt1, paramInt2, paramIntent);
    this.iLt = null;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iLr.a(getBaseContext(), this);
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = getClass().getSimpleName();
    arrayOfObject[1] = Integer.valueOf(hashCode());
    arrayOfObject[2] = Integer.valueOf(getTaskId());
    arrayOfObject[3] = ch.bL(this);
    z.i("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "checktask onCreate:%s#0x%x, taskid:%d, task:%s", arrayOfObject);
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    if (this.iLr.onCreateOptionsMenu(paramMenu))
      return true;
    return super.onCreateOptionsMenu(paramMenu);
  }

  protected void onDestroy()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = getClass().getSimpleName();
    arrayOfObject[1] = Integer.valueOf(hashCode());
    arrayOfObject[2] = ch.bL(this);
    z.i("!32@/B4Tb64lLpLxTDkrgDsygulNLPLtkN5p", "checktask onDestroy:%s#0x%x task:%s ", arrayOfObject);
    super.onDestroy();
    i.ai(this.iLr.getContentView());
    this.iLr.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.iLr.onKeyDown(paramInt, paramKeyEvent))
      return true;
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.iLr.onKeyUp(paramInt, paramKeyEvent))
      return true;
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return this.iLr.onOptionsItemSelected(paramMenuItem);
  }

  protected void onPause()
  {
    long l = System.currentTimeMillis();
    eu.D(2, this.className);
    super.onPause();
    this.iLr.onPause();
    z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN MMActivity onPause:" + (System.currentTimeMillis() - l));
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    this.iLr.onPrepareOptionsMenu(paramMenu);
    return super.onPrepareOptionsMenu(paramMenu);
  }

  protected void onResume()
  {
    long l = System.currentTimeMillis();
    eu.D(1, this.className);
    super.onResume();
    z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN MMActivity super.onResume " + (System.currentTimeMillis() - l));
    this.iLr.onResume();
    z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN MMActivity onResume :" + (System.currentTimeMillis() - l));
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT < 11)
      super.onSaveInstanceState(paramBundle);
  }

  public void onStart()
  {
    if (It() == -1)
    {
      this.iLq = getSharedPreferences(ak.aHi(), 0).getBoolean("settings_landscape_mode", false);
      if (this.iLq)
        setRequestedOrientation(-1);
    }
    while (true)
    {
      super.onStart();
      return;
      setRequestedOrientation(1);
      continue;
      setRequestedOrientation(It());
    }
  }

  public final void s(Runnable paramRunnable)
  {
    this.iLr.s(paramRunnable);
  }

  public void startActivities(Intent[] paramArrayOfIntent)
  {
    super.startActivities(paramArrayOfIntent);
    aPT();
  }

  @TargetApi(16)
  public void startActivities(Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    super.startActivities(paramArrayOfIntent, paramBundle);
    aPT();
  }

  public void startActivity(Intent paramIntent)
  {
    super.startActivity(paramIntent);
    aPT();
  }

  @TargetApi(16)
  public void startActivity(Intent paramIntent, Bundle paramBundle)
  {
    super.startActivity(paramIntent, paramBundle);
    aPT();
  }

  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    super.startActivityForResult(paramIntent, paramInt);
    aPT();
  }

  @TargetApi(16)
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
    aPT();
  }

  public final void t(int paramInt, boolean paramBoolean)
  {
    this.iLr.t(paramInt, paramBoolean);
  }

  public final void u(int paramInt, boolean paramBoolean)
  {
    this.iLr.u(paramInt, paramBoolean);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMActivity
 * JD-Core Version:    0.6.2
 */