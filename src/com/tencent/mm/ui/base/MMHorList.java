package com.tencent.mm.ui.base;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.Scroller;
import java.util.LinkedList;
import java.util.Queue;

public class MMHorList extends AdapterView
{
  private bu iZU;
  private int iZV;
  private int iZW;
  private int iZX;
  private int iZY;
  private int iZZ = 536870912;
  private Queue jaa = new LinkedList();
  private boolean jab = false;
  private boolean jac = false;
  protected Scroller jad;
  private GestureDetector jae;
  private AdapterView.OnItemSelectedListener jaf;
  private AdapterView.OnItemClickListener jag;
  private ListAdapter jah;
  private Runnable jai = new br(this);
  private boolean jaj = false;
  private boolean jak = false;
  private int jal = 0;
  private int jam = 0;
  private boolean jan = false;
  private boolean jao = false;
  private DataSetObserver jap = new bs(this);
  private GestureDetector.OnGestureListener jaq = new bt(this);
  private int offset;

  public MMHorList(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public MMHorList(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public MMHorList(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private int aSa()
  {
    return this.jah.getCount() * this.jal;
  }

  private void init()
  {
    this.jad = new Scroller(getContext());
    this.iZV = -1;
    this.iZW = 0;
    this.offset = 0;
    this.iZX = 0;
    this.iZY = 0;
    this.jab = false;
    this.iZZ = 536870912;
    this.jae = new GestureDetector(getContext(), this.jaq);
  }

  private void r(View paramView, int paramInt)
  {
    this.jac = true;
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    addViewInLayout(paramView, paramInt, localLayoutParams, true);
    paramView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), -2147483648), View.MeasureSpec.makeMeasureSpec(getHeight(), -2147483648));
  }

  private void reset()
  {
    init();
    removeAllViewsInLayout();
    requestLayout();
  }

  public final void a(bu parambu)
  {
    this.iZU = parambu;
  }

  protected final boolean aQy()
  {
    this.jad.forceFinished(true);
    return true;
  }

  public final void aRY()
  {
    this.jaj = true;
  }

  public final void aRZ()
  {
    this.jak = true;
  }

  public final boolean aSb()
  {
    return this.jan;
  }

  protected final boolean aa(float paramFloat)
  {
    this.jad.fling(this.iZY, 0, (int)-paramFloat, 0, 0, this.iZZ, 0, 0);
    requestLayout();
    return true;
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = this.jae.onTouchEvent(paramMotionEvent);
    if (paramMotionEvent.getAction() == 0)
    {
      this.jan = true;
      if (this.iZU != null)
        this.iZU.ark();
    }
    while ((paramMotionEvent.getAction() != 3) && (paramMotionEvent.getAction() != 1))
      return bool;
    if (this.jak)
    {
      if (aSa() <= getWidth())
        break label182;
      if (this.iZX >= 0)
        break label134;
      this.jad.forceFinished(true);
      this.jad.startScroll(this.iZX, 0, 0 - this.iZX, 0);
      requestLayout();
    }
    while (true)
    {
      this.jan = false;
      if (this.iZU == null)
        break;
      this.iZU.arl();
      return bool;
      label134: if (this.iZX > this.iZZ)
      {
        this.jad.forceFinished(true);
        this.jad.startScroll(this.iZX, 0, this.iZZ - this.iZX, 0);
        requestLayout();
        continue;
        label182: if (this.iZX != -1 * this.jam)
        {
          this.jad.forceFinished(true);
          this.jad.startScroll(this.iZX, 0, 0 - this.iZX, 0);
          requestLayout();
        }
      }
    }
  }

  public final int getCurrentPosition()
  {
    return this.iZX;
  }

  public View getSelectedView()
  {
    return null;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.jah == null)
      return;
    this.jac = true;
    if (this.jab)
    {
      int i6 = this.iZX;
      init();
      removeAllViewsInLayout();
      this.iZY = i6;
      if (this.jaj)
      {
        this.jam = Math.max(0, (getWidth() - aSa()) / 2);
        this.offset = this.jam;
      }
      this.jab = false;
    }
    if (this.jad.computeScrollOffset())
      this.iZY = this.jad.getCurrX();
    if (this.jak)
      if (aSa() > getWidth())
      {
        if (this.iZY < -1 * getWidth())
        {
          this.iZY = (1 + -1 * getWidth());
          this.jad.forceFinished(true);
        }
        if (this.iZY > this.iZZ + getWidth())
        {
          this.iZY = (-1 + (this.iZZ + getWidth()));
          this.jad.forceFinished(true);
        }
      }
    int i;
    while (true)
    {
      i = this.iZX - this.iZY;
      View localView1 = getChildAt(0);
      while ((localView1 != null) && (i + localView1.getRight() <= 0))
      {
        this.offset += localView1.getMeasuredWidth();
        this.jaa.offer(localView1);
        removeViewInLayout(localView1);
        this.iZV = (1 + this.iZV);
        localView1 = getChildAt(0);
        this.jac = true;
      }
      if (this.iZY < -1 * getWidth() + this.jam)
      {
        this.iZY = (1 + (-1 * getWidth() + this.jam));
        this.jad.forceFinished(true);
      }
      if (this.iZY > getWidth() - this.jam)
      {
        this.iZY = (-1 + (getWidth() - this.jam));
        this.jad.forceFinished(true);
        continue;
        if (this.iZY < 0)
        {
          this.iZY = 0;
          this.jad.forceFinished(true);
        }
        if (this.iZY > this.iZZ)
        {
          this.iZY = this.iZZ;
          this.jad.forceFinished(true);
        }
      }
    }
    View localView2 = getChildAt(-1 + getChildCount());
    while ((localView2 != null) && (i + localView2.getLeft() >= getWidth()))
    {
      this.jaa.offer(localView2);
      removeViewInLayout(localView2);
      this.iZW = (-1 + this.iZW);
      localView2 = getChildAt(-1 + getChildCount());
      this.jac = true;
    }
    View localView3 = getChildAt(-1 + getChildCount());
    if (localView3 != null);
    for (int j = localView3.getRight(); ; j = 0)
    {
      int i5;
      for (int k = j; (k + i < getWidth()) && (this.iZW < this.jah.getCount()); k = i5)
      {
        View localView7 = this.jah.getView(this.iZW, (View)this.jaa.poll(), this);
        r(localView7, -1);
        i5 = k + localView7.getMeasuredWidth();
        if (this.iZW == -1 + this.jah.getCount())
          this.iZZ = (i5 + this.iZX - getWidth());
        this.iZW = (1 + this.iZW);
      }
      View localView4 = getChildAt(0);
      if (localView4 != null);
      for (int m = localView4.getLeft(); ; m = 0)
      {
        int i4;
        for (int n = m; (n + i > 0) && (this.iZV >= 0); n = i4)
        {
          View localView6 = this.jah.getView(this.iZV, (View)this.jaa.poll(), this);
          r(localView6, 0);
          i4 = n - localView6.getMeasuredWidth();
          this.iZV = (-1 + this.iZV);
          this.offset -= localView6.getMeasuredWidth();
        }
        if ((getChildCount() > 0) && (this.jac))
        {
          this.offset = (i + this.offset);
          int i1 = this.offset;
          for (int i2 = 0; i2 < getChildCount(); i2++)
          {
            View localView5 = getChildAt(i2);
            int i3 = localView5.getMeasuredWidth();
            localView5.layout(i1, 0, i1 + i3, localView5.getMeasuredHeight());
            i1 += i3;
          }
        }
        this.iZX = this.iZY;
        if (!this.jad.isFinished())
        {
          post(this.jai);
          return;
        }
        if ((this.iZU == null) || (!this.jao))
          break;
        this.iZU.arm();
        this.jao = false;
        return;
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.jah != null) && (this.jah.getCount() > 0))
    {
      View localView = getChildAt(0);
      if (localView != null)
      {
        super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), -2147483648));
        return;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public final void pA(int paramInt)
  {
    this.jad.forceFinished(true);
    this.jad.startScroll(this.iZX, 0, paramInt - this.iZX, 0);
    this.jao = true;
    requestLayout();
  }

  public final void pz(int paramInt)
  {
    this.jal = paramInt;
  }

  public final void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.jah == null)
      paramListAdapter.registerDataSetObserver(this.jap);
    this.jah = paramListAdapter;
    reset();
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.jag = paramOnItemClickListener;
  }

  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.jaf = paramOnItemSelectedListener;
  }

  public void setSelection(int paramInt)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMHorList
 * JD-Core Version:    0.6.2
 */