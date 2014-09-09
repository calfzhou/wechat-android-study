package com.tencent.mm.q;

import com.tencent.mm.model.at;
import com.tencent.mm.model.ay;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.k;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

final class y
  implements br
{
  public byte[] dna = null;
  private final String dra;
  private final String url;

  public y(String paramString1, String paramString2)
  {
    this.dra = paramString1;
    this.url = paramString2;
  }

  public final boolean rD()
  {
    if ((ch.jb(this.dra)) || (ch.jb(this.url)));
    ByteArrayOutputStream localByteArrayOutputStream;
    InputStream localInputStream;
    while (true)
    {
      return false;
      try
      {
        localByteArrayOutputStream = new ByteArrayOutputStream();
        localInputStream = k.g(this.url, 3000, 5000);
        if (localInputStream != null)
        {
          byte[] arrayOfByte = new byte[1024];
          while (true)
          {
            int i = localInputStream.read(arrayOfByte);
            if (i == -1)
              break;
            localByteArrayOutputStream.write(arrayOfByte, 0, i);
          }
        }
      }
      catch (Exception localException)
      {
        z.e("!32@/B4Tb64lLpKQQogTCo8oV6VgvXdJVE+T", "get url:" + this.url + " failed.");
        this.dna = null;
        return false;
      }
    }
    localInputStream.close();
    this.dna = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.close();
    if (ch.B(this.dna))
    {
      z.e("!32@/B4Tb64lLpKQQogTCo8oV6VgvXdJVE+T", "imgBuff null brand:" + this.dra);
      return false;
    }
    if (bg.oE())
    {
      at.qy().x(this.dna.length, 0);
      aa.uZ().d(this.dra, this.url, this.dna);
    }
    return true;
  }

  public final boolean rE()
  {
    aa.uZ().fL(this.dra);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.y
 * JD-Core Version:    0.6.2
 */