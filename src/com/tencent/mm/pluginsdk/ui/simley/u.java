package com.tencent.mm.pluginsdk.ui.simley;

import android.content.Context;
import android.view.View;
import com.tencent.mm.aq.a;
import com.tencent.mm.k;
import com.tencent.mm.pluginsdk.ui.SmileyGrid;
import com.tencent.mm.pluginsdk.ui.SmileySubGrid;
import com.tencent.mm.sdk.platformtools.z;

public final class u
{
  private t hJL;
  private SmileyGrid hJM;
  private Context mContext;
  private int mIndex;

  public final void a(t paramt)
  {
    this.hJL = paramt;
  }

  public final SmileyGrid aEN()
  {
    return this.hJM;
  }

  public final boolean aEO()
  {
    if ((this.mContext == null) || (this.hJL == null))
      return false;
    try
    {
      int i = k.bny;
      if (this.hJL.aDu())
        i = k.bnw;
      View localView = View.inflate(this.mContext, i, null);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.hJL.JS();
      arrayOfObject[1] = Integer.valueOf(this.mIndex);
      z.d("!64@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0SGvdmwO2++pq6S+hpcF1j8zx8FuE9OrH", "initView productId: %s, index: %d", arrayOfObject);
      this.hJM = ((SmileyGrid)localView.findViewById(com.tencent.mm.i.aQv));
      this.hJM.s(this.hJL.aDr().aDS(), this.hJL.aDr().aDT());
      this.hJM.a(this.hJL.getType(), this.mIndex, this.hJL.aDs(), this.hJL.aDv(), this.hJL.aDw(), this.hJL.aDx(), this.hJL.JS());
      this.hJM.a(this.hJL.aDy());
      this.hJM.a(this.hJL.aDA());
      if ((!this.hJL.aDu()) && ((this.hJM instanceof SmileySubGrid)))
        ((SmileySubGrid)this.hJM).ab(this.hJL.aDz());
      SmileyGrid localSmileyGrid = this.hJM;
      int j = this.hJL.aDB();
      if (j > 0)
      {
        localSmileyGrid.setPadding(a.fromDPToPix(localSmileyGrid.getContext(), 6), j, a.fromDPToPix(localSmileyGrid.getContext(), 6), 0);
        localSmileyGrid.setVerticalSpacing(j / 2);
      }
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public final void setContext(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final void setIndex(int paramInt)
  {
    this.mIndex = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.simley.u
 * JD-Core Version:    0.6.2
 */