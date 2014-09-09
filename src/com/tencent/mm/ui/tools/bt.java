package com.tencent.mm.ui.tools;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.r;
import com.tencent.mm.ak.v;
import com.tencent.mm.c.a.as;
import com.tencent.mm.c.a.at;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cx;
import com.tencent.mm.model.x;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.base.ff;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.y.ag;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.h;
import com.tencent.mm.y.l;
import junit.framework.Assert;

@SuppressLint({"UseSparseArrays"})
public final class bt extends ff
{
  public ImageGalleryUI jQK;
  protected bu jQL;
  private String jQM;
  private boolean jQN;
  public boolean jQO;
  public ck jQP;
  public dm jQQ;
  public bx jQR;
  private boolean jQS;
  protected boolean jQT;

  public bt(ImageGalleryUI paramImageGalleryUI, long paramLong, String paramString1, boolean paramBoolean, String paramString2)
  {
    this.jQN = bool;
    this.jQO = false;
    this.jQT = bool;
    String str = "!44@/B4Tb64lLpJSmuQVFTi9Bytpc/Q80/vFZOdDpsRmrsY=, invalid argument, context = " + paramImageGalleryUI + ", currentMsgId = " + paramLong + ", talker = " + paramString1 + ", stack = " + ch.aHN();
    if ((paramImageGalleryUI != null) && (paramLong > 0L) && (paramString1 != null) && (paramString1.length() > 0));
    while (true)
    {
      Assert.assertTrue(str, bool);
      this.jQK = paramImageGalleryUI;
      this.jQL = new bu(paramLong, paramString1, this);
      this.jQO = paramBoolean;
      this.jQM = paramString2;
      this.jQL.Us();
      this.jQP = new ck(this);
      this.jQQ = new dm(this);
      return;
      bool = false;
    }
  }

  public static boolean a(com.tencent.mm.storage.ar paramar, l paraml)
  {
    if ((paramar == null) || (paraml == null))
      return false;
    return ap.yh().a(paraml.xM(), paramar.kk(), 1);
  }

  public static boolean ac(com.tencent.mm.storage.ar paramar)
  {
    if (paramar == null);
    while ((paramar.getType() != 3) && (paramar.getType() != 39) && (paramar.getType() != 13))
      return false;
    return true;
  }

  public static boolean ad(com.tencent.mm.storage.ar paramar)
  {
    if (paramar == null);
    while ((paramar.getType() != 43) && (paramar.getType() != 44))
      return false;
    return true;
  }

  public static int b(com.tencent.mm.storage.ar paramar, l paraml)
  {
    if (paramar.jK() == 1)
      if (paraml.xR())
      {
        l locall2 = com.tencent.mm.y.m.a(paraml);
        if ((locall2 == null) || (locall2.xM() <= 0L) || (!locall2.xQ()) || (!com.tencent.mm.a.c.ac(ap.yg().f(locall2.xN(), "", ""))));
      }
    l locall1;
    do
    {
      return 1;
      return 0;
      if (!paraml.xQ())
        break label125;
      if (!paraml.xR())
        break;
      locall1 = com.tencent.mm.y.m.a(paraml);
    }
    while ((locall1 != null) && (locall1.xM() > 0L) && (locall1.xQ()) && (com.tencent.mm.a.c.ac(ap.yg().f(locall1.xN(), "", ""))));
    return 0;
    label125: return 0;
  }

  public final l a(com.tencent.mm.storage.ar paramar, boolean paramBoolean)
  {
    return this.jQP.a(paramar, paramBoolean);
  }

  public final int aPA()
  {
    return this.jQL.aPA();
  }

  public final int aa()
  {
    return 100000 - bu.c(this.jQL);
  }

  public final int ab()
  {
    return -1 + (100000 - bu.c(this.jQL) + bu.d(this.jQL));
  }

  public final boolean ae(com.tencent.mm.storage.ar paramar)
  {
    if (paramar == null);
    q localq;
    do
    {
      l locall;
      do
      {
        return false;
        locall = a(paramar, false);
        if (locall == null)
          break;
      }
      while ((paramar == null) || (locall == null) || ((!ap.yh().a(locall.xM(), paramar.kk(), 0)) && (!a(paramar, locall))));
      return true;
      localq = dm.aj(paramar);
    }
    while ((localq == null) || (localq.getStatus() != 112) || (v.e(localq) >= 100));
    return true;
  }

  public final void af(com.tencent.mm.storage.ar paramar)
  {
    l locall = ck.ah(paramar);
    if ((paramar == null) || (paramar.kk() == 0L) || (locall == null) || (locall.xM() == 0L))
    {
      StringBuilder localStringBuilder1 = new StringBuilder("doRestransmitMsg fail, msgLocalId = ");
      Object localObject1;
      StringBuilder localStringBuilder2;
      if (paramar == null)
      {
        localObject1 = "null";
        localStringBuilder2 = localStringBuilder1.append(localObject1).append(", imgLocalId = ");
        if (locall != null)
          break label98;
      }
      label98: for (Object localObject2 = "null"; ; localObject2 = Long.valueOf(locall.xM()))
      {
        z.e("!44@/B4Tb64lLpJSmuQVFTi9Bytpc/Q80/vFZOdDpsRmrsY=", localObject2);
        return;
        localObject1 = Long.valueOf(paramar.kk());
        break;
      }
    }
    String str1 = ck.a(paramar, locall, false);
    if ((str1 == null) || (str1.length() == 0))
    {
      z.e("!44@/B4Tb64lLpJSmuQVFTi9Bytpc/Q80/vFZOdDpsRmrsY=", "doRestransmitMsg fail, bigImgPath is null, msgLocalId = " + paramar.kk() + ", imgLocalId = " + locall.xM());
      return;
    }
    if (ch.jb(this.jQM))
    {
      z.i("!44@/B4Tb64lLpJSmuQVFTi9Bytpc/Q80/vFZOdDpsRmrsY=", "directly send user is empty, select one");
      Intent localIntent2 = new Intent(this.jQK, MsgRetransmitUI.class);
      localIntent2.putExtra("Retr_File_Name", str1);
      localIntent2.putExtra("Retr_Msg_Id", paramar.kk());
      localIntent2.putExtra("Retr_Msg_Type", 0);
      localIntent2.putExtra("Retr_Compress_Type", b(paramar, locall));
      this.jQK.startActivity(localIntent2);
      return;
    }
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = this.jQM;
    z.i("!44@/B4Tb64lLpJSmuQVFTi9Bytpc/Q80/vFZOdDpsRmrsY=", "directly send user %s", arrayOfObject1);
    int i;
    if (paramar.jK() == 1)
      if (locall.xR())
      {
        i = 1;
        String str2 = x.pG();
        String str3 = ap.yg().f(com.tencent.mm.y.m.c(locall), "", "");
        if (!ch.jb(str3))
        {
          z.i("!44@/B4Tb64lLpJSmuQVFTi9Bytpc/Q80/vFZOdDpsRmrsY=", "connector click[img]: to[%s] fileName[%s]", new Object[] { locall, str3 });
          ag localag = new ag(str2, this.jQM, str3, i);
          bg.qX().d(localag);
          cx.rV().a(cx.dmq, null);
        }
        if (!this.jQN)
          break label531;
        Intent localIntent1 = new Intent(this.jQK, ChattingUI.class);
        localIntent1.addFlags(67108864);
        localIntent1.putExtra("Chat_User", this.jQM);
        this.jQK.startActivity(localIntent1);
      }
    while (true)
    {
      com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(3);
      arrayOfObject2[1] = Integer.valueOf(4);
      arrayOfObject2[2] = this.jQM;
      localn.d(10424, arrayOfObject2);
      return;
      i = 0;
      break;
      if (!locall.xR())
      {
        i = 0;
        break;
      }
      if (!com.tencent.mm.a.c.ac(com.tencent.mm.y.m.a(locall).xN()))
      {
        i = 0;
        break;
      }
      i = 1;
      break;
      label531: e.aw(this.jQK, this.jQK.getString(com.tencent.mm.n.bue));
    }
  }

  public final void bae()
  {
    this.jQS = false;
  }

  public final boolean baf()
  {
    return this.jQL.jQW;
  }

  public final com.tencent.mm.storage.ar bag()
  {
    return qP(this.jQK.W());
  }

  public final dp bah()
  {
    dp localdp = this.jQP.qM(this.jQK.W());
    if (localdp == null)
      localdp = this.jQQ.qM(this.jQK.W());
    return localdp;
  }

  public final void detach()
  {
    super.detach();
    this.jQP.detach();
    this.jQQ.detach();
  }

  public final View f(int paramInt, View paramView)
  {
    com.tencent.mm.storage.ar localar = qP(paramInt);
    dp localdp;
    if (paramView == null)
    {
      paramView = View.inflate(ak.getContext(), k.bgK, null);
      localdp = new dp(this, paramView);
      paramView.setTag(localdp);
      boolean bool = ad(localar);
      localdp.iy = paramInt;
      localdp.jSI = bool;
      if (!bool)
        break label155;
      localdp.baD();
      dp.v(localdp.jSN, 0);
      label77: dp.v(localdp.jTb, 8);
      dp.v(localdp.jSR, 8);
      dp.v(localdp.jSY, 8);
      dp.v(localdp.jSX, 8);
      if (!ac(localar))
        break label168;
      this.jQP.a(localdp, localar, paramInt);
    }
    while (true)
    {
      this.jQT = false;
      return paramView;
      localdp = (dp)paramView.getTag();
      break;
      label155: dp.v(localdp.jSN, 8);
      break label77;
      label168: this.jQQ.a(localdp, localar, paramInt);
    }
  }

  public final void gc(boolean paramBoolean)
  {
    this.jQN = paramBoolean;
  }

  public final int getCount()
  {
    return this.jQL.Us();
  }

  public final void h(int paramInt)
  {
    if (this.jQP != null)
      this.jQP.jRF.h(paramInt);
  }

  public final MultiTouchImageView hL(int paramInt)
  {
    View localView1 = super.pL(paramInt);
    if (localView1 == null)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      z.e("!44@/B4Tb64lLpJSmuQVFTi9Bytpc/Q80/vFZOdDpsRmrsY=", "position : %s getMultiTouchImageViewByPosition is null", arrayOfObject);
      return null;
    }
    View localView2 = localView1.findViewById(i.axK);
    if ((localView2 == null) || (localView2.getVisibility() == 8))
      return null;
    return (MultiTouchImageView)localView2;
  }

  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
  }

  public final com.tencent.mm.storage.ar qP(int paramInt)
  {
    return this.jQL.qX(paramInt);
  }

  public final void qQ(int paramInt)
  {
    com.tencent.mm.storage.ar localar = qP(paramInt);
    if (ad(localar))
    {
      if (!bg.qW().isSDCardAvailable())
      {
        en.cp(this.jQK);
        return;
      }
      q localq = v.ij(localar.kp());
      Intent localIntent = new Intent(this.jQK, MsgRetransmitUI.class);
      localIntent.putExtra("Retr_length", localq.AU());
      localIntent.putExtra("Retr_File_Name", localar.kp());
      localIntent.putExtra("Retr_video_isexport", localq.AX());
      localIntent.putExtra("Retr_Msg_Type", 1);
      this.jQK.startActivity(localIntent);
      return;
    }
    af(localar);
  }

  public final void qR(int paramInt)
  {
    com.tencent.mm.storage.ar localar = qP(paramInt);
    if (ad(localar))
    {
      String str2;
      if (localar != null)
      {
        str2 = v.ik(com.tencent.mm.ak.m.AL().ib(localar.kp()));
        if (ch.jb(str2))
          Toast.makeText(this.jQK, this.jQK.getString(com.tencent.mm.n.cnX), 1).show();
      }
      else
      {
        return;
      }
      Toast.makeText(this.jQK, this.jQK.getString(com.tencent.mm.n.cnY, new Object[] { str2 }), 1).show();
      bc.e(str2, this.jQK);
      return;
    }
    if ((localar == null) || (localar.kk() == 0L))
    {
      z.e("!44@/B4Tb64lLpJSmuQVFTi9Bytpc/Q80/vFZOdDpsRmrsY=", "msg is null");
      return;
    }
    l locall = ck.ah(localar);
    if ((locall == null) || (locall.xM() == 0L))
    {
      StringBuilder localStringBuilder1 = new StringBuilder("doRestransmitMsg fail, msgLocalId = ");
      Object localObject1;
      StringBuilder localStringBuilder2;
      if (localar == null)
      {
        localObject1 = "null";
        localStringBuilder2 = localStringBuilder1.append(localObject1).append(", imgLocalId = ");
        if (locall != null)
          break label211;
      }
      label211: for (Object localObject2 = "null"; ; localObject2 = Long.valueOf(locall.xM()))
      {
        z.e("!44@/B4Tb64lLpJSmuQVFTi9Bytpc/Q80/vFZOdDpsRmrsY=", localObject2);
        return;
        localObject1 = Long.valueOf(localar.kk());
        break;
      }
    }
    String str1 = ck.a(localar, locall, false);
    if ((str1 == null) || (str1.length() == 0))
    {
      z.e("!44@/B4Tb64lLpJSmuQVFTi9Bytpc/Q80/vFZOdDpsRmrsY=", "doRestransmitMsg fail, bigImgPath is null, msgLocalId = " + localar.kk() + ", imgLocalId = " + locall.xM());
      return;
    }
    bc.j(str1, this.jQK);
  }

  public final void qS(int paramInt)
  {
    com.tencent.mm.storage.ar localar = qP(paramInt);
    com.tencent.mm.c.a.ar localar1 = new com.tencent.mm.c.a.ar();
    if (com.tencent.mm.pluginsdk.model.c.a(localar1, localar))
    {
      a.aGB().g(localar1);
      if (localar1.cHV.ret == 0)
        e.aw(this.jQK, this.jQK.getString(com.tencent.mm.n.bHR));
      return;
    }
    e.b(this.jQK, localar1.cHU.type, com.tencent.mm.n.bHn);
  }

  public final void qT(int paramInt)
  {
    this.jQQ.c(qP(paramInt), paramInt);
  }

  public final void qU(int paramInt)
  {
    this.jQQ.rh(paramInt);
  }

  public final void qV(int paramInt)
  {
    com.tencent.mm.storage.ar localar = qP(paramInt);
    if ((localar == null) || (!ac(localar)));
    ck localck;
    l locall;
    do
    {
      return;
      localck = this.jQP;
      locall = ck.ah(localar);
    }
    while ((locall == null) || (localar == null));
    ap.yh().a(locall.xM(), localar.kk(), localck);
    ap.yh().a(locall.xM(), localar.kk());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.bt
 * JD-Core Version:    0.6.2
 */