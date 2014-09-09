package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v4.view.n;
import android.support.v7.internal.view.a;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.k;
import java.util.ArrayList;

public final class ActionMenuPresenter extends j
  implements android.support.v4.view.o
{
  private View jP;
  private boolean jQ;
  private boolean jR;
  private int jS;
  private int jT;
  private int jU;
  private boolean jV;
  private boolean jW;
  private boolean jX;
  private boolean jY;
  private int jZ;
  private final SparseBooleanArray ka = new SparseBooleanArray();
  private View kb;
  private f kc;
  private c kd;
  private d ke;
  final g kf = new g(this, (byte)0);
  int kg;

  public ActionMenuPresenter(Context paramContext)
  {
    super(paramContext, k.ban, k.bam);
  }

  public final View a(s params, View paramView, ViewGroup paramViewGroup)
  {
    View localView = params.getActionView();
    if ((localView == null) || (params.ci()))
    {
      if (!(paramView instanceof ActionMenuItemView))
        paramView = null;
      localView = super.a(params, paramView, paramViewGroup);
    }
    if (params.isActionViewExpanded());
    for (int i = 8; ; i = 0)
    {
      localView.setVisibility(i);
      ActionMenuView localActionMenuView = (ActionMenuView)paramViewGroup;
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      if (!localActionMenuView.checkLayoutParams(localLayoutParams))
        localView.setLayoutParams(ActionMenuView.a(localLayoutParams));
      return localView;
    }
  }

  public final void a(Context paramContext, o paramo)
  {
    super.a(paramContext, paramo);
    Resources localResources = paramContext.getResources();
    a locala = a.d(paramContext);
    boolean bool;
    int i;
    if (!this.jR)
    {
      if (Build.VERSION.SDK_INT >= 11)
      {
        bool = true;
        this.jQ = bool;
      }
    }
    else
    {
      if (!this.jX)
        this.jS = locala.be();
      if (!this.jV)
        this.jU = locala.bd();
      i = this.jS;
      if (!this.jQ)
        break label172;
      if (this.jP == null)
      {
        this.jP = new e(this, this.kw);
        int j = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.jP.measure(j, j);
      }
      i -= this.jP.getMeasuredWidth();
    }
    while (true)
    {
      this.jT = i;
      this.jZ = ((int)(56.0F * localResources.getDisplayMetrics().density));
      this.kb = null;
      return;
      bool = false;
      break;
      label172: this.jP = null;
    }
  }

  public final void a(o paramo, boolean paramBoolean)
  {
    bx();
    super.a(paramo, paramBoolean);
  }

  public final void a(s params, ah paramah)
  {
    paramah.a(params);
    ActionMenuView localActionMenuView = (ActionMenuView)this.kB;
    ((ActionMenuItemView)paramah).a(localActionMenuView);
  }

  public final boolean a(ak paramak)
  {
    if (!paramak.hasVisibleItems())
      return false;
    for (ak localak = paramak; localak.cl() != this.hM; localak = (ak)localak.cl());
    MenuItem localMenuItem = localak.getItem();
    ViewGroup localViewGroup = (ViewGroup)this.kB;
    int j;
    View localView;
    if (localViewGroup != null)
    {
      int i = localViewGroup.getChildCount();
      j = 0;
      if (j < i)
      {
        localView = localViewGroup.getChildAt(j);
        if ((!(localView instanceof ah)) || (((ah)localView).bp() != localMenuItem));
      }
    }
    while (true)
    {
      if (localView != null)
        break label131;
      if (this.jP != null)
        break label126;
      return false;
      j++;
      break;
      localView = null;
    }
    label126: this.kg = paramak.getItem().getItemId();
    label131: this.kd = new c(this, paramak);
    this.kd.bW();
    super.a(paramak);
    return true;
  }

  public final void aQ()
  {
    if (!this.jV)
      this.jU = this.mContext.getResources().getInteger(com.tencent.mm.j.baf);
    if (this.hM != null)
      this.hM.m(true);
  }

  public final ag b(ViewGroup paramViewGroup)
  {
    ag localag = super.b(paramViewGroup);
    ((ActionMenuView)localag).c(this);
    return localag;
  }

  public final boolean b(s params)
  {
    return params.cd();
  }

  public final boolean b(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.jP)
      return false;
    return super.b(paramViewGroup, paramInt);
  }

  public final boolean bA()
  {
    return this.jQ;
  }

  public final boolean bB()
  {
    ArrayList localArrayList = this.hM.bP();
    int i = localArrayList.size();
    int j = this.jU;
    int k = this.jT;
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)this.kB;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    s locals3;
    if (i3 < i)
    {
      locals3 = (s)localArrayList.get(i3);
      if (locals3.cf())
      {
        n++;
        label80: if ((!this.jY) || (!locals3.isActionViewExpanded()))
          break label824;
      }
    }
    label291: label428: label824: for (int i31 = 0; ; i31 = j)
    {
      i3++;
      j = i31;
      break;
      if (locals3.ce())
      {
        i1++;
        break label80;
      }
      i2 = 1;
      break label80;
      if ((this.jQ) && ((i2 != 0) || (n + i1 > j)))
        j--;
      int i4 = j - n;
      SparseBooleanArray localSparseBooleanArray = this.ka;
      localSparseBooleanArray.clear();
      int i5;
      int i30;
      if (this.jW)
      {
        i5 = k / this.jZ;
        i30 = k % this.jZ;
      }
      for (int i6 = this.jZ + i30 / i5; ; i6 = 0)
      {
        int i7 = 0;
        int i8 = 0;
        int i9 = i5;
        s locals1;
        View localView2;
        int i10;
        int i28;
        if (i7 < i)
        {
          locals1 = (s)localArrayList.get(i7);
          if (locals1.cf())
          {
            localView2 = a(locals1, this.kb, localViewGroup);
            if (this.kb == null)
              this.kb = localView2;
            if (this.jW)
            {
              i9 -= ActionMenuView.b(localView2, i6, i9, m, 0);
              i10 = localView2.getMeasuredWidth();
              i28 = k - i10;
              if (i8 != 0)
                break label808;
            }
          }
        }
        while (true)
        {
          int i29 = locals1.getGroupId();
          if (i29 != 0)
            localSparseBooleanArray.put(i29, true);
          locals1.q(true);
          int i11 = i28;
          int i12 = i4;
          while (true)
          {
            i7++;
            k = i11;
            i4 = i12;
            i8 = i10;
            break;
            localView2.measure(m, m);
            break label291;
            if (locals1.ce())
            {
              int i13 = locals1.getGroupId();
              boolean bool1 = localSparseBooleanArray.get(i13);
              boolean bool2;
              View localView1;
              int i22;
              label496: int i21;
              label500: int i25;
              boolean bool3;
              int i14;
              int i15;
              if (((i4 > 0) || (bool1)) && (k > 0) && ((!this.jW) || (i9 > 0)))
              {
                bool2 = true;
                if (!bool2)
                  break label778;
                localView1 = a(locals1, this.kb, localViewGroup);
                if (this.kb == null)
                  this.kb = localView1;
                if (!this.jW)
                  break label619;
                int i26 = ActionMenuView.b(localView1, i6, i9, m, 0);
                int i27 = i9 - i26;
                if (i26 != 0)
                  break label771;
                i22 = 0;
                i21 = i27;
                int i23 = localView1.getMeasuredWidth();
                k -= i23;
                if (i8 == 0)
                  i8 = i23;
                if (!this.jW)
                  break label649;
                if (k < 0)
                  break label643;
                i25 = 1;
                bool3 = i22 & i25;
                i14 = i8;
                i15 = i21;
              }
              while (true)
              {
                int i16;
                if ((bool3) && (i13 != 0))
                {
                  localSparseBooleanArray.put(i13, true);
                  i16 = i4;
                }
                while (true)
                {
                  if (bool3)
                    i16--;
                  locals1.q(bool3);
                  i10 = i14;
                  i11 = k;
                  int i17 = i15;
                  i12 = i16;
                  i9 = i17;
                  break;
                  bool2 = false;
                  break label428;
                  label619: localView1.measure(m, m);
                  int i20 = bool2;
                  i21 = i9;
                  i22 = i20;
                  break label500;
                  i25 = 0;
                  break label538;
                  if (k + i8 > 0);
                  for (int i24 = 1; ; i24 = 0)
                  {
                    bool3 = i22 & i24;
                    i14 = i8;
                    i15 = i21;
                    break;
                  }
                  if (bool1)
                  {
                    localSparseBooleanArray.put(i13, false);
                    int i18 = i4;
                    int i19 = 0;
                    while (i19 < i7)
                    {
                      s locals2 = (s)localArrayList.get(i19);
                      if (locals2.getGroupId() == i13)
                      {
                        if (locals2.cd())
                          i18++;
                        locals2.q(false);
                      }
                      i19++;
                      continue;
                      return true;
                    }
                    i16 = i18;
                  }
                  else
                  {
                    i16 = i4;
                  }
                }
                i22 = bool2;
                break label496;
                bool3 = bool2;
                i14 = i8;
                i15 = i9;
              }
            }
            i10 = i8;
            i11 = k;
            i12 = i4;
          }
          i10 = i8;
        }
        i5 = 0;
      }
    }
  }

  public final void bu()
  {
    this.jU = 2147483647;
    this.jV = true;
  }

  public final boolean bv()
  {
    if ((this.jQ) && (!bz()) && (this.hM != null) && (this.kB != null) && (this.ke == null))
    {
      this.ke = new d(this, new f(this, this.mContext, this.hM, this.jP));
      ((View)this.kB).post(this.ke);
      super.a(null);
      return true;
    }
    return false;
  }

  public final boolean bw()
  {
    if ((this.ke != null) && (this.kB != null))
    {
      ((View)this.kB).removeCallbacks(this.ke);
      this.ke = null;
      return true;
    }
    f localf = this.kc;
    if (localf != null)
    {
      localf.dismiss();
      return true;
    }
    return false;
  }

  public final boolean bx()
  {
    return bw() | by();
  }

  public final boolean by()
  {
    if (this.kd != null)
    {
      this.kd.dismiss();
      return true;
    }
    return false;
  }

  public final boolean bz()
  {
    return (this.kc != null) && (this.kc.isShowing());
  }

  public final void d(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      super.a(null);
      return;
    }
    this.hM.l(false);
  }

  public final void i(boolean paramBoolean)
  {
    this.jY = paramBoolean;
  }

  public final void j(boolean paramBoolean)
  {
    int i = 1;
    super.j(paramBoolean);
    if (this.kB == null)
      return;
    if (this.hM != null)
    {
      ArrayList localArrayList2 = this.hM.bR();
      int n = localArrayList2.size();
      for (int i1 = 0; i1 < n; i1++)
      {
        n localn = ((s)localArrayList2.get(i1)).ch();
        if (localn != null)
          localn.a(this);
      }
    }
    ArrayList localArrayList1;
    int j;
    int k;
    int m;
    if (this.hM != null)
    {
      localArrayList1 = this.hM.bS();
      boolean bool = this.jQ;
      j = 0;
      if (bool)
      {
        j = 0;
        if (localArrayList1 != null)
        {
          k = localArrayList1.size();
          if (k != i)
            break label255;
          if (((s)localArrayList1.get(0)).isActionViewExpanded())
            break label249;
          m = i;
          label145: j = m;
        }
      }
      if (j == 0)
        break label271;
      if (this.jP == null)
        this.jP = new e(this, this.kw);
      ViewGroup localViewGroup = (ViewGroup)this.jP.getParent();
      if (localViewGroup != this.kB)
      {
        if (localViewGroup != null)
          localViewGroup.removeView(this.jP);
        ((ActionMenuView)this.kB).addView(this.jP, ActionMenuView.bD());
      }
    }
    while (true)
    {
      ((ActionMenuView)this.kB).k(this.jQ);
      return;
      localArrayList1 = null;
      break;
      label249: m = 0;
      break label145;
      label255: if (k > 0);
      while (true)
      {
        j = i;
        break;
        i = 0;
      }
      label271: if ((this.jP != null) && (this.jP.getParent() == this.kB))
        ((ViewGroup)this.kB).removeView(this.jP);
    }
  }

  public final void x(int paramInt)
  {
    this.jS = paramInt;
    this.jW = true;
    this.jX = true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ActionMenuPresenter
 * JD-Core Version:    0.6.2
 */