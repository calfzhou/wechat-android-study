package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.c.a.mt;
import com.tencent.mm.c.a.mu;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import java.io.File;

final class j extends g
{
  j(f paramf)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    String str1 = ((mt)parame).cPo.path;
    if (str1 == null)
      return false;
    String str2 = o.A(str1, false);
    if (!ap.jb(str2))
      f.arG().iE(str2);
    f.arG().iD(str1);
    new File(str1).delete();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.j
 * JD-Core Version:    0.6.2
 */