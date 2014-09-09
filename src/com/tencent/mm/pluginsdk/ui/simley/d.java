package com.tencent.mm.pluginsdk.ui.simley;

import com.tencent.mm.aq.a;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class d
{
  public List hIk = new ArrayList();
  public ArrayList hIl;
  public long hIm;
  public int[] hIn;
  public int hIo;
  public int hIp = a.fromDPToPix(ak.getContext(), 179);
  public int hIq;
  public boolean hIr;
  public boolean hIs;
  public b hIt = null;
  public HashMap hIu = new HashMap();
  private final al hIv = new e(this);
  private final al hIw = new f(this);

  public final void clear()
  {
    z.v("!44@/B4Tb64lLpIUhDmLVZ6YSfFgXjzkEDm0KXlW+3FKbuI=", "clear SSC cache");
    this.hIk = new ArrayList();
    this.hIn = null;
    this.hIo = 0;
    this.hIl = null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.simley.d
 * JD-Core Version:    0.6.2
 */