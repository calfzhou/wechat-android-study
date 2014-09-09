package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.mm.a.c;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.pluginsdk.ui.bb;
import com.tencent.mm.sdk.modelmsg.WXEmojiObject;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.base.en;
import java.io.FileInputStream;

public final class gy
  implements bb
{
  private Context context;
  private com.tencent.mm.storage.i elz;
  private String jok;
  private boolean jrs = true;
  private boolean jrt = true;

  public gy(Context paramContext, com.tencent.mm.storage.i parami, String paramString)
  {
    this.context = paramContext;
    this.elz = parami;
    this.jok = paramString;
    if (com.tencent.mm.storage.i.yc(this.jok))
      this.jrt = false;
    if (com.tencent.mm.storage.i.ya(this.jok))
      this.jrs = false;
    if (com.tencent.mm.storage.i.xY(this.jok))
      this.jrs = false;
    String str;
    if ((this.elz != null) && (com.tencent.mm.storage.i.yc(this.elz.getUsername())))
      str = this.jok;
    while (true)
    {
      if (y.dd(str))
        this.jrt = false;
      return;
      if (this.elz == null)
        str = null;
      else
        str = this.elz.getUsername();
    }
  }

  public final boolean Zl()
  {
    return this.jrt;
  }

  public final boolean Zm()
  {
    return this.jrs;
  }

  public final void c(ad paramad)
  {
    if (!bg.qW().isSDCardAvailable())
      en.cp(this.context);
    while (paramad == null)
      return;
    if ((this.elz.getUsername().equals("medianote")) && ((0x4000 & x.pK()) == 0));
    for (int i = 1; i != 0; i = 0)
    {
      paramad.field_start = 0;
      paramad.field_state = ad.ijf;
      g.axR().a(paramad);
      ar localar = new ar();
      localar.setType(47);
      localar.bJ("medianote");
      localar.bv(1);
      if (paramad.avN())
        localar.setContent(com.tencent.mm.storage.z.a(x.pG(), 0L, false));
      localar.bK(paramad.vu());
      localar.q(bw.eo(localar.kt()));
      localar.setStatus(2);
      bg.qW().oV().y(localar);
      return;
    }
    com.tencent.mm.pluginsdk.i locali = g.axR();
    if (ch.jb(this.jok));
    for (String str = this.elz.getUsername(); ; str = this.jok)
    {
      locali.a(str, paramad, null);
      return;
    }
  }

  public final void d(ad paramad)
  {
    if (!bg.qW().isSDCardAvailable())
    {
      en.cp(this.context);
      return;
    }
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    String str = bg.qW().pi() + paramad.vu();
    if (c.ac(str + "_thumb"))
    {
      int i = c.ab(str + "_thumb");
      localWXMediaMessage.thumbData = c.a(str + "_thumb", 0, i);
    }
    while (true)
    {
      localWXMediaMessage.mediaObject = new WXEmojiObject(str);
      s.a(localWXMediaMessage, paramad.field_app_id, null, this.jok, 1, paramad.vu());
      return;
      try
      {
        FileInputStream localFileInputStream = new FileInputStream(str);
        localWXMediaMessage.setThumbImage(com.tencent.mm.sdk.platformtools.i.a(localFileInputStream, 1.0F));
        localFileInputStream.close();
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpKwUcOR+EdWcu7PiWmfoYexugycOHFP7DE5W5RdqSk+Cw==", "sendAppMsgEmoji Fail cause there is no thumb");
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gy
 * JD-Core Version:    0.6.2
 */