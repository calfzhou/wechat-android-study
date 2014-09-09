package com.tencent.mm.plugin.exdevice.b;

import android.util.Base64;
import com.tencent.mm.model.dx;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.plugin.exdevice.a.l;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.f.g;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

final class ab
  implements dx
{
  ab(z paramz)
  {
  }

  public final void b(q paramq)
  {
    String str1;
    if (z.Pq() != null)
    {
      z.Pq();
      str1 = ai.a(paramq.hOS);
      if (!ch.jb(str1))
        break label33;
      com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX65dDpeMGeNUeU+NCpRot09RA/scWpfYhQ", "msg content is null");
    }
    label33: Map localMap;
    String str2;
    do
    {
      do
      {
        return;
        localMap = x.bB(str1, "sysmsg");
      }
      while ((localMap == null) || (localMap.size() <= 0));
      str2 = (String)localMap.get(".sysmsg.$type");
    }
    while ((ch.jb(str2)) || (!str2.equalsIgnoreCase("wcdevicemsg")));
    String str3 = (String)localMap.get(".sysmsg.wcdevicemsg.xml.Content");
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX65dDpeMGeNUeU+NCpRot09RA/scWpfYhQ", "contentBase64 = %s", new Object[] { str3 });
    if (ch.jb(str3))
    {
      com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX65dDpeMGeNUeU+NCpRot09RA/scWpfYhQ", "Fuck off: contentBase64 is null");
      return;
    }
    byte[] arrayOfByte;
    try
    {
      arrayOfByte = Base64.decode(str3, 0);
      if (ch.B(arrayOfByte))
      {
        com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX65dDpeMGeNUeU+NCpRot09RA/scWpfYhQ", "null == decodedContent");
        return;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localException.getMessage();
      com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX65dDpeMGeNUeU+NCpRot09RA/scWpfYhQ", "decode failed!!! %s", arrayOfObject1);
      return;
    }
    long l = ch.getLong((String)localMap.get(".sysmsg.wcdevicemsg.xml.SessionID"), -1L);
    String str4 = (String)localMap.get(".sysmsg.wcdevicemsg.xml.DeviceID");
    Object[] arrayOfObject2 = new Object[4];
    arrayOfObject2[0] = Long.valueOf(l);
    arrayOfObject2[1] = str4;
    arrayOfObject2[2] = str3;
    arrayOfObject2[3] = Integer.valueOf(arrayOfByte.length);
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX65dDpeMGeNUeU+NCpRot09RA/scWpfYhQ", "------NewXml Receive------sessionId = %d, deviceId = %s, message content = %s, decoded bytes length = %d", arrayOfObject2);
    com.tencent.mm.plugin.exdevice.e.b localb = z.Pp().lQ(str4);
    if (localb == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX65dDpeMGeNUeU+NCpRot09RA/scWpfYhQ", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
      return;
    }
    if (0L == l)
    {
      g localg = new g(arrayOfByte, localb.field_mac);
      an.PO().a(localg);
      return;
    }
    l.OR().d(l, arrayOfByte);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.ab
 * JD-Core Version:    0.6.2
 */