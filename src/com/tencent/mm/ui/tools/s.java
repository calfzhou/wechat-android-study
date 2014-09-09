package com.tencent.mm.ui.tools;

import android.view.View;
import com.tencent.mm.storage.ar;

public abstract class s
{
  protected bt jOZ;

  public s(bt parambt)
  {
    this.jOZ = parambt;
  }

  public boolean a(dp paramdp, ar paramar, int paramInt)
  {
    return false;
  }

  public void detach()
  {
    this.jOZ = null;
  }

  public final dp qM(int paramInt)
  {
    View localView = this.jOZ.pL(paramInt);
    if (localView == null)
      return null;
    return (dp)((View)localView).getTag();
  }

  public final void qN(int paramInt)
  {
    View localView = this.jOZ.pL(paramInt);
    if ((localView != null) && (localView.getTag() != null))
      a((dp)localView.getTag(), this.jOZ.qP(paramInt), paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.s
 * JD-Core Version:    0.6.2
 */