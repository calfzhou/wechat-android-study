package com.tencent.mm.s;

import com.tencent.mm.aj.g;
import com.tencent.mm.aj.l;
import com.tencent.mm.model.al;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;
import java.util.LinkedList;

public final class f extends al
{
  public final boolean cG(int paramInt)
  {
    return (paramInt != 0) && (paramInt < 604307701);
  }

  public final String getTag()
  {
    return "!44@/B4Tb64lLpISOYcLaKm7W9gjN01Ji7RSvHN5fh/1KL0=";
  }

  public final void transfer(int paramInt)
  {
    ar[] arrayOfar;
    if ((paramInt != 0) && (paramInt < 604307701))
    {
      arrayOfar = bg.qW().oV().an("fmessage", 20);
      if (arrayOfar == null)
        z.e("!44@/B4Tb64lLpISOYcLaKm7W9gjN01Ji7RSvHN5fh/1KL0=", "transfer fail, msglist is empty");
    }
    else
    {
      return;
    }
    l.AF();
    z.d("!44@/B4Tb64lLpISOYcLaKm7W9gjN01Ji7RSvHN5fh/1KL0=", "transfer, msgList count = " + arrayOfar.length);
    int i = arrayOfar.length;
    int j = 0;
    if (j < i)
    {
      ar localar = arrayOfar[j];
      if ((localar == null) || (localar.kk() == 0L))
        z.e("!44@/B4Tb64lLpISOYcLaKm7W9gjN01Ji7RSvHN5fh/1KL0=", "transfer fail, msg is null, skip this msg");
      av localav;
      while (true)
      {
        j++;
        break;
        z.d("!44@/B4Tb64lLpISOYcLaKm7W9gjN01Ji7RSvHN5fh/1KL0=", "transfer msg type = " + localar.getType());
        String str = localar.getContent();
        if ((str == null) || (str.length() == 0))
          z.e("!44@/B4Tb64lLpISOYcLaKm7W9gjN01Ji7RSvHN5fh/1KL0=", "transfer fail, content is null, skip this msg, id = " + localar.kk());
        else
          switch (localar.getType())
          {
          case 38:
          case 39:
          default:
            z.i("!44@/B4Tb64lLpISOYcLaKm7W9gjN01Ji7RSvHN5fh/1KL0=", "no need to transfer, msgtype = " + localar.getType());
            break;
          case 40:
            z.d("!44@/B4Tb64lLpISOYcLaKm7W9gjN01Ji7RSvHN5fh/1KL0=", "processFMessage, msg content = " + localar.getContent());
            as localas = as.zl(localar.getContent());
            com.tencent.mm.aj.f localf2 = new com.tencent.mm.aj.f();
            localf2.field_createTime = localar.kn();
            localf2.field_isSend = 0;
            localf2.field_msgContent = localar.getContent();
            localf2.field_svrId = localar.kl();
            localf2.field_talker = localas.aJQ();
            localf2.field_type = 0;
            l.AE().a(localf2);
            break;
          case 37:
            z.d("!44@/B4Tb64lLpISOYcLaKm7W9gjN01Ji7RSvHN5fh/1KL0=", "processVerifyMsg, msg content = " + localar.getContent());
            localav = av.zp(localar.getContent());
            if ((ap.jb(localav.aJQ())) || ((localav.Ew() != 18) && (!bw.cM(localav.Ew()))))
              break label451;
            z.i("!44@/B4Tb64lLpISOYcLaKm7W9gjN01Ji7RSvHN5fh/1KL0=", "processVerifyMsg, skip lbs & shake, scene = " + localav.Ew());
          }
      }
      label451: com.tencent.mm.aj.f localf1 = new com.tencent.mm.aj.f();
      localf1.field_createTime = localar.kn();
      localf1.field_isSend = 0;
      localf1.field_msgContent = localar.getContent();
      localf1.field_svrId = localar.kl();
      localf1.field_talker = localav.aJQ();
      switch (localav.aKj())
      {
      case 3:
      case 4:
      default:
        localf1.field_type = 1;
      case 2:
      case 5:
      case 6:
      }
      while (true)
      {
        l.AE().a(localf1);
        break;
        localf1.field_type = 1;
        continue;
        localf1.field_type = 2;
        continue;
        localf1.field_type = 3;
      }
    }
    bg.qW().oQ().set(143618, Integer.valueOf(0));
    l.AF().Av();
    z.d("!44@/B4Tb64lLpISOYcLaKm7W9gjN01Ji7RSvHN5fh/1KL0=", "transfer, try to delete fmessage contact & conversation");
    bg.qW().oT().yz("fmessage");
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add("fmessage");
    bg.qW().oW().W(localLinkedList);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.s.f
 * JD-Core Version:    0.6.2
 */