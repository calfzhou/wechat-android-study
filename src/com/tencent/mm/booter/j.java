package com.tencent.mm.booter;

import android.media.MediaPlayer;
import com.tencent.mm.model.ao;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.List;

final class j
  implements az
{
  j(i parami)
  {
  }

  public final boolean kJ()
  {
    try
    {
      if ((i.a(this.dil) != null) && (i.a(this.dil).isPlaying()))
        synchronized (i.b(this.dil))
        {
          if (i.a(this.dil).getCurrentPosition() > 0)
            i.a(this.dil, i.a(this.dil).getCurrentPosition());
          Iterator localIterator = i.c(this.dil).iterator();
          ao localao;
          do
          {
            if (!localIterator.hasNext())
              break;
            localao = (ao)localIterator.next();
          }
          while (localao == null);
          localao.w(i.a(this.dil).getCurrentPosition(), i.a(this.dil).getDuration());
        }
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", localException.getMessage());
    }
    return false;
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.j
 * JD-Core Version:    0.6.2
 */