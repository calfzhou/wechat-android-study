package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.k;
import java.io.IOException;
import java.io.InputStream;

final class bo extends BaseAdapter
{
  private int fiZ = 0;

  bo(FilterImageView paramFilterImageView)
  {
  }

  public final void ds(int paramInt)
  {
    this.fiZ = paramInt;
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    return FilterImageView.jQx.length;
  }

  public final Object getItem(int paramInt)
  {
    return FilterImageView.jQx[paramInt];
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    br localbr = (br)getItem(paramInt);
    bp localbp2;
    if ((paramView == null) || (!(paramView.getTag() instanceof bp)))
    {
      paramView = View.inflate(FilterImageView.b(this.jQy), k.bfy, null);
      bp localbp1 = new bp(this);
      localbp1.ekU = ((TextView)paramView.findViewById(com.tencent.mm.i.atA));
      localbp1.jQz = ((ImageView)paramView.findViewById(com.tencent.mm.i.atz));
      paramView.setTag(localbp1);
      localbp2 = localbp1;
    }
    while (true)
    {
      localbp2.ekU.setText(localbr.jQF.getDisplayName());
      try
      {
        InputStream localInputStream = FilterImageView.b(this.jQy).getAssets().open("filter/" + localbr.icon);
        localbp2.jQA = com.tencent.mm.sdk.platformtools.i.decodeStream(localInputStream);
        localInputStream.close();
        localbp2.jQz.setImageBitmap(localbp2.jQA);
        label168: paramView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        if (paramInt == this.fiZ)
        {
          paramView.findViewById(com.tencent.mm.i.atz).setBackgroundResource(h.Te);
          return paramView;
          localbp2 = (bp)paramView.getTag();
          if (localbp2.jQA == null)
            continue;
          localbp2.jQA.recycle();
          continue;
        }
        paramView.findViewById(com.tencent.mm.i.atz).setBackgroundResource(h.Tf);
        return paramView;
      }
      catch (IOException localIOException)
      {
        break label168;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.bo
 * JD-Core Version:    0.6.2
 */