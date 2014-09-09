package com.tencent.mm.ui.c.a;

import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

final class b extends Thread
{
  b(a parama, String paramString1, Bundle paramBundle, String paramString2, c paramc, Object paramObject)
  {
  }

  public final void run()
  {
    try
    {
      String str = this.jHu.jHo.a(this.jHp, this.jHq, this.jHr);
      c localc4 = this.jHs;
      localc4.BA(str);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      c localc3 = this.jHs;
      localc3.a(localFileNotFoundException);
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      c localc2 = this.jHs;
      localc2.a(localMalformedURLException);
      return;
    }
    catch (IOException localIOException)
    {
      c localc1 = this.jHs;
      localc1.a(localIOException);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.c.a.b
 * JD-Core Version:    0.6.2
 */