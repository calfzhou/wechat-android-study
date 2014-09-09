package com.tencent.mm.plugin.f.c;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

final class h extends g
{
  private long fTz;

  public h(long paramLong)
  {
    this.fTz = paramLong;
  }

  protected final boolean a(com.tencent.mm.plugin.f.a.f paramf)
  {
    if (paramf == null)
      return false;
    long l = ch.CL();
    if (this.fTz <= 0L)
    {
      paramf.aeQ();
      paramf.hUn = ((int)l);
      return true;
    }
    String str = f.nz();
    if ((!ch.jb(str)) && (l - com.tencent.mm.platformtools.g.a(str, String.valueOf(paramf.aew()), 0L) > this.fTz))
    {
      com.tencent.mm.platformtools.g.b(str, String.valueOf(paramf.aew()), l);
      paramf.aeQ();
      paramf.hUn = ((int)l);
      File localFile = new File(str);
      if (localFile.length() > 3145728L)
        localFile.delete();
      return true;
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramf.ifI);
    arrayOfObject[1] = Integer.valueOf(paramf.aew());
    z.v("!32@/B4Tb64lLpKe2JfXcMjS1tYUTQatTRzl", "match freq limit, logID = %d, key = %d", arrayOfObject);
    return false;
  }

  protected final com.tencent.mm.plugin.f.a.g aeY()
  {
    return f.bQ(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.h
 * JD-Core Version:    0.6.2
 */