package com.tencent.mm.ui.account;

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

public class HorizontalListView extends AdapterView
{
  protected Scroller eK;
  private int iOA = -1;
  private int iOB = 0;
  protected int iOC;
  protected int iOD;
  private int iOE = 2147483647;
  private int iOF = 0;
  private GestureDetector iOG;
  private Queue iOH = new LinkedList();
  private AdapterView.OnItemSelectedListener iOI;
  private AdapterView.OnItemClickListener iOJ;
  private DataSetObserver iOK = new bc(this);
  private GestureDetector.OnGestureListener iOL = new be(this);
  public boolean iOz = true;
  protected ListAdapter oU;
  private boolean oy = false;

  public HorizontalListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    DP();
  }

  private void DP()
  {
    try
    {
      this.iOA = -1;
      this.iOB = 0;
      this.iOF = 0;
      this.iOC = 0;
      this.iOD = 0;
      this.iOE = 2147483647;
      this.eK = new Scroller(getContext());
      this.iOG = new GestureDetector(getContext(), this.iOL);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void r(View paramView, int paramInt)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    addViewInLayout(paramView, paramInt, localLayoutParams, true);
    paramView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), -2147483648), View.MeasureSpec.makeMeasureSpec(getHeight(), -2147483648));
  }

  private void reset()
  {
    try
    {
      DP();
      removeAllViewsInLayout();
      requestLayout();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected final boolean aQy()
  {
    this.eK.forceFinished(true);
    return true;
  }

  protected final boolean aa(float paramFloat)
  {
    try
    {
      this.eK.fling(this.iOD, 0, (int)-paramFloat, 0, 0, this.iOE, 0, 0);
      requestLayout();
      return true;
    }
    finally
    {
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.iOG.onTouchEvent(paramMotionEvent);
  }

  public View getSelectedView()
  {
    return null;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    int j;
    try
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      ListAdapter localListAdapter = this.oU;
      if (localListAdapter == null)
        return;
      if (this.oy)
      {
        int i6 = this.iOC;
        DP();
        removeAllViewsInLayout();
        this.iOD = i6;
        this.oy = false;
      }
      if (this.eK.computeScrollOffset())
        this.iOD = this.eK.getCurrX();
      if (this.iOD <= 0)
      {
        this.iOD = 0;
        this.eK.forceFinished(true);
      }
      if (this.iOD >= this.iOE)
      {
        this.iOD = this.iOE;
        this.eK.forceFinished(true);
      }
      j = this.iOC - this.iOD;
      for (View localView1 = getChildAt(0); (localView1 != null) && (j + localView1.getRight() <= 0); localView1 = getChildAt(0))
      {
        this.iOF += localView1.getMeasuredWidth();
        this.iOH.offer(localView1);
        removeViewInLayout(localView1);
        this.iOA = (1 + this.iOA);
      }
      while (true)
      {
        View localView2 = getChildAt(-1 + getChildCount());
        if ((localView2 == null) || (j + localView2.getLeft() < getWidth()))
          break;
        this.iOH.offer(localView2);
        removeViewInLayout(localView2);
        this.iOB = (-1 + this.iOB);
      }
    }
    finally
    {
    }
    View localView3 = getChildAt(-1 + getChildCount());
    int k;
    label313: int m;
    int n;
    if (localView3 != null)
    {
      k = localView3.getRight();
      break label684;
      while ((m + j < getWidth()) && (this.iOB < this.oU.getCount()))
      {
        View localView7 = this.oU.getView(this.iOB, (View)this.iOH.poll(), this);
        r(localView7, -1);
        int i5 = m + localView7.getMeasuredWidth();
        if (this.iOB == -1 + this.oU.getCount())
          this.iOE = (i5 + this.iOC - getWidth());
        if (this.iOE < 0)
          this.iOE = 0;
        this.iOB = (1 + this.iOB);
        m = i5;
      }
      View localView4 = getChildAt(0);
      if (localView4 != null)
      {
        n = localView4.getLeft();
        break label691;
      }
    }
    while (true)
    {
      int i1;
      if ((i1 + j > 0) && (this.iOA >= 0))
      {
        View localView6 = this.oU.getView(this.iOA, (View)this.iOH.poll(), this);
        r(localView6, 0);
        int i4 = i1 - localView6.getMeasuredWidth();
        this.iOA = (-1 + this.iOA);
        this.iOF -= localView6.getMeasuredWidth();
        i1 = i4;
      }
      else
      {
        if (getChildCount() > 0)
        {
          this.iOF = (j + this.iOF);
          int i2 = this.iOF;
          while (i < getChildCount())
          {
            View localView5 = getChildAt(i);
            int i3 = localView5.getMeasuredWidth();
            localView5.layout(i2, 0, i2 + i3, localView5.getMeasuredHeight());
            i2 += i3;
            i++;
          }
        }
        this.iOC = this.iOD;
        if (this.eK.isFinished())
          break;
        post(new bd(this));
        break;
        n = 0;
        break label691;
        k = 0;
        label684: m = k;
        break label313;
        label691: i1 = n;
      }
    }
  }

  public final void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.oU != null)
      this.oU.unregisterDataSetObserver(this.iOK);
    this.oU = paramListAdapter;
    this.oU.registerDataSetObserver(this.iOK);
    reset();
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.iOJ = paramOnItemClickListener;
  }

  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.iOI = paramOnItemSelectedListener;
  }

  public void setSelection(int paramInt)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.HorizontalListView
 * JD-Core Version:    0.6.2
 */