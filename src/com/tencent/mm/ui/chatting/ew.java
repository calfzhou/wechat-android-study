package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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

final class ew extends cl
{
  private com.tencent.mm.o.m dDA;
  private hd joF;

  public ew()
  {
    super(35);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof my)) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bdb);
      paramView.setTag(new my(this.fjl).aC(paramView));
    }
    return paramView;
  }

  protected final String a(hd paramhd, ar paramar)
  {
    return paramhd.joh.cEh;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    my localmy = (my)paramck;
    this.joF = paramhd;
    com.tencent.mm.ai.a locala = bf.GN().cp(paramar.kk());
    String str1 = ch.xw(paramar.getContent());
    if ((locala != null) && (str1 != null));
    for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.V(str1, paramar.ku()); ; localb = null)
    {
      l locall = l.tg(str1);
      if ((locall != null) && (locall.gSK != 0));
      try
      {
        String str6 = com.tencent.mm.pluginsdk.e.m.j(paramhd.agh(), locall.gSK);
        String str7 = "";
        if ((str6 != null) && (str6.length() > 0))
        {
          String[] arrayOfString = str6.split(";");
          str7 = str7 + arrayOfString[0].replace(" ", "");
          if (arrayOfString.length > 1)
            str7 = str7 + arrayOfString[1];
        }
        if ((localb != null) && (localb.description != null))
          str7 = str7 + " " + localb.description;
        localmy.eTE.setText(str7);
        label231: com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKwUcOR+EdWcgrQWCeRaP+fpwTv6y+mNLvWE+WR3rr02g==", "content remind " + paramar.getContent());
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
        if ((ap.jb(paramar.kp())) && (locall != null) && (locall.dQY != null) && (locall.dQY.length() > 0) && (locall.dQW > 0) && (this.dDA == null))
        {
          String str2 = com.tencent.mm.plugin.voicereminder.a.z.ia(x.pG());
          String str3 = o.A(str2, false);
          if (ap.jb(paramar.kp()))
          {
            paramar.bK(str2);
            bg.qW().oV().a(paramar.kk(), paramar);
            com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKwUcOR+EdWcgrQWCeRaP+fpwTv6y+mNLvWE+WR3rr02g==", "content.attachid " + localb.dQY);
            com.tencent.mm.pluginsdk.model.app.a locala1 = s.b(str3, paramar.kk(), localb.sdkVer, localb.appId, localb.dQY, localb.dQW);
            com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKwUcOR+EdWcgrQWCeRaP+fpwTv6y+mNLvWE+WR3rr02g==", "ainfo.field_mediaSvrId " + locala1.field_mediaSvrId);
            if (locala1.field_mediaSvrId != null)
            {
              ac localac = bg.qX();
              ex localex = new ex(this);
              this.dDA = localex;
              localac.a(221, localex);
              com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKwUcOR+EdWcgrQWCeRaP+fpwTv6y+mNLvWE+WR3rr02g==", "doscene");
              ae localae = new ae(locala1);
              bg.qX().d(localae);
            }
          }
        }
        localmy.jvn.setOnClickListener(new ey(this, paramar, paramInt));
        long l = paramar.kk();
        int i;
        if ((this.joF.joh.joi.isPlaying()) && (this.joF.joh.joi.aUu() == l))
        {
          i = 1;
          if (i == 0)
            break label767;
          localmy.jvn.setImageResource(h.Xc);
        }
        while (true)
        {
          localmy.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
          localmy.joC.setOnClickListener(paramhd.joh.jqc);
          if (bg.qW().isSDCardAvailable())
            localmy.joC.setOnLongClickListener(paramhd.joh.jqe);
          return;
          i = 0;
          break;
          label767: localmy.jvn.setImageResource(h.Xd);
        }
      }
      catch (Exception localException)
      {
        break label231;
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

  protected final boolean a(hd paramhd)
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ew
 * JD-Core Version:    0.6.2
 */