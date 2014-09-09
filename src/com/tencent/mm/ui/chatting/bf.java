package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import java.util.Iterator;
import java.util.List;

public final class bf
{
  private static bj jnQ = new bj((byte)0);

  public static void a(Context paramContext, List paramList, boolean paramBoolean, gm paramgm)
  {
    aUF();
    if (paramContext == null)
    {
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXNIwXR+/wPCUtE4pSafxclQ==", "do retransmit fail, context is null");
      return;
    }
    if ((paramList == null) || (paramList.isEmpty()))
    {
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXNIwXR+/wPCUtE4pSafxclQ==", "do retransmit fail, select item empty");
      return;
    }
    int i;
    if (paramList == null)
    {
      z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "check contain invalid send to friend msg error, select item empty");
      i = 1;
    }
    while (i != 0)
    {
      e.a(paramContext, paramContext.getString(n.bOZ), "", new bg(paramList, paramgm, paramContext, paramBoolean), null);
      return;
      Iterator localIterator = paramList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          ar localar = (ar)localIterator.next();
          if ((localar.aJw()) || (be.F(localar)) || (be.G(localar)) || (be.H(localar)) || (localar.getType() == -1879048186))
          {
            i = 1;
            break;
          }
        }
      i = 0;
    }
    b(paramContext, paramList, paramBoolean, paramgm);
  }

  public static void aUF()
  {
    jnQ.jnU = null;
    jnQ.iWI = false;
    jnQ.jnP = null;
  }

  public static void ax(Context paramContext, String paramString)
  {
    if (paramContext == null)
    {
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXNIwXR+/wPCUtE4pSafxclQ==", "do try retransmit fail, context is null");
      return;
    }
    if (ch.jb(paramString))
    {
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXNIwXR+/wPCUtE4pSafxclQ==", "do try retransmit fail, username is empty");
      return;
    }
    if ((jnQ.jnU == null) || (jnQ.jnU.isEmpty()))
    {
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXNIwXR+/wPCUtE4pSafxclQ==", "do try retransmit fail, select items empty");
      return;
    }
    z.v("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXNIwXR+/wPCUtE4pSafxclQ==", "post to do job, send to %s", new Object[] { paramString });
    gm.jrh.c(new bi(paramContext, paramString, null));
  }

  private static void b(Context paramContext, List paramList, boolean paramBoolean, gm paramgm)
  {
    if (be.bb(paramList))
    {
      e.a(paramContext, paramContext.getString(n.bDI), "", new bh(paramgm), null);
      return;
    }
    jnQ.jnU = paramList;
    jnQ.iWI = paramBoolean;
    jnQ.jnP = paramgm;
    Intent localIntent = new Intent(paramContext, MsgRetransmitUI.class);
    localIntent.putExtra("Retr_Msg_Type", 12);
    localIntent.putExtra("Retr_show_success_tips", true);
    paramContext.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bf
 * JD-Core Version:    0.6.2
 */