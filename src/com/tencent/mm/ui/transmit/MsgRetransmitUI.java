package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.mm.c.a.if;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cx;
import com.tencent.mm.model.y;
import com.tencent.mm.modelvoice.bs;
import com.tencent.mm.network.bm;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.model.app.o;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.sdk.modelmsg.j;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.y.ag;
import com.tencent.mm.y.ap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MsgRetransmitUI extends Activity
  implements com.tencent.mm.o.m
{
  public long cDM;
  public String cDi;
  public String cJr;
  public int cNS;
  private ProgressDialog dWT = null;
  private com.tencent.mm.o.n dyf = null;
  private int dyi = 0;
  private String jYb = null;
  private boolean jYc = true;
  private boolean jYd = false;
  private aa jYe;
  private int jYf = 0;
  private int jYg = 0;
  private ag jYh = null;
  private List jYi = null;
  private int jYj = 0;
  private int jYk = 0;
  private boolean jYl = false;
  boolean jYm = false;
  com.tencent.mm.ak.a jYn;
  private int joT = -1;
  private int length;
  public String rI;

  private void a(String paramString, int paramInt, com.tencent.mm.o.n paramn)
  {
    String str = com.tencent.mm.model.x.pG();
    if (!ch.jb(this.rI))
    {
      this.jYj = 1;
      this.jYk = 1;
      if (com.tencent.mm.model.x.b(this.rI, paramString, true))
      {
        this.dyi = 1;
        l = System.currentTimeMillis();
        this.jYh = new ag(paramInt, str, paramString, this.rI, this.dyi, paramn, 0, "", "", true, com.tencent.mm.h.Ti);
        bg.qX().d(this.jYh);
        arrayOfObject = new Object[1];
        arrayOfObject[0] = Long.valueOf(System.currentTimeMillis() - l);
        z.d("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "jacks consumption: %d", arrayOfObject);
        cx.rV().a(cx.dmq, null);
      }
    }
    while (!this.jYl)
      while (true)
      {
        long l;
        Object[] arrayOfObject;
        return;
        this.dyi = 0;
      }
    this.jYj = (1 + this.jYj);
    if (com.tencent.mm.model.x.b((String)this.jYi.get(0), paramString, true));
    for (this.dyi = 1; ; this.dyi = 0)
    {
      this.jYh = new ag(paramInt, str, paramString, (String)this.jYi.get(0), this.dyi, paramn, 0, "", "", true, com.tencent.mm.h.Ti);
      bg.qX().d(this.jYh);
      cx.rV().a(cx.dmq, null);
      return;
    }
  }

  private void bbR()
  {
    if (!bg.qW().isSDCardAvailable())
    {
      z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "sdcard is not available, type = " + this.cNS);
      Toast.makeText(this, com.tencent.mm.n.bTi, 1).show();
      finish();
      return;
    }
    switch (this.jYg)
    {
    default:
      z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "unknown iScene, value = " + this.jYg);
      return;
    case 0:
      a(this.cDi, 4, null);
      if (this.jYd)
        Toast.makeText(this, getString(com.tencent.mm.n.bON), 1).show();
      finish();
      return;
    case 1:
    }
    if ((this.jYi != null) && (this.jYi.size() > 0))
      this.jYk = this.jYi.size();
    this.dyf = new f(this);
    int i = com.tencent.mm.n.bTk;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(1);
    arrayOfObject[1] = Integer.valueOf(this.jYk);
    arrayOfObject[2] = Integer.valueOf(0);
    this.jYe = com.tencent.mm.ui.base.e.a(this, getString(i, arrayOfObject), getString(com.tencent.mm.n.buo), new g(this));
    this.jYe.setOnCancelListener(new h(this));
    this.jYe.setCanceledOnTouchOutside(false);
    this.jYe.getButton(-1).setText(com.tencent.mm.n.bsK);
    a(this.cDi, 3, this.dyf);
  }

  private void cT(byte[] paramArrayOfByte)
  {
    com.tencent.mm.ai.b localb1 = com.tencent.mm.ai.b.iS(ch.xw(this.cJr));
    if (localb1 == null)
    {
      z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "transfer app message error: app content null");
      finish();
      return;
    }
    com.tencent.mm.pluginsdk.model.app.a locala = new com.tencent.mm.pluginsdk.model.app.a();
    if (localb1.dQY != null)
    {
      long l = ch.getLong(localb1.dQY, -1L);
      if (l == -1L)
        break label256;
      com.tencent.mm.pluginsdk.model.app.bf.GP().b(l, locala);
      if (locala.iGx != l)
      {
        locala = com.tencent.mm.pluginsdk.model.app.bf.GP().uU(localb1.dQY);
        if ((locala != null) && (locala.field_mediaSvrId.equals(localb1.dQY)));
      }
    }
    for (locala = null; ; locala = null)
      label256: 
      do
      {
        String str1 = "";
        if ((locala != null) && (locala.field_fileFullPath != null) && (!locala.field_fileFullPath.equals("")))
        {
          str1 = bg.qW().po() + "da_" + ch.CM();
          p.f(locala.field_fileFullPath, str1, false);
        }
        String str2 = str1;
        com.tencent.mm.ai.b localb2 = com.tencent.mm.ai.b.a(localb1);
        localb2.dRa = 3;
        s.a(localb2, localb1.appName, this.cDi, str2, paramArrayOfByte);
        if (this.jYd)
          Toast.makeText(this, getString(com.tencent.mm.n.bON), 1).show();
        finish();
        return;
        locala = com.tencent.mm.pluginsdk.model.app.bf.GP().uU(localb1.dQY);
      }
      while ((locala != null) && (locala.field_mediaSvrId.equals(localb1.dQY)));
  }

  private void k(Intent paramIntent)
  {
    if (this.jYl)
    {
      this.jYk = this.jYi.size();
      ArrayList localArrayList = paramIntent.getExtras().getParcelableArrayList("android.intent.extra.STREAM");
      if ((localArrayList != null) && (localArrayList.size() > 0))
      {
        Iterator localIterator = localArrayList.iterator();
        while (localIterator.hasNext())
        {
          Parcelable localParcelable = (Parcelable)localIterator.next();
          if (this.jYm)
            break;
          Intent localIntent = new Intent();
          localIntent.setData((Uri)localParcelable);
          x(localIntent);
        }
      }
      finish();
      return;
    }
    this.jYk = 1;
    x(paramIntent);
    getString(com.tencent.mm.n.buo);
    this.dWT = com.tencent.mm.ui.base.e.a(this, getString(com.tencent.mm.n.buA), true, new k(this));
  }

  private void x(Intent paramIntent)
  {
    this.jYn = new com.tencent.mm.ak.a();
    this.jYn.a(this, paramIntent, new l(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if (paramx.getType() != 110)
      return;
    if ((this.jYi != null) && (this.jYi.size() > 1))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        int j = com.tencent.mm.n.bTg;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.jYi.get(0);
        Toast.makeText(this, getString(j, arrayOfObject), 1).show();
      }
      this.jYi.remove(0);
      a(this.cDi, 3, this.dyf);
      return;
    }
    if (this.jYe != null)
    {
      this.jYe.dismiss();
      this.jYe = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0));
    for (int i = com.tencent.mm.n.bTj; ; i = com.tencent.mm.n.bTh)
    {
      Toast.makeText(this, i, 1).show();
      finish();
      return;
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      finish();
      return;
    }
    if (paramInt1 != 0)
    {
      z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "onActivityResult, unknown requestCode = " + paramInt1);
      return;
    }
    this.cDi = paramIntent.getStringExtra("Select_Conv_User");
    switch (this.cNS)
    {
    case 3:
    default:
      return;
    case 0:
      if (this.jYg == 1)
      {
        bbR();
        return;
      }
      bg.qQ().aHo();
      bg.qQ().n(new a(this));
      finish();
      return;
    case 1:
    case 11:
      if (!bg.qW().isSDCardAvailable())
      {
        z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "sdcard is not available, type = " + this.cNS);
        Toast.makeText(this, com.tencent.mm.n.bTi, 1).show();
        finish();
        return;
      }
      switch (this.jYg)
      {
      default:
        z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "unknown iScene, value = " + this.jYg);
        return;
      case 0:
        String str9 = this.cDi;
        m localm = new m();
        getString(com.tencent.mm.n.buo);
        this.dWT = com.tencent.mm.ui.base.e.a(this, getString(com.tencent.mm.n.bui), true, new b(this, localm));
        localm.context = this;
        localm.rI = this.rI;
        localm.dXD = this.dWT;
        localm.cDi = str9;
        localm.jYf = this.jYf;
        localm.dGd = this.length;
        localm.hwJ = this.cNS;
        localm.jYs = false;
        localm.jYt = true;
        localm.jYd = this.jYd;
        localm.execute(new Object[0]);
        cx.rV().a(cx.dmr, null);
        return;
      case 1:
      }
      if (!bm.ab(this))
      {
        com.tencent.mm.ui.base.e.a(this, com.tencent.mm.n.cnT, com.tencent.mm.n.buo, com.tencent.mm.n.btQ, com.tencent.mm.n.bsK, new d(this), new e(this));
        return;
      }
      k(getIntent());
      return;
    case 2:
      String str5 = this.cDi;
      switch (this.jYg)
      {
      case 1:
      default:
        finish();
        return;
      case 0:
        Object localObject;
        String str8;
        if (this.jYb == null)
        {
          ar localar = bg.qW().oV().cV(this.cDM);
          int i = this.joT;
          localObject = null;
          if (i < 0)
          {
            String str7 = localar.kp();
            localObject = null;
            if (str7 != null)
            {
              boolean bool = localar.kp().equals("");
              localObject = null;
              if (!bool)
                str8 = ap.yg().gS(localar.kp());
            }
          }
        }
        while (true)
        {
          try
          {
            byte[] arrayOfByte2 = com.tencent.mm.a.c.a(str8, 0, com.tencent.mm.a.c.ab(str8));
            localObject = arrayOfByte2;
            cT(localObject);
          }
          catch (Exception localException2)
          {
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = str5;
            arrayOfObject2[1] = localException2.getLocalizedMessage();
            z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "send appmsg to %s, error:%s", arrayOfObject2);
            localObject = null;
            continue;
          }
          try
          {
            byte[] arrayOfByte1 = com.tencent.mm.a.c.a(this.jYb, 0, com.tencent.mm.a.c.ab(this.jYb));
            localObject = arrayOfByte1;
          }
          catch (Exception localException1)
          {
            Object[] arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = str5;
            arrayOfObject1[1] = localException1.getLocalizedMessage();
            z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "send appmsg to %s, error:%s", arrayOfObject1);
            localObject = null;
          }
        }
      case 2:
      }
      String str6 = getIntent().getExtras().getString("_mmessage_appPackage");
      com.tencent.mm.pluginsdk.model.app.k localk = new com.tencent.mm.pluginsdk.model.app.k();
      localk.field_packageName = str6;
      com.tencent.mm.pluginsdk.model.app.bf.GO().c(localk, new String[] { "packageName" });
      w.a(this, new j(getIntent().getExtras()).iDh, localk, new c(this));
      return;
    case 4:
      switch (this.jYg)
      {
      default:
        return;
      case 0:
      }
      if ((this.cJr == null) || (this.cJr.equals("")))
        z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "Transfer text erro: content null");
      while (true)
      {
        finish();
        return;
        com.tencent.mm.model.x.pG();
        com.tencent.mm.ab.h localh3 = new com.tencent.mm.ab.h(this.cDi, this.cJr, y.dR(this.cDi));
        bg.qX().d(localh3);
        if (this.jYd)
          Toast.makeText(this, getString(com.tencent.mm.n.bON), 1).show();
      }
    case 5:
      if (!bg.qW().isSDCardAvailable())
      {
        z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "sdcard is not available, type = " + this.cNS);
        en.cp(this);
      }
      break;
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 12:
    }
    while (true)
    {
      finish();
      return;
      switch (this.jYg)
      {
      default:
        z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "unknown iScene, value = " + this.jYg);
        return;
      case 0:
      }
      if ((this.rI == null) || (!com.tencent.mm.pluginsdk.g.axR().e(this, this.cDi, this.rI)))
        break;
      if (this.jYd)
        Toast.makeText(this, getString(com.tencent.mm.n.bON), 1).show();
      finish();
      return;
      cT(null);
      return;
      String str4 = this.cDi;
      if (!bg.qW().isSDCardAvailable())
      {
        z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "sdcard is not available, type = " + this.cNS);
        Toast.makeText(this, com.tencent.mm.n.bTi, 1).show();
      }
      while (true)
      {
        finish();
        return;
        switch (this.jYg)
        {
        default:
          return;
        case 0:
        }
        if (this.rI == null)
        {
          z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "Transfer fileName erro: fileName null");
        }
        else
        {
          com.tencent.mm.modelvoice.w localw = new com.tencent.mm.modelvoice.w(bs.c(str4, this.rI, this.length), 1);
          bg.qX().d(localw);
          if (this.jYd)
            Toast.makeText(this, getString(com.tencent.mm.n.bON), 1).show();
        }
      }
      String str3 = this.cDi;
      if (!bg.qW().isSDCardAvailable())
      {
        z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "sdcard is not available, type = " + this.cNS);
        Toast.makeText(this, com.tencent.mm.n.bTi, 1).show();
      }
      while (true)
      {
        finish();
        return;
        com.tencent.mm.ab.h localh2 = new com.tencent.mm.ab.h(str3, this.cJr, 42);
        bg.qX().d(localh2);
        if (this.jYd)
          Toast.makeText(this, getString(com.tencent.mm.n.bON), 1).show();
      }
      String str2 = this.cDi;
      switch (this.jYg)
      {
      default:
        return;
      case 0:
      }
      if ((this.cJr == null) || (this.cJr.equals("")))
        z.e("!44@/B4Tb64lLpLWl/1sKbbnJDN+/k3QDAC+0iKsGdZGh9U=", "Transfer text erro: content null");
      while (true)
      {
        finish();
        return;
        com.tencent.mm.ab.h localh1 = new com.tencent.mm.ab.h(str2, this.cJr, 48);
        bg.qX().d(localh1);
        if (this.jYd)
          Toast.makeText(this, getString(com.tencent.mm.n.bON), 1).show();
      }
      String str1 = this.cDi;
      if localif = new if();
      localif.cMG.type = 4;
      localif.cMG.cMM = bg.qW().oV().cV(this.cDM);
      localif.cMG.cIA = str1;
      com.tencent.mm.sdk.c.a.aGB().g(localif);
      if (this.jYd)
        Toast.makeText(this, getString(com.tencent.mm.n.bON), 1).show();
      finish();
      return;
      com.tencent.mm.ui.chatting.bf.ax(this, this.cDi);
      if (this.jYd)
        Toast.makeText(this, getString(com.tencent.mm.n.bON), 1).show();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.cNS = getIntent().getIntExtra("Retr_Msg_Type", -1);
    this.cJr = getIntent().getStringExtra("Retr_Msg_content");
    this.cDM = getIntent().getLongExtra("Retr_Msg_Id", -1L);
    this.rI = getIntent().getStringExtra("Retr_File_Name");
    this.jYi = getIntent().getStringArrayListExtra("Retr_File_Path_List");
    boolean bool;
    Intent localIntent;
    if ((this.jYi != null) && (this.jYi.size() > 0))
    {
      bool = true;
      this.jYl = bool;
      this.dyi = getIntent().getIntExtra("Retr_Compress_Type", 0);
      this.jYg = getIntent().getIntExtra("Retr_Scene", 0);
      this.length = getIntent().getIntExtra("Retr_length", 0);
      this.jYf = getIntent().getIntExtra("Retr_video_isexport", 0);
      this.jYb = getIntent().getStringExtra("Retr_Msg_thumb_path");
      this.jYc = getIntent().getBooleanExtra("Retr_go_to_chattingUI", true);
      this.jYd = getIntent().getBooleanExtra("Retr_show_success_tips", true);
      this.joT = getIntent().getIntExtra("Retr_Biz_Msg_Selected_Msg_Index", -1);
      bg.qX().a(110, this);
      setContentView(com.tencent.mm.k.bbP);
      localIntent = new Intent(this, SelectConversationUI.class);
      switch (this.cNS)
      {
      case 3:
      case 4:
      case 5:
      default:
        localIntent.putExtra("Select_Conv_Type", 11);
      case 2:
      case 6:
      case 7:
      }
    }
    while (true)
    {
      localIntent.putExtra("select_is_ret", true);
      startActivityForResult(localIntent, 0);
      return;
      bool = false;
      break;
      localIntent.putExtra("Select_Conv_Type", 3);
    }
  }

  protected void onDestroy()
  {
    bg.qX().b(110, this);
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI
 * JD-Core Version:    0.6.2
 */