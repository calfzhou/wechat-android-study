package com.tencent.mm.plugin.ext;

import com.tencent.mm.c.a.co;
import com.tencent.mm.c.a.cp;
import com.tencent.mm.modelvoice.bm;
import com.tencent.mm.modelvoice.br;
import com.tencent.mm.modelvoice.cb;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class s extends g
{
  public s()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof co))
    {
      z.f("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "mismatched event");
      return false;
    }
    co localco = (co)parame;
    if (bm.BD() == null)
    {
      z.e("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "SubCoreVoice.getVoiceStg()" + ch.aHN());
      localco.cJc.rI = "";
    }
    br localbr = bm.BD().eR((int)localco.cJb.cDM);
    if (localbr == null);
    for (localco.cJc.rI = ""; ; localco.cJc.rI = localbr.getFileName())
      return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.s
 * JD-Core Version:    0.6.2
 */