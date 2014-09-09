package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class q extends BaseAdapter
{
  private q(GetHdHeadImageGalleryView paramGetHdHeadImageGalleryView)
  {
  }

  public final int getCount()
  {
    return 1;
  }

  public final Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    r localr1;
    if (paramView == null)
    {
      localr1 = new r(this);
      paramView = View.inflate(this.hys.getContext(), k.bpa, null);
      localr1.faR = ((ProgressBar)paramView.findViewById(i.axk));
      localr1.cKf = ((ImageView)paramView.findViewById(i.axj));
      localr1.hyt = paramView.findViewById(i.axl);
      paramView.setTag(localr1);
    }
    for (r localr2 = localr1; ; localr2 = (r)paramView.getTag())
    {
      paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
      if (GetHdHeadImageGalleryView.d(this.hys) == null)
        break;
      localr2.faR.setVisibility(8);
      localr2.cKf.setVisibility(8);
      localr2.hyt.setVisibility(8);
      MultiTouchImageView localMultiTouchImageView = new MultiTouchImageView(this.hys.getContext(), GetHdHeadImageGalleryView.d(this.hys).getWidth(), GetHdHeadImageGalleryView.d(this.hys).getHeight());
      localMultiTouchImageView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
      localMultiTouchImageView.setImageBitmap(GetHdHeadImageGalleryView.d(this.hys));
      localMultiTouchImageView.ab(2.0F);
      localMultiTouchImageView.aTe();
      return localMultiTouchImageView;
    }
    localr2.faR.setVisibility(0);
    localr2.hyt.setVisibility(0);
    if (GetHdHeadImageGalleryView.e(this.hys) != null)
    {
      localr2.cKf.setVisibility(0);
      localr2.cKf.setImageBitmap(GetHdHeadImageGalleryView.e(this.hys));
      return paramView;
    }
    localr2.cKf.setVisibility(8);
    return paramView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.q
 * JD-Core Version:    0.6.2
 */