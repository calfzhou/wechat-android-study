package com.tencent.mm.ui.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.mm.ae.b;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.cb;
import java.util.ArrayList;

public final class f extends cb
{
  private ArrayList iRz = new ArrayList();
  private b iWt = null;

  public f(Context paramContext)
  {
    super(paramContext, null);
    DX();
  }

  public final void DW()
  {
    this.iRz.clear();
    if (this.iWt == null)
      return;
    ad localad = new ad(this.iWt);
    this.iRz.add(localad);
    notifyDataSetChanged();
  }

  protected final void DX()
  {
    DW();
  }

  public final void a(b paramb)
  {
    this.iWt = paramb;
  }

  public final int getCount()
  {
    return this.iRz.size();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ad localad = (ad)this.iRz.get(paramInt);
    ap localap2;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, k.baI, null);
      localap2 = new ap();
      localap2.iXd = paramView;
      localap2.iXe = ((Button)paramView.findViewById(i.aes));
      paramView.setTag(localap2);
    }
    for (ap localap1 = localap2; ; localap1 = (ap)paramView.getTag())
    {
      if (localad.a(localap1) != 0)
        paramView = null;
      return paramView;
    }
  }

  public final ad pi(int paramInt)
  {
    return (ad)this.iRz.get(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.f
 * JD-Core Version:    0.6.2
 */