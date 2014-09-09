package com.tencent.mm.ui.chatting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.f;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.plugin.voicereminder.a.l;
import com.tencent.mm.plugin.voicereminder.a.o;
import com.tencent.mm.pluginsdk.model.app.ae;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.r;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

final class eo extends cj
{
  private com.tencent.mm.o.m dDA;
  private ProgressDialog hqQ;
  private hd joF;

  public eo()
  {
    super(34);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof mf)) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bda);
      paramView.setTag(new mf(this.fjl).aA(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    mf localmf = (mf)paramck;
    this.joF = paramhd;
    com.tencent.mm.ai.a locala = bf.GN().cp(paramar.kk());
    String str1 = ch.xw(paramar.getContent());
    if ((locala != null) && (str1 != null));
    for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(str1); ; localb = null)
    {
      l locall = l.tg(str1);
      boolean bool = false;
      if (locall != null)
      {
        int j = locall.gSK;
        bool = false;
        if (j == 0);
      }
      try
      {
        String str9 = com.tencent.mm.pluginsdk.e.m.j(this.joF.agh(), locall.gSK);
        if ((localb != null) && (localb.description != null))
        {
          int k = localb.description.indexOf('|');
          if ((k <= 0) || (localb.description.length() <= k + 1))
            break label963;
          String str10 = localb.description.substring(k + 1);
          localmf.eTE.setText(str10);
        }
        while (true)
        {
          if ((str9 != null) && (str9.length() > 0))
          {
            String[] arrayOfString = str9.split(";");
            localmf.juz.setText(arrayOfString[0]);
            if (arrayOfString.length > 1)
              localmf.juA.setText(arrayOfString[1]);
          }
          bool = ap.ew(locall.gSK);
          if (!bool)
            break;
          localmf.juD.setVisibility(0);
          localmf.eTE.setTextColor(this.joF.getResources().getColor(f.Pb));
          localmf.juA.setTextColor(this.joF.getResources().getColor(f.Pb));
          localmf.juz.setTextColor(this.joF.getResources().getColor(f.Pb));
          localmf.juB.setOnClickListener(new ep(this, paramar, paramInt));
          long l = paramar.kk();
          if ((!this.joF.joh.joi.isPlaying()) || (this.joF.joh.joi.aUu() != l))
            break label1058;
          i = 1;
          if (i == 0)
            break label1064;
          localmf.juB.setBackgroundResource(h.acN);
          if ((locall != null) && (!ap.jb(locall.gSM)) && (locall.gSN > 0) && (ap.jb(paramar.ku())))
          {
            String str6 = com.tencent.mm.plugin.voicereminder.a.z.ia(x.pG());
            String str7 = o.A(str6, false);
            paramar.bL(str6);
            bg.qW().oV().a(paramar.kk(), paramar);
            String str8 = s.a(str7, paramar.kk(), localb.sdkVer, localb.appId, locall.gSM, locall.gSN);
            if (str8 != null)
            {
              ac localac2 = bg.qX();
              eq localeq = new eq(this, paramar, str8, paramInt);
              this.dDA = localeq;
              localac2.a(221, localeq);
              ae localae2 = new ae(str8);
              localae2.ayN();
              bg.qX().d(localae2);
            }
          }
          if ((ap.jb(paramar.kp())) && (locall.gSQ > 0))
          {
            ar localar = bg.qW().oV().q(paramar.kt(), locall.gSQ);
            if (!ap.jb(localar.kp()))
            {
              String str4 = com.tencent.mm.plugin.voicereminder.a.z.ia(x.pG());
              String str5 = o.A(str4, false);
              if (p.f(o.A(localar.kp(), false), str5, false))
              {
                paramar.bK(str4);
                bg.qW().oV().a(paramar.kk(), paramar);
              }
            }
          }
          if ((ap.jb(paramar.kp())) && (locall != null) && (!ap.jb(locall.dQY)) && (locall.dQW > 0) && (this.dDA == null))
          {
            String str2 = com.tencent.mm.plugin.voicereminder.a.z.ia(x.pG());
            String str3 = o.A(str2, false);
            paramar.bK(str2);
            bg.qW().oV().a(paramar.kk(), paramar);
            com.tencent.mm.pluginsdk.model.app.a locala1 = s.b(str3, paramar.kk(), localb.sdkVer, localb.appId, localb.dQY, localb.dQW);
            com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKwUcOR+EdWcgrQWCeRaP+fpwTv6y+mNLuv5Zxah8/EmQ==", "mediaId  " + locala1.field_mediaSvrId);
            if (locala1.field_mediaSvrId != null)
            {
              ac localac1 = bg.qX();
              er localer = new er(this, locala1);
              this.dDA = localer;
              localac1.a(221, localer);
              ae localae1 = new ae(locala1);
              bg.qX().d(localae1);
            }
          }
          localmf.juC.setOnClickListener(new es(this, paramar, locall));
          localmf.joC.setTag(new ms(paramar, this.joF.iWI, paramInt, null, 0, (byte)0));
          localmf.joC.setOnClickListener(this.joF.joh.jqc);
          if (bg.qW().isSDCardAvailable())
            localmf.joC.setOnLongClickListener(this.joF.joh.jqe);
          return;
          label963: localmf.eTE.setText("");
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          continue;
          localmf.juD.setVisibility(8);
          localmf.eTE.setTextColor(this.joF.getResources().getColor(f.Pa));
          localmf.juA.setTextColor(this.joF.getResources().getColor(f.Pa));
          localmf.juz.setTextColor(this.joF.getResources().getColor(f.Pa));
          continue;
          label1058: int i = 0;
          continue;
          label1064: localmf.juB.setBackgroundResource(h.acO);
        }
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    int j = s.vc(this.joF.at(paramar.getContent(), paramar.jK()));
    com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(this.joF.at(paramar.getContent(), paramar.jK()));
    if ((localb.dQW <= 0) || ((localb.dQW > 0) && (j >= 100)))
      paramContextMenu.add(i, 111, 0, this.joF.getString(n.cag));
    if (!this.joF.aVS())
      paramContextMenu.add(i, 100, 0, this.joF.getString(n.bzz));
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 100:
      String str = ch.xw(paramar.getContent());
      com.tencent.mm.ai.b localb = null;
      if (str != null)
        localb = com.tencent.mm.ai.b.iS(str);
      if (localb != null)
        s.vb(localb.dQY);
      bw.v(paramar.kk());
      return false;
    case 111:
    }
    Intent localIntent = new Intent(paramhd.agh(), MsgRetransmitUI.class);
    localIntent.putExtra("Retr_Msg_content", paramhd.at(paramar.getContent(), paramar.jK()));
    localIntent.putExtra("Retr_Msg_Type", 2);
    localIntent.putExtra("Retr_Msg_Id", paramar.kk());
    paramhd.startActivity(localIntent);
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return true;
  }

  protected final boolean aUQ()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.eo
 * JD-Core Version:    0.6.2
 */