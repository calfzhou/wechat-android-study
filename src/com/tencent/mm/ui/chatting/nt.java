package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ak.m;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.r;
import com.tencent.mm.ak.v;
import com.tencent.mm.aq.a;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.pluginsdk.ui.tools.MMVideoView;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.n;

final class nt extends ck
{
  MMPinProgressBtn jvF;
  ImageView jvG;
  ShortVideoView jvH;

  public nt(int paramInt)
  {
    super(paramInt);
  }

  private static void a(MMVideoView paramMMVideoView, String paramString)
  {
    z.d("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "set thumb %s", new Object[] { paramString });
    if (!bg.qW().isSDCardAvailable())
    {
      paramMMVideoView.setImageBitmap(null);
      paramMMVideoView.setImageResource(h.Xs);
      return;
    }
    String str = m.AL().ic(paramString);
    paramMMVideoView.setImageBitmap(ap.yg().a(str, a.getDensity(paramMMVideoView.getContext()), paramMMVideoView.getContext(), -1));
  }

  public static void a(nt paramnt, ar paramar, boolean paramBoolean, int paramInt, hd paramhd)
  {
    q localq1 = v.ij(paramar.kp());
    if (localq1 == null);
    for (q localq2 = new q(); ; localq2 = localq1)
    {
      Object[] arrayOfObject1 = new Object[5];
      arrayOfObject1[0] = Integer.valueOf(paramInt);
      arrayOfObject1[1] = Integer.valueOf(localq2.getStatus());
      arrayOfObject1[2] = Integer.valueOf(localq2.AU());
      arrayOfObject1[3] = Integer.valueOf(localq2.sp());
      arrayOfObject1[4] = paramar.kp();
      z.d("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "pos %d, status %d, video length %d, total length %d, path %s", arrayOfObject1);
      ar localar = (ar)paramnt.jvH.getTag();
      if ((localar == null) || (localar.kk() != paramar.kk()))
        paramnt.jvF.setProgress(v.e(localq2));
      paramnt.jvH.setTag(paramar);
      paramnt.jvH.w(paramInt);
      paramnt.joA.setVisibility(8);
      if (paramBoolean)
      {
        String str2;
        label256: int j;
        if (paramhd.iWI)
        {
          str2 = localq2.AN();
          if ((paramhd.iWI) && (paramhd.jsq))
          {
            TextView localTextView = paramnt.joA;
            localTextView.setText(com.tencent.mm.ar.b.c(paramhd.agh(), paramhd.dh(str2), (int)paramnt.joA.getTextSize()));
            paramnt.joA.setVisibility(0);
          }
          if (!y.dP(str2))
            break label526;
          paramnt.egy.setVisibility(8);
          j = localq2.getStatus();
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(j);
          z.i("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "info recv status: %d", arrayOfObject3);
          if (j != 199)
            break label546;
          paramnt.jvG.setVisibility(8);
          paramnt.jvF.setVisibility(8);
          String str3 = m.AL().ib(paramar.kp());
          if (!paramnt.jvH.Bb().equals(str3))
            a(paramnt.jvH, paramar.kp());
          ShortVideoView localShortVideoView2 = paramnt.jvH;
          boolean bool2 = paramhd.aVq();
          paramhd.getFirstVisiblePosition();
          localShortVideoView2.N(str3, bool2);
          if (paramnt.jvH.aFe())
          {
            paramnt.jvG.setImageDrawable(a.n(paramhd.agh(), h.aTL));
            paramnt.jvG.setVisibility(0);
          }
        }
        while (true)
        {
          paramnt.egy.setTag(new ms(str2));
          paramnt.egy.setOnClickListener(paramhd.joh.jqc);
          paramnt.egy.setOnLongClickListener(paramhd.joh.jqe);
          paramnt.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 2, (byte)0));
          paramnt.joC.setOnClickListener(paramhd.joh.jqc);
          paramnt.joC.setOnLongClickListener(paramhd.joh.jqe);
          return;
          str2 = localq2.getUser();
          break;
          label526: paramnt.egy.setVisibility(0);
          cj.h(paramnt.egy, str2);
          break label256;
          label546: if (j == 112)
          {
            paramnt.jvF.setVisibility(0);
            paramnt.jvF.bcp();
            paramnt.jvG.setVisibility(8);
            a(paramnt.jvH, paramar.kp());
            paramnt.jvH.clear();
          }
          else
          {
            paramnt.jvG.setImageDrawable(a.n(paramhd.agh(), h.acG));
            paramnt.jvG.setVisibility(0);
            paramnt.jvF.setVisibility(8);
            a(paramnt.jvH, paramar.kp());
            paramnt.jvH.clear();
          }
        }
      }
      int i = localq2.getStatus();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(i);
      z.i("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "info send status: %d", arrayOfObject2);
      paramnt.jvG.setImageDrawable(a.n(paramhd.agh(), h.aTL));
      paramnt.jvG.setVisibility(0);
      if ((i == 104) || (i == 103))
      {
        paramnt.jvF.setVisibility(0);
        paramnt.jvF.bcp();
        paramnt.jvG.setVisibility(8);
        z.v("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "status begin");
      }
      while (true)
      {
        String str1 = m.AL().ib(paramar.kp());
        if (!paramnt.jvH.Bb().equals(str1))
          a(paramnt.jvH, paramar.kp());
        ShortVideoView localShortVideoView1 = paramnt.jvH;
        boolean bool1 = paramhd.aVq();
        paramhd.getFirstVisiblePosition();
        localShortVideoView1.N(str1, bool1);
        if (paramnt.jvH.aFe())
          paramnt.jvG.setVisibility(0);
        paramnt.egy.setVisibility(0);
        cj.h(paramnt.egy, paramhd.joh.dnT);
        paramnt.egy.setTag(new ms(paramhd.joh.dnT));
        paramnt.egy.setOnClickListener(paramhd.joh.jqc);
        break;
        if ((i == 105) || (i == 198))
        {
          paramnt.jvG.setVisibility(0);
          paramnt.jvF.setVisibility(8);
          z.v("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "status pause");
        }
        else
        {
          paramnt.jvG.setVisibility(8);
          paramnt.jvF.setVisibility(8);
          z.v("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "status gone");
        }
      }
    }
  }

  public final ck e(View paramView, boolean paramBoolean)
  {
    super.ay(paramView);
    this.joA = ((TextView)paramView.findViewById(i.amp));
    this.joC = paramView.findViewById(i.all);
    this.jvH = ((ShortVideoView)paramView.findViewById(i.axK));
    int i;
    ShortVideoView localShortVideoView;
    if (paramBoolean)
    {
      i = 55;
      this.type = i;
      this.eWo = ((CheckBox)paramView.findViewById(i.alk));
      this.gzU = paramView.findViewById(i.alP);
      this.jvG = ((ImageView)paramView.findViewById(i.amg));
      this.jvF = ((MMPinProgressBtn)paramView.findViewById(i.bsa));
      localShortVideoView = this.jvH;
      if (!paramBoolean)
        break label184;
    }
    label184: 
    while (true)
    {
      localShortVideoView.aFb();
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.eWo.getLayoutParams();
      localMarginLayoutParams.setMargins(0, paramView.getResources().getDimensionPixelSize(g.PB), paramView.getResources().getDimensionPixelSize(g.PO), 0);
      this.eWo.setLayoutParams(localMarginLayoutParams);
      return this;
      i = 56;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.nt
 * JD-Core Version:    0.6.2
 */