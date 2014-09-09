package android.support.v7.app;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.internal.view.c;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.p;

abstract class e
{
  final ActionBarActivity hE;
  private ActionBar hF;
  private MenuInflater hG;
  boolean hH;
  boolean hI;

  e(ActionBarActivity paramActionBarActivity)
  {
    this.hE = paramActionBarActivity;
  }

  final ActionBar aM()
  {
    if ((this.hH) || (this.hI))
      if (this.hF != null);
    for (this.hF = aP(); ; this.hF = null)
      return this.hF;
  }

  abstract ActionBar aP();

  abstract void aQ();

  abstract boolean aR();

  protected final String aS()
  {
    try
    {
      ActivityInfo localActivityInfo = this.hE.getPackageManager().getActivityInfo(this.hE.getComponentName(), 128);
      Bundle localBundle = localActivityInfo.metaData;
      Object localObject = null;
      if (localBundle != null)
      {
        String str = localActivityInfo.metaData.getString("android.support.UI_OPTIONS");
        localObject = str;
      }
      return localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      new StringBuilder("getUiOptionsFromMetadata: Activity '").append(this.hE.getClass().getSimpleName()).append("' not in manifest");
    }
    return null;
  }

  protected final Context aT()
  {
    Object localObject = this.hE;
    ActionBar localActionBar = aM();
    if (localActionBar != null)
      localObject = localActionBar.getThemedContext();
    return localObject;
  }

  abstract void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);

  abstract void d(CharSequence paramCharSequence);

  final MenuInflater getMenuInflater()
  {
    ActionBar localActionBar;
    if (this.hG == null)
    {
      localActionBar = aM();
      if (localActionBar == null)
        break label36;
    }
    label36: for (this.hG = new c(localActionBar.getThemedContext()); ; this.hG = new c(this.hE))
      return this.hG;
  }

  abstract void n();

  void onCreate(Bundle paramBundle)
  {
    TypedArray localTypedArray = this.hE.obtainStyledAttributes(p.cvn);
    if (!localTypedArray.hasValue(p.cvo))
    {
      localTypedArray.recycle();
      throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }
    this.hH = localTypedArray.getBoolean(p.cvo, false);
    this.hI = localTypedArray.getBoolean(p.cvp, false);
    localTypedArray.recycle();
  }

  abstract boolean onCreatePanelMenu(int paramInt, Menu paramMenu);

  abstract View onCreatePanelView(int paramInt);

  abstract boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem);

  abstract void onPostResume();

  abstract boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu);

  abstract void onStop();

  abstract void setContentView(int paramInt);

  abstract void setContentView(View paramView);

  abstract void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);

  abstract boolean v(int paramInt);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.e
 * JD-Core Version:    0.6.2
 */