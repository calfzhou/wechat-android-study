package com.tencent.mm.ui.tools.gridviewheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.ArrayList;
import java.util.List;

public class GridHeadersGridView extends GridView
  implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, AdapterView.OnItemSelectedListener
{
  private AdapterView.OnItemClickListener JT;
  private AdapterView.OnItemSelectedListener JU;
  private int dZ;
  private int eDG;
  private AdapterView.OnItemLongClickListener eoT;
  private int es = 0;
  private DataSetObserver fZ = new i(this);
  protected int hzM;
  private int iXw;
  private int iXx;
  public k jVM;
  public l jVN;
  private boolean jVO = true;
  private final Rect jVP = new Rect();
  private boolean jVQ;
  private boolean jVR;
  private int jVS;
  private long jVT = -1L;
  private int jVU;
  private float jVV;
  private boolean jVW;
  private int jVX = 1;
  private m jVY;
  private n jVZ;
  private o jWa;
  private AbsListView.OnScrollListener jWb;
  private View jWc;
  protected c jWd;
  protected int jWe;
  private boolean jWf = true;
  private Runnable jbU;
  private cm mHandler = new cm();
  protected boolean oy;

  public GridHeadersGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842865);
  }

  public GridHeadersGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    super.setOnScrollListener(this);
    setVerticalFadingEdgeEnabled(false);
    if (!this.jVW)
      this.eDG = -1;
    this.dZ = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }

  private int bbm()
  {
    if (this.jWc != null)
      return this.jWc.getMeasuredHeight();
    return 0;
  }

  private void bbn()
  {
    if (this.jWc == null)
      return;
    int i = View.MeasureSpec.makeMeasureSpec(getWidth() - getPaddingLeft() - getPaddingRight(), 1073741824);
    ViewGroup.LayoutParams localLayoutParams = this.jWc.getLayoutParams();
    if ((localLayoutParams != null) && (localLayoutParams.height > 0));
    for (int j = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824); ; j = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      this.jWc.measure(i, j);
      this.jWc.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), this.jWc.getMeasuredHeight());
      return;
    }
  }

  private void reset()
  {
    this.jVU = 0;
    this.jWc = null;
    this.jVT = -9223372036854775808L;
  }

  private void rt(int paramInt)
  {
    if ((this.jWd == null) || (this.jWd.getCount() == 0) || (!this.jVO));
    int i;
    int j;
    long l;
    label116: int k;
    do
    {
      do
        return;
      while ((h)getChildAt(0) == null);
      i = paramInt - this.jVX;
      if (i < 0)
        i = paramInt;
      j = paramInt + this.jVX;
      if (j >= this.jWd.getCount())
        j = paramInt;
      if (this.iXx == 0)
        break label321;
      if (this.iXx >= 0)
        break label282;
      this.jWd.hF(paramInt);
      if (getChildAt(this.jVX).getTop() > 0)
        break;
      l = this.jWd.hF(j);
      if (this.jVT != l)
      {
        this.jWc = this.jWd.a(j, this.jWc, this);
        bbn();
        this.jVT = l;
      }
      k = getChildCount();
    }
    while (k == 0);
    Object localObject1 = null;
    int m = 99999;
    int n = 0;
    label174: h localh;
    int i3;
    label211: Object localObject2;
    int i4;
    if (n < k)
    {
      localh = (h)super.getChildAt(n);
      if (this.jVQ)
      {
        i3 = localh.getTop() - getPaddingTop();
        if ((i3 < 0) || (!(localh.getChildAt(0) instanceof f)) || (i3 >= m))
          break label511;
        int i5 = i3;
        localObject2 = localh;
        i4 = i5;
      }
    }
    while (true)
    {
      n += this.jVX;
      localObject1 = localObject2;
      m = i4;
      break label174;
      l = this.jWd.hF(paramInt);
      j = paramInt;
      break label116;
      label282: int i6 = getChildAt(0).getTop();
      if ((i6 > 0) && (i6 < this.iXx))
      {
        l = this.jWd.hF(i);
        j = i;
        break label116;
      }
      label321: l = this.jWd.hF(paramInt);
      j = paramInt;
      break label116;
      i3 = localh.getTop();
      break label211;
      int i1 = bbm();
      if (localObject1 != null)
      {
        if ((paramInt == 0) && (super.getChildAt(0).getTop() > 0) && (!this.jVQ))
        {
          this.jVU = 0;
          return;
        }
        if (this.jVQ)
        {
          this.jVU = Math.min(localObject1.getTop(), i1 + getPaddingTop());
          if (this.jVU < getPaddingTop());
          for (int i2 = i1 + getPaddingTop(); ; i2 = this.jVU)
          {
            this.jVU = i2;
            return;
          }
        }
        this.jVU = Math.min(localObject1.getTop(), i1);
        if (this.jVU < 0);
        while (true)
        {
          this.jVU = i1;
          return;
          i1 = this.jVU;
        }
      }
      this.jVU = i1;
      if (!this.jVQ)
        break;
      this.jVU += getPaddingTop();
      return;
      label511: i4 = m;
      localObject2 = localObject1;
    }
  }

  public final boolean aH(View paramView)
  {
    if (this.jVY != null)
    {
      playSoundEffect(0);
      if (paramView != null)
        paramView.sendAccessibilityEvent(1);
      return true;
    }
    return false;
  }

  public final boolean aI(View paramView)
  {
    if (this.jVZ != null);
    for (boolean bool = this.jVZ.bbo(); ; bool = false)
    {
      if (bool)
      {
        if (paramView != null)
          paramView.sendAccessibilityEvent(2);
        performHapticFeedback(0);
      }
      return bool;
    }
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    if (Build.VERSION.SDK_INT < 8)
      rt(getFirstVisiblePosition());
    if ((this.jWc != null) && (this.jVO) && (this.jWc.getVisibility() == 0));
    int j;
    int k;
    ArrayList localArrayList;
    for (int i = 1; ; i = 0)
    {
      j = bbm();
      k = this.jVU - j;
      if ((i != 0) && (this.jWf))
      {
        this.jVP.left = getPaddingLeft();
        this.jVP.right = (getWidth() - getPaddingRight());
        this.jVP.top = this.jVU;
        this.jVP.bottom = getHeight();
        paramCanvas.save();
        paramCanvas.clipRect(this.jVP);
      }
      super.dispatchDraw(paramCanvas);
      localArrayList = new ArrayList();
      int m = 0;
      int n = getFirstVisiblePosition();
      while (n <= getLastVisiblePosition())
      {
        if (getItemIdAtPosition(n) == -1L)
          localArrayList.add(Integer.valueOf(m));
        n += this.jVX;
        m += this.jVX;
      }
    }
    int i1 = 0;
    while (true)
    {
      h localh;
      if (i1 < localArrayList.size())
        localh = (h)getChildAt(((Integer)localArrayList.get(i1)).intValue());
      try
      {
        View localView = (View)localh.getTag();
        if ((((f)localh.getChildAt(0)).bbl() == this.jVT) && (localh.getTop() < 0) && (this.jVO));
        for (int i4 = 1; ; i4 = 0)
        {
          if ((localView.getVisibility() == 0) && (i4 == 0))
          {
            localView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824 - getPaddingLeft() - getPaddingRight()), View.MeasureSpec.makeMeasureSpec(0, 0));
            localView.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), localh.getHeight());
            this.jVP.left = getPaddingLeft();
            this.jVP.right = (getWidth() - getPaddingRight());
            this.jVP.bottom = localh.getBottom();
            this.jVP.top = localh.getTop();
            paramCanvas.save();
            paramCanvas.clipRect(this.jVP);
            paramCanvas.translate(getPaddingLeft(), localh.getTop());
            localView.draw(paramCanvas);
            paramCanvas.restore();
          }
          i1++;
          break;
        }
        if ((i != 0) && (this.jWf))
        {
          paramCanvas.restore();
          if (this.jWc.getWidth() != getWidth() - getPaddingLeft() - getPaddingRight())
          {
            int i2 = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824 - getPaddingLeft() - getPaddingRight());
            int i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.jWc.measure(i2, i3);
            this.jWc.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), this.jWc.getHeight());
          }
          this.jVP.left = getPaddingLeft();
          this.jVP.right = (getWidth() - getPaddingRight());
          this.jVP.bottom = (k + j);
          if (!this.jVQ)
            break label720;
        }
        label720: for (this.jVP.top = getPaddingTop(); ; this.jVP.top = 0)
        {
          paramCanvas.save();
          paramCanvas.clipRect(this.jVP);
          paramCanvas.translate(getPaddingLeft(), k);
          paramCanvas.saveLayerAlpha(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight(), (int)(255.0F * this.jVU / j), 4);
          this.jWc.draw(paramCanvas);
          paramCanvas.restore();
          paramCanvas.restore();
          return;
          if (i != 0)
            break;
          return;
        }
      }
      catch (Exception localException)
      {
      }
    }
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.JT.onItemClick(paramAdapterView, paramView, this.jWd.rp(paramInt).iy, paramLong);
  }

  public boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    return this.eoT.onItemLongClick(paramAdapterView, paramView, this.jWd.rp(paramInt).iy, paramLong);
  }

  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.JU.onItemSelected(paramAdapterView, paramView, this.jWd.rp(paramInt).iy, paramLong);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    int k;
    if (this.eDG == -1)
      if (this.jVS > 0)
      {
        int j = Math.max(View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight(), 0);
        k = j / this.jVS;
        if (k <= 0)
          break label87;
        while ((k != i) && (k * this.jVS + (k - 1) * this.iXw > j))
          k--;
      }
    for (i = 2; ; i = k)
      label87: for (this.jVX = i; ; this.jVX = this.eDG)
      {
        if (this.jWd != null)
          this.jWd.setNumColumns(this.jVX);
        bbn();
        super.onMeasure(paramInt1, paramInt2);
        return;
      }
  }

  public void onNothingSelected(AdapterView paramAdapterView)
  {
    this.JU.onNothingSelected(paramAdapterView);
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GridHeadersGridView.SavedState localSavedState = (GridHeadersGridView.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    this.jVO = localSavedState.jWj;
    requestLayout();
  }

  public Parcelable onSaveInstanceState()
  {
    GridHeadersGridView.SavedState localSavedState = new GridHeadersGridView.SavedState(super.onSaveInstanceState());
    localSavedState.jWj = this.jVO;
    return localSavedState;
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.jWb != null)
      this.jWb.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if (Build.VERSION.SDK_INT >= 8)
      rt(paramInt1);
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (this.jWb != null)
      this.jWb.onScrollStateChanged(paramAbsListView, paramInt);
    this.es = paramInt;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = -2;
    switch (0xFF & paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    label233: 
    do
    {
      while (true)
      {
        return super.onTouchEvent(paramMotionEvent);
        if (this.jVN == null)
          this.jVN = new l(this);
        this.mHandler.postDelayed(this.jVM, ViewConfiguration.getTapTimeout());
        int j = (int)paramMotionEvent.getY();
        this.jVV = j;
        float f = j;
        if ((this.jWc != null) && (f <= this.jWc.getBottom()));
        while (true)
        {
          this.jWe = i;
          if ((this.jWe == -1) || (this.es == 2))
            break;
          this.hzM = 0;
          return true;
          int k = getFirstVisiblePosition();
          i = 0;
          while (true)
          {
            if (k > getLastVisiblePosition())
              break label233;
            if (getItemIdAtPosition(k) == -1L)
            {
              View localView3 = getChildAt(i);
              int m = localView3.getBottom();
              int n = localView3.getTop();
              if ((f <= m) && (f >= n))
                break;
            }
            k += this.jVX;
            i += this.jVX;
          }
          i = -1;
        }
        if ((this.jWe != -1) && (Math.abs(paramMotionEvent.getY() - this.jVV) > this.dZ))
        {
          this.hzM = -1;
          View localView2 = rs(this.jWe);
          if (localView2 != null)
            localView2.setPressed(false);
          if (this.jVM != null)
            this.mHandler.removeCallbacks(this.jVM);
          this.jWe = -1;
        }
      }
      if (this.hzM == i)
        return true;
    }
    while ((this.hzM == -1) || (this.jWe == -1));
    View localView1 = rs(this.jWe);
    o localo;
    Object localObject;
    if ((localView1 != null) && (!localView1.hasFocusable()))
    {
      if (this.hzM != 0)
        localView1.setPressed(false);
      if (this.jWa == null)
        this.jWa = new o(this, (byte)0);
      localo = this.jWa;
      localo.hAl = this.jWe;
      localo.aAu();
      if ((this.hzM == 0) && (this.hzM == 1))
        break label551;
      cm localcm = this.mHandler;
      if (this.hzM != 0)
        break label534;
      localObject = this.jVN;
      localcm.removeCallbacks((Runnable)localObject);
      if (this.oy)
        break label543;
      this.hzM = 1;
      localView1.setPressed(true);
      setPressed(true);
      if (this.jbU != null)
        removeCallbacks(this.jbU);
      this.jbU = new j(this, localView1, localo);
      this.mHandler.postDelayed(this.jbU, ViewConfiguration.getPressedStateDuration());
    }
    while (true)
    {
      this.hzM = -1;
      return true;
      label534: localObject = this.jVM;
      break;
      label543: this.hzM = -1;
      continue;
      label551: if (!this.oy)
        localo.run();
    }
  }

  public final View rs(int paramInt)
  {
    if (paramInt == -2)
      return this.jWc;
    try
    {
      View localView = (View)getChildAt(paramInt).getTag();
      return localView;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    if ((this.jWd != null) && (this.fZ != null))
      this.jWd.unregisterDataSetObserver(this.fZ);
    if (!this.jVR)
      this.jVQ = true;
    Object localObject;
    if ((paramListAdapter instanceof b))
      localObject = (b)paramListAdapter;
    while (true)
    {
      this.jWd = new c(getContext(), this, (b)localObject);
      this.jWd.registerDataSetObserver(this.fZ);
      reset();
      super.setAdapter(this.jWd);
      return;
      if ((paramListAdapter instanceof t))
        localObject = new u((t)paramListAdapter);
      else
        localObject = new r(paramListAdapter);
    }
  }

  public void setClipToPadding(boolean paramBoolean)
  {
    super.setClipToPadding(paramBoolean);
    this.jVQ = paramBoolean;
    this.jVR = true;
  }

  public void setColumnWidth(int paramInt)
  {
    super.setColumnWidth(paramInt);
    this.jVS = paramInt;
  }

  public void setHorizontalSpacing(int paramInt)
  {
    super.setHorizontalSpacing(paramInt);
    this.iXw = paramInt;
  }

  public void setNumColumns(int paramInt)
  {
    super.setNumColumns(paramInt);
    this.jVW = true;
    this.eDG = paramInt;
    if ((paramInt != -1) && (this.jWd != null))
      this.jWd.setNumColumns(paramInt);
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.JT = paramOnItemClickListener;
    super.setOnItemClickListener(this);
  }

  public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener paramOnItemLongClickListener)
  {
    this.eoT = paramOnItemLongClickListener;
    super.setOnItemLongClickListener(this);
  }

  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.JU = paramOnItemSelectedListener;
    super.setOnItemSelectedListener(this);
  }

  public void setOnScrollListener(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.jWb = paramOnScrollListener;
  }

  public void setVerticalSpacing(int paramInt)
  {
    super.setVerticalSpacing(paramInt);
    this.iXx = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.GridHeadersGridView
 * JD-Core Version:    0.6.2
 */