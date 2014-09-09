package android.support.v4.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.c.a;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.HashMap;

public class Fragment
  implements ComponentCallbacks, View.OnCreateContextMenuListener
{
  private static final HashMap ae = new HashMap();
  int aA;
  String aB;
  boolean aC;
  boolean aD;
  boolean aE;
  boolean aF;
  boolean aG;
  boolean aH = true;
  boolean aI;
  int aJ;
  ViewGroup aK;
  View aL;
  View aM;
  boolean aN;
  boolean aO = true;
  y aP;
  boolean aQ;
  boolean aR;
  View af;
  int ag;
  Bundle ah;
  SparseArray ai;
  String aj;
  Bundle ak;
  Fragment al;
  int am = -1;
  int an;
  boolean ao;
  boolean ap;
  boolean aq;
  boolean ar;
  boolean as;
  boolean at;
  int au;
  m av;
  FragmentActivity aw;
  m ax;
  Fragment ay;
  int az;
  int mIndex = -1;
  int mState = 0;

  public static Fragment a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, null);
  }

  public static Fragment a(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Class localClass = (Class)ae.get(paramString);
      if (localClass == null)
      {
        localClass = paramContext.getClassLoader().loadClass(paramString);
        ae.put(paramString, localClass);
      }
      Fragment localFragment = (Fragment)localClass.newInstance();
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(localFragment.getClass().getClassLoader());
        localFragment.ak = paramBundle;
      }
      return localFragment;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new e("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", localClassNotFoundException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new e("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new e("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", localIllegalAccessException);
    }
  }

  public static void i()
  {
  }

  private boolean isAdded()
  {
    return (this.aw != null) && (this.ao);
  }

  public static Animation k()
  {
    return null;
  }

  public static void l()
  {
  }

  public static void onDestroyOptionsMenu()
  {
  }

  final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.ax != null)
      this.ax.by = false;
    return onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }

  final void b(int paramInt, Fragment paramFragment)
  {
    this.mIndex = paramInt;
    if (paramFragment != null)
    {
      this.aj = (paramFragment.aj + ":" + this.mIndex);
      return;
    }
    this.aj = ("android:fragment:" + this.mIndex);
  }

  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }

  public final Bundle getArguments()
  {
    return this.ak;
  }

  public Resources getResources()
  {
    if (this.aw == null)
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    return this.aw.getResources();
  }

  public final String getString(int paramInt)
  {
    return getResources().getString(paramInt);
  }

  public final String getString(int paramInt, Object[] paramArrayOfObject)
  {
    return getResources().getString(paramInt, paramArrayOfObject);
  }

  public final View getView()
  {
    return this.aL;
  }

  public FragmentActivity h()
  {
    return this.aw;
  }

  public final int hashCode()
  {
    return super.hashCode();
  }

  public final void j()
  {
    if (this.aG != true)
    {
      this.aG = true;
      if ((isAdded()) && (!this.aC))
        this.aw.n();
    }
  }

  final void m()
  {
    if (this.ax != null)
      this.ax.c(2);
    if (this.aQ)
    {
      this.aQ = false;
      if (!this.aR)
      {
        this.aR = true;
        FragmentActivity localFragmentActivity = this.aw;
        String str = this.aj;
        this.aP = localFragmentActivity.c(str);
      }
      if (this.aP != null)
      {
        if (this.aw.aF)
          break label88;
        this.aP.G();
      }
    }
    return;
    label88: this.aP.H();
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    this.aI = true;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.aI = true;
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    this.aI = true;
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    h().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return null;
  }

  public void onDestroy()
  {
    this.aI = true;
    if (!this.aR)
    {
      this.aR = true;
      FragmentActivity localFragmentActivity = this.aw;
      String str = this.aj;
      this.aP = localFragmentActivity.c(str);
    }
    if (this.aP != null)
      this.aP.K();
  }

  public void onLowMemory()
  {
    this.aI = true;
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }

  public void onPause()
  {
    this.aI = true;
  }

  public void onPrepareOptionsMenu(Menu paramMenu)
  {
  }

  public void onResume()
  {
    this.aI = true;
  }

  public void onStart()
  {
    this.aI = true;
    if (!this.aQ)
    {
      this.aQ = true;
      if (!this.aR)
      {
        this.aR = true;
        FragmentActivity localFragmentActivity = this.aw;
        String str = this.aj;
        this.aP = localFragmentActivity.c(str);
      }
      if (this.aP != null)
        this.aP.F();
    }
  }

  public void onStop()
  {
    this.aI = true;
  }

  public final void setArguments(Bundle paramBundle)
  {
    if (this.mIndex >= 0)
      throw new IllegalStateException("Fragment already active");
    this.ak = paramBundle;
  }

  public final void setMenuVisibility(boolean paramBoolean)
  {
    if (this.aH != paramBoolean)
    {
      this.aH = paramBoolean;
      if ((this.aG) && (isAdded()) && (!this.aC))
        this.aw.n();
    }
  }

  public final void setUserVisibleHint(boolean paramBoolean)
  {
    if ((!this.aO) && (paramBoolean) && (this.mState < 4))
      this.av.e(this);
    this.aO = paramBoolean;
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      this.aN = bool;
      return;
    }
  }

  public void startActivity(Intent paramIntent)
  {
    if (this.aw == null)
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    this.aw.a(this, paramIntent, -1);
  }

  public final void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if (this.aw == null)
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    this.aw.a(this, paramIntent, paramInt);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    a.a(this, localStringBuilder);
    if (this.mIndex >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.mIndex);
    }
    if (this.az != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(this.az));
    }
    if (this.aB != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.aB);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.Fragment
 * JD-Core Version:    0.6.2
 */