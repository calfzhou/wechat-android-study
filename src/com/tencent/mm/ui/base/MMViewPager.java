package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.support.v4.view.ViewPager;
import android.support.v4.view.an;
import android.support.v4.view.bz;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import com.tencent.mm.sdk.platformtools.cm;
import java.lang.ref.WeakReference;

public class MMViewPager extends ViewPager
{
  private GestureDetector eFq;
  private int enc;
  private int ene;
  private cm gQj = new cm(Looper.getMainLooper());
  private MultiTouchImageView jda;
  private fe jdb;
  private boolean jdc = false;
  private boolean jdd = false;
  private boolean jde = false;
  private boolean jdf = false;
  private boolean jdg = false;
  private float jdh;
  private float jdi;
  private ew jdj;
  private ez jdk;
  private ex jdl;
  private bz jdm = null;
  private MotionEvent jdn;
  private View.OnTouchListener jdo;

  public MMViewPager(Context paramContext)
  {
    super(paramContext);
    setStaticTransformationsEnabled(true);
  }

  public MMViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setStaticTransformationsEnabled(true);
    this.jdb = new fe(new WeakReference(this));
    this.eFq = new GestureDetector(paramContext, new ey(this, (byte)0));
    super.a(new eu(this));
    super.setOnTouchListener(new ev(this));
  }

  public MMViewPager(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setStaticTransformationsEnabled(true);
  }

  private boolean a(float paramFloat1, float paramFloat2, View paramView, float paramFloat3)
  {
    int i;
    if ((this.jde) || (this.jdd))
    {
      i = 0;
      if (i == 0)
        break label131;
    }
    while (true)
    {
      return true;
      if (U().b(paramView) == -1 + U().getCount())
      {
        if (this.jdg)
        {
          if (paramFloat3 > 0.0F)
          {
            this.jda.t(-paramFloat3, 0.0F);
            i = 1;
            break;
          }
          i = 0;
          break;
        }
        if (paramFloat3 > 0.0F)
        {
          if (paramFloat2 < this.enc)
            this.jdg = true;
          this.jda.t(-paramFloat3, 0.0F);
          i = 1;
          break;
        }
      }
      this.jdg = false;
      i = 0;
      break;
      label131: int j;
      if ((this.jde) || (this.jdd))
        j = 0;
      while (j == 0)
      {
        return false;
        if (U().b(paramView) == 0)
        {
          if (this.jdf)
          {
            if (paramFloat3 < 0.0F)
            {
              this.jda.t(-paramFloat3, 0.0F);
              j = 1;
            }
            else
            {
              j = 0;
            }
          }
          else if (paramFloat3 < 0.0F)
          {
            if (paramFloat1 > 0.0F)
              this.jdf = true;
            this.jda.t(-paramFloat3, 0.0F);
            j = 1;
          }
        }
        else
        {
          this.jdf = false;
          j = 0;
        }
      }
    }
  }

  private void aSV()
  {
    this.jdb.removeMessages(1);
  }

  private void aSW()
  {
    aSV();
    this.jdb.j(15L, 15L);
  }

  private boolean aSX()
  {
    if (this.jdd)
      return true;
    this.jde = true;
    return false;
  }

  private boolean c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if ((this.jde) || (this.jdf) || (this.jdg));
    do
    {
      do
      {
        return true;
        this.jdd = true;
        if (paramFloat1 >= 0.0F)
          break;
      }
      while (paramFloat2 >= 0.0F);
      float f2 = -paramFloat1;
      if (paramFloat2 - paramFloat1 > 0.0F)
        f2 = -paramFloat2;
      this.jda.t(0.0F, f2);
      return true;
    }
    while (paramFloat3 <= this.ene);
    float f1 = -paramFloat1;
    if (paramFloat3 - paramFloat1 < this.ene)
      f1 = this.ene - paramFloat3;
    this.jda.t(0.0F, f1);
    return true;
  }

  public final void a(an paraman)
  {
    if ((paraman instanceof ff))
    {
      super.a(paraman);
      return;
    }
    throw new IllegalArgumentException("must be MMViewPagerAdapter");
  }

  public final void a(bz parambz)
  {
    this.jdm = parambz;
  }

  public final void a(ex paramex)
  {
    this.jdl = paramex;
  }

  public final void a(ez paramez)
  {
    this.jdk = paramez;
  }

  public final int aa()
  {
    int i = ((ff)U()).aa();
    if (i >= 0)
      return i;
    return super.aa();
  }

  public final int ab()
  {
    int i = ((ff)U()).ab();
    if (i >= 0)
      return i;
    return super.ab();
  }

  public boolean isFocused()
  {
    return true;
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    if (paramBoolean)
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.enc = View.MeasureSpec.getSize(paramInt1);
    this.ene = View.MeasureSpec.getSize(paramInt2);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if (paramBoolean)
      super.onWindowFocusChanged(paramBoolean);
  }

  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.jdo = paramOnTouchListener;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager
 * JD-Core Version:    0.6.2
 */