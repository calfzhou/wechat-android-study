package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.tencent.mm.ak.m;
import com.tencent.mm.ak.r;
import com.tencent.mm.c.a.mx;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.l;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.openapi.AddAppUI;
import java.io.File;

final class cf
  implements l
{
  cf(bw parambw)
  {
  }

  public final void Zd()
  {
    if (bw.d(this.jor).aCk())
      bw.d(this.jor).aCj();
    mx localmx = new mx();
    localmx.cPr.cEg = 5;
    localmx.cPr.cEh = this.jor.aUL();
    localmx.cPr.context = bw.f(this.jor).agh();
    localmx.cPr.cPu = 2;
    com.tencent.mm.sdk.c.a.aGB().g(localmx);
    com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(4);
    arrayOfObject[1] = Integer.valueOf(1);
    arrayOfObject[2] = Integer.valueOf(0);
    localn.d(11033, arrayOfObject);
  }

  public final void Ze()
  {
    if (bw.d(this.jor).aCk())
      bw.d(this.jor).aCj();
    mx localmx = new mx();
    localmx.cPr.cEg = 5;
    localmx.cPr.cEh = this.jor.aUL();
    localmx.cPr.context = bw.f(this.jor).agh();
    localmx.cPr.cPu = 3;
    com.tencent.mm.sdk.c.a.aGB().g(localmx);
    com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(4);
    arrayOfObject[1] = Integer.valueOf(2);
    arrayOfObject[2] = Integer.valueOf(0);
    localn.d(11033, arrayOfObject);
  }

  public final void Zf()
  {
    try
    {
      String str1 = this.jor.aUL();
      String str2 = r.ia(str1);
      String str3 = m.AL().Bb();
      String str4 = m.AL().ib(str2);
      String str5 = m.AL().ic(str2);
      Intent localIntent = new Intent();
      localIntent.putExtra("to_user", str1);
      localIntent.putExtra("file_name", str2);
      localIntent.putExtra("video_path", str3);
      localIntent.putExtra("video_full_path", str4);
      localIntent.putExtra("video_thumb_path", str5);
      bc.a(bw.f(this.jor), localIntent);
      am.b(new cg(this), 1000L);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        bc.j(bw.f(this.jor));
    }
  }

  public final void Zg()
  {
    bw.d(this.jor).aCj();
    bw.f(this.jor).ft(false);
  }

  public final void Zh()
  {
    bw.f(this.jor).aVV();
  }

  public final void Zi()
  {
    bw.f(this.jor).aVU();
  }

  public final void Zj()
  {
    Intent localIntent = new Intent(bw.f(this.jor).agh(), AddAppUI.class);
    bw.f(this.jor).startActivity(localIntent);
  }

  public final void Zk()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_to_user", bw.p(this.jor).getUsername());
    localIntent.putExtra("key_fav_item_id", "3");
    com.tencent.mm.am.a.b(bw.f(this.jor).agh(), "favorite", ".ui.FavSelectUI", localIntent);
  }

  public final void e(k paramk)
  {
    bw.f(this.jor).m(paramk);
  }

  public final void ir(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 0:
    }
    do
    {
      return;
      if (bw.f(this.jor).Bp(ak.aHi()).getString("gallery", "1").equalsIgnoreCase("0"))
        bc.i(bw.f(this.jor));
      while (true)
      {
        am.b(new ch(this), 1000L);
        return;
        String str1 = bw.f(this.jor).zj();
        String str2 = bw.f(this.jor).aUL();
        bc.a(bw.f(this.jor), str1, str2);
      }
      File localFile = new File(h.dOL);
      if ((!localFile.exists()) && (!localFile.mkdir()))
      {
        Toast.makeText(bw.f(this.jor).agh(), bw.f(this.jor).getString(com.tencent.mm.n.bAn), 1).show();
        return;
      }
    }
    while (bc.a(bw.f(this.jor), h.dOL, "microMsg." + System.currentTimeMillis() + ".jpg"));
    Toast.makeText(bw.f(this.jor).agh(), bw.f(this.jor).getString(com.tencent.mm.n.cdH), 1).show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.cf
 * JD-Core Version:    0.6.2
 */