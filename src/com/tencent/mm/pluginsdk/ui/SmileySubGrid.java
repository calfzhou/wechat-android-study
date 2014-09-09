package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ListAdapter;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.CustomViewPager;
import com.tencent.mm.ui.base.MMFlipper;

public class SmileySubGrid extends SmileyGrid
{
  private int dZ;
  float eEV;
  float eEW;
  private WindowManager eFd;
  private LayoutInflater ekY;
  private bd hAa;
  private int hAb;
  private int hAc;
  private View hAd;
  private int hAe;
  private String hAf;
  private volatile int hAg = -1;
  private volatile boolean hAh = false;
  private final String hAi = "lock_refresh";
  int hzL = 6;
  int hzM;
  int hzN;
  int hzO = -1;
  Rect hzP = new Rect();
  boolean hzQ;
  private DynamicEmojiView hzR;
  private WindowManager.LayoutParams hzS;
  private int hzT;
  private int hzU;
  private boolean hzV;
  private be hzW;
  private int hzX;
  private int hzY;
  private bc hzZ;
  private cm mHandler = new cm();

  public SmileySubGrid(Context paramContext)
  {
    this(paramContext, null);
  }

  public SmileySubGrid(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.ekY = LayoutInflater.from(paramContext);
    this.eFd = ((WindowManager)paramContext.getSystemService("window"));
    this.hzR = new DynamicEmojiView(getContext());
    this.hzR.df(true);
    this.hzS = new WindowManager.LayoutParams(-1, -1, 2, 8, 1);
    this.hAe = paramContext.getResources().getDimensionPixelSize(g.Qq);
    this.hzS.width = this.hAe;
    this.hzS.height = this.hAe;
    this.hzS.gravity = 17;
    this.hzX = Od();
    this.hzY = ViewConfiguration.getPressedStateDuration();
    this.hAb = getResources().getConfiguration().orientation;
    if (this.hAb == 2)
      this.hzT = this.eFd.getDefaultDisplay().getHeight();
    for (this.hzU = this.eFd.getDefaultDisplay().getWidth(); ; this.hzU = this.eFd.getDefaultDisplay().getHeight())
    {
      setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      setBackgroundResource(0);
      setStretchMode(2);
      this.hAc = e.a(paramContext, 80.0F);
      setColumnWidth(this.hAc);
      setNumColumns(this.hzT / this.hAc);
      this.dZ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
      return;
      this.hzT = this.eFd.getDefaultDisplay().getWidth();
    }
  }

  private void aAs()
  {
    if (this.hzW != null)
      this.mHandler.removeCallbacks(this.hzW);
    if (this.hzV)
    {
      this.eFd.removeView(this.hzR);
      this.hzV = false;
      this.hAh = false;
    }
    this.hAf = "";
  }

  private void ac(View paramView)
  {
    Rect localRect = this.hzP;
    localRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    int i = localRect.left;
    int j = localRect.top;
    int k = localRect.right;
    int m = localRect.bottom;
    this.hzP.set(i - getPaddingLeft(), j - getPaddingTop(), k + getPaddingRight(), m + getPaddingBottom());
    boolean bool1 = this.hzQ;
    if (paramView.isEnabled() != bool1)
      if (bool1)
        break label116;
    label116: for (boolean bool2 = true; ; bool2 = false)
    {
      this.hzQ = bool2;
      refreshDrawableState();
      return;
    }
  }

  private void i(ad paramad)
  {
    if (paramad == null);
    try
    {
      this.hzR.ms(k.hxL);
      while (true)
      {
        return;
        if (!paramad.vu().equals(this.hAf))
        {
          this.hAf = paramad.vu();
          this.hzR.g(paramad);
        }
      }
    }
    finally
    {
    }
  }

  private void p(View paramView, int paramInt)
  {
    int i;
    int[] arrayOfInt;
    if ((paramInt == this.hAg) && (this.hzR.isShown()))
    {
      i = 1;
      if (i != 0)
        break label293;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      z.d("!32@/B4Tb64lLpJwTdf0UnldbM1CCN2N7ccr", "jacks begin show:%d", arrayOfObject2);
      ad localad = (ad)getAdapter().getItem(paramInt);
      if (this.hzW == null)
        this.hzW = new be(this, (byte)0);
      i(localad);
      this.hzR.setBackgroundResource(h.UG);
      arrayOfInt = new int[2];
      paramView.getLocationOnScreen(arrayOfInt);
      if (this.hAb != 1)
        break label217;
      this.hzS.x = (0 + (arrayOfInt[0] - (this.hzT - paramView.getMeasuredWidth()) / 2));
      this.hzS.y = (arrayOfInt[1] - this.hzU / 2 - paramView.getMeasuredHeight() - Oc());
      label172: if (this.hzV)
        break label273;
      this.hAh = true;
      this.mHandler.postDelayed(this.hzW, this.hzY);
      label201: gJ(paramInt);
    }
    while (true)
    {
      this.hAg = paramInt;
      return;
      i = 0;
      break;
      label217: this.hzS.x = (arrayOfInt[0] - (this.hzU - paramView.getMeasuredWidth()) / 2 - Oc());
      this.hzS.y = (0 + (arrayOfInt[1] - this.hzT / 2 - paramView.getMeasuredHeight()));
      break label172;
      label273: this.eFd.updateViewLayout(this.hzR, this.hzS);
      break label201;
      label293: Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt);
      z.d("!32@/B4Tb64lLpJwTdf0UnldbM1CCN2N7ccr", "jacks already show:%d", arrayOfObject1);
    }
  }

  protected int Oc()
  {
    return 0;
  }

  protected int Od()
  {
    return ViewConfiguration.getLongPressTimeout();
  }

  protected boolean Oe()
  {
    return true;
  }

  public final void a(ad paramad, int paramInt)
  {
    if ((this.hAg != paramInt) || (!this.hAh))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      arrayOfObject[1] = Boolean.valueOf(this.hAh);
      z.d("!32@/B4Tb64lLpJwTdf0UnldbM1CCN2N7ccr", "not show:%d, needData: %B, so do not refresh", arrayOfObject);
      return;
    }
    i(paramad);
  }

  public final int aAr()
  {
    return this.hzO;
  }

  public final boolean aAt()
  {
    return this.hzL == 5;
  }

  protected void aI(boolean paramBoolean)
  {
    if (this.hAd != null)
    {
      if (!(this.hAd instanceof MMFlipper))
        break label29;
      ((MMFlipper)this.hAd).aI(paramBoolean);
    }
    label29: 
    while (!(this.hAd instanceof CustomViewPager))
      return;
    ((CustomViewPager)this.hAd).ew(paramBoolean);
  }

  public final void ab(View paramView)
  {
    this.hAd = paramView;
  }

  protected void gJ(int paramInt)
  {
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!Oe())
    {
      aAs();
      return super.onTouchEvent(paramMotionEvent);
    }
    int i = paramMotionEvent.getAction();
    switch (i)
    {
    default:
      return true;
    case 0:
      int i1 = (int)paramMotionEvent.getX();
      int i2 = (int)paramMotionEvent.getY();
      this.eEV = i1;
      this.eEW = i2;
      int i3 = pointToPosition(i1, i2);
      if ((i3 >= 0) && (getAdapter().isEnabled(i3)))
        this.hzM = 0;
      View localView5 = null;
      if (i3 >= 0)
      {
        this.hzO = i3;
        localView5 = getChildAt(i3 - getFirstVisiblePosition());
      }
      if (localView5 != null)
      {
        localView5.setPressed(true);
        localView5.setSelected(true);
        ac(localView5);
      }
      if (this.hzZ == null)
        this.hzZ = new bc(this, (byte)0);
      this.hzZ.aAu();
      this.hzN = i3;
      this.mHandler.postDelayed(this.hzZ, this.hzX);
      return true;
    case 2:
      int k = (int)paramMotionEvent.getX();
      int m = (int)paramMotionEvent.getY();
      if (this.hzL == 5)
      {
        int n = pointToPosition(k, m);
        this.hzN = n;
        if (n >= 0)
          if (this.hzO != n)
          {
            this.hzO = n;
            View localView4 = getChildAt(n - getFirstVisiblePosition());
            layoutChildren();
            if (localView4 != null)
            {
              localView4.setPressed(true);
              localView4.setSelected(true);
              ac(localView4);
              p(localView4, this.hzO);
            }
          }
        while (true)
        {
          this.mHandler.removeCallbacks(this.hzZ);
          return true;
          aAs();
          if (this.hzO >= 0)
          {
            View localView3 = getChildAt(this.hzO - getFirstVisiblePosition());
            if (localView3 != null)
            {
              localView3.setPressed(false);
              localView3.setSelected(false);
              ac(localView3);
            }
          }
        }
      }
      if (Math.abs(this.eEV - k) > this.dZ)
      {
        this.hzM = -1;
        this.mHandler.removeCallbacks(this.hzZ);
      }
      aAs();
      return true;
    case 1:
    case 3:
    }
    int j = this.hzN;
    View localView1 = getChildAt(j - getFirstVisiblePosition());
    if ((i == 1) && (this.hzM != -1))
    {
      if (this.hAa == null)
        this.hAa = new bd(this, (byte)0);
      bd localbd = this.hAa;
      localbd.hAk = localView1;
      localbd.hAl = j;
      localbd.aAu();
      this.mHandler.post(localbd);
    }
    this.mHandler.removeCallbacks(this.hzZ);
    aI(true);
    aAs();
    if (this.hzO >= 0)
    {
      View localView2 = getChildAt(this.hzO - getFirstVisiblePosition());
      if (localView2 != null)
      {
        localView2.setPressed(false);
        localView2.setSelected(false);
        ac(localView2);
      }
    }
    this.hzL = 6;
    return true;
  }

  public final void release()
  {
    super.release();
    aAs();
    if (this.hzR != null)
    {
      this.hzR.recycle();
      this.hzR = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.SmileySubGrid
 * JD-Core Version:    0.6.2
 */