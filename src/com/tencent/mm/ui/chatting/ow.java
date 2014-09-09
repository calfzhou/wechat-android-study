package com.tencent.mm.ui.chatting;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.ak.m;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.r;
import com.tencent.mm.ak.v;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.n;

final class ow extends ck
{
  TextView egB;
  ImageView jlS;
  TextView jlV;
  ImageView jms;
  ImageView juU;
  ImageView jvG;
  TextView jwu;
  ImageView jwv;
  ImageView jww;
  ProgressBar jwx;
  View jwy;

  public ow(int paramInt)
  {
    super(paramInt);
  }

  public static void a(ow paramow, ar paramar, boolean paramBoolean, int paramInt1, hd paramhd, int paramInt2)
  {
    q localq = v.ij(paramar.kp());
    if (localq == null)
      localq = new q();
    String str = m.AL().ic(paramar.kp());
    Bitmap localBitmap = com.tencent.mm.y.ap.yg().a(str, a.getDensity(paramhd.agh()), paramhd.agh(), paramInt2);
    paramow.juU.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
    int k;
    if (localBitmap == null)
      if (!bg.qW().isSDCardAvailable())
      {
        paramow.jlS.setImageDrawable(a.n(paramhd.agh(), h.acI));
        if (!paramBoolean)
          break label562;
        paramow.egB.setText(com.tencent.mm.platformtools.ap.Z(localq.sp()));
        paramow.jwu.setText(com.tencent.mm.platformtools.ap.eY(localq.AU()));
        k = localq.getStatus();
        if (k != 199)
          break label445;
        paramow.jvG.setImageDrawable(a.n(paramhd.agh(), h.acJ));
        paramow.egB.setVisibility(4);
        label184: if (k != 112)
          break label474;
        paramow.jww.setVisibility(0);
        paramow.jwv.setVisibility(8);
        paramow.jwx.setVisibility(0);
        paramow.jwx.setProgress(v.e(localq));
        z.v("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "status begin");
        paramow.jwx.invalidate();
      }
    label562: 
    while (true)
    {
      paramow.jww.setTag(new ms(paramar, paramhd.iWI, paramInt1, paramar.kt(), 4, (byte)0));
      paramow.jww.setOnClickListener(paramhd.joh.jqc);
      paramow.jwv.setTag(new ms(paramar, paramhd.iWI, paramInt1, paramar.kt(), 3, (byte)0));
      paramow.jwv.setOnClickListener(paramhd.joh.jqc);
      paramow.joC.setTag(new ms(paramar, paramhd.iWI, paramInt1, paramar.kt(), 2, (byte)0));
      paramow.joC.setOnClickListener(paramhd.joh.jqc);
      paramow.joC.setOnLongClickListener(paramhd.joh.jqe);
      return;
      paramow.jlS.setImageDrawable(a.n(paramhd.agh(), h.Uy));
      break;
      paramow.jlS.setImageBitmap(localBitmap);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(localBitmap.getWidth(), localBitmap.getHeight());
      paramow.juU.setLayoutParams(localLayoutParams);
      break;
      label445: paramow.jvG.setImageDrawable(a.n(paramhd.agh(), h.acG));
      paramow.egB.setVisibility(0);
      break label184;
      label474: if ((k == 113) || (k == 198))
      {
        paramow.jwv.setVisibility(0);
        paramow.jww.setVisibility(8);
        paramow.jwx.setVisibility(8);
        z.v("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "status pause");
      }
      else
      {
        paramow.jww.setVisibility(8);
        paramow.jwv.setVisibility(8);
        paramow.jwx.setVisibility(8);
        z.v("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "status gone");
        continue;
        paramow.egB.setText(com.tencent.mm.platformtools.ap.Z(localq.sp()));
        paramow.jwu.setText(com.tencent.mm.platformtools.ap.eY(localq.AU()));
        int i = localq.getStatus();
        paramow.jvG.setImageDrawable(a.n(paramhd.agh(), h.acJ));
        if ((i == 104) || (i == 103))
        {
          paramow.jww.setVisibility(0);
          paramow.jwv.setVisibility(8);
          paramow.jwx.setVisibility(0);
          ProgressBar localProgressBar = paramow.jwx;
          if (localq.sp() == 0);
          for (int j = 0; ; j = 100 * localq.AO() / localq.sp())
          {
            localProgressBar.setProgress(j);
            z.v("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "status begin");
            break;
            z.d("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "cdntra getUploadProgress :" + localq.AO() + " " + localq.sp());
          }
        }
        if ((i == 105) || (i == 198))
        {
          paramow.jwv.setVisibility(0);
          paramow.jww.setVisibility(8);
          paramow.jwx.setVisibility(8);
          z.v("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "status pause");
        }
        else
        {
          paramow.jww.setVisibility(8);
          paramow.jwv.setVisibility(8);
          paramow.jwx.setVisibility(8);
          z.v("!32@/B4Tb64lLpJM/Lh7GYoyAX5LS2Mvf7Yr", "status gone");
        }
      }
    }
  }

  public final ck e(View paramView, boolean paramBoolean)
  {
    super.ay(paramView);
    this.eTC = ((TextView)paramView.findViewById(i.amj));
    this.jlS = ((ImageView)paramView.findViewById(i.alq));
    this.joA = ((TextView)paramView.findViewById(i.amp));
    this.egB = ((TextView)paramView.findViewById(i.amc));
    this.jwu = ((TextView)paramView.findViewById(i.alH));
    this.jvG = ((ImageView)paramView.findViewById(i.amg));
    this.jwv = ((ImageView)paramView.findViewById(i.alu));
    this.jww = ((ImageView)paramView.findViewById(i.ami));
    this.jwx = ((ProgressBar)paramView.findViewById(i.alv));
    this.jwy = paramView.findViewById(i.amr);
    this.joC = paramView.findViewById(i.all);
    int i;
    if (paramBoolean)
    {
      i = 10;
      this.type = i;
      this.jlV = ((TextView)paramView.findViewById(i.akP));
      this.eWo = ((CheckBox)paramView.findViewById(i.alk));
      this.gzU = paramView.findViewById(i.alP);
      this.juU = ((ImageView)paramView.findViewById(i.als));
      if (paramBoolean)
        break label248;
    }
    label248: for (ImageView localImageView = (ImageView)paramView.findViewById(i.amh); ; localImageView = null)
    {
      this.jms = localImageView;
      return this;
      i = 11;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ow
 * JD-Core Version:    0.6.2
 */