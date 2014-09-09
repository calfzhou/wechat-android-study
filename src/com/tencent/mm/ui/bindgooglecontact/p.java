package com.tencent.mm.ui.bindgooglecontact;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.f;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.n;
import com.tencent.mm.n.c;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.cb;

public final class p extends cb
{
  private LayoutInflater ekY;
  private String jic;
  private q jiy;
  private String jiz;
  private Context mContext;

  public p(Context paramContext, String paramString)
  {
    super(paramContext, new ad());
    this.jic = paramString;
    this.mContext = paramContext;
    this.ekY = LayoutInflater.from(this.mContext);
  }

  public final void DW()
  {
    setCursor(az.xh().P(this.jiz, this.jic));
    super.notifyDataSetChanged();
  }

  protected final void DX()
  {
    DW();
  }

  public final void a(q paramq)
  {
    this.jiy = paramq;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    r localr1;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = this.ekY.inflate(k.bgu, null);
      localr1 = new r(this, paramView);
      paramView.setTag(localr1);
    }
    ad localad;
    for (r localr2 = localr1; ; localr2 = (r)paramView.getTag())
    {
      localad = (ad)getItem(paramInt);
      if (localad != null)
        break;
      return paramView;
    }
    localr2.position = paramInt;
    localr2.hlo = localad.field_googlegmail;
    switch (localad.field_status)
    {
    default:
      if (TextUtils.isEmpty(localad.field_googlename))
      {
        localr2.dYV.setText(ch.xE(localad.field_googlegmail));
        switch (localad.field_status)
        {
        default:
          switch (localad.field_googlecgistatus)
          {
          default:
            localr2.jiA.setText(localad.field_googlegmail);
            return paramView;
          case 0:
          case 1:
          case 2:
          }
          break;
        case 0:
        case 1:
        case 2:
        }
      }
      break;
    case 0:
    case 2:
      label147: label180: label212: if (localad.field_small_url == null);
      break;
    case 1:
    }
    for (Bitmap localBitmap2 = c.a(localad.field_username, false, -1); ; localBitmap2 = null)
    {
      if (localBitmap2 == null)
      {
        localr2.dXf.setImageDrawable(a.n(this.mContext, h.WL));
        break;
      }
      localr2.dXf.setImageBitmap(localBitmap2);
      break;
      Bitmap localBitmap1 = c.eE(localad.field_googleid);
      if (localBitmap1 == null)
      {
        localr2.dXf.setImageDrawable(a.n(this.mContext, h.WL));
        break;
      }
      localr2.dXf.setImageBitmap(localBitmap1);
      break;
      localr2.dYV.setText(localad.field_googlename);
      break label147;
      localr2.jiB.setClickable(true);
      localr2.jiB.setBackgroundResource(h.SZ);
      localr2.fFM.setText(n.bMK);
      localr2.fFM.setTextColor(this.mContext.getResources().getColor(f.white));
      break label180;
      localr2.jiB.setClickable(true);
      localr2.jiB.setBackgroundResource(h.Ta);
      localr2.fFM.setText(n.bMS);
      localr2.fFM.setTextColor(this.mContext.getResources().getColor(f.On));
      break label180;
      localr2.jiB.setClickable(false);
      localr2.jiB.setBackgroundDrawable(null);
      localr2.fFM.setText(n.bMM);
      localr2.fFM.setTextColor(this.mContext.getResources().getColor(f.On));
      break label180;
      localr2.fFM.setVisibility(4);
      localr2.jiC.setVisibility(0);
      break label212;
      localr2.jiB.setClickable(false);
      localr2.jiB.setBackgroundDrawable(null);
      localr2.fFM.setVisibility(0);
      localr2.jiC.setVisibility(8);
      localr2.fFM.setTextColor(this.mContext.getResources().getColor(f.On));
      switch (localad.field_status)
      {
      default:
        break;
      case 0:
        localr2.fFM.setText(n.bML);
        break;
      case 1:
        localr2.fFM.setText(n.bMT);
        break;
        localr2.fFM.setVisibility(0);
        localr2.jiC.setVisibility(8);
        switch (localad.field_status)
        {
        default:
          break;
        case 0:
          localr2.fFM.setText(n.bMK);
          localr2.fFM.setTextColor(this.mContext.getResources().getColor(f.white));
          break;
        case 1:
          localr2.fFM.setText(n.bMS);
          localr2.fFM.setTextColor(this.mContext.getResources().getColor(f.On));
          break;
        }
        break;
      }
    }
  }

  public final void jI(String paramString)
  {
    this.jiz = ch.iV(paramString);
    closeCursor();
    DW();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.p
 * JD-Core Version:    0.6.2
 */