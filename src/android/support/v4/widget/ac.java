package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.aj;
import android.support.v4.view.aw;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

public final class ac
{
  private static final Interpolator eC = new ad();
  private int dZ;
  private int fe = -1;
  private VelocityTracker ff;
  private final ViewGroup hA;
  private final Runnable hB = new ae(this);
  private int hj;
  private float[] hk;
  private float[] hl;
  private float[] hm;
  private float[] hn;
  private int[] ho;
  private int[] hp;
  private int[] hq;
  private int hr;
  private float hs;
  private float ht;
  private int hu;
  private int hv;
  private o hw;
  private final af hx;
  private View hy;
  private boolean hz;

  private ac(Context paramContext, ViewGroup paramViewGroup, af paramaf)
  {
    if (paramViewGroup == null)
      throw new IllegalArgumentException("Parent view may not be null");
    if (paramaf == null)
      throw new IllegalArgumentException("Callback may not be null");
    this.hA = paramViewGroup;
    this.hx = paramaf;
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
    this.hu = ((int)(0.5F + 20.0F * paramContext.getResources().getDisplayMetrics().density));
    this.dZ = localViewConfiguration.getScaledTouchSlop();
    this.hs = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.ht = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.hw = o.a(paramContext, eC);
  }

  private static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = Math.abs(paramFloat1);
    if (f < paramFloat2)
      paramFloat3 = 0.0F;
    do
    {
      return paramFloat3;
      if (f <= paramFloat3)
        break;
    }
    while (paramFloat1 > 0.0F);
    return -paramFloat3;
    return paramFloat1;
  }

  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0)
      return 0;
    int i = this.hA.getWidth();
    int j = i / 2;
    float f1 = Math.min(1.0F, Math.abs(paramInt1) / i);
    float f2 = j + j * (float)Math.sin((float)(0.47123891676382D * (f1 - 0.5F)));
    int k = Math.abs(paramInt2);
    if (k > 0);
    for (int m = 4 * Math.round(1000.0F * Math.abs(f2 / k)); ; m = (int)(256.0F * (1.0F + Math.abs(paramInt1) / paramInt3)))
      return Math.min(m, 600);
  }

  public static ac a(ViewGroup paramViewGroup, float paramFloat, af paramaf)
  {
    ac localac = new ac(paramViewGroup.getContext(), paramViewGroup, paramaf);
    localac.dZ = ((int)(localac.dZ * (1.0F / paramFloat)));
    return localac;
  }

  private void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    if ((this.hk == null) || (this.hk.length <= paramInt))
    {
      float[] arrayOfFloat1 = new float[paramInt + 1];
      float[] arrayOfFloat2 = new float[paramInt + 1];
      float[] arrayOfFloat3 = new float[paramInt + 1];
      float[] arrayOfFloat4 = new float[paramInt + 1];
      int[] arrayOfInt1 = new int[paramInt + 1];
      int[] arrayOfInt2 = new int[paramInt + 1];
      int[] arrayOfInt3 = new int[paramInt + 1];
      if (this.hk != null)
      {
        System.arraycopy(this.hk, 0, arrayOfFloat1, 0, this.hk.length);
        System.arraycopy(this.hl, 0, arrayOfFloat2, 0, this.hl.length);
        System.arraycopy(this.hm, 0, arrayOfFloat3, 0, this.hm.length);
        System.arraycopy(this.hn, 0, arrayOfFloat4, 0, this.hn.length);
        System.arraycopy(this.ho, 0, arrayOfInt1, 0, this.ho.length);
        System.arraycopy(this.hp, 0, arrayOfInt2, 0, this.hp.length);
        System.arraycopy(this.hq, 0, arrayOfInt3, 0, this.hq.length);
      }
      this.hk = arrayOfFloat1;
      this.hl = arrayOfFloat2;
      this.hm = arrayOfFloat3;
      this.hn = arrayOfFloat4;
      this.ho = arrayOfInt1;
      this.hp = arrayOfInt2;
      this.hq = arrayOfInt3;
    }
    float[] arrayOfFloat5 = this.hk;
    this.hm[paramInt] = paramFloat1;
    arrayOfFloat5[paramInt] = paramFloat1;
    float[] arrayOfFloat6 = this.hl;
    this.hn[paramInt] = paramFloat2;
    arrayOfFloat6[paramInt] = paramFloat2;
    int[] arrayOfInt4 = this.ho;
    int i = (int)paramFloat1;
    int j = (int)paramFloat2;
    int k = this.hA.getLeft() + this.hu;
    int m = 0;
    if (i < k)
      m = 1;
    if (j < this.hA.getTop() + this.hu)
      m |= 4;
    if (i > this.hA.getRight() - this.hu)
      m |= 2;
    if (j > this.hA.getBottom() - this.hu)
      m |= 8;
    arrayOfInt4[paramInt] = m;
    this.hr |= 1 << paramInt;
  }

  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    float f1 = Math.abs(paramFloat1);
    float f2 = Math.abs(paramFloat2);
    if (((paramInt2 & this.ho[paramInt1]) != paramInt2) || ((paramInt2 & this.hv) == 0) || ((paramInt2 & this.hq[paramInt1]) == paramInt2) || ((paramInt2 & this.hp[paramInt1]) == paramInt2) || ((f1 <= this.dZ) && (f2 <= this.dZ)));
    while ((f1 < f2 * 0.5F) && (((paramInt2 & this.hp[paramInt1]) != 0) || (f1 <= this.dZ)))
      return false;
    return true;
  }

  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.hy.getLeft();
    int j = this.hy.getTop();
    int k = paramInt1 - i;
    int m = paramInt2 - j;
    if ((k == 0) && (m == 0))
    {
      this.hw.abortAnimation();
      t(0);
      return false;
    }
    View localView = this.hy;
    int n = b(paramInt3, (int)this.ht, (int)this.hs);
    int i1 = b(paramInt4, (int)this.ht, (int)this.hs);
    int i2 = Math.abs(k);
    int i3 = Math.abs(m);
    int i4 = Math.abs(n);
    int i5 = Math.abs(i1);
    int i6 = i4 + i5;
    int i7 = i2 + i3;
    float f1;
    if (n != 0)
    {
      f1 = i4 / i6;
      if (i1 == 0)
        break label262;
    }
    label262: for (float f2 = i5 / i6; ; f2 = i3 / i7)
    {
      int i8 = a(k, n, this.hx.y(localView));
      int i9 = a(m, i1, 0);
      int i10 = (int)(f1 * i8 + f2 * i9);
      o localo = this.hw;
      o.gL.a(localo.gK, i, j, k, m, i10);
      t(2);
      return true;
      f1 = i2 / i7;
      break;
    }
  }

  private void aH()
  {
    this.ff.computeCurrentVelocity(1000, this.hs);
    float f = a(aw.a(this.ff, this.fe), this.ht, this.hs);
    a(aw.b(this.ff, this.fe), this.ht, this.hs);
    f(f);
  }

  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = Math.abs(paramInt1);
    if (i < paramInt2)
      paramInt3 = 0;
    do
    {
      return paramInt3;
      if (i <= paramInt3)
        break;
    }
    while (paramInt1 > 0);
    return -paramInt3;
    return paramInt1;
  }

  private void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i = 1;
    if (a(paramFloat1, paramFloat2, paramInt, i));
    while (true)
    {
      if (a(paramFloat2, paramFloat1, paramInt, 4))
        i |= 4;
      if (a(paramFloat1, paramFloat2, paramInt, 2))
        i |= 2;
      if (a(paramFloat2, paramFloat1, paramInt, 8))
        i |= 8;
      if (i != 0)
      {
        int[] arrayOfInt = this.hp;
        arrayOfInt[paramInt] = (i | arrayOfInt[paramInt]);
        this.hx.f(i, paramInt);
      }
      return;
      i = 0;
    }
  }

  public static boolean b(View paramView, int paramInt1, int paramInt2)
  {
    if (paramView == null);
    while ((paramInt1 < paramView.getLeft()) || (paramInt1 >= paramView.getRight()) || (paramInt2 < paramView.getTop()) || (paramInt2 >= paramView.getBottom()))
      return false;
    return true;
  }

  private boolean d(View paramView, float paramFloat)
  {
    if (paramView == null);
    while (true)
    {
      return false;
      if (this.hx.y(paramView) > 0);
      for (int i = 1; (i != 0) && (Math.abs(paramFloat) > this.dZ); i = 0)
        return true;
    }
  }

  private void e(MotionEvent paramMotionEvent)
  {
    int i = aj.c(paramMotionEvent);
    for (int j = 0; j < i; j++)
    {
      int k = aj.b(paramMotionEvent, j);
      float f1 = aj.c(paramMotionEvent, j);
      float f2 = aj.d(paramMotionEvent, j);
      this.hm[k] = f1;
      this.hn[k] = f2;
    }
  }

  private void f(float paramFloat)
  {
    this.hz = true;
    this.hx.c(this.hy, paramFloat);
    this.hz = false;
    if (this.hj == 1)
      t(0);
  }

  private boolean g(View paramView, int paramInt)
  {
    if ((paramView == this.hy) && (this.fe == paramInt))
      return true;
    if ((paramView != null) && (this.hx.w(paramView)))
    {
      this.fe = paramInt;
      f(paramView, paramInt);
      return true;
    }
    return false;
  }

  private void s(int paramInt)
  {
    if (this.hk == null)
      return;
    this.hk[paramInt] = 0.0F;
    this.hl[paramInt] = 0.0F;
    this.hm[paramInt] = 0.0F;
    this.hn[paramInt] = 0.0F;
    this.ho[paramInt] = 0;
    this.hp[paramInt] = 0;
    this.hq[paramInt] = 0;
    this.hr &= (0xFFFFFFFF ^ 1 << paramInt);
  }

  public final boolean a(View paramView, int paramInt1, int paramInt2)
  {
    this.hy = paramView;
    this.fe = -1;
    return a(paramInt1, paramInt2, 0, 0);
  }

  public final int aC()
  {
    return this.hj;
  }

  public final int aD()
  {
    return this.hu;
  }

  public final View aE()
  {
    return this.hy;
  }

  public final boolean aF()
  {
    if (this.hj == 2)
    {
      o localo1 = this.hw;
      boolean bool = o.gL.C(localo1.gK);
      int i = this.hw.getCurrX();
      int j = this.hw.getCurrY();
      int k = i - this.hy.getLeft();
      int m = j - this.hy.getTop();
      if (k != 0)
        this.hy.offsetLeftAndRight(k);
      if (m != 0)
        this.hy.offsetTopAndBottom(m);
      if ((k != 0) || (m != 0))
        this.hx.d(this.hy, i);
      if (bool)
      {
        o localo2 = this.hw;
        if (i == o.gL.E(localo2.gK))
        {
          o localo3 = this.hw;
          if (j == o.gL.F(localo3.gK))
          {
            this.hw.abortAnimation();
            o localo4 = this.hw;
            bool = o.gL.x(localo4.gK);
          }
        }
      }
      if (!bool)
        this.hA.post(this.hB);
    }
    return this.hj == 2;
  }

  public final boolean aG()
  {
    int i = this.hk.length;
    label100: label106: label112: for (int j = 0; j < i; j++)
    {
      int k;
      int m;
      if ((this.hr & 1 << j) != 0)
      {
        k = 1;
        if (k == 0)
          break label106;
        float f1 = this.hm[j] - this.hk[j];
        float f2 = this.hn[j] - this.hl[j];
        if (f1 * f1 + f2 * f2 <= this.dZ * this.dZ)
          break label100;
        m = 1;
      }
      while (true)
      {
        if (m == 0)
          break label112;
        return true;
        k = 0;
        break;
        m = 0;
        continue;
        m = 0;
      }
    }
    return false;
  }

  public final void abort()
  {
    cancel();
    if (this.hj == 2)
    {
      this.hw.getCurrX();
      this.hw.getCurrY();
      this.hw.abortAnimation();
      int i = this.hw.getCurrX();
      this.hw.getCurrY();
      this.hx.d(this.hy, i);
    }
    t(0);
  }

  public final void cancel()
  {
    this.fe = -1;
    if (this.hk != null)
    {
      Arrays.fill(this.hk, 0.0F);
      Arrays.fill(this.hl, 0.0F);
      Arrays.fill(this.hm, 0.0F);
      Arrays.fill(this.hn, 0.0F);
      Arrays.fill(this.ho, 0);
      Arrays.fill(this.hp, 0);
      Arrays.fill(this.hq, 0);
      this.hr = 0;
    }
    if (this.ff != null)
    {
      this.ff.recycle();
      this.ff = null;
    }
  }

  public final void e(float paramFloat)
  {
    this.ht = paramFloat;
  }

  public final void f(View paramView, int paramInt)
  {
    if (paramView.getParent() != this.hA)
      throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.hA + ")");
    this.hy = paramView;
    this.fe = paramInt;
    this.hx.x(paramView);
    t(1);
  }

  public final boolean f(MotionEvent paramMotionEvent)
  {
    int i = aj.a(paramMotionEvent);
    int j = aj.b(paramMotionEvent);
    if (i == 0)
      cancel();
    if (this.ff == null)
      this.ff = VelocityTracker.obtain();
    this.ff.addMovement(paramMotionEvent);
    switch (i)
    {
    case 4:
    default:
    case 0:
    case 5:
    case 2:
    case 6:
    case 1:
    case 3:
    }
    while (this.hj == 1)
    {
      return true;
      float f6 = paramMotionEvent.getX();
      float f7 = paramMotionEvent.getY();
      int i2 = aj.b(paramMotionEvent, 0);
      a(f6, f7, i2);
      View localView3 = h((int)f6, (int)f7);
      if ((localView3 == this.hy) && (this.hj == 2))
        g(localView3, i2);
      if ((this.ho[i2] & this.hv) != 0)
      {
        af localaf2 = this.hx;
        localaf2.aw();
        continue;
        int i1 = aj.b(paramMotionEvent, j);
        float f4 = aj.c(paramMotionEvent, j);
        float f5 = aj.d(paramMotionEvent, j);
        a(f4, f5, i1);
        if (this.hj == 0)
        {
          if ((this.ho[i1] & this.hv) != 0)
          {
            af localaf1 = this.hx;
            localaf1.aw();
          }
        }
        else if (this.hj == 2)
        {
          View localView2 = h((int)f4, (int)f5);
          if (localView2 == this.hy)
          {
            g(localView2, i1);
            continue;
            int k = aj.c(paramMotionEvent);
            for (int m = 0; m < k; m++)
            {
              int n = aj.b(paramMotionEvent, m);
              float f1 = aj.c(paramMotionEvent, m);
              float f2 = aj.d(paramMotionEvent, m);
              float f3 = f1 - this.hk[n];
              b(f3, f2 - this.hl[n], n);
              if (this.hj == 1)
                break;
              View localView1 = h((int)f1, (int)f2);
              if ((localView1 != null) && (d(localView1, f3)) && (g(localView1, n)))
                break;
            }
            e(paramMotionEvent);
            continue;
            s(aj.b(paramMotionEvent, j));
            continue;
            cancel();
          }
        }
      }
    }
    return false;
  }

  public final void g(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = aj.a(paramMotionEvent);
    int k = aj.b(paramMotionEvent);
    if (j == 0)
      cancel();
    if (this.ff == null)
      this.ff = VelocityTracker.obtain();
    this.ff.addMovement(paramMotionEvent);
    int m;
    switch (j)
    {
    case 4:
    default:
    case 0:
    case 5:
      int i12;
      int i13;
      int i14;
      do
      {
        float f8;
        float f9;
        do
        {
          int i15;
          do
          {
            return;
            float f10 = paramMotionEvent.getX();
            float f11 = paramMotionEvent.getY();
            i15 = aj.b(paramMotionEvent, 0);
            View localView2 = h((int)f10, (int)f11);
            a(f10, f11, i15);
            g(localView2, i15);
          }
          while ((this.ho[i15] & this.hv) == 0);
          af localaf2 = this.hx;
          localaf2.aw();
          return;
          i12 = aj.b(paramMotionEvent, k);
          f8 = aj.c(paramMotionEvent, k);
          f9 = aj.d(paramMotionEvent, k);
          a(f8, f9, i12);
          if (this.hj != 0)
            break;
          g(h((int)f8, (int)f9), i12);
        }
        while ((this.ho[i12] & this.hv) == 0);
        af localaf1 = this.hx;
        localaf1.aw();
        return;
        i13 = (int)f8;
        i14 = (int)f9;
      }
      while (!b(this.hy, i13, i14));
      g(this.hy, i12);
      return;
    case 2:
      if (this.hj == 1)
      {
        int i5 = aj.a(paramMotionEvent, this.fe);
        float f6 = aj.c(paramMotionEvent, i5);
        float f7 = aj.d(paramMotionEvent, i5);
        int i6 = (int)(f6 - this.hm[this.fe]);
        int i7 = (int)(f7 - this.hn[this.fe]);
        int i8 = i6 + this.hy.getLeft();
        this.hy.getTop();
        int i9 = this.hy.getLeft();
        int i10 = this.hy.getTop();
        if (i6 != 0)
        {
          i8 = this.hx.e(this.hy, i8);
          this.hy.offsetLeftAndRight(i8 - i9);
        }
        if (i7 != 0)
        {
          int i11 = this.hx.z(this.hy);
          this.hy.offsetTopAndBottom(i11 - i10);
        }
        if ((i6 != 0) || (i7 != 0))
          this.hx.d(this.hy, i8);
        e(paramMotionEvent);
        return;
      }
      int i3 = aj.c(paramMotionEvent);
      while (i < i3)
      {
        int i4 = aj.b(paramMotionEvent, i);
        float f3 = aj.c(paramMotionEvent, i);
        float f4 = aj.d(paramMotionEvent, i);
        float f5 = f3 - this.hk[i4];
        b(f5, f4 - this.hl[i4], i4);
        if (this.hj == 1)
          break;
        View localView1 = h((int)f3, (int)f4);
        if ((d(localView1, f5)) && (g(localView1, i4)))
          break;
        i++;
      }
      e(paramMotionEvent);
      return;
    case 6:
      m = aj.b(paramMotionEvent, k);
      if ((this.hj == 1) && (m == this.fe))
      {
        int n = aj.c(paramMotionEvent);
        if (i >= n)
          break label768;
        int i2 = aj.b(paramMotionEvent, i);
        if (i2 == this.fe)
          break label727;
        float f1 = aj.c(paramMotionEvent, i);
        float f2 = aj.d(paramMotionEvent, i);
        if ((h((int)f1, (int)f2) != this.hy) || (!g(this.hy, i2)))
          break label727;
      }
      break;
    case 1:
    case 3:
    }
    label768: for (int i1 = this.fe; ; i1 = -1)
    {
      if (i1 == -1)
        aH();
      s(m);
      return;
      label727: i++;
      break;
      if (this.hj == 1)
        aH();
      cancel();
      return;
      if (this.hj == 1)
        f(0.0F);
      cancel();
      return;
    }
  }

  public final boolean g(int paramInt1, int paramInt2)
  {
    if (!this.hz)
      throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    return a(paramInt1, paramInt2, (int)aw.a(this.ff, this.fe), (int)aw.b(this.ff, this.fe));
  }

  public final int getTouchSlop()
  {
    return this.dZ;
  }

  public final View h(int paramInt1, int paramInt2)
  {
    for (int i = -1 + this.hA.getChildCount(); i >= 0; i--)
    {
      ViewGroup localViewGroup = this.hA;
      View localView = localViewGroup.getChildAt(i);
      if ((paramInt1 >= localView.getLeft()) && (paramInt1 < localView.getRight()) && (paramInt2 >= localView.getTop()) && (paramInt2 < localView.getBottom()))
        return localView;
    }
    return null;
  }

  public final void r(int paramInt)
  {
    this.hv = paramInt;
  }

  final void t(int paramInt)
  {
    if (this.hj != paramInt)
    {
      this.hj = paramInt;
      this.hx.q(paramInt);
      if (paramInt == 0)
        this.hy = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.ac
 * JD-Core Version:    0.6.2
 */