package com.tencent.mm.ui.transmit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.n;

final class an extends BaseAdapter
{
  public ao[] jYP;

  an(ShareImageSelectorUI paramShareImageSelectorUI)
  {
    ao[] arrayOfao = new ao[3];
    arrayOfao[0] = new ao(this, n.bDY, h.aaE);
    arrayOfao[1] = new ao(this, n.bDZ, h.Vi);
    arrayOfao[2] = new ao(this, n.bDX, h.WY);
    this.jYP = arrayOfao;
  }

  public final int getCount()
  {
    return 3;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView == null) || (paramView.getTag() == null))
      paramView = LayoutInflater.from(this.jYO.aPI()).inflate(k.bnm, null);
    for (ap localap = new ap(this.jYO, paramView); ; localap = (ap)paramView.getTag())
    {
      ao localao = this.jYP[paramInt];
      if (localao != null)
      {
        localap.jYT.setText(localao.jYQ);
        localap.eyY.setImageResource(localao.jYR);
      }
      return paramView;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.an
 * JD-Core Version:    0.6.2
 */