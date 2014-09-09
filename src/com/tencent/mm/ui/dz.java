package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.tools.fj;

public abstract class dz extends ai
{
  String className;
  protected cg iLr = new ea(this);
  protected ActionBarActivity iMW;

  public dz()
  {
  }

  public dz(boolean paramBoolean)
  {
    super(true);
  }

  protected static View aPX()
  {
    return null;
  }

  protected static void aQf()
  {
  }

  protected static void axa()
  {
  }

  public void Bt(String paramString)
  {
    this.iLr.Bt(paramString);
  }

  public void Bu(String paramString)
  {
    this.iLr.Bu(paramString);
  }

  protected final void Bv(String paramString)
  {
    this.iLr.Bv(paramString);
  }

  public void XF()
  {
    this.iLr.XF();
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.iLr.a(paramInt1, paramInt2, paramInt3, paramOnMenuItemClickListener);
  }

  public void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.iLr.a(paramOnMenuItemClickListener, 0);
  }

  public final void a(String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    this.iLr.a(2, paramString, paramOnMenuItemClickListener, null, paramInt);
  }

  public final void a(boolean paramBoolean, fj paramfj)
  {
    this.iLr.a(paramBoolean, paramfj);
  }

  public final cg aPC()
  {
    return this.iLr;
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

  protected String aPL()
  {
    return "";
  }

  public final void aPO()
  {
    this.iLr.aPO();
  }

  public final boolean aPY()
  {
    return this.iLr.aPY();
  }

  public final boolean aPZ()
  {
    return this.iLr.aPZ();
  }

  public final int aQg()
  {
    return this.iLr.getStreamVolume(3);
  }

  public final int aQh()
  {
    return this.iLr.getStreamMaxVolume(3);
  }

  public final void aep()
  {
    this.iLr.aep();
  }

  public final Activity agh()
  {
    return this.iLr.aPI();
  }

  public final void av(boolean paramBoolean)
  {
    this.iLr.av(paramBoolean);
  }

  public final void b(ActionBarActivity paramActionBarActivity)
  {
    this.iMW = paramActionBarActivity;
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

  public final void eF(boolean paramBoolean)
  {
    this.iLr.u(2, paramBoolean);
  }

  public void finish()
  {
    super.finish();
    int i = h().getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", -1);
    int j = h().getIntent().getIntExtra("MMActivity.OverrideExitAnimation", -1);
    if (i != -1)
      this.iLr.aPI().overridePendingTransition(i, j);
  }

  protected final View getContentView()
  {
    return this.iLr.getContentView();
  }

  protected abstract int getLayoutId();

  public final FragmentActivity h()
  {
    if (this.iLr.aPI() != null)
      return this.iLr.aPI();
    return super.h();
  }

  public void oP(int paramInt)
  {
    this.iLr.oP(paramInt);
  }

  public void oQ(int paramInt)
  {
    this.iLr.oQ(paramInt);
  }

  public final boolean oS(int paramInt)
  {
    return this.iLr.oS(paramInt);
  }

  public void oT(int paramInt)
  {
    this.iLr.oT(paramInt);
  }

  public void oX(int paramInt)
  {
    this.iLr.oX(paramInt);
  }

  public final void oY(int paramInt)
  {
    this.iLr.aZ(2, paramInt);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iLr.a(h().getBaseContext(), (ActionBarActivity)h());
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    if (!this.iLr.onCreateOptionsMenu(paramMenu))
      super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    j();
    return this.iLr.getContentView();
  }

  public void onDestroy()
  {
    super.onDestroy();
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

  public final boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return this.iLr.onOptionsItemSelected(paramMenuItem);
  }

  public void onPause()
  {
    long l = System.currentTimeMillis();
    eu.D(2, this.className);
    super.onPause();
    this.iLr.onPause();
    z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN MMActivity onPause:" + (System.currentTimeMillis() - l));
  }

  public final void onPrepareOptionsMenu(Menu paramMenu)
  {
    this.iLr.onPrepareOptionsMenu(paramMenu);
    super.onPrepareOptionsMenu(paramMenu);
  }

  public void onResume()
  {
    long l = System.currentTimeMillis();
    eu.D(1, this.className);
    super.onResume();
    z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN MMActivity super.onResume " + (System.currentTimeMillis() - l));
    this.iLr.onResume();
    z.v("!24@/B4Tb64lLpKk4tudMInS/w==", "KEVIN MMActivity onResume :" + (System.currentTimeMillis() - l));
  }

  public void onStart()
  {
    this.iLr.onStart();
    super.onStart();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.dz
 * JD-Core Version:    0.6.2
 */