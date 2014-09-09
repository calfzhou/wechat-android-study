package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.platformtools.s;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class gv extends BaseAdapter
{
  String imagePath;

  public final int getCount()
  {
    return 1;
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Bitmap localBitmap = s.jA(this.imagePath);
    if (localBitmap == null)
    {
      z.w("!32@/B4Tb64lLpL/S4mvETx9l9B/T4NcFgMX", "get image fail");
      if ((paramView == null) || ((paramView instanceof MultiTouchImageView)))
        paramView = View.inflate(paramViewGroup.getContext(), k.bns, null);
      ((ImageView)paramView.findViewById(i.ayb)).setImageResource(h.UB);
      paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
      return paramView;
    }
    Context localContext = paramViewGroup.getContext();
    MultiTouchImageView localMultiTouchImageView;
    if ((paramView == null) || (!(paramView instanceof MultiTouchImageView)))
      localMultiTouchImageView = new MultiTouchImageView(localContext, localBitmap.getWidth(), localBitmap.getHeight());
    while (true)
    {
      localMultiTouchImageView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
      localMultiTouchImageView.setImageBitmap(localBitmap);
      localMultiTouchImageView.aTe();
      return localMultiTouchImageView;
      localMultiTouchImageView = (MultiTouchImageView)paramView;
      localMultiTouchImageView.bh(localBitmap.getWidth(), localBitmap.getHeight());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gv
 * JD-Core Version:    0.6.2
 */