package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.h;
import com.tencent.mm.aj.j;
import com.tencent.mm.aj.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.model.p;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.av;
import com.tencent.mm.ui.base.cr;

public final class a extends LinearLayout
  implements m
{
  private static g hGT;
  private Context context;
  private cr dWq;
  private TextView dYT;
  private Button hGU;

  public a(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    View localView = View.inflate(this.context, com.tencent.mm.k.bfM, this);
    this.dYT = ((TextView)localView.findViewById(com.tencent.mm.i.auj));
    this.hGU = ((Button)localView.findViewById(com.tencent.mm.i.auk));
    this.hGU.setOnClickListener(new b(this));
  }

  public static void a(g paramg)
  {
    hGT = paramg;
  }

  private static int vM(String paramString)
  {
    if (paramString == null)
    {
      z.d("!44@/B4Tb64lLpISOYcLaKm7W1V6z9KICjQJp9PXDQLaAGg=", "getOpCodeFromVerify fail, xml is null");
      return 6;
    }
    switch (av.zp(paramString).aKj())
    {
    case 2:
    case 5:
    case 3:
    case 4:
    default:
      return 6;
    case 6:
    }
    return 5;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (paramx.getType() != 30)
      return;
    z.d("!44@/B4Tb64lLpISOYcLaKm7W1V6z9KICjQJp9PXDQLaAGg=", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (this.dWq != null)
      this.dWq.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      int i = ((p)paramx).ayw();
      String str2 = ((p)paramx).ayx();
      z.d("!44@/B4Tb64lLpISOYcLaKm7W1V6z9KICjQJp9PXDQLaAGg=", "onSceneEnd, pre insert fmsg, opcode = " + i + ", verifyContent = " + str2);
      z.d("!44@/B4Tb64lLpISOYcLaKm7W1V6z9KICjQJp9PXDQLaAGg=", "onSceneEnd, type = " + hGT.type);
      f localf;
      switch (hGT.type)
      {
      default:
        localf = new f();
        localf.field_createTime = e.b(hGT.cEh, 0L);
        localf.field_isSend = 1;
        localf.field_msgContent = str2;
        localf.field_talker = hGT.cEh;
        if (i != 5)
          break;
      case 1:
      case 2:
      }
      for (int j = 2; ; j = 3)
      {
        localf.field_type = j;
        boolean bool2 = l.AE().a(localf);
        z.d("!44@/B4Tb64lLpISOYcLaKm7W1V6z9KICjQJp9PXDQLaAGg=", "onSceneEnd, insert fmsg, ret = " + bool2);
        while (true)
        {
          bg.qX().b(30, this);
          return;
          h localh = new h();
          localh.field_createtime = com.tencent.mm.aj.i.hP(hGT.cEh);
          localh.field_isSend = 1;
          localh.field_content = str2;
          localh.field_talker = "fmessage";
          localh.field_sayhiuser = hGT.cEh;
          localh.field_svrid = System.currentTimeMillis();
          localh.field_status = 4;
          l.AG().a(localh);
          continue;
          j localj = new j();
          localj.field_createtime = com.tencent.mm.aj.k.hP(hGT.cEh);
          localj.field_isSend = 1;
          localj.field_content = str2;
          localj.field_talker = "fmessage";
          localj.field_sayhiuser = hGT.cEh;
          localj.field_svrid = System.currentTimeMillis();
          localj.field_status = 4;
          boolean bool1 = l.AH().a(localj);
          z.d("!44@/B4Tb64lLpISOYcLaKm7W1V6z9KICjQJp9PXDQLaAGg=", "onSceneEnd, insert shake, ret = " + bool1);
        }
      }
    }
    String str1;
    if ((paramInt1 == 4) && (paramInt2 == -34))
      str1 = this.context.getString(n.bJR);
    while (true)
    {
      Toast.makeText(this.context, str1, 1).show();
      break;
      if ((paramInt1 == 4) && (paramInt2 == -94))
        str1 = this.context.getString(n.bJS);
      else
        str1 = this.context.getString(n.ceo);
    }
  }

  public final void detach()
  {
    bg.qX().b(30, this);
    if ((this.dWq != null) && (this.dWq.isShowing()))
      this.dWq.dismiss();
  }

  public final void mX(int paramInt)
  {
    if (this.hGU != null)
      this.hGU.setVisibility(paramInt);
  }

  public final void vN(String paramString)
  {
    this.dYT.setText(com.tencent.mm.ar.b.f(this.context, ch.ja(paramString), (int)this.dYT.getTextSize()));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.a
 * JD-Core Version:    0.6.2
 */