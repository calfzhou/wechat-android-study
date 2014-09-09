package com.tencent.mm.ui.base;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

final class bq extends BaseAdapter
{
  private bq(MMGridPaperGridView paramMMGridPaperGridView)
  {
  }

  public final int getCount()
  {
    if ((MMGridPaperGridView.c(this.iZT) < 0) || (MMGridPaperGridView.a(this.iZT) == null))
      return 0;
    return MMGridPaperGridView.c(this.iZT);
  }

  public final Object getItem(int paramInt)
  {
    if (MMGridPaperGridView.a(this.iZT) == null)
      return null;
    return MMGridPaperGridView.a(this.iZT).getItem(paramInt + MMGridPaperGridView.b(this.iZT));
  }

  public final long getItemId(int paramInt)
  {
    if (MMGridPaperGridView.a(this.iZT) == null)
      return 0L;
    return MMGridPaperGridView.a(this.iZT).getItemId(paramInt + MMGridPaperGridView.b(this.iZT));
  }

  public final int getItemViewType(int paramInt)
  {
    if (MMGridPaperGridView.a(this.iZT) == null)
      return 0;
    MMGridPaperGridView.a(this.iZT);
    MMGridPaperGridView.b(this.iZT);
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    long l = ch.CN();
    Object[] arrayOfObject1 = new Object[5];
    arrayOfObject1[0] = Integer.valueOf(MMGridPaperGridView.d(this.iZT));
    arrayOfObject1[1] = Integer.valueOf(paramInt);
    boolean bool1;
    View localView;
    label105: boolean bool2;
    if (paramView == null)
    {
      bool1 = true;
      arrayOfObject1[2] = Boolean.valueOf(bool1);
      arrayOfObject1[3] = paramViewGroup.toString();
      arrayOfObject1[4] = Boolean.valueOf(MMGridPaperGridView.e(this.iZT));
      z.v("!44@/B4Tb64lLpJ3ysDJ3BtNKWRcjd4fCZrJmrjyp4tQ6Cg=", "getView:index[%d], pos[%d], converrView is null[%B], parent is [%s], mClearMode[%B]", arrayOfObject1);
      if (MMGridPaperGridView.e(this.iZT))
        paramView = null;
      if (MMGridPaperGridView.a(this.iZT) != null)
        break label220;
      localView = null;
      if (localView == null)
        break label245;
      bool2 = true;
      label113: Assert.assertTrue(bool2);
      if ((-1 == MMGridPaperGridView.f(this.iZT)) || (paramInt + MMGridPaperGridView.b(this.iZT) != MMGridPaperGridView.f(this.iZT)))
        break label251;
      localView.setVisibility(4);
    }
    while (true)
    {
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Long.valueOf(ch.ad(l));
      arrayOfObject2[1] = Integer.valueOf(MMGridPaperGridView.f(this.iZT));
      arrayOfObject2[2] = Integer.valueOf(paramInt + MMGridPaperGridView.b(this.iZT));
      z.v("!44@/B4Tb64lLpJ3ysDJ3BtNKWRcjd4fCZrJmrjyp4tQ6Cg=", "get View ok: use %d ms, hidden index[%d], cur global index[%d]", arrayOfObject2);
      return localView;
      bool1 = false;
      break;
      label220: localView = MMGridPaperGridView.a(this.iZT).f(paramInt + MMGridPaperGridView.b(this.iZT), paramView);
      break label105;
      label245: bool2 = false;
      break label113;
      label251: localView.setVisibility(0);
    }
  }

  public final int getViewTypeCount()
  {
    if (MMGridPaperGridView.a(this.iZT) == null)
      return 1;
    MMGridPaperGridView.a(this.iZT);
    return 1;
  }

  public final boolean isEnabled(int paramInt)
  {
    if (MMGridPaperGridView.a(this.iZT) == null)
      return false;
    MMGridPaperGridView.a(this.iZT);
    MMGridPaperGridView.b(this.iZT);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bq
 * JD-Core Version:    0.6.2
 */