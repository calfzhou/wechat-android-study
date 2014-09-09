package android.support.v7.app;

import android.os.Bundle;
import android.support.v7.internal.view.b;
import android.support.v7.internal.view.menu.ai;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

final class i extends e
{
  Menu hU;

  i(ActionBarActivity paramActionBarActivity)
  {
    super(paramActionBarActivity);
  }

  public final ActionBar aP()
  {
    return new o(this.hE, this.hE);
  }

  public final void aQ()
  {
  }

  public final boolean aR()
  {
    return false;
  }

  public final void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.hE.b(paramView, paramLayoutParams);
  }

  public final void d(CharSequence paramCharSequence)
  {
  }

  public final void n()
  {
    this.hU = null;
  }

  public final void onActionModeFinished(ActionMode paramActionMode)
  {
    new b(aT(), paramActionMode);
  }

  public final void onActionModeStarted(ActionMode paramActionMode)
  {
    new b(aT(), paramActionMode);
  }

  public final void onCreate(Bundle paramBundle)
  {
    if ("splitActionBarWhenNarrow".equals(aS()))
      this.hE.getWindow().setUiOptions(1, 1);
    super.onCreate(paramBundle);
    if (this.hH)
      this.hE.requestWindowFeature(8);
    if (this.hI)
      this.hE.requestWindowFeature(9);
    Window localWindow = this.hE.getWindow();
    localWindow.setCallback(new j(this, localWindow.getCallback()));
  }

  public final boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if ((paramInt == 0) || (paramInt == 8))
    {
      if (this.hU == null)
        this.hU = ai.c(paramMenu);
      return this.hE.a(paramInt, this.hU);
    }
    return this.hE.a(paramInt, paramMenu);
  }

  public final View onCreatePanelView(int paramInt)
  {
    return null;
  }

  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (paramInt == 0)
      paramMenuItem = ai.j(paramMenuItem);
    return this.hE.a(paramInt, paramMenuItem);
  }

  public final void onPostResume()
  {
  }

  public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) || (paramInt == 8))
      return this.hE.a(paramInt, paramView, this.hU);
    return this.hE.a(paramInt, paramView, paramMenu);
  }

  public final void onStop()
  {
  }

  public final void setContentView(int paramInt)
  {
    this.hE.u(paramInt);
  }

  public final void setContentView(View paramView)
  {
    this.hE.D(paramView);
  }

  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.hE.a(paramView, paramLayoutParams);
  }

  public final boolean v(int paramInt)
  {
    return this.hE.requestWindowFeature(5);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.i
 * JD-Core Version:    0.6.2
 */