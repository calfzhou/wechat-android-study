package com.tencent.mm.plugin.ext;

import com.tencent.mm.c.a.cl;
import com.tencent.mm.c.a.cm;
import com.tencent.mm.modelvoice.bm;
import com.tencent.mm.modelvoice.br;
import com.tencent.mm.modelvoice.cb;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class r extends g
{
  public r()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof cl))
    {
      z.f("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "mismatched event");
      return false;
    }
    cl localcl = (cl)parame;
    if (bm.BD() == null)
      z.e("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "SubCoreVoice.getVoiceStg() == null" + ch.aHN());
    br localbr = bm.BD().iF(localcl.cIZ.rI);
    if (localbr != null)
      localcl.cJa.cDM = localbr.AV();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.r
 * JD-Core Version:    0.6.2
 */