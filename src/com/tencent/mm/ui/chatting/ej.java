package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.compatible.loader.PluginResourceLoader;
import com.tencent.mm.compatible.loader.g;
import com.tencent.mm.f;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.plugin.b;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.base.MMTextView;

class ej extends cm
{
  private hd joF;
  private int jpD = 0;
  private int jpE = 0;
  private int jpF = 0;

  public ej(int paramInt)
  {
    super(paramInt);
  }

  private CharSequence a(TextView paramTextView, int paramInt, boolean paramBoolean)
  {
    int i = -com.tencent.mm.aq.a.fromDPToPix(this.joF.agh(), 2);
    if (paramInt != 301989937)
    {
      if (paramBoolean)
        break label46;
      this.joF.joh.jpY.b(paramTextView, i, false);
    }
    while (true)
    {
      return paramTextView.getText();
      label46: this.joF.joh.jpY.a(paramTextView, i);
    }
  }

  private void a(LayoutInflater paramLayoutInflater)
  {
    this.jpD = com.tencent.mm.aq.a.fromDPToPix(paramLayoutInflater.getContext(), 122);
    this.jpE = com.tencent.mm.aq.a.fromDPToPix(paramLayoutInflater.getContext(), 30);
    this.jpF = com.tencent.mm.aq.a.fromDPToPix(paramLayoutInflater.getContext(), 215);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcL);
      paramView.setTag(new ov(this.fjl).e(paramView, false));
      a(paramLayoutInflater);
    }
    return paramView;
  }

  public void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    a(paramhd.h().getLayoutInflater());
    ov localov = (ov)paramck;
    String str1;
    hb localhb;
    boolean bool;
    label244: Activity localActivity;
    int i;
    if (aUS())
    {
      if (localov.fIh != null)
        localov.fIh.setVisibility(8);
      if ((paramar.getStatus() == 1) || (paramar.getStatus() == 5))
      {
        if (localov.jms != null)
          localov.jms.setVisibility(8);
        localov.jws.setBackgroundResource(h.Ub);
        int m = paramhd.getResources().getColor(f.OD);
        localov.jws.setTextColor(m | 0xA0000000);
        paramar.ijv = true;
        localov.erf.setVisibility(0);
        str1 = paramar.getContent();
        if (ch.jb(str1))
        {
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Long.valueOf(paramar.kk());
          arrayOfObject2[1] = Long.valueOf(paramar.kl());
          z.e("!44@/B4Tb64lLpKwUcOR+EdWciGPn9ltClXlZLyLJ6sDMxo=", "[carl] text to, content is null! why?? localid : %s, svrid : %s", arrayOfObject2);
        }
        String str2 = paramar.kw();
        if (!b.DK())
          break label956;
        localov.jwt.fm(false);
        localhb = paramhd.P(paramar);
        if (!paramar.aJK())
          break label920;
        if (!paramar.aJM())
          break label906;
        localov.jwt.aVk();
        bool = true;
        localActivity = paramhd.agh();
        if (1 != localov.joD)
          break label971;
        i = 1;
        label262: if ((g.dOg == null) || (g.dOg.dOr == null))
          break label977;
        this.jpF = (g.dOg.dOr.getDisplayMetrics().widthPixels - this.jpD);
        label298: if (i != 0)
          this.jpF -= this.jpE;
        localov.jws.setMaxWidth(this.jpF);
        if (!bool)
          break label1000;
        localov.jwt.measure(0, 0);
        localov.jws.setMinWidth(localov.jwt.getMeasuredWidth());
        label359: if (!bool)
          break label1012;
        localov.jws.setText(str1);
        CharSequence localCharSequence1 = a(localov.jws, paramar.getType(), false);
        localov.jws.setText(str2);
        CharSequence localCharSequence2 = a(localov.jws, paramar.getType(), true);
        CharSequence[] arrayOfCharSequence = new CharSequence[3];
        arrayOfCharSequence[0] = localCharSequence1;
        arrayOfCharSequence[1] = ("\n" + " " + "\n");
        arrayOfCharSequence[2] = localCharSequence2;
        CharSequence localCharSequence3 = TextUtils.concat(arrayOfCharSequence);
        localov.jws.setText(localCharSequence3);
        MMTextView localMMTextView = localov.jws;
        int j = 1 + localCharSequence1.length();
        int k = " ".length();
        localMMTextView.measure(0, 0);
        Drawable localDrawable = this.joF.getResources().getDrawable(h.acp);
        localDrawable.setBounds(0, 0, localMMTextView.getMeasuredWidth() - localMMTextView.getPaddingLeft() - localMMTextView.getPaddingRight(), 30);
        ImageSpan localImageSpan = new ImageSpan(localDrawable, 1);
        SpannableString localSpannableString = new SpannableString(localMMTextView.getText());
        localSpannableString.setSpan(localImageSpan, j, k + j, 33);
        localMMTextView.setText(localSpannableString);
      }
    }
    while (true)
    {
      if (ch.jb(localov.jws.getText().toString()))
      {
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = Long.valueOf(paramar.kk());
        arrayOfObject1[1] = Long.valueOf(paramar.kl());
        arrayOfObject1[2] = Boolean.valueOf(bool);
        z.e("!44@/B4Tb64lLpKwUcOR+EdWciGPn9ltClXlZLyLJ6sDMxo=", "[carl] text to, content textview getText is null! why?? localid : %s, svrid : %s, showTranslatedContent : %s", arrayOfObject1);
      }
      ms localms = ms.a(paramar, paramhd.iWI, paramInt);
      localov.jws.setTag(localms);
      localov.jws.setOnClickListener(paramhd.joh.jqc);
      localov.jws.setOnLongClickListener(paramhd.joh.jqe);
      localov.jws.a(paramhd.joh.jqg);
      a(paramInt, localov, paramar, paramhd.joh.dnT, paramhd.iWI, paramhd.joh.jqc);
      return;
      localov.jws.setBackgroundResource(h.Ua);
      if (localov.jms == null)
        break;
      if (cR(paramar.kk()))
      {
        if (paramar.ijv)
        {
          AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.5F, 1.0F);
          localAlphaAnimation.setDuration(300L);
          localov.jws.startAnimation(localAlphaAnimation);
          paramar.ijv = false;
        }
        localov.jms.setVisibility(0);
        break;
      }
      localov.jms.setVisibility(8);
      break;
      if (localov.fIh == null)
        break;
      localov.fIh.setVisibility(0);
      if (paramar.getStatus() < 2)
        break;
      localov.fIh.setVisibility(8);
      break;
      label906: localov.jwt.aVi();
      bool = false;
      break label244;
      label920: if (localhb == hb.jrA)
      {
        localov.jwt.aVj();
        bool = false;
        break label244;
      }
      localov.jwt.aVi();
      bool = false;
      break label244;
      label956: localov.jwt.fm(true);
      bool = false;
      break label244;
      label971: i = 0;
      break label262;
      label977: this.jpF = (localActivity.getResources().getDisplayMetrics().widthPixels - this.jpD);
      break label298;
      label1000: localov.jws.setMinWidth(0);
      break label359;
      label1012: localov.jws.setText(str1);
      a(localov.jws, paramar.getType(), false);
    }
  }

  public boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i;
    if ((paramar.aJD()) || (paramar.aJx()))
    {
      i = ((ms)paramView.getTag()).position;
      if (paramar.aJD())
        paramContextMenu.add(i, 102, 0, paramView.getContext().getString(n.bzw));
      paramContextMenu.add(i, 108, 0, paramView.getContext().getString(n.cag));
      if (paramar.getStatus() == 5)
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(n.bAb));
      if (com.tencent.mm.am.a.to("favorite"))
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(n.bUO));
      if ((!paramar.aJv()) && (paramar.aJD()) && ((paramar.getStatus() == 2) || (paramar.kD() == 1)) && (aUR()) && (cR(paramar.kk())) && (Cd(paramar.kt())))
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(n.bzE));
      if (b.DK())
      {
        if ((!paramar.aJK()) || (!paramar.aJM()))
          break label337;
        paramContextMenu.add(i, 124, 0, paramView.getContext().getString(n.bzH));
      }
    }
    while (true)
    {
      if ((paramar.aJD()) && (r.uF()) && (!this.joF.aVS()))
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(n.bzv));
      if (!this.joF.aVS())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(n.bzz));
      return true;
      label337: paramContextMenu.add(i, 124, 0, paramView.getContext().getString(n.bzI));
    }
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ej
 * JD-Core Version:    0.6.2
 */