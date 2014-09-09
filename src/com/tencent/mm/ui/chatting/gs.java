package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.c.a.ar;
import com.tencent.mm.c.a.as;
import com.tencent.mm.c.a.at;
import com.tencent.mm.pluginsdk.model.d;
import com.tencent.mm.protocal.a.ja;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.e;
import java.util.List;

final class gs
  implements View.OnClickListener
{
  gs(gm paramgm)
  {
  }

  private void b(ar paramar)
  {
    a.aGB().g(paramar);
    if (paramar.cHV.ret == 0)
    {
      e.aw(gm.b(this.jrm).agh(), gm.b(this.jrm).getString(com.tencent.mm.n.bHR));
      this.jrm.aVe();
      if (14 != paramar.cHU.type)
      {
        z.d("!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==", "not record type, do not report");
        return;
      }
      if (paramar.cHU.cHX == null)
      {
        z.e("!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==", "want to report record fav, but type count is null");
        return;
      }
      com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject = new Object[14];
      arrayOfObject[0] = Integer.valueOf(paramar.cHU.cHX.hZI);
      arrayOfObject[1] = Integer.valueOf(paramar.cHU.cHX.hZJ);
      arrayOfObject[2] = Integer.valueOf(paramar.cHU.cHX.hZK);
      arrayOfObject[3] = Integer.valueOf(paramar.cHU.cHX.hZL);
      arrayOfObject[4] = Integer.valueOf(paramar.cHU.cHX.hZM);
      arrayOfObject[5] = Integer.valueOf(paramar.cHU.cHX.hZN);
      arrayOfObject[6] = Integer.valueOf(paramar.cHU.cHX.hZO);
      arrayOfObject[7] = Integer.valueOf(paramar.cHU.cHX.hZP);
      arrayOfObject[8] = Integer.valueOf(paramar.cHU.cHX.hZQ);
      arrayOfObject[9] = Integer.valueOf(paramar.cHU.cHX.hZR);
      arrayOfObject[10] = Integer.valueOf(paramar.cHU.cHX.hZS);
      arrayOfObject[11] = Integer.valueOf(paramar.cHU.cHX.hZT);
      arrayOfObject[12] = Integer.valueOf(paramar.cHU.cHX.hZU);
      arrayOfObject[13] = Integer.valueOf(paramar.cHU.cHX.hZV);
      localn.d(11142, arrayOfObject);
      return;
    }
    e.b(gm.b(this.jrm).agh(), com.tencent.mm.n.bHw, com.tencent.mm.n.bHn);
  }

  public final void onClick(View paramView)
  {
    ar localar = new ar();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = gm.g(this.jrm).getUsername();
    z.d("!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==", "want fav msgs from %s", arrayOfObject);
    gm.b(this.jrm).agh();
    if (d.a(localar, gm.g(this.jrm).getUsername(), gm.e(this.jrm)))
    {
      b(localar);
      return;
    }
    if (gm.e(this.jrm).size() > 1)
    {
      e.a(gm.b(this.jrm).agh(), com.tencent.mm.n.bHu, com.tencent.mm.n.buo, new gt(this, localar), null);
      return;
    }
    e.b(gm.b(this.jrm).agh(), localar.cHU.type, com.tencent.mm.n.bHn);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gs
 * JD-Core Version:    0.6.2
 */