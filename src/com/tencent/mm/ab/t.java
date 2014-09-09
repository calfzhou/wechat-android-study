package com.tencent.mm.ab;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.protocal.a.ee;
import com.tencent.mm.protocal.a.ef;
import com.tencent.mm.protocal.a.to;
import com.tencent.mm.protocal.ar;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.aw;
import java.util.LinkedList;

final class t
  implements az
{
  private boolean dzU = false;

  t(s params)
  {
  }

  public final boolean kJ()
  {
    if (!this.dzU)
    {
      this.dzU = true;
      bg.qW().oV().aKl();
    }
    if (s.a(this.dzV))
    {
      s.b(this.dzV);
      k.yx();
      bg.qW().oV().aKm();
      return false;
    }
    l locall = new l();
    if (this.dzV.dzR.hNM.hTr.huF > 1)
      bg.qW().oO();
    int i = 0;
    label272: boolean bool;
    if (i < 5)
      if (s.c(this.dzV))
        if ((this.dzV.dzR.hNM.hTr == null) || (this.dzV.dzR.hNM.hTr.hQc == null) || (s.d(this.dzV) >= this.dzV.dzR.hNM.hTr.hQc.size()) || (!s.e(this.dzV).a((ee)this.dzV.dzR.hNM.hTr.hQc.get(s.d(this.dzV)), false)))
        {
          z.d("!44@/B4Tb64lLpIGru/HscmmoR6O74SHzsGrcKBJCWjMRvE=", "sync processingResp.getCmdList() " + this.dzV.dzR.hNM.hTr.huF);
          s.f(this.dzV);
          s.g(this.dzV);
          if (locall.nM() <= 500L)
            break label434;
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Long.valueOf(locall.nM());
          arrayOfObject2[1] = Integer.valueOf(i);
          z.d("!44@/B4Tb64lLpIGru/HscmmoR6O74SHzsGrcKBJCWjMRvE=", "dksynctime(>500) : %d cnt:%d", arrayOfObject2);
          bool = true;
        }
    while (true)
    {
      if (0L > 0L)
        bg.qW().oO();
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Long.valueOf(locall.nM());
      arrayOfObject1[1] = Integer.valueOf(i);
      z.d("!44@/B4Tb64lLpIGru/HscmmoR6O74SHzsGrcKBJCWjMRvE=", "dksynctime : %d cnt:%d", arrayOfObject1);
      return bool;
      s.h(this.dzV);
      break label272;
      s.b(this.dzV).a(this.dzV.dzR);
      s.e(this.dzV).yz();
      s.i(this.dzV);
      z.i("!44@/B4Tb64lLpIGru/HscmmoR6O74SHzsGrcKBJCWjMRvE=", "sync resp list process done");
      bg.qW().oV().aKm();
      bool = false;
      continue;
      label434: i++;
      break;
      bool = true;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.t
 * JD-Core Version:    0.6.2
 */