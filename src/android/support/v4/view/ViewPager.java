package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.widget.j;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager extends ViewGroup
{
  private static final Comparator eB = new bs();
  private static final Interpolator eC = new bt();
  private static final int[] ez = { 16842931 };
  private static final cd fA = new cd();
  private boolean as;
  private final Rect dR = new Rect();
  private float dX;
  private float dY;
  private int dZ;
  private int eA;
  private final ArrayList eD = new ArrayList();
  private final bw eE = new bw();
  private an eF;
  private int eG;
  private int eH = -1;
  private Parcelable eI = null;
  private ClassLoader eJ = null;
  private Scroller eK;
  private cb eL;
  private int eM;
  private Drawable eN;
  private int eO;
  private int eP;
  private float eQ = -3.402824E+38F;
  private float eR = 3.4028235E+38F;
  private int eS;
  private int eT;
  private boolean eU;
  private boolean eV;
  private int eW = 1;
  private boolean eX;
  private boolean eY;
  private int eZ;
  private int es = 0;
  private final Runnable fB = new bu(this);
  private int fb;
  private float fc;
  private float fd;
  private int fe = -1;
  private VelocityTracker ff;
  private int fg;
  private int fh;
  private int fi;
  private int fj;
  private boolean fk;
  private long fl;
  private j fn;
  private j fo;
  private boolean fp = true;
  private boolean fq = false;
  private boolean fr;
  private int fs;
  private bz ft;
  private bz fu;
  private by fv;
  private ca fw;
  private Method fx;
  private int fy;
  private ArrayList fz;

  public ViewPager(Context paramContext)
  {
    super(paramContext);
    T();
  }

  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    T();
  }

  private void T()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.eK = new Scroller(localContext, eC);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f = localContext.getResources().getDisplayMetrics().density;
    this.dZ = bj.a(localViewConfiguration);
    this.fg = ((int)(400.0F * f));
    this.fh = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.fn = new j(localContext);
    this.fo = new j(localContext);
    this.fi = ((int)(25.0F * f));
    this.fj = ((int)(2.0F * f));
    this.eZ = ((int)(16.0F * f));
    ba.a(this, new bx(this));
    if (ba.g(this) == 0)
      ba.h(this);
  }

  private int V()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }

  private void Y()
  {
    if (this.fy != 0)
    {
      if (this.fz == null)
        this.fz = new ArrayList();
      while (true)
      {
        int i = getChildCount();
        for (int j = 0; j < i; j++)
        {
          View localView = getChildAt(j);
          this.fz.add(localView);
        }
        this.fz.clear();
      }
      Collections.sort(this.fz, fA);
    }
  }

  private bw Z()
  {
    int i = V();
    float f1;
    float f2;
    label31: float f3;
    float f4;
    int j;
    int k;
    int m;
    Object localObject;
    label49: bw localbw1;
    bw localbw3;
    int n;
    if (i > 0)
    {
      f1 = getScrollX() / i;
      if (i <= 0)
        break label210;
      f2 = this.eM / i;
      f3 = 0.0F;
      f4 = 0.0F;
      j = -1;
      k = 0;
      m = 1;
      localObject = null;
      if (k < this.eD.size())
      {
        localbw1 = (bw)this.eD.get(k);
        if ((m != 0) || (localbw1.position == j + 1))
          break label261;
        localbw3 = this.eE;
        localbw3.fF = (f2 + (f3 + f4));
        localbw3.position = (j + 1);
        localbw3.fE = 1.0F;
        n = k - 1;
      }
    }
    for (bw localbw2 = localbw3; ; localbw2 = localbw1)
    {
      float f5 = localbw2.fF;
      float f6 = f2 + (f5 + localbw2.fE);
      if ((m != 0) || (f1 >= f5))
      {
        if ((f1 < f6) || (n == -1 + this.eD.size()))
          localObject = localbw2;
      }
      else
      {
        return localObject;
        f1 = 0.0F;
        break;
        label210: f2 = 0.0F;
        break label31;
      }
      int i1 = localbw2.position;
      float f7 = localbw2.fE;
      int i2 = n + 1;
      f4 = f5;
      j = i1;
      f3 = f7;
      localObject = localbw2;
      k = i2;
      m = 0;
      break label49;
      label261: n = k;
    }
  }

  private Rect a(Rect paramRect, View paramView)
  {
    if (paramRect == null);
    for (Rect localRect = new Rect(); ; localRect = paramRect)
    {
      if (paramView == null)
      {
        localRect.set(0, 0, 0, 0);
        return localRect;
      }
      localRect.left = paramView.getLeft();
      localRect.right = paramView.getRight();
      localRect.top = paramView.getTop();
      localRect.bottom = paramView.getBottom();
      ViewGroup localViewGroup;
      for (ViewParent localViewParent = paramView.getParent(); ((localViewParent instanceof ViewGroup)) && (localViewParent != this); localViewParent = localViewGroup.getParent())
      {
        localViewGroup = (ViewGroup)localViewParent;
        localRect.left += localViewGroup.getLeft();
        localRect.right += localViewGroup.getRight();
        localRect.top += localViewGroup.getTop();
        localRect.bottom += localViewGroup.getBottom();
      }
      return localRect;
    }
  }

  private void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int n;
    int i1;
    int i2;
    int i4;
    View localView2;
    int i9;
    int i6;
    int i7;
    if (this.fs > 0)
    {
      int m = getScrollX();
      n = getPaddingLeft();
      i1 = getPaddingRight();
      i2 = getWidth();
      int i3 = getChildCount();
      i4 = 0;
      if (i4 < i3)
      {
        localView2 = getChildAt(i4);
        ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView2.getLayoutParams();
        if (!localLayoutParams.fG)
          break label401;
        switch (0x7 & localLayoutParams.gravity)
        {
        case 2:
        case 4:
        default:
          i9 = n;
          int i15 = i1;
          i6 = n;
          i7 = i15;
          label132: int i11 = i9 + m - localView2.getLeft();
          if (i11 != 0)
            localView2.offsetLeftAndRight(i11);
          break;
        case 3:
        case 1:
        case 5:
        }
      }
    }
    while (true)
    {
      i4++;
      int i8 = i7;
      n = i6;
      i1 = i8;
      break;
      int i13 = n + localView2.getWidth();
      int i14 = n;
      i7 = i1;
      i6 = i13;
      i9 = i14;
      break label132;
      i9 = Math.max((i2 - localView2.getMeasuredWidth()) / 2, n);
      int i12 = i1;
      i6 = n;
      i7 = i12;
      break label132;
      i9 = i2 - i1 - localView2.getMeasuredWidth();
      int i10 = i1 + localView2.getMeasuredWidth();
      i6 = n;
      i7 = i10;
      break label132;
      if (this.ft != null)
        this.ft.a(paramInt1, paramFloat, paramInt2);
      if (this.fu != null)
        this.fu.a(paramInt1, paramFloat, paramInt2);
      if (this.fw != null)
      {
        int i = getScrollX();
        int j = getChildCount();
        for (int k = 0; k < j; k++)
        {
          View localView1 = getChildAt(k);
          if (!((ViewPager.LayoutParams)localView1.getLayoutParams()).fG)
          {
            float f = (localView1.getLeft() - i) / V();
            this.fw.a(localView1, f);
          }
        }
      }
      this.fr = true;
      return;
      label401: int i5 = i1;
      i6 = n;
      i7 = i5;
    }
  }

  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    bw localbw = n(paramInt1);
    int i = 0;
    if (localbw != null)
      i = (int)(V() * Math.max(this.eQ, Math.min(localbw.fF, this.eR)));
    if (paramBoolean1)
    {
      if (getChildCount() == 0)
        setScrollingCacheEnabled(false);
      int j;
      int k;
      int m;
      int n;
      while (true)
      {
        if ((paramBoolean2) && (this.ft != null))
          this.ft.h(paramInt1);
        if ((paramBoolean2) && (this.fu != null))
          this.fu.h(paramInt1);
        return;
        j = getScrollX();
        k = getScrollY();
        m = i - j;
        n = 0 - k;
        if ((m != 0) || (n != 0))
          break;
        e(false);
        populate();
        j(0);
      }
      setScrollingCacheEnabled(true);
      j(2);
      int i1 = V();
      int i2 = i1 / 2;
      float f1 = Math.min(1.0F, 1.0F * Math.abs(m) / i1);
      float f2 = i2 + i2 * (float)Math.sin((float)(0.47123891676382D * (f1 - 0.5F)));
      int i3 = Math.abs(paramInt2);
      if (i3 > 0);
      float f4;
      for (int i4 = 4 * Math.round(1000.0F * Math.abs(f2 / i3)); ; i4 = (int)(100.0F * (3.0F + Math.abs(m) / (f4 + this.eM))))
      {
        int i5 = Math.min(i4, 600);
        this.eK.startScroll(j, k, m, n, i5);
        ba.f(this);
        break;
        float f3 = i1;
        f4 = f3 * 1.0F;
      }
    }
    if ((paramBoolean2) && (this.ft != null))
      this.ft.h(paramInt1);
    if ((paramBoolean2) && (this.fu != null))
      this.fu.h(paramInt1);
    e(false);
    scrollTo(i, 0);
    o(i);
  }

  private void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramInt, paramBoolean1, paramBoolean2, 0);
  }

  private void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    if ((this.eF == null) || (this.eF.getCount() <= 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if ((!paramBoolean2) && (this.eG == paramInt1) && (this.eD.size() != 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if (paramInt1 < 0)
      paramInt1 = 0;
    while (true)
    {
      int i = this.eW;
      if ((paramInt1 <= i + this.eG) && (paramInt1 >= this.eG - i))
        break;
      for (int j = 0; j < this.eD.size(); j++)
        ((bw)this.eD.get(j)).fD = true;
      if (paramInt1 >= this.eF.getCount())
        paramInt1 = -1 + this.eF.getCount();
    }
    int k = this.eG;
    boolean bool = false;
    if (k != paramInt1)
      bool = true;
    if (this.fp)
    {
      this.eG = paramInt1;
      if ((bool) && (this.ft != null))
        this.ft.h(paramInt1);
      if ((bool) && (this.fu != null))
        this.fu.h(paramInt1);
      requestLayout();
      return;
    }
    m(paramInt1);
    a(paramInt1, paramBoolean1, paramInt2, bool);
  }

  private void a(bw parambw1, int paramInt, bw parambw2)
  {
    int i = this.eF.getCount();
    int j = V();
    if (j > 0);
    int i5;
    float f12;
    int i15;
    bw localbw4;
    for (float f1 = this.eM / j; ; f1 = 0.0F)
    {
      if (parambw2 == null)
        break label415;
      i5 = parambw2.position;
      if (i5 >= parambw1.position)
        break;
      float f11 = f1 + (parambw2.fF + parambw2.fE);
      int i13 = i5 + 1;
      f12 = f11;
      int i14 = 0;
      i15 = i13;
      if ((i15 > parambw1.position) || (i14 >= this.eD.size()))
        break label415;
      for (localbw4 = (bw)this.eD.get(i14); (i15 > localbw4.position) && (i14 < -1 + this.eD.size()); localbw4 = (bw)this.eD.get(i14))
        i14++;
    }
    while (true)
    {
      int i17;
      float f13;
      if (i17 < localbw4.position)
      {
        Object localObject2;
        float f15 = localObject2 + (1.0F + f1);
        i17++;
        f13 = f15;
      }
      else
      {
        localbw4.fF = f13;
        float f14 = f13 + (f1 + localbw4.fE);
        int i18 = i17 + 1;
        f12 = f14;
        i15 = i18;
        break;
        float f7;
        int i9;
        bw localbw3;
        if (i5 > parambw1.position)
        {
          int i6 = -1 + this.eD.size();
          float f6 = parambw2.fF;
          int i7 = i5 - 1;
          int i8 = i6;
          f7 = f6;
          i9 = i7;
          if ((i9 >= parambw1.position) && (i8 >= 0))
            for (localbw3 = (bw)this.eD.get(i8); (i9 < localbw3.position) && (i8 > 0); localbw3 = (bw)this.eD.get(i8))
              i8--;
        }
        while (true)
        {
          int i11;
          float f8;
          if (i11 > localbw3.position)
          {
            Object localObject1;
            float f10 = localObject1 - (1.0F + f1);
            i11--;
            f8 = f10;
          }
          else
          {
            float f9 = f8 - (f1 + localbw3.fE);
            localbw3.fF = f9;
            int i12 = i11 - 1;
            f7 = f9;
            i9 = i12;
            break;
            label415: int k = this.eD.size();
            float f2 = parambw1.fF;
            int m = -1 + parambw1.position;
            float f3;
            float f4;
            if (parambw1.position == 0)
            {
              f3 = parambw1.fF;
              this.eQ = f3;
              if (parambw1.position != i - 1)
                break label548;
              f4 = parambw1.fF + parambw1.fE - 1.0F;
              label481: this.eR = f4;
            }
            label548: int i4;
            for (int n = paramInt - 1; ; n = i4)
            {
              if (n < 0)
                break label605;
              bw localbw2 = (bw)this.eD.get(n);
              while (true)
                if (m > localbw2.position)
                {
                  m--;
                  f2 -= 1.0F + f1;
                  continue;
                  f3 = -3.402824E+38F;
                  break;
                  f4 = 3.4028235E+38F;
                  break label481;
                }
              f2 -= f1 + localbw2.fE;
              localbw2.fF = f2;
              if (localbw2.position == 0)
                this.eQ = f2;
              i4 = n - 1;
              m--;
            }
            label605: float f5 = f1 + (parambw1.fF + parambw1.fE);
            int i1 = 1 + parambw1.position;
            int i3;
            for (int i2 = paramInt + 1; i2 < k; i2 = i3)
            {
              bw localbw1 = (bw)this.eD.get(i2);
              while (i1 < localbw1.position)
              {
                i1++;
                f5 += 1.0F + f1;
              }
              if (localbw1.position == i - 1)
                this.eR = (f5 + localbw1.fE - 1.0F);
              localbw1.fF = f5;
              f5 += f1 + localbw1.fE;
              i3 = i2 + 1;
              i1++;
            }
            this.fq = false;
            return;
            int i10 = i9;
            f8 = f7;
            i11 = i10;
          }
        }
        int i16 = i15;
        f13 = f12;
        i17 = i16;
      }
    }
  }

  private boolean a(float paramFloat)
  {
    int i = 1;
    float f1 = this.fc - paramFloat;
    this.fc = paramFloat;
    float f2 = f1 + getScrollX();
    int j = V();
    float f3 = j * this.eQ;
    float f4 = j * this.eR;
    bw localbw1 = (bw)this.eD.get(0);
    bw localbw2 = (bw)this.eD.get(-1 + this.eD.size());
    if (localbw1.position != 0)
      f3 = localbw1.fF * j;
    for (int k = 0; ; k = i)
    {
      float f5;
      if (localbw2.position != -1 + this.eF.getCount())
      {
        f5 = localbw2.fF * j;
        i = 0;
      }
      while (true)
      {
        boolean bool;
        if (f2 < f3)
        {
          bool = false;
          if (k != 0)
          {
            float f6 = f3 - f2;
            bool = this.fn.b(Math.abs(f6) / j);
          }
        }
        while (true)
        {
          this.fc += f3 - (int)f3;
          scrollTo((int)f3, getScrollY());
          o((int)f3);
          return bool;
          if (f2 > f5)
          {
            bool = false;
            if (i != 0)
            {
              float f7 = f2 - f5;
              bool = this.fo.b(Math.abs(f7) / j);
            }
            f3 = f5;
          }
          else
          {
            f3 = f2;
            bool = false;
          }
        }
        f5 = f4;
      }
    }
  }

  private boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int k;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i = paramView.getScrollX();
      int j = paramView.getScrollY();
      k = -1 + localViewGroup.getChildCount();
      if (k >= 0)
      {
        localView = localViewGroup.getChildAt(k);
        if ((paramInt2 + i < localView.getLeft()) || (paramInt2 + i >= localView.getRight()) || (paramInt3 + j < localView.getTop()) || (paramInt3 + j >= localView.getBottom()) || (!a(localView, true, paramInt1, paramInt2 + i - localView.getLeft(), paramInt3 + j - localView.getTop())));
      }
    }
    while ((paramBoolean) && (ba.a(paramView, -paramInt1)))
    {
      View localView;
      return true;
      k--;
      break;
    }
    return false;
  }

  private void ae()
  {
    this.eX = false;
    this.eY = false;
    if (this.ff != null)
    {
      this.ff.recycle();
      this.ff = null;
    }
  }

  private boolean af()
  {
    if (this.eG > 0)
    {
      a(-1 + this.eG, true);
      return true;
    }
    return false;
  }

  private boolean ag()
  {
    if ((this.eF != null) && (this.eG < -1 + this.eF.getCount()))
    {
      a(1 + this.eG, true);
      return true;
    }
    return false;
  }

  private boolean arrowScroll(int paramInt)
  {
    View localView1 = findFocus();
    View localView2;
    View localView3;
    boolean bool;
    label86: ViewParent localViewParent1;
    if (localView1 == this)
    {
      localView2 = null;
      localView3 = FocusFinder.getInstance().findNextFocus(this, localView2, paramInt);
      if ((localView3 == null) || (localView3 == localView2))
        break label304;
      if (paramInt != 17)
        break label248;
      int k = a(this.dR, localView3).left;
      int m = a(this.dR, localView2).left;
      if ((localView2 != null) && (k >= m))
      {
        bool = af();
        if (bool)
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        return bool;
      }
    }
    else
    {
      if (localView1 == null)
        break label350;
      localViewParent1 = localView1.getParent();
      if (!(localViewParent1 instanceof ViewGroup))
        break label355;
      if (localViewParent1 != this);
    }
    label304: label344: label350: label355: for (int n = 1; ; n = 0)
    {
      if (n == 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localView1.getClass().getSimpleName());
        ViewParent localViewParent2 = localView1.getParent();
        while (true)
          if ((localViewParent2 instanceof ViewGroup))
          {
            localStringBuilder.append(" => ").append(localViewParent2.getClass().getSimpleName());
            localViewParent2 = localViewParent2.getParent();
            continue;
            localViewParent1 = localViewParent1.getParent();
            break;
          }
        new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ").append(localStringBuilder.toString());
        localView2 = null;
        break;
        bool = localView3.requestFocus();
        break label86;
        label248: if (paramInt == 66)
        {
          int i = a(this.dR, localView3).left;
          int j = a(this.dR, localView2).left;
          if ((localView2 == null) || (i > j))
          {
            bool = localView3.requestFocus();
            break label86;
            if ((paramInt == 17) || (paramInt == 1))
            {
              bool = af();
              break label86;
            }
            if ((paramInt != 66) && (paramInt != 2))
              break label344;
          }
          bool = ag();
          break label86;
        }
        bool = false;
        break label86;
      }
      localView2 = localView1;
      break;
    }
  }

  private bw d(int paramInt1, int paramInt2)
  {
    bw localbw = new bw();
    localbw.position = paramInt1;
    localbw.fa = this.eF.a(this, paramInt1);
    localbw.fE = 1.0F;
    if ((paramInt2 < 0) || (paramInt2 >= this.eD.size()))
    {
      this.eD.add(localbw);
      return localbw;
    }
    this.eD.add(paramInt2, localbw);
    return localbw;
  }

  private void d(MotionEvent paramMotionEvent)
  {
    int i = aj.b(paramMotionEvent);
    if (aj.b(paramMotionEvent, i) == this.fe)
      if (i != 0)
        break label56;
    label56: for (int j = 1; ; j = 0)
    {
      this.fc = aj.c(paramMotionEvent, j);
      this.fe = aj.b(paramMotionEvent, j);
      if (this.ff != null)
        this.ff.clear();
      return;
    }
  }

  private void e(boolean paramBoolean)
  {
    if (this.es == 2);
    int k;
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        setScrollingCacheEnabled(false);
        this.eK.abortAnimation();
        int m = getScrollX();
        int n = getScrollY();
        int i1 = this.eK.getCurrX();
        int i2 = this.eK.getCurrY();
        if ((m != i1) || (n != i2))
          scrollTo(i1, i2);
      }
      this.eV = false;
      int j = 0;
      k = i;
      while (j < this.eD.size())
      {
        bw localbw = (bw)this.eD.get(j);
        if (localbw.fD)
        {
          localbw.fD = false;
          k = 1;
        }
        j++;
      }
    }
    if (k != 0)
    {
      if (paramBoolean)
        ba.a(this, this.fB);
    }
    else
      return;
    this.fB.run();
  }

  private void j(int paramInt)
  {
    if (this.es == paramInt);
    label35: label71: 
    do
    {
      return;
      this.es = paramInt;
      if (this.fw != null)
      {
        int i;
        int k;
        if (paramInt != 0)
        {
          i = 1;
          int j = getChildCount();
          k = 0;
          if (k >= j)
            continue;
          if (i == 0)
            break label71;
        }
        for (int m = 2; ; m = 0)
        {
          ba.a(getChildAt(k), m, null);
          k++;
          break label35;
          i = 0;
          break;
        }
      }
    }
    while (this.ft == null);
    this.ft.i(paramInt);
  }

  private bw m(View paramView)
  {
    for (int i = 0; i < this.eD.size(); i++)
    {
      bw localbw = (bw)this.eD.get(i);
      if (this.eF.a(paramView, localbw.fa))
        return localbw;
    }
    return null;
  }

  private void m(int paramInt)
  {
    int i15;
    bw localbw1;
    int i;
    if (this.eG != paramInt)
      if (this.eG < paramInt)
      {
        i15 = 66;
        bw localbw13 = n(this.eG);
        this.eG = paramInt;
        localbw1 = localbw13;
        i = i15;
      }
    while (true)
    {
      if (this.eF == null)
        Y();
      do
      {
        return;
        i15 = 17;
        break;
        if (this.eV)
        {
          Y();
          return;
        }
      }
      while (getWindowToken() == null);
      int j = this.eW;
      int k = Math.max(0, this.eG - j);
      int m = this.eF.getCount();
      int n = Math.min(m - 1, j + this.eG);
      if (m != this.eA)
        try
        {
          String str2 = getResources().getResourceName(getId());
          str1 = str2;
          throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.eA + ", found: " + m + " Pager id: " + str1 + " Pager class: " + getClass() + " Problematic adapter: " + this.eF.getClass());
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          while (true)
            String str1 = Integer.toHexString(getId());
        }
      int i1 = 0;
      bw localbw2;
      if (i1 < this.eD.size())
      {
        localbw2 = (bw)this.eD.get(i1);
        if (localbw2.position >= this.eG)
          if (localbw2.position != this.eG)
            break label1283;
      }
      while (true)
      {
        if ((localbw2 == null) && (m > 0));
        for (bw localbw3 = d(this.eG, i1); ; localbw3 = localbw2)
        {
          label352: int i6;
          label366: int i9;
          label389: label500: label633: float f3;
          label522: label528: bw localbw8;
          label679: float f4;
          label687: Object localObject2;
          int i13;
          int i14;
          label707: bw localbw12;
          label803: Object localObject3;
          float f6;
          if (localbw3 != null)
          {
            int i5 = i1 - 1;
            bw localbw7;
            float f1;
            float f2;
            int i8;
            int i10;
            if (i5 >= 0)
            {
              localbw7 = (bw)this.eD.get(i5);
              i6 = V();
              if (i6 > 0)
                break label500;
              f1 = 0.0F;
              int i7 = -1 + this.eG;
              f2 = 0.0F;
              i8 = i7;
              i9 = i1;
              i10 = i5;
              if (i8 < 0)
                break label633;
              if ((f2 < f1) || (i8 >= k))
                break label528;
              if (localbw7 == null)
                break label633;
              if ((i8 == localbw7.position) && (!localbw7.fD))
              {
                this.eD.remove(i10);
                this.eF.a(this, i8, localbw7.fa);
                i10--;
                i9--;
                if (i10 < 0)
                  break label522;
                localbw7 = (bw)this.eD.get(i10);
              }
            }
            while (true)
            {
              i8--;
              break label389;
              i1++;
              break;
              localbw7 = null;
              break label352;
              f1 = 2.0F - localbw3.fE + getPaddingLeft() / i6;
              break label366;
              localbw7 = null;
              continue;
              if ((localbw7 != null) && (i8 == localbw7.position))
              {
                f2 += localbw7.fE;
                i10--;
                if (i10 >= 0)
                  localbw7 = (bw)this.eD.get(i10);
                else
                  localbw7 = null;
              }
              else
              {
                f2 += d(i8, i10 + 1).fE;
                i9++;
                if (i10 >= 0)
                  localbw7 = (bw)this.eD.get(i10);
                else
                  localbw7 = null;
              }
            }
            f3 = localbw3.fE;
            int i11 = i9 + 1;
            if (f3 < 2.0F)
              if (i11 < this.eD.size())
              {
                localbw8 = (bw)this.eD.get(i11);
                if (i6 > 0)
                  break label839;
                f4 = 0.0F;
                int i12 = 1 + this.eG;
                localObject2 = localbw8;
                i13 = i11;
                i14 = i12;
                if (i14 >= m)
                  break label998;
                if ((f3 < f4) || (i14 <= n))
                  break label861;
                if (localObject2 == null)
                  break label998;
                if ((i14 != ((bw)localObject2).position) || (((bw)localObject2).fD))
                  break label1261;
                this.eD.remove(i13);
                this.eF.a(this, i14, ((bw)localObject2).fa);
                if (i13 >= this.eD.size())
                  break label855;
                localbw12 = (bw)this.eD.get(i13);
                float f10 = f3;
                localObject3 = localbw12;
                f6 = f10;
              }
          }
          while (true)
          {
            i14++;
            float f7 = f6;
            localObject2 = localObject3;
            f3 = f7;
            break label707;
            localbw8 = null;
            break label679;
            label839: f4 = 2.0F + getPaddingRight() / i6;
            break label687;
            label855: localbw12 = null;
            break label803;
            label861: if ((localObject2 != null) && (i14 == ((bw)localObject2).position))
            {
              float f8 = f3 + ((bw)localObject2).fE;
              i13++;
              if (i13 < this.eD.size());
              for (bw localbw11 = (bw)this.eD.get(i13); ; localbw11 = null)
              {
                localObject3 = localbw11;
                f6 = f8;
                break;
              }
            }
            bw localbw9 = d(i14, i13);
            i13++;
            float f5 = f3 + localbw9.fE;
            if (i13 < this.eD.size());
            for (bw localbw10 = (bw)this.eD.get(i13); ; localbw10 = null)
            {
              localObject3 = localbw10;
              f6 = f5;
              break;
            }
            label998: a(localbw3, i9, localbw1);
            an localan = this.eF;
            if (localbw3 != null);
            for (Object localObject1 = localbw3.fa; ; localObject1 = null)
            {
              localan.a(localObject1);
              this.eF.B();
              int i2 = getChildCount();
              for (int i3 = 0; i3 < i2; i3++)
              {
                View localView3 = getChildAt(i3);
                ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView3.getLayoutParams();
                localLayoutParams.fI = i3;
                if ((!localLayoutParams.fG) && (localLayoutParams.fE == 0.0F))
                {
                  bw localbw6 = m(localView3);
                  if (localbw6 != null)
                  {
                    localLayoutParams.fE = localbw6.fE;
                    localLayoutParams.position = localbw6.position;
                  }
                }
              }
            }
            Y();
            if (!hasFocus())
              break;
            View localView1 = findFocus();
            if (localView1 != null);
            for (bw localbw4 = n(localView1); ; localbw4 = null)
            {
              if ((localbw4 != null) && (localbw4.position == this.eG))
                break label1259;
              for (int i4 = 0; ; i4++)
              {
                if (i4 >= getChildCount())
                  break label1253;
                View localView2 = getChildAt(i4);
                bw localbw5 = m(localView2);
                if ((localbw5 != null) && (localbw5.position == this.eG) && (localView2.requestFocus(i)))
                  break;
              }
              label1253: break;
            }
            label1259: break;
            label1261: float f9 = f3;
            localObject3 = localObject2;
            f6 = f9;
          }
        }
        label1283: localbw2 = null;
      }
      i = 2;
      localbw1 = null;
    }
  }

  private bw n(int paramInt)
  {
    for (int i = 0; i < this.eD.size(); i++)
    {
      bw localbw = (bw)this.eD.get(i);
      if (localbw.position == paramInt)
        return localbw;
    }
    return null;
  }

  private bw n(View paramView)
  {
    while (true)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this)
        break;
      if ((localViewParent == null) || (!(localViewParent instanceof View)))
        return null;
      paramView = (View)localViewParent;
    }
    return m(paramView);
  }

  private boolean o(int paramInt)
  {
    boolean bool1;
    if (this.eD.size() == 0)
    {
      this.fr = false;
      a(0, 0.0F, 0);
      boolean bool2 = this.fr;
      bool1 = false;
      if (!bool2)
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }
    else
    {
      bw localbw = Z();
      int i = V();
      int j = i + this.eM;
      float f1 = this.eM / i;
      int k = localbw.position;
      float f2 = (paramInt / i - localbw.fF) / (f1 + localbw.fE);
      int m = (int)(f2 * j);
      this.fr = false;
      a(k, f2, m);
      if (!this.fr)
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      bool1 = true;
    }
    return bool1;
  }

  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.eU != paramBoolean)
      this.eU = paramBoolean;
  }

  public final an U()
  {
    return this.eF;
  }

  public final int W()
  {
    return this.eG;
  }

  final void X()
  {
    int i = this.eF.getCount();
    this.eA = i;
    int j;
    int m;
    int n;
    int i1;
    int i2;
    label61: bw localbw;
    int i5;
    int i11;
    int i6;
    int i7;
    int i8;
    int i9;
    if ((this.eD.size() < 1 + 2 * this.eW) && (this.eD.size() < i))
    {
      j = 1;
      int k = this.eG;
      m = 0;
      n = k;
      i1 = j;
      i2 = 0;
      if (i2 >= this.eD.size())
        break label285;
      localbw = (bw)this.eD.get(i2);
      i5 = this.eF.b(localbw.fa);
      if (i5 == -1)
        break label375;
      if (i5 != -2)
        break label234;
      this.eD.remove(i2);
      i11 = i2 - 1;
      if (m == 0)
        m = 1;
      this.eF.a(this, localbw.position, localbw.fa);
      if (this.eG != localbw.position)
        break label394;
      int i12 = Math.max(0, Math.min(this.eG, i - 1));
      i6 = i11;
      i7 = m;
      i8 = i12;
      i9 = 1;
    }
    label285: 
    while (true)
    {
      int i10 = i6 + 1;
      i1 = i9;
      n = i8;
      m = i7;
      i2 = i10;
      break label61;
      j = 0;
      break;
      label234: if (localbw.position != i5)
      {
        if (localbw.position == this.eG)
          n = i5;
        localbw.position = i5;
        i6 = i2;
        i7 = m;
        i8 = n;
        i9 = 1;
        continue;
        if (m != 0)
          this.eF.B();
        Collections.sort(this.eD, eB);
        if (i1 != 0)
        {
          int i3 = getChildCount();
          for (int i4 = 0; i4 < i3; i4++)
          {
            ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)getChildAt(i4).getLayoutParams();
            if (!localLayoutParams.fG)
              localLayoutParams.fE = 0.0F;
          }
          a(n, false, true);
          requestLayout();
        }
      }
      else
      {
        label375: i6 = i2;
        i7 = m;
        i8 = n;
        i9 = i1;
        continue;
        i6 = i11;
        i7 = m;
        i8 = n;
        i9 = 1;
      }
    }
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    this.eV = false;
    a(paramInt, paramBoolean, false);
  }

  public void a(an paraman)
  {
    if (this.eF != null)
    {
      this.eF.unregisterDataSetObserver(this.eL);
      for (int i = 0; i < this.eD.size(); i++)
      {
        bw localbw = (bw)this.eD.get(i);
        this.eF.a(this, localbw.position, localbw.fa);
      }
      this.eF.B();
      this.eD.clear();
      for (int j = 0; j < getChildCount(); j++)
        if (!((ViewPager.LayoutParams)getChildAt(j).getLayoutParams()).fG)
        {
          removeViewAt(j);
          j--;
        }
      this.eG = 0;
      scrollTo(0, 0);
    }
    an localan = this.eF;
    this.eF = paraman;
    this.eA = 0;
    boolean bool;
    if (this.eF != null)
    {
      if (this.eL == null)
        this.eL = new cb(this, (byte)0);
      this.eF.registerDataSetObserver(this.eL);
      this.eV = false;
      bool = this.fp;
      this.fp = true;
      this.eA = this.eF.getCount();
      if (this.eH < 0)
        break label296;
      this.eF.a(this.eI, this.eJ);
      a(this.eH, false, true);
      this.eH = -1;
      this.eI = null;
      this.eJ = null;
    }
    while (true)
    {
      if ((this.fv != null) && (localan != paraman))
        this.fv.b(localan, paraman);
      return;
      label296: if (!bool)
        populate();
      else
        requestLayout();
    }
  }

  final void a(by paramby)
  {
    this.fv = paramby;
  }

  public void a(bz parambz)
  {
    this.ft = parambz;
  }

  public final void a(ca paramca)
  {
    int i = 1;
    int j;
    if (Build.VERSION.SDK_INT >= 11)
    {
      if (this.fw == null)
        break label114;
      j = i;
    }
    while (true)
    {
      if (i != j)
      {
        this.fw = paramca;
        if ((Build.VERSION.SDK_INT >= 7) && (this.fx != null));
      }
      try
      {
        Class[] arrayOfClass = new Class[1];
        arrayOfClass[0] = Boolean.TYPE;
        this.fx = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", arrayOfClass);
        try
        {
          label71: Method localMethod = this.fx;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Boolean.valueOf(true);
          localMethod.invoke(this, arrayOfObject);
          label100: this.fy = 2;
          if (i != 0)
            populate();
          return;
          label114: j = 0;
          continue;
          i = 0;
        }
        catch (Exception localException)
        {
          break label100;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        break label71;
      }
    }
  }

  public int aa()
  {
    return ((bw)this.eD.get(0)).position;
  }

  public int ab()
  {
    return ((bw)this.eD.get(-1 + this.eD.size())).position;
  }

  public final boolean ac()
  {
    if (this.eX)
      return false;
    this.fk = true;
    j(1);
    this.fc = 0.0F;
    this.dX = 0.0F;
    if (this.ff == null)
      this.ff = VelocityTracker.obtain();
    while (true)
    {
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
      this.ff.addMovement(localMotionEvent);
      localMotionEvent.recycle();
      this.fl = l;
      return true;
      this.ff.clear();
    }
  }

  public final boolean ad()
  {
    return this.fk;
  }

  public void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    int i = paramArrayList.size();
    int j = getDescendantFocusability();
    if (j != 393216)
      for (int k = 0; k < getChildCount(); k++)
      {
        View localView = getChildAt(k);
        if (localView.getVisibility() == 0)
        {
          bw localbw = m(localView);
          if ((localbw != null) && (localbw.position == this.eG))
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
    if (((j == 262144) && (i != paramArrayList.size())) || (!isFocusable()));
    while ((((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode())) || (paramArrayList == null))
      return;
    paramArrayList.add(this);
  }

  public void addTouchables(ArrayList paramArrayList)
  {
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        bw localbw = m(localView);
        if ((localbw != null) && (localbw.position == this.eG))
          localView.addTouchables(paramArrayList);
      }
    }
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (!checkLayoutParams(paramLayoutParams));
    for (ViewGroup.LayoutParams localLayoutParams = generateLayoutParams(paramLayoutParams); ; localLayoutParams = paramLayoutParams)
    {
      ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localLayoutParams;
      localLayoutParams1.fG |= paramView instanceof bv;
      if (this.as)
      {
        if ((localLayoutParams1 != null) && (localLayoutParams1.fG))
          throw new IllegalStateException("Cannot add pager decor view during layout");
        localLayoutParams1.fH = true;
        addViewInLayout(paramView, paramInt, localLayoutParams);
        return;
      }
      super.addView(paramView, paramInt, localLayoutParams);
      return;
    }
  }

  final bz b(bz parambz)
  {
    bz localbz = this.fu;
    this.fu = parambz;
    return localbz;
  }

  public final void b(float paramFloat1, float paramFloat2)
  {
    this.fc = paramFloat1;
    this.fd = paramFloat2;
  }

  public boolean canScrollHorizontally(int paramInt)
  {
    if (this.eF == null);
    int i;
    int j;
    do
    {
      do
      {
        return false;
        i = V();
        j = getScrollX();
        if (paramInt >= 0)
          break;
      }
      while (j <= (int)(i * this.eQ));
      return true;
    }
    while ((paramInt <= 0) || (j >= (int)(i * this.eR)));
    return true;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof ViewPager.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public void computeScroll()
  {
    if ((!this.eK.isFinished()) && (this.eK.computeScrollOffset()))
    {
      int i = getScrollX();
      int j = getScrollY();
      int k = this.eK.getCurrX();
      int m = this.eK.getCurrY();
      if ((i != k) || (j != m))
      {
        scrollTo(k, m);
        if (!o(k))
        {
          this.eK.abortAnimation();
          scrollTo(0, m);
        }
      }
      ba.f(this);
      return;
    }
    e(true);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool2;
    if (!super.dispatchKeyEvent(paramKeyEvent))
    {
      if (paramKeyEvent.getAction() == 0);
      switch (paramKeyEvent.getKeyCode())
      {
      default:
        bool2 = false;
      case 21:
      case 22:
      case 61:
      }
    }
    while (true)
    {
      boolean bool1 = false;
      if (bool2)
        bool1 = true;
      return bool1;
      bool2 = arrowScroll(17);
      continue;
      bool2 = arrowScroll(66);
      continue;
      if (Build.VERSION.SDK_INT < 11)
        break;
      if (u.b(paramKeyEvent))
      {
        bool2 = arrowScroll(2);
      }
      else
      {
        if (!u.a(paramKeyEvent))
          break;
        bool2 = arrowScroll(1);
      }
    }
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool;
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      bool = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      return bool;
    }
    int i = getChildCount();
    for (int j = 0; ; j++)
    {
      bool = false;
      if (j >= i)
        break;
      View localView = getChildAt(j);
      if (localView.getVisibility() == 0)
      {
        bw localbw = m(localView);
        if ((localbw != null) && (localbw.position == this.eG) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent)))
          return true;
      }
    }
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = ba.e(this);
    boolean bool2;
    if ((i == 0) || ((i == 1) && (this.eF != null) && (this.eF.getCount() > 1)))
    {
      boolean bool1 = this.fn.isFinished();
      bool2 = false;
      if (!bool1)
      {
        int n = paramCanvas.save();
        int i1 = getHeight() - getPaddingTop() - getPaddingBottom();
        int i2 = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-i1 + getPaddingTop(), this.eQ * i2);
        this.fn.setSize(i1, i2);
        bool2 = false | this.fn.draw(paramCanvas);
        paramCanvas.restoreToCount(n);
      }
      if (!this.fo.isFinished())
      {
        int j = paramCanvas.save();
        int k = getWidth();
        int m = getHeight() - getPaddingTop() - getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(1.0F + this.eR) * k);
        this.fo.setSize(m, k);
        bool2 |= this.fo.draw(paramCanvas);
        paramCanvas.restoreToCount(j);
      }
    }
    while (true)
    {
      if (bool2)
        ba.f(this);
      return;
      this.fn.finish();
      this.fo.finish();
      bool2 = false;
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.eN;
    if ((localDrawable != null) && (localDrawable.isStateful()))
      localDrawable.setState(getDrawableState());
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewPager.LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewPager.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }

  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.fy == 2)
      paramInt2 = paramInt1 - 1 - paramInt2;
    return ((ViewPager.LayoutParams)((View)this.fz.get(paramInt2)).getLayoutParams()).fI;
  }

  public final void k(int paramInt)
  {
    this.eV = false;
    if (!this.fp);
    for (boolean bool = true; ; bool = false)
    {
      a(paramInt, bool, false);
      return;
    }
  }

  public final void l(int paramInt)
  {
    if (paramInt <= 0)
    {
      new StringBuilder("Requested offscreen page limit ").append(paramInt).append(" too small; defaulting to 1");
      paramInt = 1;
    }
    if (paramInt != this.eW)
    {
      this.eW = paramInt;
      populate();
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.fp = true;
  }

  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.fB);
    super.onDetachedFromWindow();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.eM > 0) && (this.eN != null) && (this.eD.size() > 0) && (this.eF != null))
    {
      int i = getScrollX();
      int j = getWidth();
      float f1 = this.eM / j;
      bw localbw = (bw)this.eD.get(0);
      float f2 = localbw.fF;
      int k = this.eD.size();
      int m = localbw.position;
      int n = ((bw)this.eD.get(k - 1)).position;
      int i1 = 0;
      int i2 = m;
      if (i2 < n)
      {
        while ((i2 > localbw.position) && (i1 < k))
        {
          ArrayList localArrayList = this.eD;
          i1++;
          localbw = (bw)localArrayList.get(i1);
        }
        float f3;
        if (i2 == localbw.position)
          f3 = (localbw.fF + localbw.fE) * j;
        for (f2 = f1 + (localbw.fF + localbw.fE); ; f2 += 1.0F + f1)
        {
          if (f3 + this.eM > i)
          {
            this.eN.setBounds((int)f3, this.eO, (int)(0.5F + (f3 + this.eM)), this.eP);
            this.eN.draw(paramCanvas);
          }
          if (f3 > i + j)
            return;
          i2++;
          break;
          f3 = (1.0F + f2) * j;
        }
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0xFF & paramMotionEvent.getAction();
    if ((i == 3) || (i == 1))
    {
      this.eX = false;
      this.eY = false;
      this.fe = -1;
      if (this.ff != null)
      {
        this.ff.recycle();
        this.ff = null;
      }
    }
    do
    {
      return false;
      if (i == 0)
        break;
      if (this.eX)
        return true;
    }
    while (this.eY);
    switch (i)
    {
    default:
    case 2:
    case 0:
    case 6:
    }
    while (true)
    {
      if (this.ff == null)
        this.ff = VelocityTracker.obtain();
      this.ff.addMovement(paramMotionEvent);
      return this.eX;
      int j = this.fe;
      if (j != -1)
      {
        int k = aj.a(paramMotionEvent, j);
        float f3 = aj.c(paramMotionEvent, k);
        float f4 = f3 - this.fc;
        float f5 = Math.abs(f4);
        float f6 = aj.d(paramMotionEvent, k);
        float f7 = Math.abs(f6 - this.dY);
        if (f4 != 0.0F)
        {
          float f9 = this.fc;
          if (((f9 < this.fb) && (f4 > 0.0F)) || ((f9 > getWidth() - this.fb) && (f4 < 0.0F)));
          for (int m = 1; (m == 0) && (a(this, false, (int)f4, (int)f3, (int)f6)); m = 0)
          {
            this.fc = f3;
            this.fd = f6;
            this.eY = true;
            return false;
          }
        }
        float f8;
        if ((f5 > this.dZ) && (0.5F * f5 > f7))
        {
          this.eX = true;
          j(1);
          if (f4 > 0.0F)
          {
            f8 = this.dX + this.dZ;
            label360: this.fc = f8;
            this.fd = f6;
            setScrollingCacheEnabled(true);
          }
        }
        while ((this.eX) && (a(f3)))
        {
          ba.f(this);
          break;
          f8 = this.dX - this.dZ;
          break label360;
          if (f7 > this.dZ)
            this.eY = true;
        }
        float f1 = paramMotionEvent.getX();
        this.dX = f1;
        this.fc = f1;
        float f2 = paramMotionEvent.getY();
        this.dY = f2;
        this.fd = f2;
        this.fe = aj.b(paramMotionEvent, 0);
        this.eY = false;
        this.eK.computeScrollOffset();
        if ((this.es == 2) && (Math.abs(this.eK.getFinalX() - this.eK.getCurrX()) > this.fj))
        {
          this.eK.abortAnimation();
          this.eV = false;
          populate();
          this.eX = true;
          j(1);
        }
        else
        {
          e(false);
          this.eX = false;
          continue;
          d(paramMotionEvent);
        }
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    int j = paramInt3 - paramInt1;
    int k = paramInt4 - paramInt2;
    int m = getPaddingLeft();
    int n = getPaddingTop();
    int i1 = getPaddingRight();
    int i2 = getPaddingBottom();
    int i3 = getScrollX();
    int i4 = 0;
    int i5 = 0;
    View localView2;
    int i16;
    label156: int i17;
    int i19;
    int i20;
    label208: int i9;
    int i10;
    int i11;
    if (i5 < i)
    {
      localView2 = getChildAt(i5);
      if (localView2.getVisibility() == 8)
        break label659;
      ViewPager.LayoutParams localLayoutParams2 = (ViewPager.LayoutParams)localView2.getLayoutParams();
      if (!localLayoutParams2.fG)
        break label659;
      int i13 = 0x7 & localLayoutParams2.gravity;
      int i14 = 0x70 & localLayoutParams2.gravity;
      switch (i13)
      {
      case 2:
      case 4:
      default:
        i16 = m;
        switch (i14)
        {
        default:
          i17 = n;
          int i25 = i2;
          i19 = n;
          i20 = i25;
          int i21 = i16 + i3;
          localView2.layout(i21, i17, i21 + localView2.getMeasuredWidth(), i17 + localView2.getMeasuredHeight());
          i9 = i4 + 1;
          i10 = i19;
          i2 = i20;
          i11 = i1;
        case 48:
        case 16:
        case 80:
        }
        break;
      case 3:
      case 1:
      case 5:
      }
    }
    for (int i12 = m; ; i12 = m)
    {
      i5++;
      m = i12;
      i1 = i11;
      n = i10;
      i4 = i9;
      break;
      int i26 = m + localView2.getMeasuredWidth();
      i16 = m;
      m = i26;
      break label156;
      i16 = Math.max((j - localView2.getMeasuredWidth()) / 2, m);
      break label156;
      int i15 = j - i1 - localView2.getMeasuredWidth();
      i1 += localView2.getMeasuredWidth();
      i16 = i15;
      break label156;
      int i23 = n + localView2.getMeasuredHeight();
      int i24 = n;
      i20 = i2;
      i19 = i23;
      i17 = i24;
      break label208;
      i17 = Math.max((k - localView2.getMeasuredHeight()) / 2, n);
      int i22 = i2;
      i19 = n;
      i20 = i22;
      break label208;
      i17 = k - i2 - localView2.getMeasuredHeight();
      int i18 = i2 + localView2.getMeasuredHeight();
      i19 = n;
      i20 = i18;
      break label208;
      int i6 = j - m - i1;
      for (int i7 = 0; i7 < i; i7++)
      {
        View localView1 = getChildAt(i7);
        if (localView1.getVisibility() != 8)
        {
          ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localView1.getLayoutParams();
          if (!localLayoutParams1.fG)
          {
            bw localbw = m(localView1);
            if (localbw != null)
            {
              int i8 = m + (int)(i6 * localbw.fF);
              if (localLayoutParams1.fH)
              {
                localLayoutParams1.fH = false;
                localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i6 * localLayoutParams1.fE), 1073741824), View.MeasureSpec.makeMeasureSpec(k - n - i2, 1073741824));
              }
              localView1.layout(i8, n, i8 + localView1.getMeasuredWidth(), n + localView1.getMeasuredHeight());
            }
          }
        }
      }
      this.eO = n;
      this.eP = (k - i2);
      this.fs = i4;
      if (this.fp)
        a(this.eG, false, 0, false);
      this.fp = false;
      return;
      label659: i9 = i4;
      i10 = n;
      i11 = i1;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    int i = getMeasuredWidth();
    this.fb = Math.min(i / 10, this.eZ);
    int j = i - getPaddingLeft() - getPaddingRight();
    int k = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int m = getChildCount();
    int n = 0;
    View localView2;
    ViewPager.LayoutParams localLayoutParams2;
    int i5;
    int i6;
    int i7;
    label167: int i8;
    label182: label192: int i9;
    int i10;
    if (n < m)
    {
      localView2 = getChildAt(n);
      if (localView2.getVisibility() != 8)
      {
        localLayoutParams2 = (ViewPager.LayoutParams)localView2.getLayoutParams();
        if ((localLayoutParams2 != null) && (localLayoutParams2.fG))
        {
          int i3 = 0x7 & localLayoutParams2.gravity;
          int i4 = 0x70 & localLayoutParams2.gravity;
          i5 = -2147483648;
          i6 = -2147483648;
          if ((i4 != 48) && (i4 != 80))
            break label294;
          i7 = 1;
          if ((i3 != 3) && (i3 != 5))
            break label300;
          i8 = 1;
          if (i7 == 0)
            break label306;
          i5 = 1073741824;
          if (localLayoutParams2.width == -2)
            break label478;
          i9 = 1073741824;
          if (localLayoutParams2.width == -1)
            break label471;
          i10 = localLayoutParams2.width;
        }
      }
    }
    while (true)
    {
      if (localLayoutParams2.height != -2)
      {
        i6 = 1073741824;
        if (localLayoutParams2.height == -1);
      }
      for (int i11 = localLayoutParams2.height; ; i11 = k)
      {
        localView2.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i6));
        if (i7 != 0)
          k -= localView2.getMeasuredHeight();
        while (true)
        {
          n++;
          break;
          label294: i7 = 0;
          break label167;
          label300: i8 = 0;
          break label182;
          label306: if (i8 == 0)
            break label192;
          i6 = 1073741824;
          break label192;
          if (i8 != 0)
            j -= localView2.getMeasuredWidth();
        }
        this.eS = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
        this.eT = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
        this.as = true;
        populate();
        this.as = false;
        int i1 = getChildCount();
        for (int i2 = 0; i2 < i1; i2++)
        {
          View localView1 = getChildAt(i2);
          if (localView1.getVisibility() != 8)
          {
            ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localView1.getLayoutParams();
            if ((localLayoutParams1 == null) || (!localLayoutParams1.fG))
              localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(j * localLayoutParams1.fE), 1073741824), this.eT);
          }
        }
        return;
      }
      label471: i10 = j;
      continue;
      label478: i9 = i5;
      i10 = j;
    }
  }

  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i = -1;
    int j = getChildCount();
    int k;
    if ((paramInt & 0x2) != 0)
    {
      i = 1;
      k = 0;
    }
    while (k != j)
    {
      View localView = getChildAt(k);
      if (localView.getVisibility() == 0)
      {
        bw localbw = m(localView);
        if ((localbw != null) && (localbw.position == this.eG) && (localView.requestFocus(paramInt, paramRect)))
        {
          return true;
          k = j - 1;
          j = i;
        }
      }
      else
      {
        k += i;
      }
    }
    return false;
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof ViewPager.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    ViewPager.SavedState localSavedState = (ViewPager.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (this.eF != null)
    {
      this.eF.a(localSavedState.fJ, localSavedState.fK);
      a(localSavedState.position, false, true);
      return;
    }
    this.eH = localSavedState.position;
    this.eI = localSavedState.fJ;
    this.eJ = localSavedState.fK;
  }

  public Parcelable onSaveInstanceState()
  {
    ViewPager.SavedState localSavedState = new ViewPager.SavedState(super.onSaveInstanceState());
    localSavedState.position = this.eG;
    if (this.eF != null)
      localSavedState.fJ = this.eF.C();
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      int i = this.eM;
      int j = this.eM;
      if ((paramInt3 <= 0) || (this.eD.isEmpty()))
        break label158;
      int m = i + (paramInt1 - getPaddingLeft() - getPaddingRight());
      int n = j + (paramInt3 - getPaddingLeft() - getPaddingRight());
      int i1 = (int)(getScrollX() / n * m);
      scrollTo(i1, getScrollY());
      if (!this.eK.isFinished())
      {
        int i2 = this.eK.getDuration() - this.eK.timePassed();
        bw localbw2 = n(this.eG);
        this.eK.startScroll(i1, 0, (int)(localbw2.fF * paramInt1), 0, i2);
      }
    }
    return;
    label158: bw localbw1 = n(this.eG);
    if (localbw1 != null);
    for (float f = Math.min(localbw1.fF, this.eR); ; f = 0.0F)
    {
      int k = (int)(f * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (k == getScrollX())
        break;
      e(false);
      scrollTo(k, getScrollY());
      return;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.fk)
      return true;
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
      return false;
    if ((this.eF == null) || (this.eF.getCount() == 0))
      return false;
    if (this.ff == null)
      this.ff = VelocityTracker.obtain();
    this.ff.addMovement(paramMotionEvent);
    int i = 0xFF & paramMotionEvent.getAction();
    boolean bool1 = false;
    switch (i)
    {
    case 4:
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    case 5:
    case 6:
    }
    while (true)
    {
      if (bool1)
        ba.f(this);
      return true;
      this.eK.abortAnimation();
      this.eV = false;
      populate();
      this.eX = true;
      j(1);
      float f8 = paramMotionEvent.getX();
      this.dX = f8;
      this.fc = f8;
      float f9 = paramMotionEvent.getY();
      this.dY = f9;
      this.fd = f9;
      this.fe = aj.b(paramMotionEvent, 0);
      bool1 = false;
      continue;
      float f5;
      if (!this.eX)
      {
        int i2 = aj.a(paramMotionEvent, this.fe);
        float f3 = aj.c(paramMotionEvent, i2);
        float f4 = Math.abs(f3 - this.fc);
        f5 = aj.d(paramMotionEvent, i2);
        float f6 = Math.abs(f5 - this.fd);
        if ((f4 > this.dZ) && (f4 > f6))
        {
          this.eX = true;
          if (f3 - this.dX <= 0.0F)
            break label368;
        }
      }
      label368: for (float f7 = this.dX + this.dZ; ; f7 = this.dX - this.dZ)
      {
        this.fc = f7;
        this.fd = f5;
        j(1);
        setScrollingCacheEnabled(true);
        boolean bool4 = this.eX;
        bool1 = false;
        if (!bool4)
          break;
        bool1 = false | a(aj.c(paramMotionEvent, aj.a(paramMotionEvent, this.fe)));
        break;
      }
      boolean bool3 = this.eX;
      bool1 = false;
      if (bool3)
      {
        VelocityTracker localVelocityTracker = this.ff;
        localVelocityTracker.computeCurrentVelocity(1000, this.fh);
        int k = (int)aw.a(localVelocityTracker, this.fe);
        this.eV = true;
        int m = V();
        int n = getScrollX();
        bw localbw = Z();
        int i1 = localbw.position;
        float f1 = (n / m - localbw.fF) / localbw.fE;
        if ((Math.abs((int)(aj.c(paramMotionEvent, aj.a(paramMotionEvent, this.fe)) - this.dX)) > this.fi) && (Math.abs(k) > this.fg))
        {
          if (k > 0);
          while (true)
          {
            if (this.eD.size() > 0)
              i1 = Math.max(aa(), Math.min(i1, ab()));
            a(i1, true, true, k);
            this.fe = -1;
            ae();
            bool1 = this.fn.ax() | this.fo.ax();
            break;
            i1++;
          }
        }
        if (i1 >= this.eG);
        for (float f2 = 0.6F; ; f2 = 0.4F)
        {
          i1 = (int)(f2 + (f1 + i1));
          break;
        }
        boolean bool2 = this.eX;
        bool1 = false;
        if (bool2)
        {
          a(this.eG, true, 0, false);
          this.fe = -1;
          ae();
          bool1 = this.fn.ax() | this.fo.ax();
          continue;
          int j = aj.b(paramMotionEvent);
          this.fc = aj.c(paramMotionEvent, j);
          this.fe = aj.b(paramMotionEvent, j);
          bool1 = false;
          continue;
          d(paramMotionEvent);
          this.fc = aj.c(paramMotionEvent, aj.a(paramMotionEvent, this.fe));
          bool1 = false;
        }
      }
    }
  }

  final void populate()
  {
    m(this.eG);
  }

  public void removeView(View paramView)
  {
    if (this.as)
    {
      removeViewInLayout(paramView);
      return;
    }
    super.removeView(paramView);
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.eN);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager
 * JD-Core Version:    0.6.2
 */