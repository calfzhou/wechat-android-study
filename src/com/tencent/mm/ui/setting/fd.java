package com.tencent.mm.ui.setting;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.ad.a;
import com.tencent.mm.ad.l;
import com.tencent.mm.ad.m;
import com.tencent.mm.ad.s;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.cb;

final class fd extends cb
{
  private Context context;
  private int jOk;

  public fd(SettingsSelectBgUI paramSettingsSelectBgUI, Context paramContext, int paramInt)
  {
    super(paramContext, new l());
    this.context = paramContext;
    this.jOk = paramInt;
  }

  public final void DW()
  {
    setCursor(s.yO().yK());
    super.notifyDataSetChanged();
  }

  protected final void DX()
  {
    DW();
  }

  public final int getCount()
  {
    return 2 + getCursor().getCount();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    gf localgf1;
    int i;
    a locala;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, k.bna, null);
      paramView.setLayoutParams(new AbsListView.LayoutParams(this.jOk, this.jOk));
      gf localgf2 = new gf();
      localgf2.jOv = ((LinearLayout)paramView.findViewById(com.tencent.mm.i.aNQ));
      localgf2.jOw = ((LinearLayout)paramView.findViewById(com.tencent.mm.i.aNP));
      localgf2.jOx = ((LinearLayout)paramView.findViewById(com.tencent.mm.i.aNS));
      localgf2.jOy = ((LinearLayout)paramView.findViewById(com.tencent.mm.i.aNT));
      localgf2.jOz = ((LinearLayout)paramView.findViewById(com.tencent.mm.i.aNO));
      paramView.setTag(localgf2);
      localgf1 = localgf2;
      i = ap.a((Integer)bg.qW().oQ().get(12311), -2);
      locala = s.yP().ha(SettingsSelectBgUI.f(this.jOg));
      if (paramInt != 0)
        break label291;
      if (((!SettingsSelectBgUI.c(this.jOg)) || (i != -2)) && ((SettingsSelectBgUI.c(this.jOg)) || (i != -2) || (locala != null)) && ((locala == null) || (locala.yE() != -2)))
        break label281;
      localgf1.Dj("using");
    }
    while (true)
    {
      Bitmap localBitmap4 = com.tencent.mm.sdk.platformtools.i.a(BitmapFactory.decodeResource(this.context.getResources(), h.TQ), true, 10.0F);
      ((ImageView)paramView.findViewById(com.tencent.mm.i.aNR)).setImageBitmap(localBitmap4);
      return paramView;
      localgf1 = (gf)paramView.getTag();
      break;
      label281: localgf1.Dj("downloaded");
    }
    label291: if (paramInt == 1)
    {
      if (((SettingsSelectBgUI.c(this.jOg)) && (i == 0)) || ((!SettingsSelectBgUI.c(this.jOg)) && (i == 0) && (locala == null)) || ((locala != null) && (locala.yE() == 0)))
        localgf1.Dj("using");
      while (true)
      {
        Bitmap localBitmap3 = com.tencent.mm.sdk.platformtools.i.a(BitmapFactory.decodeResource(this.context.getResources(), h.TP), true, 10.0F);
        ((ImageView)paramView.findViewById(com.tencent.mm.i.aNR)).setImageBitmap(localBitmap3);
        return paramView;
        localgf1.Dj("downloaded");
      }
    }
    l locall = (l)getItem(paramInt - 2);
    m localm = s.yO();
    if (!bg.qW().isSDCardAvailable());
    for (Bitmap localBitmap1 = BitmapFactory.decodeResource(this.jOg.getResources(), h.Xt); localBitmap1 != null; localBitmap1 = com.tencent.mm.sdk.platformtools.i.wU(localm.yL() + m.D(locall.getId(), locall.yJ())))
    {
      Bitmap localBitmap2 = com.tencent.mm.sdk.platformtools.i.a(localBitmap1, true, 10.0F);
      ((ImageView)paramView.findViewById(com.tencent.mm.i.aNR)).setImageBitmap(localBitmap2);
      switch (locall.getStatus())
      {
      default:
        return paramView;
      case 1:
        if ((SettingsSelectBgUI.c(this.jOg)) || (locala == null) || (locala.yE() == locall.getId()))
          break label655;
        localgf1.Dj("downloaded");
        return paramView;
      case 3:
      case 2:
      case 5:
      case 4:
      }
    }
    localgf1.Dj("downloading");
    return paramView;
    if ((!SettingsSelectBgUI.c(this.jOg)) && (locala != null) && (locala.yE() == locall.getId()))
    {
      localgf1.Dj("using");
      return paramView;
    }
    localgf1.Dj("downloaded");
    return paramView;
    localgf1.Dj("undownloaded");
    return paramView;
    label655: localgf1.Dj("using");
    return paramView;
    localgf1.Dj("canceling");
    return paramView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.fd
 * JD-Core Version:    0.6.2
 */