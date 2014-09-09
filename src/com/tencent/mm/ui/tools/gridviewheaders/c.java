package com.tencent.mm.ui.tools.gridviewheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class c extends BaseAdapter
{
  private static boolean jVC;
  private int eDG = 1;
  private DataSetObserver fZ = new d(this);
  private final b jVD;
  private GridHeadersGridView jVE;
  private final List jVF = new ArrayList();
  private View[] jVG;
  private final Context mContext;
  private int mCount;

  public c(Context paramContext, GridHeadersGridView paramGridHeadersGridView, b paramb)
  {
    this.mContext = paramContext;
    this.jVD = paramb;
    this.jVE = paramGridHeadersGridView;
    paramb.registerDataSetObserver(this.fZ);
  }

  private void rn(int paramInt)
  {
    this.jVG = new View[paramInt];
    Arrays.fill(this.jVG, null);
  }

  private int ro(int paramInt)
  {
    int i = this.jVD.rm(paramInt) % this.eDG;
    if (i == 0)
      return 0;
    return this.eDG - i;
  }

  protected final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.jVD.bbj() == 0)
      return null;
    return this.jVD.d(rp(paramInt).jVK, paramView);
  }

  public final boolean areAllItemsEnabled()
  {
    return false;
  }

  protected final void bbk()
  {
    this.mCount = 0;
    int i = this.jVD.bbj();
    int j = 0;
    if (i == 0)
      this.mCount = this.jVD.getCount();
    while (true)
    {
      return;
      while (j < i)
      {
        this.mCount += this.jVD.rm(j) + this.eDG;
        j++;
      }
    }
  }

  public final int getCount()
  {
    this.mCount = 0;
    int i = this.jVD.bbj();
    int j = 0;
    if (i == 0)
      return this.jVD.getCount();
    while (j < i)
    {
      this.mCount += this.jVD.rm(j) + ro(j) + this.eDG;
      j++;
    }
    return this.mCount;
  }

  public final Object getItem(int paramInt)
  {
    g localg = rp(paramInt);
    if ((localg.iy == -1) || (localg.iy == -2))
      return null;
    return this.jVD.getItem(localg.iy);
  }

  public final long getItemId(int paramInt)
  {
    g localg = rp(paramInt);
    if (localg.iy == -2)
      return -1L;
    if (localg.iy == -1)
      return -2L;
    return this.jVD.getItemId(localg.iy);
  }

  public final int getItemViewType(int paramInt)
  {
    g localg = rp(paramInt);
    int i;
    if (localg.iy == -2)
      i = 1;
    do
    {
      return i;
      if (localg.iy == -1)
        return 0;
      i = this.jVD.getItemViewType(localg.iy);
    }
    while (i == -1);
    return i + 2;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    h localh;
    View localView1;
    if ((paramView instanceof h))
    {
      localh = (h)paramView;
      localView1 = localh.getChildAt(0);
    }
    while (true)
    {
      g localg = rp(paramInt);
      Object localObject;
      if (localg.iy == -2)
      {
        localObject = new f(this, this.mContext);
        ((f)localObject).rr(this.jVE.getWidth());
        ((f)localObject).rq(localg.jVK);
        View localView2 = (View)((View)localObject).getTag();
        ((View)localObject).setTag(this.jVD.d(localg.jVK, localView2));
      }
      while (true)
      {
        if (localh == null)
          localh = new h(this, this.mContext);
        localh.removeAllViews();
        localh.addView((View)localObject);
        localh.w(paramInt);
        localh.setNumColumns(this.eDG);
        this.jVG[(paramInt % this.eDG)] = localh;
        if (paramInt % this.eDG != 0)
          break label290;
        jVC = true;
        for (int i = 1; i < this.jVG.length; i++)
          this.jVG[i] = getView(paramInt + i, null, paramViewGroup);
        if (localg.iy == -1)
        {
          e locale = (e)localView1;
          if (locale == null)
            locale = new e(this, this.mContext);
          localObject = locale;
        }
        else
        {
          localObject = this.jVD.getView(localg.iy, localView1, paramViewGroup);
        }
      }
      jVC = false;
      label290: localh.a(this.jVG);
      if ((!jVC) && ((paramInt % this.eDG == -1 + this.eDG) || (paramInt == -1 + getCount())))
        rn(this.eDG);
      return localh;
      localView1 = paramView;
      localh = null;
    }
  }

  public final int getViewTypeCount()
  {
    return 2 + this.jVD.getViewTypeCount();
  }

  protected final long hF(int paramInt)
  {
    return rp(paramInt).jVK;
  }

  public final boolean hasStableIds()
  {
    return this.jVD.hasStableIds();
  }

  public final boolean isEmpty()
  {
    return this.jVD.isEmpty();
  }

  public final boolean isEnabled(int paramInt)
  {
    g localg = rp(paramInt);
    if ((localg.iy == -1) || (localg.iy == -2))
      return false;
    return this.jVD.isEnabled(localg.iy);
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.jVD.registerDataSetObserver(paramDataSetObserver);
  }

  protected final g rp(int paramInt)
  {
    int i = 0;
    int j = this.jVD.bbj();
    if (j == 0)
    {
      if (paramInt >= this.jVD.getCount())
        return new g(this, -1, 0);
      return new g(this, paramInt, 0);
    }
    int i3;
    for (int k = paramInt; i < j; k = i3)
    {
      int m = this.jVD.rm(i);
      if (paramInt == 0)
        return new g(this, -2, i);
      int n = paramInt - this.eDG;
      if (n < 0)
        return new g(this, -1, i);
      int i1 = k - this.eDG;
      if (n < m)
        return new g(this, i1, i);
      int i2 = ro(i);
      i3 = i1 - i2;
      paramInt = n - (i2 + m);
      i++;
    }
    return new g(this, -1, i);
  }

  public final void setNumColumns(int paramInt)
  {
    this.eDG = paramInt;
    rn(paramInt);
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.jVD.unregisterDataSetObserver(paramDataSetObserver);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.c
 * JD-Core Version:    0.6.2
 */