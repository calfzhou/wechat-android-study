package com.tencent.mm.pluginsdk.ui.simley;

import android.support.v4.view.an;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.pluginsdk.ui.SmileyGrid;
import com.tencent.mm.pluginsdk.ui.bb;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.SoftReference;

public final class r extends an
{
  private final String TAG = "!64@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0SGvdmwO2++q4dTPr74yTErfz7EPUuQJc";
  i hIA;
  private boolean hJF;
  private SparseArray hJG = new SparseArray();
  private volatile boolean hJH = false;
  private int mCount;

  public r(i parami)
  {
    this.hIA = parami;
  }

  public final void KE()
  {
    z.d("!64@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0SGvdmwO2++q4dTPr74yTErfz7EPUuQJc", "refresh data");
    this.mCount = this.hIA.aEj();
  }

  public final Object a(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.hJF)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramInt);
      z.v("!64@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0SGvdmwO2++q4dTPr74yTErfz7EPUuQJc", "get item: %d pass---- --- ", arrayOfObject3);
      return null;
    }
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    z.v("!64@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0SGvdmwO2++q4dTPr74yTErfz7EPUuQJc", "get item: %d", arrayOfObject1);
    if (this.hJG.get(paramInt) != null);
    for (SmileyGrid localSmileyGrid1 = (SmileyGrid)((SoftReference)this.hJG.get(paramInt)).get(); ; localSmileyGrid1 = null)
    {
      if (localSmileyGrid1 == null)
      {
        long l1 = System.currentTimeMillis();
        SmileyGrid localSmileyGrid2 = (SmileyGrid)this.hIA.ng(paramInt);
        paramViewGroup.addView(localSmileyGrid2, 0);
        this.hJG.put(paramInt, new SoftReference(localSmileyGrid2));
        long l2 = System.currentTimeMillis();
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(paramInt);
        arrayOfObject2[1] = Long.valueOf(l2 - l1);
        z.d("!64@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0SGvdmwO2++q4dTPr74yTErfz7EPUuQJc", "instance one item : %d, expense Time: %d", arrayOfObject2);
        return localSmileyGrid2;
      }
      if (localSmileyGrid1.getParent() != null)
        ((ViewGroup)localSmileyGrid1.getParent()).removeView(localSmileyGrid1);
      paramViewGroup.addView(localSmileyGrid1, 0);
      return localSmileyGrid1;
    }
  }

  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.v("!64@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0SGvdmwO2++q4dTPr74yTErfz7EPUuQJc", "destroy item: %d", arrayOfObject);
    paramViewGroup.removeView((View)paramObject);
  }

  public final boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }

  public final void aEM()
  {
    z.d("!64@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0SGvdmwO2++q4dTPr74yTErfz7EPUuQJc", "deep notify data change!");
    clear();
    KE();
    this.hJH = true;
    super.notifyDataSetChanged();
    this.hJH = false;
  }

  public final int b(Object paramObject)
  {
    if (this.hJH)
    {
      z.d("!64@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0SGvdmwO2++q4dTPr74yTErfz7EPUuQJc", "getItemposition always changed");
      return -2;
    }
    return super.b(paramObject);
  }

  public final void clear()
  {
    z.v("!64@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0SGvdmwO2++q4dTPr74yTErfz7EPUuQJc", "clear adapter all grid view cache .. ");
    if ((this.hJG == null) || (this.hJG.size() <= 0))
    {
      this.hJG.clear();
      return;
    }
    int i = 0;
    label34: int j;
    if (i < this.hJG.size())
    {
      j = this.hJG.keyAt(i);
      if (this.hJG.get(j) != null)
        break label81;
    }
    label81: for (SmileyGrid localSmileyGrid = null; ; localSmileyGrid = (SmileyGrid)((SoftReference)this.hJG.get(j)).get())
    {
      if (localSmileyGrid != null)
        localSmileyGrid.release();
      i++;
      break label34;
      break;
    }
  }

  public final void dX(boolean paramBoolean)
  {
    this.hJF = paramBoolean;
  }

  public final void e(bb parambb)
  {
    if ((this.hJG == null) || (this.hJG.size() <= 0))
      return;
    int i = 0;
    label20: int j;
    if (i < this.hJG.size())
    {
      j = this.hJG.keyAt(i);
      if (this.hJG.get(j) != null)
        break label71;
    }
    label71: for (SmileyGrid localSmileyGrid = null; ; localSmileyGrid = (SmileyGrid)((SoftReference)this.hJG.get(j)).get())
    {
      if (localSmileyGrid != null)
        localSmileyGrid.a(parambb);
      i++;
      break label20;
      break;
    }
  }

  public final int getCount()
  {
    return this.mCount;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.simley.r
 * JD-Core Version:    0.6.2
 */