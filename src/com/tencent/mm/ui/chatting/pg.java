package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.b;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.g;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.AnimImageView;

final class pg extends ck
{
  TextView jlV;
  ImageView jms;
  TextView jpB;
  TextView jwF;
  TextView jwG;
  AnimImageView jwH;
  FrameLayout jwI;
  FrameLayout jwJ;
  ImageView jwK;
  AnimImageView jwM;
  ProgressBar jwN;
  TextView jwO;
  Animation jwP;

  public pg(int paramInt)
  {
    super(paramInt);
  }

  private static void a(pg parampg, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    parampg.jmh.setVisibility(paramInt2);
    parampg.jpB.setVisibility(paramInt2);
    parampg.jwI.setVisibility(paramInt2);
    if (paramBoolean)
    {
      parampg.jwM.setVisibility(paramInt1);
      parampg.jlV.setVisibility(paramInt2);
      return;
    }
    parampg.jwO.setVisibility(paramInt1);
  }

  public static void a(pg parampg, ar paramar, int paramInt, hd paramhd, boolean paramBoolean)
  {
    if (parampg == null)
      return;
    bp localbp = new bp(paramar.getContent());
    float f1 = (float)localbp.getTime() / 1000.0F;
    if (f1 < 1.0F)
      f1 = 1.0F;
    float f2 = Math.round(f1 * 10.0F) / 10.0F;
    label213: float f3;
    if (paramar.kk() == paramhd.joh.joi.aUu())
    {
      parampg.jwH.setVisibility(0);
      parampg.jwH.Wq();
      if (paramar.jK() == 0)
      {
        if (localbp.getTime() != 0L)
          break label511;
        a(parampg, 8, 0, true);
        parampg.jwM.aRu();
        parampg.jwM.setVisibility(8);
        parampg.jmh.setVisibility(8);
        f2 = 0.0F;
        parampg.jwG.setWidth(com.tencent.mm.aq.a.fromDPToPix(paramhd.agh(), iq(0)));
        TextView localTextView4 = parampg.jpB;
        int m = n.bLk;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(0);
        localTextView4.setText(paramhd.getString(m, arrayOfObject3));
        parampg.jwH.setWidth(com.tencent.mm.aq.a.fromDPToPix(paramhd.agh(), iq(0)));
      }
      if (1 != paramar.jK())
        break label984;
      if (paramar.getStatus() != 1)
        break label703;
      a(parampg, 0, 8, false);
      parampg.jwJ.setVisibility(8);
      parampg.aWF();
      f3 = f2;
      label254: if (paramhd.joh.fPh != null)
      {
        parampg.jpB.setTextColor(paramhd.joh.fPh.azH());
        if (!paramhd.joh.fPh.azL())
          break label991;
        parampg.jpB.setShadowLayer(2.0F, 1.2F, 1.2F, paramhd.joh.fPh.azI());
        if (!paramhd.joh.fPh.azJ())
          break label1005;
        parampg.jpB.setBackgroundResource(h.TZ);
      }
      label316: label339: parampg.jwG.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
      parampg.jwG.setOnClickListener(paramhd.joh.jqc);
      parampg.jwG.setOnLongClickListener(paramhd.joh.jqe);
      if ((0x1 & paramar.ky()) != 1)
        break label1049;
      parampg.jwF.setVisibility(0);
      if (paramar.jK() != 0)
        break label1016;
      parampg.jwH.setBackgroundResource(h.TD);
      parampg.jwG.setBackgroundResource(h.TD);
      label435: if (!paramBoolean)
        break label1121;
    }
    label703: label984: label991: label1121: for (String str = paramhd.joh.cEh; ; str = paramhd.joh.dnT)
    {
      com.tencent.mm.ui.a.a locala = com.tencent.mm.ui.a.a.aQs();
      TextView localTextView1 = parampg.jwG;
      int i = (int)f3;
      paramhd.dh(str);
      locala.q(localTextView1, i);
      parampg.jpB.setContentDescription(" ");
      return;
      parampg.jwH.setVisibility(8);
      parampg.jwH.aRu();
      break;
      label511: if (localbp.getTime() == -1L)
      {
        a(parampg, 8, 0, true);
        parampg.jwM.aRu();
        parampg.jwM.setVisibility(8);
        parampg.jwG.setWidth(80);
        parampg.jpB.setVisibility(8);
        parampg.jwH.setWidth(com.tencent.mm.aq.a.fromDPToPix(paramhd.agh(), iq((int)f2)));
        break label213;
      }
      a(parampg, 8, 0, true);
      parampg.jwM.aRu();
      parampg.jwM.setVisibility(8);
      parampg.jpB.setVisibility(0);
      parampg.jwG.setWidth(com.tencent.mm.aq.a.fromDPToPix(paramhd.agh(), iq((int)f2)));
      TextView localTextView3 = parampg.jpB;
      int k = n.bLk;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf((int)f2);
      localTextView3.setText(paramhd.getString(k, arrayOfObject2));
      parampg.jwH.setWidth(com.tencent.mm.aq.a.fromDPToPix(paramhd.agh(), iq((int)f2)));
      break label213;
      if (localbp.getTime() == -1L)
      {
        a(parampg, 8, 0, false);
        parampg.jwG.setWidth(80);
        parampg.jpB.setVisibility(8);
        parampg.jwJ.setVisibility(8);
        parampg.jwH.setWidth(com.tencent.mm.aq.a.fromDPToPix(paramhd.agh(), iq((int)f2)));
        parampg.aWF();
        f3 = f2;
        break label254;
      }
      if (paramar.getStatus() == 7)
      {
        a(parampg, 8, 8, false);
        parampg.jpB.setVisibility(8);
        parampg.jwJ.setVisibility(0);
        parampg.aWF();
        if (parampg.jwK != null)
        {
          parampg.jwP = AnimationUtils.loadAnimation(parampg.gAm.getContext(), b.MW);
          parampg.jwK.startAnimation(parampg.jwP);
        }
        f3 = f2;
        break label254;
      }
      a(parampg, 8, 0, false);
      parampg.jwJ.setVisibility(8);
      parampg.jpB.setVisibility(0);
      parampg.aWF();
      if (localbp.getTime() == 0L)
        f2 = 0.0F;
      parampg.jwG.setWidth(com.tencent.mm.aq.a.fromDPToPix(paramhd.agh(), iq((int)f2)));
      TextView localTextView2 = parampg.jpB;
      int j = n.bLk;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf((int)f2);
      localTextView2.setText(paramhd.getString(j, arrayOfObject1));
      parampg.jwH.setWidth(com.tencent.mm.aq.a.fromDPToPix(paramhd.agh(), iq((int)f2)));
      f3 = f2;
      break label254;
      parampg.jpB.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
      break label316;
      label1005: parampg.jpB.setBackgroundColor(0);
      break label339;
      label1016: parampg.jwO.setBackgroundResource(h.Uc);
      parampg.jwH.setBackgroundResource(h.Uc);
      parampg.jwG.setBackgroundResource(h.Uc);
      break label435;
      parampg.jwF.setVisibility(8);
      if (paramar.jK() == 0)
      {
        parampg.jwH.setBackgroundResource(h.Tv);
        parampg.jwG.setBackgroundResource(h.Tv);
        break label435;
      }
      parampg.jwO.setBackgroundResource(h.Ua);
      parampg.jwH.setBackgroundResource(h.Ua);
      parampg.jwG.setBackgroundResource(h.Ua);
      break label435;
    }
  }

  private void aWF()
  {
    if (this.jwP != null)
    {
      this.jwP.cancel();
      this.jwP = null;
    }
  }

  private static int iq(int paramInt)
  {
    if (paramInt <= 2)
      return 80;
    if (paramInt < 10)
      return 80 + 9 * (paramInt - 2);
    if (paramInt < 60)
      return 80 + 9 * (7 + paramInt / 10);
    return 204;
  }

  public final ck g(View paramView, boolean paramBoolean)
  {
    super.ay(paramView);
    this.eTC = ((TextView)paramView.findViewById(i.amj));
    this.joA = ((TextView)paramView.findViewById(i.amp));
    this.jwG = ((TextView)paramView.findViewById(i.amv));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    this.jmh = ((ImageView)paramView.findViewById(i.amf));
    this.jpB = ((TextView)paramView.findViewById(i.alp));
    this.jwI = ((FrameLayout)paramView.findViewById(i.amw));
    this.jwF = ((TextView)paramView.findViewById(i.amt));
    this.jwH = ((AnimImageView)paramView.findViewById(i.ams));
    this.jwH.aRt();
    if (paramBoolean)
    {
      this.type = 6;
      this.jwH.eM(true);
      this.jlV = ((TextView)paramView.findViewById(i.akP));
      this.jwM = ((AnimImageView)paramView.findViewById(i.amu));
      this.jwM.eM(true);
      this.jwM.aRt();
      return this;
    }
    this.jwJ = ((FrameLayout)paramView.findViewById(i.amx));
    this.jwK = ((ImageView)paramView.findViewById(i.amy));
    this.jwN = ((ProgressBar)paramView.findViewById(i.amz));
    this.fIh = ((ProgressBar)paramView.findViewById(i.aUi));
    this.jwO = ((TextView)paramView.findViewById(i.amA));
    this.jwH.eM(false);
    this.type = 7;
    this.jms = ((ImageView)paramView.findViewById(i.amh));
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.pg
 * JD-Core Version:    0.6.2
 */