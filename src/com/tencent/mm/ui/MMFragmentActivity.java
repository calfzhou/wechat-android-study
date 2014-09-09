package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class MMFragmentActivity extends ActionBarActivity
{
  String className;
  private ce iLs = new ce();
  ArrayList iMY = new ArrayList();

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

  public final dz aQi()
  {
    int i = this.iMY.size();
    dz localdz;
    if (i == 0)
      localdz = null;
    do
    {
      return localdz;
      localdz = (dz)((WeakReference)this.iMY.get(i - 1)).get();
    }
    while ((localdz != null) && (localdz.isShowing()));
    return null;
  }

  public void finish()
  {
    super.finish();
    if ((this.iLs.iLD != -1) && (this.iLs.iLE != -1))
      super.overridePendingTransition(this.iLs.iLD, this.iLs.iLE);
    while (true)
    {
      this.iLs.reset();
      return;
      super.overridePendingTransition(this.iLs.iLB, this.iLs.iLC);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    this.className = getClass().getName();
    eu.D(3, this.className);
    super.onCreate(paramBundle);
  }

  protected void onPause()
  {
    eu.D(2, this.className);
    super.onPause();
  }

  protected void onResume()
  {
    eu.D(1, this.className);
    super.onResume();
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT < 11)
      super.onSaveInstanceState(paramBundle);
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
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMFragmentActivity
 * JD-Core Version:    0.6.2
 */