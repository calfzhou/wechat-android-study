package com.tencent.mm.model;

import com.tencent.mm.compatible.g.h;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.sdk.platformtools.z;

final class q extends Thread
{
  String dkc;
  String dkd;

  public q(String paramString1, String paramString2)
  {
    super.setName("MoveDataFiles");
    this.dkc = paramString1;
    this.dkd = paramString2;
  }

  public final void run()
  {
    if ((ch.jb(this.dkc)) || (ch.jb(this.dkd)));
    do
    {
      return;
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "MoveDataFiles :" + this.dkc + " to :" + this.dkd);
    }
    while ((!j.nI()) || (!this.dkd.substring(0, h.dOI.length()).equals(h.dOI)));
    p.f(this.dkc + "image/", this.dkd + "image/", true);
    p.f(this.dkc + "image2/", this.dkd + "image2/", true);
    p.f(this.dkc + "avatar/", this.dkd + "avatar/", true);
    p.f(this.dkc + "video/", this.dkd + "video/", true);
    p.f(this.dkc + "voice/", this.dkd + "voice/", true);
    p.f(this.dkc + "voice2/", this.dkd + "voice2/", true);
    p.f(this.dkc + "package/", this.dkd + "package/", true);
    p.f(this.dkc + "emoji/", this.dkd + "emoji/", true);
    p.f(this.dkc + "mailapp/", this.dkd + "mailapp/", true);
    p.f(this.dkc + "brandicon/", this.dkd + "brandicon/", true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.q
 * JD-Core Version:    0.6.2
 */