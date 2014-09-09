package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import com.tencent.mm.sdk.platformtools.z;

public final class MMGridPaperGridView extends GridView
{
  private int iZK;
  private int iZL;
  private int iZM;
  private int iZN = -1;
  private boolean iZO = false;
  private bq iZP;
  private bm iZQ;
  private AdapterView.OnItemClickListener iZR = new bo(this);
  private AdapterView.OnItemLongClickListener iZS = new bp(this);
  private int mCount;
  private int mIndex;

  public MMGridPaperGridView(Context paramContext)
  {
    super(paramContext);
  }

  public MMGridPaperGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MMGridPaperGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, bm parambm)
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[bool] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    if (parambm == null);
    while (true)
    {
      arrayOfObject[3] = Boolean.valueOf(bool);
      z.i("!44@/B4Tb64lLpJ3ysDJ3BtNKWRcjd4fCZrJmrjyp4tQ6Cg=", "index[%d], rows[%d], columns[%d], adapter is null[%B]", arrayOfObject);
      this.mIndex = paramInt1;
      this.iZK = paramInt2;
      this.iZL = paramInt3;
      this.iZQ = parambm;
      this.mCount = (this.iZK * this.iZL);
      this.iZM = (this.mIndex * this.mCount);
      if ((this.iZQ != null) && (this.iZQ.getCount() - this.iZM < this.mCount))
        this.mCount = (this.iZQ.getCount() - this.iZM);
      if (getAdapter() == null)
      {
        z.w("!44@/B4Tb64lLpJ3ysDJ3BtNKWRcjd4fCZrJmrjyp4tQ6Cg=", "get adapter null, new one");
        this.iZP = new bq(this, (byte)0);
        setAdapter(this.iZP);
      }
      setNumColumns(this.iZL);
      setColumnWidth(3);
      setOnItemClickListener(this.iZR);
      setOnItemLongClickListener(this.iZS);
      return;
      bool = false;
    }
  }

  public final int getIndex()
  {
    return this.mIndex;
  }

  public final void notifyDataSetChanged()
  {
    if (this.iZP != null)
      this.iZP.notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMGridPaperGridView
 * JD-Core Version:    0.6.2
 */