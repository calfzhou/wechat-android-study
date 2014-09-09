package com.tencent.mm.ui.bindqq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.modelfriend.av;
import com.tencent.mm.modelfriend.aw;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.n;
import com.tencent.mm.ui.cb;
import com.tencent.mm.ui.cc;

final class w extends cb
{
  public w(QQGroupUI paramQQGroupUI, Context paramContext, cc paramcc)
  {
    super(paramContext, new av());
    super.a(paramcc);
    this.context = paramContext;
  }

  public final void DW()
  {
    setCursor(az.xc().wN());
    super.notifyDataSetChanged();
  }

  protected final void DX()
  {
    DW();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    av localav = (av)getItem(paramInt);
    x localx2;
    if (paramView == null)
    {
      x localx1 = new x(this);
      paramView = View.inflate(this.context, k.bkH, null);
      localx1.dtJ = ((TextView)paramView.findViewById(i.aIR));
      localx1.jlf = ((TextView)paramView.findViewById(i.aIT));
      paramView.setTag(localx1);
      localx2 = localx1;
      localx2.dtJ.setText(localav.wM());
      if (localav.wJ() != 0)
        break label205;
      if (localav.wI() != 0)
        break label140;
      localx2.jlf.setText(n.bVX);
    }
    while (true)
    {
      localx2.jlf.setVisibility(8);
      return paramView;
      localx2 = (x)paramView.getTag();
      break;
      label140: TextView localTextView2 = localx2.jlf;
      QQGroupUI localQQGroupUI2 = this.jld;
      int j = n.aIT;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(localav.wI());
      arrayOfObject2[1] = Integer.valueOf(localav.wJ());
      localTextView2.setText(localQQGroupUI2.getString(j, arrayOfObject2));
      continue;
      label205: TextView localTextView1 = localx2.jlf;
      QQGroupUI localQQGroupUI1 = this.jld;
      int i = n.aIT;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(localav.wI());
      arrayOfObject1[1] = Integer.valueOf(localav.wJ());
      localTextView1.setText(localQQGroupUI1.getString(i, arrayOfObject1));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.w
 * JD-Core Version:    0.6.2
 */