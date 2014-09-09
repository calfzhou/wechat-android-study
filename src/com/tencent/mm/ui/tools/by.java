package com.tencent.mm.ui.tools;

import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.tools.a.ad;
import com.tencent.mm.ui.tools.a.u;
import java.util.ArrayList;
import java.util.List;

public final class by extends BaseAdapter
{
  private LayoutInflater gJ;
  private boolean hMJ;
  private List jRi;
  private final ImageGalleryGridUI jRj;

  public by(ImageGalleryGridUI paramImageGalleryGridUI, List paramList)
  {
    this.jRi = paramList;
    this.hMJ = bg.qW().isSDCardAvailable();
    this.gJ = LayoutInflater.from(paramImageGalleryGridUI);
    this.jRj = paramImageGalleryGridUI;
  }

  public final boolean areAllItemsEnabled()
  {
    return false;
  }

  public final int getCount()
  {
    return this.jRi.size();
  }

  public final Object getItem(int paramInt)
  {
    if ((this.jRi == null) || (paramInt < 0) || (paramInt >= this.jRi.size()))
      return null;
    return this.jRi.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    cb localcb;
    Object localObject;
    if (paramView == null)
    {
      paramView = this.gJ.inflate(k.bgH, paramViewGroup, false);
      localcb = new cb();
      localcb.grk = ((ImageView)paramView.findViewById(i.awR));
      localcb.jRn = paramView.findViewById(i.aVm);
      localcb.jRn.setVisibility(8);
      localcb.hyt = paramView.findViewById(i.bUx);
      paramView.setTag(localcb);
      localObject = getItem(paramInt);
      if (localObject != null)
        break label107;
    }
    label107: 
    while (((localObject instanceof CharSequence)) || (!(localObject instanceof ar)))
    {
      return paramView;
      localcb = (cb)paramView.getTag();
      break;
    }
    if (this.hMJ)
    {
      if (!(this.jRj instanceof ImageGalleryGridUI))
        throw new IllegalArgumentException("the context should be ImageGalleryGridUI");
      ar localar = (ar)localObject;
      ey localey = new ey(localar, String.valueOf(localar.kk()));
      ImageGalleryGridUI localImageGalleryGridUI = this.jRj;
      if (localImageGalleryGridUI.bal().contains(Integer.valueOf(paramInt)))
        if (localImageGalleryGridUI.jRo == paramInt)
        {
          if (Build.VERSION.SDK_INT >= 11)
          {
            localcb.hyt.setAlpha(0.5F);
            localcb.hyt.setVisibility(0);
          }
          u.cG(this.jRj);
          u.a(localey).bbD().bbG().bbF().rv(h.Xv).a(localcb.grk, new bz(this, localImageGalleryGridUI, localcb));
        }
      while (bt.ad(localar))
      {
        localcb.jRn.setVisibility(0);
        return paramView;
        u.cG(this.jRj);
        u.a(localey).bbD().bbG().bbF().rv(h.Xv).d(localcb.grk);
        continue;
        if (localImageGalleryGridUI.jRo == paramInt)
        {
          if (Build.VERSION.SDK_INT >= 11)
          {
            localcb.hyt.setAlpha(0.5F);
            localcb.hyt.setVisibility(0);
          }
          u.cG(this.jRj);
          u.a(localey).bbD().bbF().rv(h.Xv).a(localcb.grk, new ca(this, localImageGalleryGridUI, localcb));
        }
        else
        {
          u.cG(this.jRj);
          u.a(localey).bbD().bbF().rv(h.Xv).d(localcb.grk);
        }
      }
      localcb.jRn.setVisibility(8);
      return paramView;
    }
    u.cG(this.jRj);
    u.ru(h.Xs).bbD().bbF().d(localcb.grk);
    return paramView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.by
 * JD-Core Version:    0.6.2
 */