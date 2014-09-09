package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.a.a;
import android.support.v7.internal.view.menu.af;
import android.support.v7.internal.view.menu.ag;
import android.support.v7.internal.view.menu.ai;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.mm.d;
import com.tencent.mm.i;

class f extends e
  implements af, android.support.v7.internal.view.menu.p
{
  private static final int[] hJ = arrayOfInt;
  private ActionBarView hK;
  private m hL;
  private android.support.v7.internal.view.menu.o hM;
  private a hN;
  private boolean hO;
  private boolean hP;
  private boolean hQ;
  private boolean hR;
  private final Runnable hS = new g(this);

  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = d.homeAsUpIndicator;
  }

  f(ActionBarActivity paramActionBarActivity)
  {
    super(paramActionBarActivity);
  }

  private android.support.v7.internal.view.menu.o aV()
  {
    android.support.v7.internal.view.menu.o localo = new android.support.v7.internal.view.menu.o(aT());
    localo.a(this);
    return localo;
  }

  private void c(android.support.v7.internal.view.menu.o paramo)
  {
    if (paramo == this.hM);
    do
    {
      return;
      if (this.hM != null)
        this.hM.b(this.hL);
      this.hM = paramo;
      if ((paramo != null) && (this.hL != null))
        paramo.a(this.hL);
    }
    while (this.hK == null);
    this.hK.a(paramo, this);
  }

  public final void a(android.support.v7.internal.view.menu.o paramo)
  {
    if ((this.hK != null) && (this.hK.bA()))
    {
      if (!this.hK.bz())
      {
        if (this.hK.getVisibility() == 0)
          this.hK.bv();
        return;
      }
      this.hK.bw();
      return;
    }
    paramo.close();
  }

  public final void a(android.support.v7.internal.view.menu.o paramo, boolean paramBoolean)
  {
    this.hE.closeOptionsMenu();
  }

  public ActionBar aP()
  {
    aU();
    return new k(this.hE, this.hE);
  }

  public final void aQ()
  {
    if ((this.hH) && (this.hO))
      ((k)aM()).aQ();
  }

  public final boolean aR()
  {
    if (this.hN != null)
    {
      this.hN.finish();
      return true;
    }
    if ((this.hK != null) && (this.hK.ct()))
    {
      this.hK.cu();
      return true;
    }
    return false;
  }

  final void aU()
  {
    boolean bool1;
    if ((this.hH) && (!this.hO))
    {
      if (!this.hI)
        break label207;
      this.hE.u(com.tencent.mm.k.bah);
      this.hK = ((ActionBarView)this.hE.findViewById(i.aee));
      this.hK.a(this.hE);
      if (this.hP)
        this.hK.cq();
      if (this.hQ)
        this.hK.cr();
      bool1 = "splitActionBarWhenNarrow".equals(aS());
      if (!bool1)
        break label220;
    }
    label207: label220: boolean bool2;
    for (boolean bool3 = this.hE.getResources().getBoolean(com.tencent.mm.e.NO); ; bool3 = bool2)
    {
      ActionBarContainer localActionBarContainer = (ActionBarContainer)this.hE.findViewById(i.aRL);
      if (localActionBarContainer != null)
      {
        this.hK.a(localActionBarContainer);
        this.hK.s(bool3);
        this.hK.t(bool1);
        ActionBarContextView localActionBarContextView = (ActionBarContextView)this.hE.findViewById(i.ael);
        localActionBarContextView.a(localActionBarContainer);
        localActionBarContextView.s(bool3);
        localActionBarContextView.t(bool1);
      }
      this.hO = true;
      n();
      return;
      this.hE.u(com.tencent.mm.k.bag);
      break;
      TypedArray localTypedArray = this.hE.obtainStyledAttributes(com.tencent.mm.p.cvn);
      bool2 = localTypedArray.getBoolean(com.tencent.mm.p.cvq, false);
      localTypedArray.recycle();
    }
  }

  public final void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    aU();
    if (this.hH)
    {
      ((ViewGroup)this.hE.findViewById(i.aef)).addView(paramView, paramLayoutParams);
      return;
    }
    this.hE.a(paramView, paramLayoutParams);
  }

  public final boolean b(android.support.v7.internal.view.menu.o paramo)
  {
    return false;
  }

  public final void d(CharSequence paramCharSequence)
  {
    if (this.hK != null)
      this.hK.f(paramCharSequence);
  }

  public final boolean f(MenuItem paramMenuItem)
  {
    return this.hE.onMenuItemSelected(0, paramMenuItem);
  }

  public final void n()
  {
    if (!this.hR)
    {
      this.hR = true;
      this.hE.getWindow().getDecorView().post(this.hS);
    }
  }

  public final boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt != 0)
      return this.hE.a(paramInt, paramMenu);
    return false;
  }

  public final View onCreatePanelView(int paramInt)
  {
    View localView = null;
    ActionBarActivity localActionBarActivity;
    ag localag;
    if (paramInt == 0)
    {
      boolean bool = true;
      android.support.v7.internal.view.menu.o localo1 = this.hM;
      if (this.hN == null)
      {
        if (localo1 == null)
        {
          localo1 = aV();
          c(localo1);
          localo1.bL();
          bool = this.hE.a(0, localo1);
        }
        if (bool)
        {
          localo1.bL();
          bool = this.hE.a(0, null, localo1);
        }
      }
      if (!bool)
        break label214;
      localActionBarActivity = this.hE;
      android.support.v7.internal.view.menu.o localo2 = this.hM;
      localag = null;
      if (localo2 == null)
      {
        localView = (View)localag;
        localo1.bM();
      }
    }
    else
    {
      return localView;
    }
    if (this.hL == null)
    {
      TypedArray localTypedArray = localActionBarActivity.obtainStyledAttributes(com.tencent.mm.p.cyM);
      int i = localTypedArray.getResourceId(com.tencent.mm.p.cyN, com.tencent.mm.o.cuF);
      localTypedArray.recycle();
      this.hL = new m(com.tencent.mm.k.bat, i);
      this.hL.a(this);
      this.hM.a(this.hL);
    }
    while (true)
    {
      localag = this.hL.b(new FrameLayout(localActionBarActivity));
      break;
      this.hL.j(false);
    }
    label214: c(null);
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
    k localk = (k)aM();
    if (localk != null)
      localk.h(true);
  }

  public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if (paramInt != 0)
      return this.hE.a(paramInt, paramView, paramMenu);
    return false;
  }

  public final void onStop()
  {
    k localk = (k)aM();
    if (localk != null)
      localk.h(false);
  }

  public final void setContentView(int paramInt)
  {
    aU();
    if (this.hH)
    {
      ViewGroup localViewGroup = (ViewGroup)this.hE.findViewById(i.aef);
      localViewGroup.removeAllViews();
      this.hE.getLayoutInflater().inflate(paramInt, localViewGroup);
      return;
    }
    this.hE.u(paramInt);
  }

  public final void setContentView(View paramView)
  {
    aU();
    if (this.hH)
    {
      ViewGroup localViewGroup = (ViewGroup)this.hE.findViewById(i.aef);
      localViewGroup.removeAllViews();
      localViewGroup.addView(paramView);
      return;
    }
    this.hE.D(paramView);
  }

  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    aU();
    if (this.hH)
    {
      ViewGroup localViewGroup = (ViewGroup)this.hE.findViewById(i.aef);
      localViewGroup.removeAllViews();
      localViewGroup.addView(paramView, paramLayoutParams);
      return;
    }
    this.hE.a(paramView, paramLayoutParams);
  }

  public final boolean v(int paramInt)
  {
    this.hQ = true;
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.app.f
 * JD-Core Version:    0.6.2
 */