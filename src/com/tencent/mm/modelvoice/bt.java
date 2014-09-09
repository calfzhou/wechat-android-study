package com.tencent.mm.modelvoice;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.o.j;
import com.tencent.mm.o.k;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class bt
  implements j
{
  private static Set dIN = new HashSet();

  public static void b(c paramc)
  {
    dIN.remove(paramc);
  }

  public static void c(c paramc)
  {
    if (!dIN.contains(paramc))
      dIN.add(paramc);
  }

  public final k a(q paramq)
  {
    if (paramq == null)
    {
      z.e("!44@/B4Tb64lLpJDbBvHbUsv3zBLtM+ZFGAMCy9Shpv8X/k=", "onPreAddMessage cmdAM is null , give up.");
      return null;
    }
    z.v("!44@/B4Tb64lLpJDbBvHbUsv3zBLtM+ZFGAMCy9Shpv8X/k=", "parseVoiceMsg srvId:" + paramq.hOY);
    String str1 = ai.a(paramq.hOP);
    if (str1.equals(com.tencent.mm.model.x.pG()));
    for (String str2 = ai.a(paramq.hOQ); ; str2 = str1)
    {
      br localbr1;
      int i;
      String str4;
      while (true)
      {
        ar localar1 = bg.qW().oV().q(str2, paramq.hOY);
        if ((localar1.kk() != 0L) && (604800000L + localar1.kn() < bw.b(str2, paramq.hOV)))
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Long.valueOf(paramq.hOY);
          z.w("!44@/B4Tb64lLpJDbBvHbUsv3zBLtM+ZFGAMCy9Shpv8X/k=", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d", arrayOfObject);
          bw.v(paramq.hOY);
          br localbr3 = bm.BD().Y(paramq.hOY);
          if ((localbr3 != null) && (!ch.jb(localbr3.getFileName())))
            bs.iB(localbr3.getFileName());
        }
        localbr1 = new br();
        localbr1.setUser(str2);
        localbr1.q(paramq.hOV);
        localbr1.p(paramq.hOY);
        String str3 = ai.a(paramq.hOS);
        if (y.dc(str1))
        {
          str3 = bw.en(str3);
          z.d("!44@/B4Tb64lLpJDbBvHbUsv3zBLtM+ZFGAMCy9Shpv8X/k=", "chatroom voicemsg, new content=" + str3);
        }
        Map localMap = com.tencent.mm.sdk.platformtools.x.bB(str3, "msg");
        if (localMap == null)
          break;
        try
        {
          localbr1.eF(Integer.valueOf((String)localMap.get(".msg.voicemsg.$length")).intValue());
          localbr1.it((String)localMap.get(".msg.voicemsg.$clientmsgid"));
          i = Integer.valueOf((String)localMap.get(".msg.voicemsg.$endflag")).intValue();
          int j = Integer.valueOf((String)localMap.get(".msg.voicemsg.$cancelflag")).intValue();
          localbr1.eP(Integer.valueOf((String)localMap.get(".msg.voicemsg.$voicelength")).intValue());
          localbr1.hU((String)localMap.get(".msg.voicemsg.$fromusername"));
          str4 = (String)localMap.get(".msg.commenturl");
          localbr1.eO(Integer.valueOf(ch.Y((String)localMap.get(".msg.voicemsg.$forwardflag"), "0")).intValue());
          localbr1.iu((String)localMap.get(".msg.voicemsg.$voiceformat"));
          if (j == 1)
          {
            z.v("!44@/B4Tb64lLpJDbBvHbUsv3zBLtM+ZFGAMCy9Shpv8X/k=", "cancelFlag = 1 srvId:" + paramq.hOY);
            br localbr2 = bm.BD().Y(localbr1.kl());
            if (localbr2 == null)
              break;
            bs.iA(localbr2.getFileName());
            return null;
          }
        }
        catch (Exception localException)
        {
          z.e("!44@/B4Tb64lLpJDbBvHbUsv3zBLtM+ZFGAMCy9Shpv8X/k=", "parsing voice msg xml failed");
          return null;
        }
      }
      if (i == 1)
      {
        z.v("!44@/B4Tb64lLpJDbBvHbUsv3zBLtM+ZFGAMCy9Shpv8X/k=", "endFlag = 1 srvId:" + paramq.hOY);
        localbr1.cZ(localbr1.AO());
      }
      localbr1.db(22190);
      byte[] arrayOfByte = ai.a(paramq.hOU);
      if (arrayOfByte != null)
        z.d("!44@/B4Tb64lLpJDbBvHbUsv3zBLtM+ZFGAMCy9Shpv8X/k=", "Voice Buf Len:" + arrayOfByte.length + " srvId:" + paramq.hOY);
      ar localar3;
      if (bs.a(localbr1, arrayOfByte, paramq.dZy, str4) > 0)
      {
        localar3 = bg.qW().oV().q(localbr1.getUser(), localbr1.kl());
        localar3.ok(0);
        Iterator localIterator = dIN.iterator();
        while (localIterator.hasNext())
          am.h(new bu(this, (c)localIterator.next(), localbr1));
      }
      for (ar localar2 = localar3; ; localar2 = null)
      {
        if ((localar2 != null) && (localar2.kk() > 0L));
        for (boolean bool = true; ; bool = false)
          return new k(localar2, bool);
      }
    }
  }

  public final void d(ar paramar)
  {
    z.d("!44@/B4Tb64lLpJDbBvHbUsv3zBLtM+ZFGAMCy9Shpv8X/k=", "onPreDelMessage " + paramar.kp() + " " + paramar.kt());
    if (!y.dD(paramar.kt()))
      bs.iB(paramar.kp());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bt
 * JD-Core Version:    0.6.2
 */