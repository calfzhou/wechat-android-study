package android.support.v7.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.aa;
import android.support.v4.app.at;
import android.support.v4.app.au;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class ActionBarActivity extends FragmentActivity
  implements au, a
{
  e hD;

  private boolean aO()
  {
    Intent localIntent = aa.a(this);
    if (localIntent != null)
    {
      if (aa.a(this, localIntent))
      {
        at localat = at.b(this);
        localat.c(this);
        localat.startActivities();
        try
        {
          if (Build.VERSION.SDK_INT >= 16)
            finishAffinity();
          else
            finish();
        }
        catch (IllegalStateException localIllegalStateException)
        {
          finish();
        }
      }
      else
      {
        aa.b(this, localIntent);
      }
    }
    else
      return false;
    return true;
  }

  final void D(View paramView)
  {
    super.setContentView(paramView);
  }

  public final Intent N()
  {
    return aa.a(this);
  }

  final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(paramView, paramLayoutParams);
  }

  final boolean a(int paramInt, Menu paramMenu)
  {
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }

  final boolean a(int paramInt, MenuItem paramMenuItem)
  {
    return super.onMenuItemSelected(paramInt, paramMenuItem);
  }

  final boolean a(int paramInt, View paramView, Menu paramMenu)
  {
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }

  public final ActionBar aM()
  {
    return this.hD.aM();
  }

  public final boolean aN()
  {
    return this.hD.v(5);
  }

  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.hD.addContentView(paramView, paramLayoutParams);
  }

  final void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addContentView(paramView, paramLayoutParams);
  }

  public MenuInflater getMenuInflater()
  {
    return this.hD.getMenuInflater();
  }

  public final void n()
  {
    if (Build.VERSION.SDK_INT >= 14)
      super.n();
    this.hD.n();
  }

  public void onBackPressed()
  {
    if (!this.hD.aR())
      super.onBackPressed();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.hD.aQ();
  }

  protected void onCreate(Bundle paramBundle)
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (i >= 14)
      localObject = new i(this);
    while (true)
    {
      this.hD = ((e)localObject);
      super.onCreate(paramBundle);
      this.hD.onCreate(paramBundle);
      return;
      if (i >= 11)
        localObject = new h(this);
      else
        localObject = new f(this);
    }
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return this.hD.onCreatePanelMenu(paramInt, paramMenu);
  }

  public View onCreatePanelView(int paramInt)
  {
    if (paramInt == 0)
      return this.hD.onCreatePanelView(paramInt);
    return super.onCreatePanelView(paramInt);
  }

  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (this.hD.onMenuItemSelected(paramInt, paramMenuItem))
      return true;
    ActionBar localActionBar = this.hD.aM();
    if ((paramMenuItem.getItemId() == 16908332) && (localActionBar != null) && ((0x4 & localActionBar.getDisplayOptions()) != 0))
      return aO();
    return false;
  }

  protected void onPostResume()
  {
    super.onPostResume();
    this.hD.onPostResume();
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return this.hD.onPreparePanel(paramInt, paramView, paramMenu);
  }

  protected void onStop()
  {
    super.onStop();
    this.hD.onStop();
  }

  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    this.hD.d(paramCharSequence);
  }

  public void setContentView(int paramInt)
  {
    this.hD.setContentView(paramInt);
  }

  public void setContentView(View paramView)
  {
    this.hD.setContentView(paramView);
  }

  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.hD.setContentView(paramView, paramLayoutParams);
  }

  final void u(int paramInt)
  {
    super.setContentView(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.ActionBarActivity
 * JD-Core Version:    0.6.2
 */