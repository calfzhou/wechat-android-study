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
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.compatible.loader.PluginResourceLoader;
import com.tencent.mm.compatible.loader.g;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bw;
import com.tencent.mm.n;
import com.tencent.mm.plugin.b;
import com.tencent.mm.q.r;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.base.MMTextView;

class ei extends cl
{
  private hd joF;
  private int jpD = 0;
  private int jpE = 0;
  private int jpF = 0;

  public ei(int paramInt)
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

  public View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcq);
      paramView.setTag(new ov(this.fjl).e(paramView, true));
      a(paramLayoutInflater);
    }
    return paramView;
  }

  public void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    a(paramhd.h().getLayoutInflater());
    ov localov = (ov)paramck;
    String str1 = paramar.getContent();
    String str2 = paramar.kw();
    String str3 = paramhd.joh.cEh;
    hb localhb;
    int i;
    String str7;
    label141: String str8;
    String str5;
    String str4;
    String str6;
    if (b.DK())
    {
      localov.jwt.fm(false);
      localhb = paramhd.P(paramar);
      if (paramar.aJK())
        if (paramar.aJM())
        {
          localov.jwt.aVk();
          i = 1;
          if (!paramhd.iWI)
            break label798;
          int n = bw.ek(str1);
          if (n == -1)
            break label798;
          str7 = str1.substring(0, n).trim();
          if ((str7 == null) || (str7.length() <= 0))
            break label791;
          str8 = str1.substring(n + 1).trim();
          if (i == 0)
            break label776;
          String str9 = str2.substring(n + 1).trim();
          str5 = str7;
          str4 = str9;
          str6 = str8;
        }
    }
    while (true)
    {
      a(localov, paramhd, str5);
      b(localov, paramhd, str5);
      Activity localActivity = paramhd.agh();
      int j;
      if (1 == localov.joD)
      {
        j = 1;
        label221: if ((g.dOg == null) || (g.dOg.dOr == null))
          break label724;
        this.jpF = (g.dOg.dOr.getDisplayMetrics().widthPixels - this.jpD);
        label257: if (j != 0)
          this.jpF -= this.jpE;
        localov.jws.setMaxWidth(this.jpF);
        if (i == 0)
          break label747;
        localov.jws.setText(str6);
        CharSequence localCharSequence1 = a(localov.jws, paramar.getType(), false);
        localov.jws.setText(str4);
        CharSequence localCharSequence2 = a(localov.jws, paramar.getType(), true);
        CharSequence[] arrayOfCharSequence = new CharSequence[3];
        arrayOfCharSequence[0] = localCharSequence1;
        arrayOfCharSequence[1] = ("\n" + " " + "\n");
        arrayOfCharSequence[2] = localCharSequence2;
        CharSequence localCharSequence3 = TextUtils.concat(arrayOfCharSequence);
        localov.jws.setText(localCharSequence3);
        MMTextView localMMTextView = localov.jws;
        int k = 1 + localCharSequence1.length();
        int m = " ".length();
        localMMTextView.measure(0, 0);
        Drawable localDrawable = this.joF.getResources().getDrawable(h.acq);
        localDrawable.setBounds(0, 0, localMMTextView.getMeasuredWidth() - localMMTextView.getPaddingLeft() - localMMTextView.getPaddingRight(), 30);
        ImageSpan localImageSpan = new ImageSpan(localDrawable, 1);
        SpannableString localSpannableString = new SpannableString(localMMTextView.getText());
        localSpannableString.setSpan(localImageSpan, k, m + k, 33);
        localMMTextView.setText(localSpannableString);
      }
      while (true)
      {
        localov.erf.setVisibility(0);
        localov.egy.setTag(new ms(str5));
        localov.egy.setOnClickListener(paramhd.joh.jqc);
        localov.egy.setOnLongClickListener(paramhd.joh.jqe);
        ms localms = ms.a(paramar, paramhd.iWI, paramInt);
        localov.jws.setTag(localms);
        localov.jws.setOnClickListener(paramhd.joh.jqc);
        localov.jws.setOnLongClickListener(paramhd.joh.jqe);
        localov.jws.a(paramhd.joh.jqg);
        return;
        localov.jwt.aVi();
        i = 0;
        break;
        if (localhb == hb.jrA)
        {
          localov.jwt.aVj();
          i = 0;
          break;
        }
        localov.jwt.aVi();
        i = 0;
        break;
        localov.jwt.fm(true);
        i = 0;
        break;
        j = 0;
        break label221;
        label724: this.jpF = (localActivity.getResources().getDisplayMetrics().widthPixels - this.jpD);
        break label257;
        label747: localov.jws.setText(str6);
        a(localov.jws, paramar.getType(), false);
      }
      label776: str6 = str8;
      str5 = str7;
      str4 = str2;
      continue;
      label791: str7 = str3;
      break label141;
      label798: str4 = str2;
      str5 = str3;
      str6 = str1;
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
      if (com.tencent.mm.am.a.to("favorite"))
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(n.bUO));
      if ((paramar.aJD()) && (r.uF()) && (!this.joF.aVS()))
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(n.bzv));
      if (!this.joF.aVS())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(n.bzz));
      if (b.DK())
      {
        if ((!paramar.aJK()) || (!paramar.aJM()))
          break label229;
        paramContextMenu.add(i, 124, 0, paramView.getContext().getString(n.bzH));
      }
    }
    while (true)
    {
      return true;
      label229: paramContextMenu.add(i, 124, 0, paramView.getContext().getString(n.bzI));
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

  protected final boolean a(hd paramhd)
  {
    return paramhd.iWI;
  }

  protected boolean aUQ()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ei
 * JD-Core Version:    0.6.2
 */