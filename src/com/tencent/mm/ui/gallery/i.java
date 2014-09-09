package com.tencent.mm.ui.gallery;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import com.tencent.mm.aq.a;
import com.tencent.mm.k;
import com.tencent.mm.model.aa;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.platformtools.b;
import com.tencent.mm.platformtools.o;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MultiTouchImageView;
import java.util.List;

final class i extends BaseAdapter
{
  public i(GestureGalleryUI paramGestureGalleryUI)
  {
  }

  public final int getCount()
  {
    z.d("!44@/B4Tb64lLpI3qghlmlMkBkqieoUTg8Us2r04Hi9+F7o=", "lstpicurl:" + GestureGalleryUI.d(this.jJI).size());
    return GestureGalleryUI.d(this.jJI).size();
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
    j localj;
    if (paramView == null)
    {
      localj = new j(this);
      paramView = View.inflate(this.jJI, k.blg, null);
      localj.faR = ((ProgressBar)paramView.findViewById(com.tencent.mm.i.aIC));
      localj.cKf = ((ImageView)paramView.findViewById(com.tencent.mm.i.axK));
      paramView.setTag(localj);
    }
    Bitmap localBitmap;
    while (true)
    {
      paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
      String str = GestureGalleryUI.f(this.jJI).d((String)GestureGalleryUI.d(this.jJI).get(paramInt), GestureGalleryUI.e(this.jJI), paramInt);
      if (ap.jb(str))
        break label262;
      localj.faR.setVisibility(8);
      localBitmap = b.c(str, a.getDensity(this.jJI.aPI()));
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        if (!o.Dx())
          break;
        localj.cKf.setVisibility(8);
        paramView = new MultiTouchImageView(this.jJI, localBitmap.getWidth(), localBitmap.getHeight());
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        paramView.setImageBitmap(localBitmap);
      }
      return paramView;
      localj = (j)paramView.getTag();
    }
    localj.cKf.setImageBitmap(localBitmap);
    localj.cKf.setVisibility(0);
    localj.cKf.setScaleType(ImageView.ScaleType.MATRIX);
    return paramView;
    label262: localj.faR.setVisibility(0);
    localj.cKf.setVisibility(8);
    return paramView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gallery.i
 * JD-Core Version:    0.6.2
 */