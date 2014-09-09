package com.tencent.mm.n;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

final class j
  implements br
{
  Bitmap dnb = null;
  String username = null;

  public j(e parame, String paramString)
  {
    this.username = paramString;
  }

  public final boolean rD()
  {
    if (ch.jb(this.username));
    m localm;
    do
    {
      return false;
      localm = e.sj();
    }
    while (localm == null);
    String str = (String)m.dng.get(this.username);
    Context localContext;
    if (!ch.jb(str))
    {
      af.sI();
      localContext = af.getContext();
      if (localContext == null);
    }
    try
    {
      localm.d(this.username, i.decodeStream(localContext.getAssets().open(str)));
      label83: this.dnb = localm.eT(this.username);
      return true;
    }
    catch (IOException localIOException)
    {
      break label83;
    }
  }

  public final boolean rE()
  {
    if (this.dnb == null)
    {
      e.a(this.dmW, this.username);
      return false;
    }
    m localm = e.sj();
    if (localm != null)
      localm.c(this.username, this.dnb);
    e.e(this.dmW).remove(this.username);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.j
 * JD-Core Version:    0.6.2
 */